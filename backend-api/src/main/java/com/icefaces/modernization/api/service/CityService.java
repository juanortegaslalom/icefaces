package com.icefaces.modernization.api.service;

import com.icefaces.modernization.api.dto.CityDto;
import com.icefaces.modernization.api.dto.CityStatisticsDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for City operations
 * Replaces business logic from ICEfaces managed beans like:
 * - org.icefaces.samples.showcase.example.ace.autocompleteentry.AutoCompleteEntryBean
 * - org.icefaces.samples.showcase.example.compat.autocomplete.AutocompleteBean
 * - Geographic/map-related managed beans
 * 
 * This interface defines the contract for city-related operations,
 * particularly focused on autocomplete and geographic functionality.
 */
public interface CityService {
    
    /**
     * Retrieve all cities
     * Replaces: ICEfaces managed bean city list initialization
     */
    List<CityDto> getAllCities();
    
    /**
     * Find city by ID
     * Replaces: ICEfaces managed bean selection logic
     */
    Optional<CityDto> getCityById(Long id);
    
    /**
     * Create new city
     * Replaces: ICEfaces managed bean add city functionality
     */
    CityDto createCity(CityDto cityDto);
    
    /**
     * Update existing city
     * Replaces: ICEfaces managed bean update city functionality
     */
    CityDto updateCity(Long id, CityDto cityDto);
    
    /**
     * Delete city
     * Replaces: ICEfaces managed bean delete city functionality
     */
    void deleteCity(Long id);
    
    /**
     * Autocomplete cities by name (optimized for fast response)
     * Replaces: ICEfaces autocomplete component data provision
     * This is the primary method for autocomplete functionality
     */
    List<CityDto> autocompleteCities(String searchTerm);
    
    /**
     * Search cities by name containing term
     * Replaces: ICEfaces search/filter functionality
     */
    List<CityDto> searchCitiesByName(String name);
    
    /**
     * Find cities by country
     * Replaces: ICEfaces country-based filtering
     */
    List<CityDto> getCitiesByCountry(String country);
    
    /**
     * Find exact city by name and country
     * Replaces: ICEfaces precise city lookup logic
     */
    Optional<CityDto> findCityByNameAndCountry(String name, String country);
    
    /**
     * Find cities within geographic bounding box
     * Replaces: ICEfaces map component data filtering
     */
    List<CityDto> getCitiesInBoundingBox(Double minLat, Double maxLat, 
                                        Double minLon, Double maxLon);
    
    /**
     * Find cities near a point (simplified distance)
     * Replaces: ICEfaces proximity search functionality
     */
    List<CityDto> getCitiesNearPoint(Double latitude, Double longitude, Double radius);
    
    /**
     * Get all countries for dropdown population
     * Replaces: ICEfaces managed bean methods for populating country selects
     */
    List<String> getAllCountries();
    
    /**
     * Get cities by country with ordering
     * Replaces: ICEfaces ordered city list generation
     */
    List<CityDto> getCitiesByCountryOrdered(String country);
    
    /**
     * Advanced city search with multiple criteria
     * Replaces: Complex ICEfaces search combinations
     */
    List<CityDto> searchCities(String name, String country);
    
    /**
     * Get city statistics for reporting
     * Replaces: ICEfaces statistical data generation
     */
    CityStatisticsDto getCityStatistics();
}