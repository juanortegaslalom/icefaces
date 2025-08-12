package com.icefaces.modernization.api.controller;

import com.icefaces.modernization.api.dto.CityDto;
import com.icefaces.modernization.api.dto.CityStatisticsDto;
import com.icefaces.modernization.api.service.CityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST Controller for City operations
 * Replaces ICEfaces AutoComplete managed beans with modern REST API
 * 
 * Provides endpoints for:
 * - CRUD operations
 * - Fast autocomplete functionality
 * - Geographic search operations
 * - Country and statistical data
 */
@RestController
@RequestMapping("/api/v1/cities")
@Tag(name = "Cities", description = "City management and autocomplete operations")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @Operation(summary = "Get all cities", description = "Retrieve all cities in the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved all cities"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping
    public ResponseEntity<List<CityDto>> getAllCities() {
        List<CityDto> cities = cityService.getAllCities();
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Get city by ID", description = "Retrieve a specific city by its ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "City found"),
        @ApiResponse(responseCode = "404", description = "City not found"),
        @ApiResponse(responseCode = "400", description = "Invalid ID format")
    })
    @GetMapping("/{id}")
    public ResponseEntity<CityDto> getCityById(
            @Parameter(description = "City ID", required = true)
            @PathVariable Long id) {
        Optional<CityDto> city = cityService.getCityById(id);
        return city.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Create new city", description = "Add a new city to the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "City created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid city data")
    })
    @PostMapping
    public ResponseEntity<CityDto> createCity(
            @Parameter(description = "City data", required = true)
            @Valid @RequestBody CityDto cityDto) {
        CityDto createdCity = cityService.createCity(cityDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCity);
    }

    @Operation(summary = "Update city", description = "Update an existing city")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "City updated successfully"),
        @ApiResponse(responseCode = "404", description = "City not found"),
        @ApiResponse(responseCode = "400", description = "Invalid city data")
    })
    @PutMapping("/{id}")
    public ResponseEntity<CityDto> updateCity(
            @Parameter(description = "City ID", required = true)
            @PathVariable Long id,
            @Parameter(description = "Updated city data", required = true)
            @Valid @RequestBody CityDto cityDto) {
        try {
            CityDto updatedCity = cityService.updateCity(id, cityDto);
            return ResponseEntity.ok(updatedCity);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Delete city", description = "Remove a city from the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "City deleted successfully"),
        @ApiResponse(responseCode = "404", description = "City not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(
            @Parameter(description = "City ID", required = true)
            @PathVariable Long id) {
        cityService.deleteCity(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(
        summary = "Autocomplete cities", 
        description = "Fast autocomplete endpoint for city names (optimized for real-time search)"
    )
    @GetMapping("/autocomplete")
    public ResponseEntity<List<CityDto>> autocompleteCities(
            @Parameter(description = "Search term for city name", required = true)
            @RequestParam String query) {
        if (query == null || query.trim().length() < 2) {
            return ResponseEntity.badRequest().build();
        }
        List<CityDto> cities = cityService.autocompleteCities(query.trim());
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Search cities by name", description = "Find cities by name (case-insensitive)")
    @GetMapping("/search/name")
    public ResponseEntity<List<CityDto>> searchCitiesByName(
            @Parameter(description = "Search term for city name")
            @RequestParam String name) {
        List<CityDto> cities = cityService.searchCitiesByName(name);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Get cities by country", description = "Find all cities in a specific country")
    @GetMapping("/country/{country}")
    public ResponseEntity<List<CityDto>> getCitiesByCountry(
            @Parameter(description = "Country name")
            @PathVariable String country) {
        List<CityDto> cities = cityService.getCitiesByCountry(country);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Get cities by country (ordered)", description = "Get cities by country ordered by name")
    @GetMapping("/country/{country}/ordered")
    public ResponseEntity<List<CityDto>> getCitiesByCountryOrdered(
            @Parameter(description = "Country name")
            @PathVariable String country) {
        List<CityDto> cities = cityService.getCitiesByCountryOrdered(country);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Find city by name and country", description = "Find exact city by name and country")
    @GetMapping("/find")
    public ResponseEntity<CityDto> findCityByNameAndCountry(
            @Parameter(description = "City name", required = true)
            @RequestParam String name,
            @Parameter(description = "Country name", required = true)
            @RequestParam String country) {
        Optional<CityDto> city = cityService.findCityByNameAndCountry(name, country);
        return city.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Geographic bounding box search", description = "Find cities within geographic bounds")
    @GetMapping("/geo/bounding-box")
    public ResponseEntity<List<CityDto>> getCitiesInBoundingBox(
            @Parameter(description = "Minimum latitude")
            @RequestParam Double minLat,
            @Parameter(description = "Maximum latitude")
            @RequestParam Double maxLat,
            @Parameter(description = "Minimum longitude")
            @RequestParam Double minLon,
            @Parameter(description = "Maximum longitude")
            @RequestParam Double maxLon) {
        List<CityDto> cities = cityService.getCitiesInBoundingBox(minLat, maxLat, minLon, maxLon);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Geographic proximity search", description = "Find cities near a point within radius")
    @GetMapping("/geo/near")
    public ResponseEntity<List<CityDto>> getCitiesNearPoint(
            @Parameter(description = "Latitude")
            @RequestParam Double latitude,
            @Parameter(description = "Longitude")
            @RequestParam Double longitude,
            @Parameter(description = "Radius in km")
            @RequestParam Double radius) {
        List<CityDto> cities = cityService.getCitiesNearPoint(latitude, longitude, radius);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Get all countries", description = "Get list of all countries for dropdowns")
    @GetMapping("/countries")
    public ResponseEntity<List<String>> getAllCountries() {
        List<String> countries = cityService.getAllCountries();
        return ResponseEntity.ok(countries);
    }

    @Operation(summary = "Advanced city search", description = "Search cities with multiple criteria")
    @GetMapping("/search/advanced")
    public ResponseEntity<List<CityDto>> searchCities(
            @Parameter(description = "City name (optional)")
            @RequestParam(required = false) String name,
            @Parameter(description = "Country name (optional)")
            @RequestParam(required = false) String country) {
        List<CityDto> cities = cityService.searchCities(name, country);
        return ResponseEntity.ok(cities);
    }

    @Operation(summary = "Get city statistics", description = "Get statistical data for geographic analysis")
    @GetMapping("/statistics")
    public ResponseEntity<CityStatisticsDto> getCityStatistics() {
        CityStatisticsDto statistics = cityService.getCityStatistics();
        return ResponseEntity.ok(statistics);
    }
}