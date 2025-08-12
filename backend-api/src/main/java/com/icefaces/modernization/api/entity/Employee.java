package com.icefaces.modernization.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Employee entity - modernized from ICEfaces Employee model
 * Original: org.icefaces.samples.showcase.example.compat.series.Employee
 * 
 * Modernizations:
 * - JPA annotations for persistence
 * - Bean validation annotations
 * - Enhanced salary handling
 * - Better name handling and indexing
 */
@Entity
@Table(name = "employees",
       indexes = {
           @Index(name = "idx_employee_lastname", columnList = "lastName"),
           @Index(name = "idx_employee_fullname", columnList = "firstName, lastName"),
           @Index(name = "idx_employee_salary", columnList = "salary")
       })
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "First name is required")
    @Size(min = 1, max = 50, message = "First name must be between 1 and 50 characters")
    @Column(nullable = false, length = 50)
    private String firstName;
    
    @NotBlank(message = "Last name is required")
    @Size(min = 1, max = 50, message = "Last name must be between 1 and 50 characters")
    @Column(nullable = false, length = 50)
    private String lastName;
    
    @Size(max = 200, message = "Address must be less than 200 characters")
    @Column(length = 200)
    private String address;
    
    @NotNull(message = "Salary is required")
    @Min(value = 0, message = "Salary must be positive")
    @Column(nullable = false)
    private Integer salary;
    
    // Default constructor for JPA
    public Employee() {
    }
    
    // Constructor for easy creation
    public Employee(String firstName, String lastName, String address, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public Integer getSalary() {
        return salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    // Utility methods
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getDisplayName() {
        return lastName + ", " + firstName;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Employee employee = (Employee) o;
        return id != null ? id.equals(employee.id) : employee.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}