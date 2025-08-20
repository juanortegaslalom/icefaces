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
        if (unit != null) {
            unit.setExpanded(!unit.isExpanded());
            System.out.println("DEBUG: Toggled expansion for " + unit.getName() + " to " + unit.isExpanded());
        } else {
            System.err.println("ERROR: toggleExpansion called with null unit");
        }
    }
    
    /**
     * Select an organizational unit to view details
     */
    public void selectUnit(OrganizationalUnit unit) {
        if (unit != null) {
            this.selectedUnit = unit;
            this.currentView = "contacts";
            System.out.println("DEBUG: Selected unit: " + unit.getName());
        } else {
            System.err.println("ERROR: selectUnit called with null unit");
        }
    }
    
    /**
     * Select a deputy minister office to view its contacts
     */
    public void selectDeputyMinisterOffice(OrganizationalUnit office) {
        if (office != null) {
            this.selectedUnit = office;
            this.currentView = "contacts";
            System.out.println("DEBUG: Selected deputy minister office: " + office.getName());
        } else {
            System.err.println("ERROR: selectDeputyMinisterOffice called with null office");
        }
    }
    
    
    /**
     * Navigate to main view
     */
    public String showMainView() {
        System.out.println("DEBUG: showMainView called, switching to main view");
        this.currentView = "main";
        this.selectedUnit = null;
        this.searchTerm = ""; // Clear search term when going back to main
        this.searchResults = null; // Clear search results
        System.out.println("DEBUG: Current view is now: " + this.currentView);
        return null;
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
            
            // Always switch to search results view after search
            currentView = "search";
            
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
    
    
    public boolean isContactsView() {
        return "contacts".equals(currentView);
    }
    
    public boolean isSearchView() {
        return "search".equals(currentView);
    }
    
    public boolean getSearchView() {
        return isSearchView();
    }
    
    public boolean isDeputyMinisterListView() {
        return "deputyMinisterList".equals(currentView);
    }
    
    public boolean getDeputyMinisterListView() {
        return isDeputyMinisterListView();
    }
    
    public boolean isSpokespersonListView() {
        return "spokespersonList".equals(currentView);
    }
    
    public boolean getSpokespersonListView() {
        return isSpokespersonListView();
    }
    
    /**
     * Navigate back to spokesperson list from department view
     */
    public void backToSpokespersonList() {
        showSpokespersonContacts();
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
    
    public boolean getHasSearchResults() {
        return hasSearchResults();
    }
    
    /**
     * Navigate to Contact a Minister section
     */
    public void showContactMinister() {
        this.currentView = "contacts";
        
        // Find Executive Branch ministry and Members of Executive Council unit
        for (OrganizationalUnit ministry : ministries) {
            if ("Executive Branch".equals(ministry.getName())) {
                for (OrganizationalUnit unit : ministry.getChildren()) {
                    if ("Members of Executive Council".equals(unit.getName())) {
                        this.selectedUnit = unit;
                        return;
                    }
                }
                // If no specific unit found, select the ministry itself
                this.selectedUnit = ministry;
                return;
            }
        }
    }
    
    /**
     * Navigate to Contact a Deputy Minister section
     */
    public void showContactDeputyMinister() {
        this.currentView = "deputyMinisterList";
        
        // Find Deputy Ministers ministry to show list of offices
        for (OrganizationalUnit ministry : ministries) {
            if ("Deputy Ministers".equals(ministry.getName())) {
                this.selectedUnit = ministry;
                return;
            }
        }
    }
    
    /**
     * Navigate to Spokesperson contacts section
     */
    public void showSpokespersonContacts() {
        this.currentView = "spokespersonList";
        
        // Find Spokesperson Contacts ministry to show list of departments
        for (OrganizationalUnit ministry : ministries) {
            if ("Spokesperson Contacts".equals(ministry.getName())) {
                this.selectedUnit = ministry;
                return;
            }
        }
    }
    
    /**
     * Select a spokesperson department to view its contacts
     */
    public void selectSpokespersonDepartment(OrganizationalUnit department) {
        if (department != null) {
            this.selectedUnit = department;
            this.currentView = "contacts";
            System.out.println("DEBUG: Selected spokesperson department: " + department.getName());
        } else {
            System.err.println("ERROR: selectSpokespersonDepartment called with null department");
        }
    }
    
    /**
     * Navigate to Administrative departments section
     */
    public void showAdministrativeDepartments() {
        this.currentView = "contacts";
        
        // Find Administrative Services ministry and create a combined view
        for (OrganizationalUnit ministry : ministries) {
            if ("Administrative Services".equals(ministry.getName())) {
                // Create a synthetic unit that combines all child contacts
                OrganizationalUnit combinedUnit = new OrganizationalUnit("Administrative Services", "ministry");
                
                // Add ministry-level contacts first
                if (ministry.getContacts() != null) {
                    for (Contact contact : ministry.getContacts()) {
                        combinedUnit.addContact(contact);
                    }
                }
                
                // Add all contacts from all child departments
                if (ministry.getChildren() != null) {
                    for (OrganizationalUnit department : ministry.getChildren()) {
                        if (department.getContacts() != null) {
                            for (Contact contact : department.getContacts()) {
                                combinedUnit.addContact(contact);
                            }
                        }
                    }
                }
                
                System.out.println("DEBUG: Administrative Services ministry found with " + 
                    (ministry.getChildren() != null ? ministry.getChildren().size() : 0) + " child units and " +
                    combinedUnit.getContacts().size() + " total contacts");
                
                this.selectedUnit = combinedUnit;
                return;
            }
        }
        
        System.err.println("ERROR: Administrative Services ministry not found!");
        System.out.println("Available ministries:");
        for (OrganizationalUnit ministry : ministries) {
            System.out.println("  - " + ministry.getName());
        }
    }
    
    /**
     * Check if current view is showing minister contacts
     */
    public boolean isMinisterContactsView() {
        return isContactsView() && selectedUnit != null && 
               (selectedUnit.getName().contains("Executive Council") ||
                (selectedUnit.getName().equals("Executive Branch")));
    }
    
    /**
     * Check if current view is showing deputy minister contacts
     */
    public boolean isDeputyMinisterContactsView() {
        return isContactsView() && selectedUnit != null && 
               (selectedUnit.getName().contains("Deputy Minister") ||
                selectedUnit.getName().contains("Office of"));
    }
    
    /**
     * Navigate back to deputy minister list from office view
     */
    public void backToDeputyMinisterList() {
        showContactDeputyMinister();
    }
    
    /**
     * Check if current view is showing spokesperson contacts
     */
    public boolean isSpokespersonContactsView() {
        return isContactsView() && selectedUnit != null && 
               selectedUnit.getName().contains("Spokesperson Contacts");
    }
    
    /**
     * Check if current view is showing administrative departments
     */
    public boolean isAdministrativeContactsView() {
        return isContactsView() && selectedUnit != null && 
               selectedUnit.getName().contains("Administrative Services");
    }
    
    /**
     * Check if current view is the main view (getter method for EL)
     */
    public boolean getShowMainView() {
        return isMainView();
    }
    
    
    /**
     * Getter method for search action (workaround for JSF EL evaluation)
     */
    public String getSearch() {
        return null; // This is just to satisfy EL evaluation, actual action method exists
    }
    
    /**
     * Getter method for showContactMinister action (workaround for JSF EL evaluation)
     */
    public String getShowContactMinister() {
        return null;
    }
    
    /**
     * Getter method for showContactDeputyMinister action (workaround for JSF EL evaluation)
     */
    public String getShowContactDeputyMinister() {
        return null;
    }
    
    /**
     * Getter method for showSpokespersonContacts action (workaround for JSF EL evaluation)
     */
    public String getShowSpokespersonContacts() {
        return null;
    }
    
    /**
     * Getter method for showAdministrativeDepartments action (workaround for JSF EL evaluation)
     */
    public String getShowAdministrativeDepartments() {
        return null;
    }
    
    
    
}