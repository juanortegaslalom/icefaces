package com.icefaces.modernization.api.repository;

import com.icefaces.modernization.api.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository for City entity - replaces ICEfaces autocomplete data access
 * Optimized for autocomplete and geographic search operations
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    
    /**
     * Find cities by name containing search term (case-insensitive)
     * Primary method for autocomplete functionality
     * Replaces: ICEfaces autocomplete bean filtering
     */
    List<City> findByNameContainingIgnoreCase(String searchTerm);
    
    /**
     * Find cities by country (case-insensitive)
     * Useful for country-based filtering
     */
    List<City> findByCountryIgnoreCase(String country);
    
    /**
     * Find city by exact name and country match
     * Useful for precise city lookup
     */
    Optional<City> findByNameIgnoreCaseAndCountryIgnoreCase(String name, String country);
    
    /**
     * Find cities within geographic bounding box
     * Useful for map-based applications
     */
    @Query("SELECT c FROM City c WHERE " +
           "c.latitude BETWEEN :minLat AND :maxLat AND " +
           "c.longitude BETWEEN :minLon AND :maxLon")
    List<City> findCitiesInBoundingBox(@Param("minLat") Double minLatitude,
                                      @Param("maxLat") Double maxLatitude,
                                      @Param("minLon") Double minLongitude,
                                      @Param("maxLon") Double maxLongitude);
    
    /**
     * Find cities near a point within radius (simplified distance calculation)
     * Note: This is a simplified version. In production, use PostGIS or similar for accurate geo queries
     */
    @Query("SELECT c FROM City c WHERE " +
           "ABS(c.latitude - :lat) < :radius AND " +
           "ABS(c.longitude - :lon) < :radius")
    List<City> findCitiesNearPoint(@Param("lat") Double latitude,
                                  @Param("lon") Double longitude,
                                  @Param("radius") Double radius);
    
    /**
     * Autocomplete search with limit
     * Optimized for fast autocomplete responses
     */
    @Query("SELECT c FROM City c WHERE " +
           "LOWER(c.name) LIKE LOWER(CONCAT(:searchTerm, '%')) " +
           "ORDER BY c.name ASC")
    List<City> findCitiesForAutocomplete(@Param("searchTerm") String searchTerm);
    
    /**
     * Find all countries (distinct)
     * Useful for populating country dropdowns
     */
    @Query("SELECT DISTINCT c.country FROM City c ORDER BY c.country")
    List<String> findAllCountries();
    
    /**
     * Find distinct countries
     * Alternative method name for findAllCountries
     */
    @Query("SELECT DISTINCT c.country FROM City c ORDER BY c.country")
    List<String> findDistinctCountries();
    
    /**
     * Find cities by country with limit
     * Useful for paginated country-based city lists
     */
    @Query("SELECT c FROM City c WHERE LOWER(c.country) = LOWER(:country) ORDER BY c.name")
    List<City> findByCountryOrderByName(@Param("country") String country);
    
    /**
     * Find cities by country ordered by name (case-insensitive)
     * Standard Spring Data method name
     */
    List<City> findByCountryIgnoreCaseOrderByName(String country);
    
    /**
     * Find cities by name containing search term, ordered by name
     * Used for autocomplete with ordering
     */
    List<City> findByNameContainingIgnoreCaseOrderByName(String searchTerm);
    
    /**
     * Search cities by multiple criteria
     * Advanced search combining name and country filters
     */
    @Query("SELECT c FROM City c WHERE " +
           "(:name IS NULL OR LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
           "(:country IS NULL OR LOWER(c.country) LIKE LOWER(CONCAT('%', :country, '%')))")
    List<City> findByMultipleCriteria(@Param("name") String name, @Param("country") String country);
    
    /**
     * Count cities by country
     * Useful for statistical displays
     */
    long countByCountryIgnoreCase(String country);
    
    /**
     * Find cities with highest/lowest altitude
     * Useful for geographic data analysis
     */
    @Query("SELECT c FROM City c WHERE c.altitude IS NOT NULL ORDER BY c.altitude DESC")
    List<City> findCitiesByAltitudeDesc();
    
    /**
     * Search cities by partial name and country
     * Advanced search combining multiple criteria
     */
    @Query("SELECT c FROM City c WHERE " +
           "(:name IS NULL OR LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
           "(:country IS NULL OR LOWER(c.country) LIKE LOWER(CONCAT('%', :country, '%')))")
    List<City> searchCities(@Param("name") String name, @Param("country") String country);
}