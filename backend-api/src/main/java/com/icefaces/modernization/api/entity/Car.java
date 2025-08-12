package com.icefaces.modernization.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Car entity - modernized from ICEfaces Car model
 * Original: org.icefaces.samples.showcase.example.compat.dataTable.Car
 * 
 * Modernizations:
 * - JPA annotations for persistence
 * - Bean validation annotations
 * - Modern ID generation strategy
 * - Proper relationship mapping potential
 */
@Entity
@Table(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Car name is required")
    @Size(min = 1, max = 100, message = "Car name must be between 1 and 100 characters")
    @Column(nullable = false, length = 100)
    private String name;
    
    @NotBlank(message = "Chassis type is required")
    @Size(min = 1, max = 50, message = "Chassis must be between 1 and 50 characters")
    @Column(nullable = false, length = 50)
    private String chassis;
    
    @NotNull(message = "Weight is required")
    @Min(value = 0, message = "Weight must be positive")
    @Column(nullable = false)
    private Integer weight;
    
    @NotNull(message = "Acceleration is required")
    @Min(value = 0, message = "Acceleration must be positive")
    @Column(nullable = false)
    private Integer acceleration;
    
    @NotNull(message = "MPG is required")
    @DecimalMin(value = "0.0", message = "MPG must be positive")
    @Column(nullable = false)
    private Double mpg;
    
    @NotNull(message = "Cost is required")
    @DecimalMin(value = "0.0", message = "Cost must be positive")
    @Column(nullable = false)
    private Double cost;
    
    // Default constructor for JPA
    public Car() {
    }
    
    // Constructor for easy creation
    public Car(String name, String chassis, Integer weight, Integer acceleration, Double mpg, Double cost) {
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Car car = (Car) o;
        return id != null ? id.equals(car.id) : car.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "Car{" +
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