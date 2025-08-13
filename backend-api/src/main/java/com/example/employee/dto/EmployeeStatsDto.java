package com.example.employee.dto;

import java.util.Map;

/**
 * Employee statistics DTO
 * Provides aggregate information about employees
 */
public class EmployeeStatsDto {
    
    private long totalEmployees;
    private Map<String, Long> employeesByDepartment;
    private String lastUpdated;

    public EmployeeStatsDto() {}

    public EmployeeStatsDto(long totalEmployees, Map<String, Long> employeesByDepartment) {
        this.totalEmployees = totalEmployees;
        this.employeesByDepartment = employeesByDepartment;
    }

    // Getters and Setters
    public long getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(long totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public Map<String, Long> getEmployeesByDepartment() {
        return employeesByDepartment;
    }

    public void setEmployeesByDepartment(Map<String, Long> employeesByDepartment) {
        this.employeesByDepartment = employeesByDepartment;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "EmployeeStatsDto{" +
                "totalEmployees=" + totalEmployees +
                ", employeesByDepartment=" + employeesByDepartment +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}