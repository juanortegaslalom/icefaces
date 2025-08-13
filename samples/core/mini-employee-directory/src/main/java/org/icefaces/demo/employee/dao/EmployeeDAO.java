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

package org.icefaces.demo.employee.dao;

import org.icefaces.demo.employee.model.Employee;

import javax.persistence.*;
import java.util.List;

/**
 * Data Access Object for Employee entity operations.
 * Handles all database CRUD operations using JPA/Hibernate.
 */
public class EmployeeDAO {
    
    private EntityManagerFactory emf;
    
    public EmployeeDAO() {
        try {
            emf = Persistence.createEntityManagerFactory("EmployeePU");
        } catch (Exception e) {
            System.err.println("Error creating EntityManagerFactory: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Get EntityManager for database operations
     */
    private EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("EmployeePU");
        }
        return emf.createEntityManager();
    }
    
    /**
     * Save a new employee to the database
     */
    public Employee saveEmployee(Employee employee) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        
        try {
            tx = em.getTransaction();
            tx.begin();
            
            em.persist(employee);
            tx.commit();
            
            return employee;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error saving employee: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to save employee", e);
        } finally {
            em.close();
        }
    }
    
    /**
     * Update an existing employee
     */
    public Employee updateEmployee(Employee employee) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        
        try {
            tx = em.getTransaction();
            tx.begin();
            
            Employee updated = em.merge(employee);
            tx.commit();
            
            return updated;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error updating employee: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to update employee", e);
        } finally {
            em.close();
        }
    }
    
    /**
     * Delete an employee by ID
     */
    public boolean deleteEmployee(Long id) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        
        try {
            tx = em.getTransaction();
            tx.begin();
            
            Employee employee = em.find(Employee.class, id);
            if (employee != null) {
                em.remove(employee);
                tx.commit();
                return true;
            } else {
                tx.rollback();
                return false;
            }
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error deleting employee: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }
    
    /**
     * Delete an employee object
     */
    public boolean deleteEmployee(Employee employee) {
        if (employee == null || employee.getId() == null) {
            return false;
        }
        return deleteEmployee(employee.getId());
    }
    
    /**
     * Find an employee by ID
     */
    public Employee findById(Long id) {
        EntityManager em = getEntityManager();
        
        try {
            return em.find(Employee.class, id);
        } catch (Exception e) {
            System.err.println("Error finding employee by ID: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    /**
     * Get all employees
     */
    public List<Employee> findAllEmployees() {
        EntityManager em = getEntityManager();
        
        try {
            TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Error finding all employees: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    /**
     * Find employees by department
     */
    public List<Employee> findByDepartment(String department) {
        EntityManager em = getEntityManager();
        
        try {
            TypedQuery<Employee> query = em.createQuery(
                "SELECT e FROM Employee e WHERE e.department = :department", Employee.class);
            query.setParameter("department", department);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Error finding employees by department: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    /**
     * Find employees by name (first or last name contains the search term)
     */
    public List<Employee> findByName(String name) {
        EntityManager em = getEntityManager();
        
        try {
            TypedQuery<Employee> query = em.createQuery(
                "SELECT e FROM Employee e WHERE LOWER(e.firstName) LIKE LOWER(:name) OR LOWER(e.lastName) LIKE LOWER(:name)", 
                Employee.class);
            query.setParameter("name", "%" + name + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Error finding employees by name: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    /**
     * Get total count of employees
     */
    public long getEmployeeCount() {
        EntityManager em = getEntityManager();
        
        try {
            TypedQuery<Long> query = em.createQuery("SELECT COUNT(e) FROM Employee e", Long.class);
            return query.getSingleResult();
        } catch (Exception e) {
            System.err.println("Error getting employee count: " + e.getMessage());
            e.printStackTrace();
            return 0;
        } finally {
            em.close();
        }
    }
    
    /**
     * Initialize database with sample data if empty
     */
    public void initializeSampleData() {
        if (getEmployeeCount() == 0) {
            System.out.println("Database is empty, initializing with sample data...");
            
            saveEmployee(new Employee("John", "Smith", "john.smith@company.com", "IT"));
            saveEmployee(new Employee("Sarah", "Johnson", "sarah.johnson@company.com", "IT"));
            saveEmployee(new Employee("Michael", "Brown", "michael.brown@company.com", "Finance"));
            saveEmployee(new Employee("Emily", "Davis", "emily.davis@company.com", "Design"));
            saveEmployee(new Employee("Robert", "Wilson", "robert.wilson@company.com", "IT"));
            saveEmployee(new Employee("Lisa", "Garcia", "lisa.garcia@company.com", "Human Resources"));
            saveEmployee(new Employee("David", "Martinez", "david.martinez@company.com", "Sales"));
            saveEmployee(new Employee("Jennifer", "Taylor", "jennifer.taylor@company.com", "Marketing"));
            
            System.out.println("Sample data initialized successfully.");
        }
    }
    
    /**
     * Close the EntityManagerFactory
     */
    public void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}