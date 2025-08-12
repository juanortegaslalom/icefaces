package com.icefaces.modernization.api.dto;

/**
 * DTO for salary range counts used in chart generation
 * Replaces ICEfaces chart data preparation logic
 */
public class SalaryRangeCountDto {
    private String rangeName;
    private Integer minSalary;
    private Integer maxSalary;
    private Long count;

    public SalaryRangeCountDto() {}

    public SalaryRangeCountDto(String rangeName, Integer minSalary, Integer maxSalary, Long count) {
        this.rangeName = rangeName;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.count = count;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}