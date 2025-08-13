package com.example.employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

/**
 * Employee DTO for API communication
 * Clean data transfer object without JPA annotations
 */
public class EmployeeDto {
    
    private Long id;
    
    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name must be less than 50 characters")
    private String firstName;
    
    @NotBlank(message = "Last name is required") 
    @Size(max = 50, message = "Last name must be less than 50 characters")
    private String lastName;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    @Size(max = 100, message = "Email must be less than 100 characters")
    private String email;
    
    @NotBlank(message = "Department is required")
    @Size(max = 50, message = "Department must be less than 50 characters") 
    private String department;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructors
    public EmployeeDto() {}

    public EmployeeDto(String firstName, String lastName, String email, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Computed fields for frontend display
    public String getFullName() {
        return (firstName != null ? firstName : "") + 
               (lastName != null && !lastName.isEmpty() ? " " + lastName : "");
    }

    // For backward compatibility with ICEfaces templates
    public String getName() {
        return getFullName();
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}