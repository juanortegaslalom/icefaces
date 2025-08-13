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

import org.icefaces.demo.employee.model.Employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * Managed bean for the Mini Employee Directory demo.
 * Handles employee data management and form operations.
 */
@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    
    private static List<Employee> employees = new ArrayList<Employee>();
    private static int nextId = 1;
    
    // Form fields for adding new employees
    private String newName = "";
    private String newPosition = "";
    private String newDepartment = "";
    private String newEmail = "";
    
    
    // Sorting fields
    private String sortColumn = "name";
    private boolean sortAscending = true;
    
    // Initialize with sample data
    static {
        employees.add(new Employee(nextId++, "John Smith", "Software Engineer", "IT", "john.smith@company.com"));
        employees.add(new Employee(nextId++, "Sarah Johnson", "Project Manager", "IT", "sarah.johnson@company.com"));
        employees.add(new Employee(nextId++, "Michael Brown", "Business Analyst", "Finance", "michael.brown@company.com"));
        employees.add(new Employee(nextId++, "Emily Davis", "UX Designer", "Design", "emily.davis@company.com"));
        employees.add(new Employee(nextId++, "Robert Wilson", "DevOps Engineer", "IT", "robert.wilson@company.com"));
        employees.add(new Employee(nextId++, "Lisa Garcia", "HR Manager", "Human Resources", "lisa.garcia@company.com"));
        employees.add(new Employee(nextId++, "David Martinez", "Sales Representative", "Sales", "david.martinez@company.com"));
        employees.add(new Employee(nextId++, "Jennifer Taylor", "Marketing Specialist", "Marketing", "jennifer.taylor@company.com"));
    }
    
    public EmployeeBean() {
        sortEmployees();
    }
    
    /**
     * Get the list of employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }
    
    /**
     * Add a new employee
     */
    public void addEmployee(ActionEvent event) {
        if (isValidEmployee()) {
            Employee newEmployee = new Employee(nextId++, newName.trim(), newPosition.trim(), newDepartment.trim(), newEmail.trim());
            employees.add(newEmployee);
            clearForm();
            sortEmployees();
        }
    }
    
    /**
     * Clear the form fields
     */
    public void clearForm() {
        newName = "";
        newPosition = "";
        newDepartment = "";
        newEmail = "";
    }
    
    /**
     * Validate form input
     */
    private boolean isValidEmployee() {
        return newName != null && !newName.trim().isEmpty() &&
               newPosition != null && !newPosition.trim().isEmpty() &&
               newDepartment != null && !newDepartment.trim().isEmpty() &&
               newEmail != null && !newEmail.trim().isEmpty();
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
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                int result = 0;
                if ("name".equals(sortColumn)) {
                    result = e1.getName().compareToIgnoreCase(e2.getName());
                } else if ("position".equals(sortColumn)) {
                    result = e1.getPosition().compareToIgnoreCase(e2.getPosition());
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
        if (column.equals(sortColumn)) {
            return sortAscending ? " ↑" : " ↓";
        }
        return "";
    }
    
    /**
     * Action listener for column sorting
     */
    public void sortByName(ActionEvent event) {
        sortByColumn("name");
    }
    
    public void sortByPosition(ActionEvent event) {
        sortByColumn("position");
    }
    
    public void sortByDepartment(ActionEvent event) {
        sortByColumn("department");
    }
    
    public void sortByEmail(ActionEvent event) {
        sortByColumn("email");
    }
    
    /**
     * Remove an employee from the list
     */
    public String removeEmployee(Employee employee) {
        if (employee != null) {
            employees.remove(employee);
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
                int id = Integer.parseInt(idParam);
                Employee toRemove = null;
                for (Employee emp : employees) {
                    if (emp.getId() == id) {
                        toRemove = emp;
                        break;
                    }
                }
                if (toRemove != null) {
                    removeEmployee(toRemove);
                }
            } catch (NumberFormatException e) {
                // Handle invalid ID
            }
        }
    }
    
    
    // Getters and setters for form fields
    public String getNewName() {
        return newName;
    }
    
    public void setNewName(String newName) {
        this.newName = newName;
    }
    
    public String getNewPosition() {
        return newPosition;
    }
    
    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
    }
    
    public String getNewDepartment() {
        return newDepartment;
    }
    
    public void setNewDepartment(String newDepartment) {
        this.newDepartment = newDepartment;
    }
    
    public String getNewEmail() {
        return newEmail;
    }
    
    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
    
    public String getSortColumn() {
        return sortColumn;
    }
    
    public boolean isSortAscending() {
        return sortAscending;
    }
    
    public int getEmployeeCount() {
        return employees.size();
    }
}