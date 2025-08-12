package com.icefaces.modernization.api.dto;

/**
 * DTO for City statistics used in geographic reporting
 * Replaces ICEfaces statistical data generation logic
 */
public class CityStatisticsDto {
    private Long totalCities;
    private Long totalCountries;
    private Double averageLatitude;
    private Double averageLongitude;
    private Double averageAltitude;

    public CityStatisticsDto() {}

    public CityStatisticsDto(Long totalCities, Long totalCountries, Double averageLatitude, 
                            Double averageLongitude, Double averageAltitude) {
        this.totalCities = totalCities;
        this.totalCountries = totalCountries;
        this.averageLatitude = averageLatitude;
        this.averageLongitude = averageLongitude;
        this.averageAltitude = averageAltitude;
    }

    public Long getTotalCities() {
        return totalCities;
    }

    public void setTotalCities(Long totalCities) {
        this.totalCities = totalCities;
    }

    public Long getTotalCountries() {
        return totalCountries;
    }

    public void setTotalCountries(Long totalCountries) {
        this.totalCountries = totalCountries;
    }

    public Double getAverageLatitude() {
        return averageLatitude;
    }

    public void setAverageLatitude(Double averageLatitude) {
        this.averageLatitude = averageLatitude;
    }

    public Double getAverageLongitude() {
        return averageLongitude;
    }

    public void setAverageLongitude(Double averageLongitude) {
        this.averageLongitude = averageLongitude;
    }

    public Double getAverageAltitude() {
        return averageAltitude;
    }

    public void setAverageAltitude(Double averageAltitude) {
        this.averageAltitude = averageAltitude;
    }
}