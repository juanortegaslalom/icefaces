package com.icefaces.modernization.api.dto;

/**
 * DTO for Employee general statistics
 * Replaces ICEfaces HR analytics functionality
 */
public class EmployeeStatisticsDto {
    private Long totalEmployees;
    private Double averageSalary;
    private Long distinctCities;
    private Long highEarners;

    public EmployeeStatisticsDto() {}

    public EmployeeStatisticsDto(Long totalEmployees, Double averageSalary, 
                                Long distinctCities, Long highEarners) {
        this.totalEmployees = totalEmployees;
        this.averageSalary = averageSalary;
        this.distinctCities = distinctCities;
        this.highEarners = highEarners;
    }

    public Long getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Long totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Long getDistinctCities() {
        return distinctCities;
    }

    public void setDistinctCities(Long distinctCities) {
        this.distinctCities = distinctCities;
    }

    public Long getHighEarners() {
        return highEarners;
    }

    public void setHighEarners(Long highEarners) {
        this.highEarners = highEarners;
    }
}