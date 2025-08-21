package org.icefaces.samples.showcase.alberta.bean;

import org.icefaces.samples.showcase.alberta.dao.AlbertaDirectoryDAO;
import org.icefaces.samples.showcase.alberta.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple Data Controller for Alberta Staff Directory
 * - 3 simple views: Main, Ministers, All Staff
 * - Plain Java class for easy migration to Spring Boot
 * - No JSF dependencies
 */
public class StaffDirectoryBean {
    
    private AlbertaDirectoryDAO dao;
    
    // View state - simplified to 3 views
    private String currentView = "main"; // main, ministers, staff
    
    // Data - single list, filter as needed
    private List<Contact> allContacts;
    private List<Contact> searchResults;
    
    // Search functionality
    private String searchTerm = "";
    
    public StaffDirectoryBean() {
        this.dao = new AlbertaDirectoryDAO();
    }
    
    // View Navigation Methods
    public void showMainView() {
        currentView = "main";
    }
    
    public void showMinistersView() {
        currentView = "ministers";
        loadAllContacts();
    }
    
    public void showAllStaffView() {
        currentView = "staff";
        loadAllContacts();
    }
    
    // Data Loading - single method for simplicity
    private void loadAllContacts() {
        try {
            allContacts = dao.getAllContacts();
        } catch (Exception e) {
            System.err.println("Error loading contacts: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Search functionality
    public void performSearch() {
        if (searchTerm != null && !searchTerm.trim().isEmpty()) {
            try {
                searchResults = dao.searchContacts(searchTerm.trim());
                currentView = "search";
            } catch (Exception e) {
                System.err.println("Error performing search: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // If empty search, show all contacts
            loadAllContacts();
            searchResults = allContacts;
            currentView = "search";
        }
    }
    
    public void clearSearch() {
        searchTerm = "";
        searchResults = null;
        currentView = "main";
    }
    
    // View State Properties
    public boolean isMainView() {
        return "main".equals(currentView);
    }
    
    public boolean isMinistersView() {
        return "ministers".equals(currentView);
    }
    
    public boolean isStaffView() {
        return "staff".equals(currentView);
    }
    
    public boolean isSearchView() {
        return "search".equals(currentView);
    }
    
    // Helper methods
    public boolean hasSearchResults() {
        return searchResults != null && !searchResults.isEmpty();
    }
    
    public int getSearchResultsCount() {
        return searchResults != null ? searchResults.size() : 0;
    }
    
    public int getMinistersCount() {
        if (allContacts == null) return 0;
        List<Contact> ministers = dao.filterByRole(allContacts, "minister");
        List<Contact> deputies = dao.filterByRole(allContacts, "deputy_minister");
        return ministers.size() + deputies.size();
    }
    
    public int getAllStaffCount() {
        if (allContacts == null) return 0;
        return dao.filterByRole(allContacts, "staff").size();
    }
    
    // Getters and Setters
    public String getCurrentView() {
        return currentView;
    }
    
    public void setCurrentView(String currentView) {
        this.currentView = currentView;
    }
    
    // Data filtering methods
    public List<Contact> getMinisters() {
        if (allContacts == null) return new ArrayList<Contact>();
        // Combine ministers and deputy ministers for the ministers view
        List<Contact> ministers = new ArrayList<Contact>();
        ministers.addAll(dao.filterByRole(allContacts, "minister"));
        ministers.addAll(dao.filterByRole(allContacts, "deputy_minister"));
        return ministers;
    }
    
    public List<Contact> getAllStaff() {
        if (allContacts == null) return new ArrayList<Contact>();
        return dao.filterByRole(allContacts, "staff");
    }
    
    public List<Contact> getAllContacts() {
        return allContacts;
    }
    
    public void setAllContacts(List<Contact> allContacts) {
        this.allContacts = allContacts;
    }
    
    public List<Contact> getSearchResults() {
        return searchResults;
    }
    
    public void setSearchResults(List<Contact> searchResults) {
        this.searchResults = searchResults;
    }
    
    public String getSearchTerm() {
        return searchTerm;
    }
    
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}