package com.icefaces.modernization.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object for Employee entity
 * Used for employee management API operations
 * Replaces direct ICEfaces employee model exposure
 */
public class EmployeeDto {
    
    private Long id;
    
    @NotBlank(message = "First name is required")
    @Size(min = 1, max = 50, message = "First name must be between 1 and 50 characters")
    private String firstName;
    
    @NotBlank(message = "Last name is required")
    @Size(min = 1, max = 50, message = "Last name must be between 1 and 50 characters")
    private String lastName;
    
    @Size(max = 200, message = "Address must be less than 200 characters")
    private String address;
    
    @NotNull(message = "Salary is required")
    @Min(value = 0, message = "Salary must be positive")
    private Integer salary;
    
    // Default constructor
    public EmployeeDto() {
    }
    
    // Constructor for creation without ID
    public EmployeeDto(String firstName, String lastName, String address, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
    }
    
    // Full constructor
    public EmployeeDto(Long id, String firstName, String lastName, String address, Integer salary) {
        this.id = id;
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
    
    // Utility methods for frontend display
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getDisplayName() {
        return lastName + ", " + firstName;
    }
    
    public String getFormattedSalary() {
        return String.format("$%,d", salary);
    }
    
    public String getInitials() {
        return (firstName != null && firstName.length() > 0 ? firstName.substring(0, 1) : "") +
               (lastName != null && lastName.length() > 0 ? lastName.substring(0, 1) : "");
    }
    
    // For dropdown/select displays
    public String getSelectLabel() {
        return getDisplayName() + " (" + getFormattedSalary() + ")";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        EmployeeDto that = (EmployeeDto) o;
        return id != null ? id.equals(that.id) : that.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}