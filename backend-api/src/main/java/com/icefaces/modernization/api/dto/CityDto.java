package com.icefaces.modernization.api.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object for City entity
 * Optimized for autocomplete and geographic API responses
 * Replaces direct ICEfaces model exposure in web services
 */
public class CityDto {
    
    private Long id;
    
    @NotBlank(message = "City name is required")
    @Size(min = 1, max = 100, message = "City name must be between 1 and 100 characters")
    private String name;
    
    @NotBlank(message = "Country is required")
    @Size(min = 1, max = 100, message = "Country name must be between 1 and 100 characters")
    private String country;
    
    @NotNull(message = "Latitude is required")
    @DecimalMin(value = "-90.0", message = "Latitude must be between -90 and 90")
    @DecimalMax(value = "90.0", message = "Latitude must be between -90 and 90")
    private Double latitude;
    
    @NotNull(message = "Longitude is required")
    @DecimalMin(value = "-180.0", message = "Longitude must be between -180 and 180")
    @DecimalMax(value = "180.0", message = "Longitude must be between -180 and 180")
    private Double longitude;
    
    @DecimalMin(value = "-1000.0", message = "Altitude must be above -1000 meters")
    @DecimalMax(value = "10000.0", message = "Altitude must be below 10000 meters")
    private Double altitude;
    
    // Default constructor
    public CityDto() {
    }
    
    // Constructor for basic city info (commonly used for autocomplete)
    public CityDto(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    // Constructor without altitude
    public CityDto(String name, String country, Double latitude, Double longitude) {
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    // Full constructor
    public CityDto(Long id, String name, String country, Double latitude, Double longitude, Double altitude) {
        this.id = id;
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
    
    // Utility methods for frontend display
    public String getDisplayName() {
        return name + ", " + country;
    }
    
    public String getFormattedCoordinates() {
        if (latitude != null && longitude != null) {
            return String.format("%.4f, %.4f", latitude, longitude);
        }
        return "N/A";
    }
    
    public String getFormattedAltitude() {
        if (altitude != null) {
            return String.format("%.0f m", altitude);
        }
        return "N/A";
    }
    
    // For autocomplete responses - simplified display
    public String getAutocompleteLabel() {
        return name + ", " + country;
    }
    
    public String getAutocompleteValue() {
        return name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        CityDto cityDto = (CityDto) o;
        
        if (!name.equals(cityDto.name)) return false;
        return country.equals(cityDto.country);
    }
    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "CityDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }
}