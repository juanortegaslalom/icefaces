package com.icefaces.modernization.api.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object for Car entity
 * Used for API communication between Angular frontend and Spring Boot backend
 * Replaces direct exposure of ICEfaces model classes
 */
public class CarDto {
    
    private Long id;
    
    @NotBlank(message = "Car name is required")
    @Size(min = 1, max = 100, message = "Car name must be between 1 and 100 characters")
    private String name;
    
    @NotBlank(message = "Chassis type is required")
    @Size(min = 1, max = 50, message = "Chassis must be between 1 and 50 characters")
    private String chassis;
    
    @NotNull(message = "Weight is required")
    @Min(value = 0, message = "Weight must be positive")
    private Integer weight;
    
    @NotNull(message = "Acceleration is required")
    @Min(value = 0, message = "Acceleration must be positive")
    private Integer acceleration;
    
    @NotNull(message = "MPG is required")
    @DecimalMin(value = "0.0", message = "MPG must be positive")
    private Double mpg;
    
    @NotNull(message = "Cost is required")
    @DecimalMin(value = "0.0", message = "Cost must be positive")
    private Double cost;
    
    // Default constructor
    public CarDto() {
    }
    
    // Constructor for creation without ID
    public CarDto(String name, String chassis, Integer weight, Integer acceleration, Double mpg, Double cost) {
        this.name = name;
        this.chassis = chassis;
        this.weight = weight;
        this.acceleration = acceleration;
        this.mpg = mpg;
        this.cost = cost;
    }
    
    // Full constructor
    public CarDto(Long id, String name, String chassis, Integer weight, Integer acceleration, Double mpg, Double cost) {
        this.id = id;
        this.name = name;
        this.chassis = chassis;
        this.weight = weight;
        this.acceleration = acceleration;
        this.mpg = mpg;
        this.cost = cost;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getChassis() {
        return chassis;
    }
    
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    
    public Integer getWeight() {
        return weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    public Integer getAcceleration() {
        return acceleration;
    }
    
    public void setAcceleration(Integer acceleration) {
        this.acceleration = acceleration;
    }
    
    public Double getMpg() {
        return mpg;
    }
    
    public void setMpg(Double mpg) {
        this.mpg = mpg;
    }
    
    public Double getCost() {
        return cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    // Utility methods for frontend display
    public String getDisplayName() {
        return name + " (" + chassis + ")";
    }
    
    public String getFormattedCost() {
        return String.format("$%.2f", cost);
    }
    
    public String getFormattedMpg() {
        return String.format("%.1f MPG", mpg);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        CarDto carDto = (CarDto) o;
        return id != null ? id.equals(carDto.id) : carDto.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "CarDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chassis='" + chassis + '\'' +
                ", weight=" + weight +
                ", acceleration=" + acceleration +
                ", mpg=" + mpg +
                ", cost=" + cost +
                '}';
    }
}