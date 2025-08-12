package com.icefaces.modernization.api.dto;

/**
 * DTO for Car statistics used in dashboard and reporting
 * Replaces ICEfaces chart data preparation logic
 */
public class CarStatisticsDto {
    private Long totalCars;
    private Double averageMpg;
    private Double averageCost;
    private Double averageWeight;
    private Double maxMpg;
    private Double minCost;
    private Double maxCost;

    public CarStatisticsDto() {}

    public CarStatisticsDto(Long totalCars, Double averageMpg, Double averageCost, 
                           Double averageWeight, Double maxMpg, Double minCost, Double maxCost) {
        this.totalCars = totalCars;
        this.averageMpg = averageMpg;
        this.averageCost = averageCost;
        this.averageWeight = averageWeight;
        this.maxMpg = maxMpg;
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    public Long getTotalCars() {
        return totalCars;
    }

    public void setTotalCars(Long totalCars) {
        this.totalCars = totalCars;
    }

    public Double getAverageMpg() {
        return averageMpg;
    }

    public void setAverageMpg(Double averageMpg) {
        this.averageMpg = averageMpg;
    }

    public Double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(Double averageCost) {
        this.averageCost = averageCost;
    }

    public Double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(Double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public Double getMaxMpg() {
        return maxMpg;
    }

    public void setMaxMpg(Double maxMpg) {
        this.maxMpg = maxMpg;
    }

    public Double getMinCost() {
        return minCost;
    }

    public void setMinCost(Double minCost) {
        this.minCost = minCost;
    }

    public Double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(Double maxCost) {
        this.maxCost = maxCost;
    }
}