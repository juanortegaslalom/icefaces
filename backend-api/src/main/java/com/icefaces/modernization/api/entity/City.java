package com.icefaces.modernization.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * City entity - modernized from ICEfaces City model
 * Original: org.icefaces.samples.showcase.example.ace.autocompleteentry.City
 * 
 * Modernizations:
 * - JPA annotations for persistence
 * - Bean validation annotations
 * - Proper geographic coordinate validation
 * - Enhanced for autocomplete and geographic features
 */
@Entity
@Table(name = "cities", 
       indexes = {
           @Index(name = "idx_city_name", columnList = "name"),
           @Index(name = "idx_city_country", columnList = "country"),
           @Index(name = "idx_city_name_country", columnList = "name, country")
       })
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "City name is required")
    @Size(min = 1, max = 100, message = "City name must be between 1 and 100 characters")
    @Column(nullable = false, length = 100)
    private String name;
    
    @NotBlank(message = "Country is required")
    @Size(min = 1, max = 100, message = "Country name must be between 1 and 100 characters")
    @Column(nullable = false, length = 100)
    private String country;
    
    @NotNull(message = "Latitude is required")
    @DecimalMin(value = "-90.0", message = "Latitude must be between -90 and 90")
    @DecimalMax(value = "90.0", message = "Latitude must be between -90 and 90")
    @Column(nullable = false)
    private Double latitude;
    
    @NotNull(message = "Longitude is required")
    @DecimalMin(value = "-180.0", message = "Longitude must be between -180 and 180")
    @DecimalMax(value = "180.0", message = "Longitude must be between -180 and 180")
    @Column(nullable = false)
    private Double longitude;
    
    @DecimalMin(value = "-1000.0", message = "Altitude must be above -1000 meters")
    @DecimalMax(value = "10000.0", message = "Altitude must be below 10000 meters")
    @Column
    private Double altitude;
    
    // Default constructor for JPA
    public City() {
    }
    
    // Constructor for easy creation
    public City(String name, String country, Double latitude, Double longitude) {
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    // Full constructor
    public City(String name, String country, Double latitude, Double longitude, Double altitude) {
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
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
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public Double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    
    public Double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
    public Double getAltitude() {
        return altitude;
    }
    
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
    
    // Utility method for display
    public String getDisplayName() {
        return name + ", " + country;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        City city = (City) o;
        
        if (!name.equals(city.name)) return false;
        return country.equals(city.country);
    }
    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }
}