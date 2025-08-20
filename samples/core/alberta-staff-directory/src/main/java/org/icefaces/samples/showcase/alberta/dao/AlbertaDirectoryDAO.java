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
        Connection conn = null;
        
        try {
            conn = dbManager.getConnection();
            
            // First, load all ministries
            String ministriesQuery = "SELECT id, name FROM ministries ORDER BY name";
            PreparedStatement ministriesStmt = conn.prepareStatement(ministriesQuery);
            ResultSet ministriesRs = ministriesStmt.executeQuery();
            
            Map<Integer, OrganizationalUnit> ministryMap = new HashMap<Integer, OrganizationalUnit>();
            
            while (ministriesRs.next()) {
                int ministryId = ministriesRs.getInt("id");
                String ministryName = ministriesRs.getString("name");
                
                OrganizationalUnit ministry = new OrganizationalUnit(ministryName, "ministry");
                ministries.add(ministry);
                ministryMap.put(ministryId, ministry);
            }
            ministriesRs.close();
            ministriesStmt.close();
            
            // Load organizational units for each ministry
            String unitsQuery = "SELECT id, ministry_id, parent_id, name, unit_type FROM organizational_units ORDER BY ministry_id, parent_id, name";
            PreparedStatement unitsStmt = conn.prepareStatement(unitsQuery);
            ResultSet unitsRs = unitsStmt.executeQuery();
            
            Map<Integer, OrganizationalUnit> unitMap = new HashMap<Integer, OrganizationalUnit>();
            
            while (unitsRs.next()) {
                int unitId = unitsRs.getInt("id");
                int ministryId = unitsRs.getInt("ministry_id");
                Integer parentId = unitsRs.getObject("parent_id", Integer.class);
                String unitName = unitsRs.getString("name");
                String unitType = unitsRs.getString("unit_type");
                
                OrganizationalUnit unit = new OrganizationalUnit(unitName, unitType);
                unitMap.put(unitId, unit);
                
                // Attach to parent (either ministry or parent unit)
                if (parentId == null) {
                    // This unit belongs directly to a ministry
                    OrganizationalUnit ministry = ministryMap.get(ministryId);
                    if (ministry != null) {
                        ministry.addChild(unit);
                    }
                } else {
                    // This unit belongs to a parent unit
                    OrganizationalUnit parentUnit = unitMap.get(parentId);
                    if (parentUnit != null) {
                        parentUnit.addChild(unit);
                    }
                }
            }
            unitsRs.close();
            unitsStmt.close();
            
            // Load contacts for ministries and organizational units
            String contactsQuery = "SELECT c.name, c.title, c.phone, c.email, c.ministry_id, c.organizational_unit_id " +
                                 "FROM contacts c ORDER BY c.ministry_id, c.organizational_unit_id, c.name";
            PreparedStatement contactsStmt = conn.prepareStatement(contactsQuery);
            ResultSet contactsRs = contactsStmt.executeQuery();
            
            while (contactsRs.next()) {
                String contactName = contactsRs.getString("name");
                String contactTitle = contactsRs.getString("title");
                String contactPhone = contactsRs.getString("phone");
                String contactEmail = contactsRs.getString("email");
                int ministryId = contactsRs.getInt("ministry_id");
                Integer unitId = contactsRs.getObject("organizational_unit_id", Integer.class);
                
                Contact contact = new Contact(contactName, contactTitle, contactPhone, contactEmail);
                
                if (unitId != null) {
                    // Contact belongs to an organizational unit
                    OrganizationalUnit unit = unitMap.get(unitId);
                    if (unit != null) {
                        unit.addContact(contact);
                    }
                } else {
                    // Contact belongs directly to a ministry
                    OrganizationalUnit ministry = ministryMap.get(ministryId);
                    if (ministry != null) {
                        ministry.addContact(contact);
                    }
                }
            }
            contactsRs.close();
            contactsStmt.close();
            
            System.out.println("Loaded " + ministries.size() + " ministries from database");
            
        } catch (SQLException e) {
            System.err.println("Error loading ministries from database: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error closing database connection: " + e.getMessage());
                }
            }
        }
        
        return ministries;
    }
    
    /**
     * Search for contacts by name, title, or ministry
     */
    public List<Contact> searchContacts(String searchTerm) {
        List<Contact> results = new ArrayList<Contact>();
        
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return results;
        }
        
        Connection conn = null;
        
        try {
            conn = dbManager.getConnection();
            
            // Search contacts by name, title, ministry name, or organizational unit name
            String searchQuery = 
                "SELECT DISTINCT c.name, c.title, c.phone, c.email " +
                "FROM contacts c " +
                "LEFT JOIN ministries m ON c.ministry_id = m.id " +
                "LEFT JOIN organizational_units ou ON c.organizational_unit_id = ou.id " +
                "WHERE LOWER(c.name) LIKE ? " +
                "   OR LOWER(c.title) LIKE ? " +
                "   OR LOWER(m.name) LIKE ? " +
                "   OR LOWER(ou.name) LIKE ? " +
                "ORDER BY c.name";
            
            PreparedStatement searchStmt = conn.prepareStatement(searchQuery);
            String searchPattern = "%" + searchTerm.trim().toLowerCase() + "%";
            
            searchStmt.setString(1, searchPattern);
            searchStmt.setString(2, searchPattern);
            searchStmt.setString(3, searchPattern);
            searchStmt.setString(4, searchPattern);
            
            ResultSet searchRs = searchStmt.executeQuery();
            
            while (searchRs.next()) {
                String contactName = searchRs.getString("name");
                String contactTitle = searchRs.getString("title");
                String contactPhone = searchRs.getString("phone");
                String contactEmail = searchRs.getString("email");
                
                Contact contact = new Contact(contactName, contactTitle, contactPhone, contactEmail);
                results.add(contact);
            }
            
            searchRs.close();
            searchStmt.close();
            
            System.out.println("Search for '" + searchTerm + "' returned " + results.size() + " results from database");
            
        } catch (SQLException e) {
            System.err.println("Error searching contacts in database: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error closing database connection: " + e.getMessage());
                }
            }
        }
        
        return results;
    }
    
    
    /**
     * Get total count of ministries
     */
    public int getMinistryCount() {
        Connection conn = null;
        int count = 0;
        
        try {
            conn = dbManager.getConnection();
            
            String countQuery = "SELECT COUNT(*) as ministry_count FROM ministries";
            PreparedStatement countStmt = conn.prepareStatement(countQuery);
            ResultSet countRs = countStmt.executeQuery();
            
            if (countRs.next()) {
                count = countRs.getInt("ministry_count");
            }
            
            countRs.close();
            countStmt.close();
            
        } catch (SQLException e) {
            System.err.println("Error counting ministries in database: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error closing database connection: " + e.getMessage());
                }
            }
        }
        
        return count;
    }
    
    /**
     * Get total count of contacts
     */
    public int getContactCount() {
        Connection conn = null;
        int count = 0;
        
        try {
            conn = dbManager.getConnection();
            
            String countQuery = "SELECT COUNT(*) as contact_count FROM contacts";
            PreparedStatement countStmt = conn.prepareStatement(countQuery);
            ResultSet countRs = countStmt.executeQuery();
            
            if (countRs.next()) {
                count = countRs.getInt("contact_count");
            }
            
            countRs.close();
            countStmt.close();
            
        } catch (SQLException e) {
            System.err.println("Error counting contacts in database: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error closing database connection: " + e.getMessage());
                }
            }
        }
        
        return count;
    }
}