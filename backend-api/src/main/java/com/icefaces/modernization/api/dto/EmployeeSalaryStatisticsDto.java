package com.icefaces.modernization.api.dto;

/**
 * DTO for Employee salary statistics
 * Replaces ICEfaces statistical calculation logic
 */
public class EmployeeSalaryStatisticsDto {
    private Double averageSalary;
    private Double medianSalary;
    private Double minSalary;
    private Double maxSalary;
    private Long totalEmployees;

    public EmployeeSalaryStatisticsDto() {}

    public EmployeeSalaryStatisticsDto(Double averageSalary, Double medianSalary, 
                                      Double minSalary, Double maxSalary, Long totalEmployees) {
        this.averageSalary = averageSalary;
        this.medianSalary = medianSalary;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.totalEmployees = totalEmployees;
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Double getMedianSalary() {
        return medianSalary;
    }

    public void setMedianSalary(Double medianSalary) {
        this.medianSalary = medianSalary;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Long getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Long totalEmployees) {
        this.totalEmployees = totalEmployees;
    }
}