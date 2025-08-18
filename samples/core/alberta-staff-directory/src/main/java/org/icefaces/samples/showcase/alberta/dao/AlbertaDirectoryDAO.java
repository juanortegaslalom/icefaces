package org.icefaces.samples.showcase.alberta.dao;

import org.icefaces.samples.showcase.alberta.model.Contact;
import org.icefaces.samples.showcase.alberta.model.OrganizationalUnit;
import org.icefaces.samples.showcase.alberta.util.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Data Access Object for Alberta Staff Directory data
 */
public class AlbertaDirectoryDAO {
    
    private DatabaseManager dbManager;
    
    public AlbertaDirectoryDAO() {
        this.dbManager = DatabaseManager.getInstance();
    }
    
    /**
     * Get all ministries with their hierarchical organizational structure
     */
    public List<OrganizationalUnit> getAllMinistries() {
        List<OrganizationalUnit> ministries = new ArrayList<OrganizationalUnit>();
        
        String sql = "SELECT id, name FROM ministries ORDER BY name";
        
        try (Connection conn = dbManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                int ministryId = rs.getInt("id");
                String name = rs.getString("name");
                
                OrganizationalUnit ministry = new OrganizationalUnit(name, "ministry");
                
                // Load organizational units for this ministry
                loadOrganizationalUnits(conn, ministry, ministryId);
                
                // Load ministry-level contacts
                loadContacts(conn, ministry, ministryId, null);
                
                ministries.add(ministry);
            }
            
        } catch (SQLException e) {
            System.err.println("Error loading ministries: " + e.getMessage());
            e.printStackTrace();
        }
        
        return ministries;
    }
    
    /**
     * Load organizational units hierarchy for a ministry
     */
    private void loadOrganizationalUnits(Connection conn, OrganizationalUnit ministry, int ministryId) 
            throws SQLException {
        
        // Get all organizational units for this ministry
        String sql = "SELECT id, parent_id, name, unit_type, level " +
                    "FROM organizational_units " +
                    "WHERE ministry_id = ? " +
                    "ORDER BY level, name";
        
        Map<Integer, OrganizationalUnit> unitMap = new HashMap<Integer, OrganizationalUnit>();
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ministryId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int unitId = rs.getInt("id");
                    Integer parentId = rs.getObject("parent_id", Integer.class);
                    String name = rs.getString("name");
                    String unitType = rs.getString("unit_type");
                    int level = rs.getInt("level");
                    
                    OrganizationalUnit unit = new OrganizationalUnit(name, unitType);
                    unitMap.put(unitId, unit);
                    
                    // Load contacts for this unit
                    loadContacts(conn, unit, ministryId, unitId);
                    
                    // Add to parent or ministry
                    if (parentId == null) {
                        // Top-level unit under ministry
                        ministry.addChild(unit);
                    } else {
                        // Child unit
                        OrganizationalUnit parent = unitMap.get(parentId);
                        if (parent != null) {
                            parent.addChild(unit);
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Load contacts for a ministry or organizational unit
     */
    private void loadContacts(Connection conn, OrganizationalUnit unit, int ministryId, Integer unitId) 
            throws SQLException {
        
        String sql;
        PreparedStatement stmt;
        
        if (unitId == null) {
            // Ministry-level contacts
            sql = "SELECT name, title, phone, email FROM contacts WHERE ministry_id = ? AND organizational_unit_id IS NULL";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, ministryId);
        } else {
            // Unit-level contacts
            sql = "SELECT name, title, phone, email FROM contacts WHERE organizational_unit_id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, unitId);
        }
        
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString("name");
                String title = rs.getString("title");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                
                // Skip empty contacts
                if ((name == null || name.trim().isEmpty()) && 
                    (phone == null || phone.trim().isEmpty())) {
                    continue;
                }
                
                Contact contact = new Contact(
                    name != null ? name.trim() : "",
                    title != null ? title.trim() : "",
                    phone != null ? phone.trim() : "",
                    email != null ? email.trim() : ""
                );
                
                unit.addContact(contact);
            }
        }
        
        stmt.close();
    }
    
    /**
     * Search for contacts by name, title, or ministry
     */
    public List<Contact> searchContacts(String searchTerm) {
        List<Contact> results = new ArrayList<Contact>();
        
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return results;
        }
        
        String sql = "SELECT c.name, c.title, c.phone, c.email, m.name as ministry_name " +
                    "FROM contacts c " +
                    "LEFT JOIN ministries m ON c.ministry_id = m.id " +
                    "WHERE c.name LIKE ? OR c.title LIKE ? OR m.name LIKE ? " +
                    "ORDER BY c.name";
        
        String searchPattern = "%" + searchTerm.trim() + "%";
        
        try (Connection conn = dbManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    String title = rs.getString("title");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");
                    String ministryName = rs.getString("ministry_name");
                    
                    // Add ministry context to title if available
                    String fullTitle = title;
                    if (ministryName != null && !ministryName.trim().isEmpty()) {
                        fullTitle = title + " (" + ministryName + ")";
                    }
                    
                    Contact contact = new Contact(
                        name != null ? name.trim() : "",
                        fullTitle != null ? fullTitle.trim() : "",
                        phone != null ? phone.trim() : "",
                        email != null ? email.trim() : ""
                    );
                    
                    results.add(contact);
                }
            }
            
        } catch (SQLException e) {
            System.err.println("Error searching contacts: " + e.getMessage());
            e.printStackTrace();
        }
        
        return results;
    }
    
    /**
     * Get total count of ministries
     */
    public int getMinistryCount() {
        String sql = "SELECT COUNT(*) FROM ministries";
        
        try (Connection conn = dbManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            
        } catch (SQLException e) {
            System.err.println("Error getting ministry count: " + e.getMessage());
        }
        
        return 0;
    }
    
    /**
     * Get total count of contacts
     */
    public int getContactCount() {
        String sql = "SELECT COUNT(*) FROM contacts";
        
        try (Connection conn = dbManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            
        } catch (SQLException e) {
            System.err.println("Error getting contact count: " + e.getMessage());
        }
        
        return 0;
    }
}