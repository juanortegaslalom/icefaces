/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.icefaces.demo.employee.bean;

import org.icefaces.demo.employee.dao.EmployeeDAO;
import org.icefaces.demo.employee.model.Employee;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * Managed bean for the Mini Employee Directory demo.
 * Handles employee data management and form operations using MySQL database persistence.
 */
@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    
    private EmployeeDAO employeeDAO;
    
    // Form fields for adding new employees
    private String newFirstName = "";
    private String newLastName = "";
    private String newEmail = "";
    private String newDepartment = "";
    
    // Sorting fields
    private String sortColumn = "firstName";
    private boolean sortAscending = true;
    
    // Cache for employees list to avoid repeated database calls
    private List<Employee> employeesCache;
    private boolean cacheValid = false;
    
    /**
     * Initialize the bean and setup database connection
     */
    @PostConstruct
    public void init() {
        try {
            employeeDAO = new EmployeeDAO();
            // Initialize sample data if database is empty
            employeeDAO.initializeSampleData();
            refreshEmployeeCache();
        } catch (Exception e) {
            System.err.println("Error initializing EmployeeBean: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Cleanup resources when bean is destroyed
     */
    @PreDestroy
    public void cleanup() {
        if (employeeDAO != null) {
            employeeDAO.close();
        }
    }
    
    /**
     * Refresh the employee cache from database
     */
    private void refreshEmployeeCache() {
        try {
            employeesCache = employeeDAO.findAllEmployees();
            if (employeesCache != null) {
                sortEmployees();
                cacheValid = true;
            }
        } catch (Exception e) {
            System.err.println("Error refreshing employee cache: " + e.getMessage());
            e.printStackTrace();
            cacheValid = false;
        }
    }
    
    /**
     * Get the list of employees
     */
    public List<Employee> getEmployees() {
        if (!cacheValid || employeesCache == null) {
            refreshEmployeeCache();
        }
        return employeesCache;
    }
    
    /**
     * Add a new employee
     */
    public void addEmployee(ActionEvent event) {
        try {
            if (isValidEmployee()) {
                Employee newEmployee = new Employee(
                    newFirstName.trim(), 
                    newLastName.trim(), 
                    newEmail.trim(), 
                    newDepartment.trim()
                );
                
                Employee saved = employeeDAO.saveEmployee(newEmployee);
                if (saved != null) {
                    clearForm();
                    refreshEmployeeCache();
                    
                    // Add success message
                    FacesContext.getCurrentInstance().addMessage(null, 
                        new javax.faces.application.FacesMessage(
                            javax.faces.application.FacesMessage.SEVERITY_INFO,
                            "Success", "Employee added successfully!"));
                }
            }
        } catch (Exception e) {
            System.err.println("Error adding employee: " + e.getMessage());
            e.printStackTrace();
            
            // Add error message
            FacesContext.getCurrentInstance().addMessage(null, 
                new javax.faces.application.FacesMessage(
                    javax.faces.application.FacesMessage.SEVERITY_ERROR,
                    "Error", "Failed to add employee. Please try again."));
        }
    }
    
    /**
     * Clear the form fields
     */
    public void clearForm() {
        newFirstName = "";
        newLastName = "";
        newEmail = "";
        newDepartment = "";
    }
    
    /**
     * Validate form input
     */
    private boolean isValidEmployee() {
        return newFirstName != null && !newFirstName.trim().isEmpty() &&
               newLastName != null && !newLastName.trim().isEmpty() &&
               newEmail != null && !newEmail.trim().isEmpty() &&
               newDepartment != null && !newDepartment.trim().isEmpty();
    }
    
    /**
     * Sort employees by the specified column
     */
    public void sortByColumn(String column) {
        if (column.equals(sortColumn)) {
            sortAscending = !sortAscending;
        } else {
            sortColumn = column;
            sortAscending = true;
        }
        sortEmployees();
    }
    
    /**
     * Sort the employee list
     */
    private void sortEmployees() {
        if (employeesCache == null) return;
        
        Collections.sort(employeesCache, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                int result = 0;
                if ("firstName".equals(sortColumn) || "name".equals(sortColumn)) {
                    result = e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
                } else if ("lastName".equals(sortColumn)) {
                    result = e1.getLastName().compareToIgnoreCase(e2.getLastName());
                } else if ("department".equals(sortColumn)) {
                    result = e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
                } else if ("email".equals(sortColumn)) {
                    result = e1.getEmail().compareToIgnoreCase(e2.getEmail());
                }
                return sortAscending ? result : -result;
            }
        });
    }
    
    /**
     * Get the sort indicator for the specified column
     */
    public String getSortIndicator(String column) {
        // Handle both "name" and "firstName" for backward compatibility
        if ((column.equals("name") && sortColumn.equals("firstName")) || 
            column.equals(sortColumn)) {
            return sortAscending ? " ↑" : " ↓";
        }
        return "";
    }
    
    /**
     * Action listener for column sorting
     */
    public void sortByName(ActionEvent event) {
        sortByColumn("firstName");
    }
    
    public void sortByPosition(ActionEvent event) {
        // For backward compatibility, map position to department
        sortByColumn("department");
    }
    
    public void sortByDepartment(ActionEvent event) {
        sortByColumn("department");
    }
    
    public void sortByEmail(ActionEvent event) {
        sortByColumn("email");
    }
    
    /**
     * Remove an employee from the database
     */
    public String removeEmployee(Employee employee) {
        try {
            if (employee != null && employeeDAO.deleteEmployee(employee)) {
                refreshEmployeeCache();
                
                // Add success message
                FacesContext.getCurrentInstance().addMessage(null, 
                    new javax.faces.application.FacesMessage(
                        javax.faces.application.FacesMessage.SEVERITY_INFO,
                        "Success", "Employee removed successfully!"));
            } else {
                // Add error message
                FacesContext.getCurrentInstance().addMessage(null, 
                    new javax.faces.application.FacesMessage(
                        javax.faces.application.FacesMessage.SEVERITY_ERROR,
                        "Error", "Failed to remove employee."));
            }
        } catch (Exception e) {
            System.err.println("Error removing employee: " + e.getMessage());
            e.printStackTrace();
            
            // Add error message
            FacesContext.getCurrentInstance().addMessage(null, 
                new javax.faces.application.FacesMessage(
                    javax.faces.application.FacesMessage.SEVERITY_ERROR,
                    "Error", "Failed to remove employee. Please try again."));
        }
        return null; // Stay on same page
    }
    
    /**
     * Remove employee by ID (for action listener)
     */
    public void removeEmployeeById(ActionEvent event) {
        String idParam = FacesContext.getCurrentInstance().getExternalContext()
            .getRequestParameterMap().get("employeeId");
        if (idParam != null) {
            try {
                Long id = Long.parseLong(idParam);
                Employee employee = employeeDAO.findById(id);
                if (employee != null) {
                    removeEmployee(employee);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid employee ID: " + idParam);
            }
        }
    }
    
    // Getters and setters for form fields
    public String getNewFirstName() {
        return newFirstName;
    }
    
    public void setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
    }
    
    public String getNewLastName() {
        return newLastName;
    }
    
    public void setNewLastName(String newLastName) {
        this.newLastName = newLastName;
    }
    
    public String getNewEmail() {
        return newEmail;
    }
    
    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
    
    public String getNewDepartment() {
        return newDepartment;
    }
    
    public void setNewDepartment(String newDepartment) {
        this.newDepartment = newDepartment;
    }
    
    // Backward compatibility getters/setters for existing form
    public String getNewName() {
        return newFirstName + (newLastName.isEmpty() ? "" : " " + newLastName);
    }
    
    public void setNewName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            String[] parts = newName.trim().split("\\s+", 2);
            this.newFirstName = parts[0];
            this.newLastName = parts.length > 1 ? parts[1] : "";
        }
    }
    
    public String getNewPosition() {
        return newDepartment; // Map position to department for backward compatibility
    }
    
    public void setNewPosition(String newPosition) {
        this.newDepartment = newPosition;
    }
    
    public String getSortColumn() {
        return sortColumn;
    }
    
    public boolean isSortAscending() {
        return sortAscending;
    }
    
    public int getEmployeeCount() {
        List<Employee> employees = getEmployees();
        return employees != null ? employees.size() : 0;
    }
}