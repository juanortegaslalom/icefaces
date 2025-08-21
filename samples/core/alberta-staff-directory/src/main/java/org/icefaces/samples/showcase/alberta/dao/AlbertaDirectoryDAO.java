package org.icefaces.samples.showcase.alberta.dao;

import org.icefaces.samples.showcase.alberta.model.Contact;
import org.icefaces.samples.showcase.alberta.util.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Alberta Staff Directory
 * - Simple JDBC operations
 * - PostgreSQL-compatible field naming
 */
public class AlbertaDirectoryDAO {
    
    private DatabaseManager dbManager;
    
    public AlbertaDirectoryDAO() {
        this.dbManager = DatabaseManager.getInstance();
    }
    
    /**
     * Get all contacts from database
     */
    public List<Contact> getAllContacts() {
        String query = "SELECT name, title, phone, email, ministry, role_type FROM contacts ORDER BY name";
        return executeQuery(query);
    }
    
    /**
     * Search contacts by name, title, or ministry
     */
    public List<Contact> searchContacts(String searchTerm) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return getAllContacts();
        }
        
        List<Contact> contacts = new ArrayList<Contact>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = dbManager.getConnection();
            String query = "SELECT name, title, phone, email, ministry, role_type FROM contacts " +
                          "WHERE LOWER(name) LIKE ? OR LOWER(title) LIKE ? OR LOWER(ministry) LIKE ? " +
                          "ORDER BY name";
            stmt = conn.prepareStatement(query);
            String searchPattern = "%" + searchTerm.toLowerCase() + "%";
            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);
            
            rs = stmt.executeQuery();
            contacts = mapResultSetToContacts(rs);
            
        } catch (SQLException e) {
            System.err.println("Error searching contacts: " + e.getMessage());
            e.printStackTrace();
        } finally {
            closeResources(rs, stmt, conn);
        }
        
        return contacts;
    }
    
    /**
     * Filter contacts by role type
     */
    public List<Contact> filterByRole(List<Contact> contacts, String roleType) {
        List<Contact> filtered = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (roleType.equals(contact.getRole_type())) {
                filtered.add(contact);
            }
        }
        return filtered;
    }
    
    // Helper methods to reduce code duplication
    
    private List<Contact> executeQuery(String query) {
        List<Contact> contacts = new ArrayList<Contact>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = dbManager.getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            contacts = mapResultSetToContacts(rs);
            
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
            e.printStackTrace();
        } finally {
            closeResources(rs, stmt, conn);
        }
        
        return contacts;
    }
    
    private List<Contact> mapResultSetToContacts(ResultSet rs) throws SQLException {
        List<Contact> contacts = new ArrayList<Contact>();
        while (rs.next()) {
            Contact contact = new Contact();
            contact.setName(rs.getString("name"));
            contact.setTitle(rs.getString("title"));
            contact.setPhone(rs.getString("phone"));
            contact.setEmail(rs.getString("email"));
            contact.setMinistry(rs.getString("ministry"));
            contact.setRole_type(rs.getString("role_type"));
            contacts.add(contact);
        }
        return contacts;
    }
    
    private void closeResources(ResultSet rs, PreparedStatement stmt, Connection conn) {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
}