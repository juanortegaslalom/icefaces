package org.icefaces.samples.showcase.alberta.bean;

import org.icefaces.samples.showcase.alberta.dao.AlbertaDirectoryDAO;
import org.icefaces.samples.showcase.alberta.model.Contact;
import org.icefaces.samples.showcase.alberta.model.OrganizationalUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Main backing bean for the Alberta Staff Directory application
 */
@ManagedBean(name = "staffDirectoryBean")
@SessionScoped
public class StaffDirectoryBean implements Serializable {
    
    private List<OrganizationalUnit> ministries;
    private OrganizationalUnit selectedUnit;
    private String searchTerm = "";
    private String currentView = "main"; // main, organizational, contacts
    private List<Contact> searchResults;
    private AlbertaDirectoryDAO dao;
    
    public StaffDirectoryBean() {
        this.dao = new AlbertaDirectoryDAO();
        initializeData();
    }
    
    /**
     * Initialize data from Alberta government database
     */
    private void initializeData() {
        try {
            System.out.println("Loading Alberta Staff Directory data from database...");
            ministries = dao.getAllMinistries();
            System.out.println("Loaded " + ministries.size() + " ministries from database");
            
            // Log some statistics
            int totalContacts = dao.getContactCount();
            System.out.println("Total contacts in database: " + totalContacts);
            
        } catch (Exception e) {
            System.err.println("Error loading data from database: " + e.getMessage());
            e.printStackTrace();
            
            // Fallback to empty list if database fails
            ministries = new ArrayList<OrganizationalUnit>();
            
            // Create a simple error ministry to show something
            OrganizationalUnit errorMinistry = new OrganizationalUnit("Database Error", "ministry");
            errorMinistry.addContact(new Contact("System Administrator", "Please check database connection", "N/A", "admin@gov.ab.ca"));
            ministries.add(errorMinistry);
        }
    }
    
    /**
     * Toggle expansion of an organizational unit
     */
    public void toggleExpansion(OrganizationalUnit unit) {
        unit.setExpanded(!unit.isExpanded());
    }
    
    /**
     * Select an organizational unit to view details
     */
    public void selectUnit(OrganizationalUnit unit) {
        this.selectedUnit = unit;
        this.currentView = "contacts";
    }
    
    /**
     * Navigate to organizational view
     */
    public void showOrganizationalView() {
        this.currentView = "organizational";
        this.selectedUnit = null;
    }
    
    /**
     * Navigate to main view
     */
    public void showMainView() {
        this.currentView = "main";
        this.selectedUnit = null;
    }
    
    /**
     * Perform search action
     */
    public void search() {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            searchResults = new ArrayList<Contact>();
            return;
        }
        
        try {
            System.out.println("Searching for: " + searchTerm);
            searchResults = dao.searchContacts(searchTerm.trim());
            System.out.println("Found " + searchResults.size() + " search results");
            
            // Switch to search results view if we have results
            if (!searchResults.isEmpty()) {
                currentView = "search";
            }
            
        } catch (Exception e) {
            System.err.println("Error performing search: " + e.getMessage());
            e.printStackTrace();
            searchResults = new ArrayList<Contact>();
        }
    }
    
    /**
     * Get flattened list of all contacts for search
     */
    public List<Contact> getAllContacts() {
        List<Contact> allContacts = new ArrayList<Contact>();
        for (OrganizationalUnit ministry : ministries) {
            collectContacts(ministry, allContacts);
        }
        return allContacts;
    }
    
    private void collectContacts(OrganizationalUnit unit, List<Contact> contacts) {
        if (unit.getContacts() != null) {
            contacts.addAll(unit.getContacts());
        }
        if (unit.getChildren() != null) {
            for (OrganizationalUnit child : unit.getChildren()) {
                collectContacts(child, contacts);
            }
        }
    }
    
    // Getters and setters
    public List<OrganizationalUnit> getMinistries() {
        return ministries;
    }
    
    public void setMinistries(List<OrganizationalUnit> ministries) {
        this.ministries = ministries;
    }
    
    public OrganizationalUnit getSelectedUnit() {
        return selectedUnit;
    }
    
    public void setSelectedUnit(OrganizationalUnit selectedUnit) {
        this.selectedUnit = selectedUnit;
    }
    
    public String getSearchTerm() {
        return searchTerm;
    }
    
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
    
    public String getCurrentView() {
        return currentView;
    }
    
    public void setCurrentView(String currentView) {
        this.currentView = currentView;
    }
    
    public boolean isMainView() {
        return "main".equals(currentView);
    }
    
    public boolean isOrganizationalView() {
        return "organizational".equals(currentView);
    }
    
    public boolean isContactsView() {
        return "contacts".equals(currentView);
    }
    
    public boolean isSearchView() {
        return "search".equals(currentView);
    }
    
    public List<Contact> getSearchResults() {
        return searchResults;
    }
    
    public void setSearchResults(List<Contact> searchResults) {
        this.searchResults = searchResults;
    }
    
    public boolean hasSearchResults() {
        return searchResults != null && !searchResults.isEmpty();
    }
}