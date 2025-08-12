package com.icefaces.modernization.api.service;

import com.icefaces.modernization.api.dto.CarDto;
import com.icefaces.modernization.api.dto.CarStatisticsDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Car operations
 * Replaces business logic from ICEfaces managed beans like:
 * - org.icefaces.samples.showcase.example.compat.dataTable.DataTableBean
 * - org.icefaces.samples.showcase.example.ace.dataTable.DataTableBean
 * 
 * This interface defines the contract for car-related business operations
 * that were previously scattered across JSF managed beans.
 */
public interface CarService {
    
    /**
     * Retrieve all cars
     * Replaces: ICEfaces managed bean getData() methods
     */
    List<CarDto> getAllCars();
    
    /**
     * Find car by ID
     * Replaces: ICEfaces managed bean selection logic
     */
    Optional<CarDto> getCarById(Long id);
    
    /**
     * Create new car
     * Replaces: ICEfaces managed bean add/create methods
     */
    CarDto createCar(CarDto carDto);
    
    /**
     * Update existing car
     * Replaces: ICEfaces managed bean update/save methods
     */
    CarDto updateCar(Long id, CarDto carDto);
    
    /**
     * Delete car
     * Replaces: ICEfaces managed bean delete/remove methods
     */
    void deleteCar(Long id);
    
    /**
     * Search cars by name (case-insensitive)
     * Replaces: ICEfaces filter/search functionality
     */
    List<CarDto> searchCarsByName(String name);
    
    /**
     * Filter cars by chassis type
     * Replaces: ICEfaces dropdown filter logic
     */
    List<CarDto> getCarsByChassis(String chassis);
    
    /**
     * Find cars within weight range
     * Replaces: ICEfaces range filter components
     */
    List<CarDto> getCarsByWeightRange(Integer minWeight, Integer maxWeight);
    
    /**
     * Find fuel efficient cars (above specified MPG)
     * Replaces: ICEfaces business logic for filtering
     */
    List<CarDto> getFuelEfficientCars(Double minMpg);
    
    /**
     * Find cars within budget range
     * Replaces: ICEfaces cost filter functionality
     */
    List<CarDto> getCarsInBudgetRange(Double minCost, Double maxCost);
    
    /**
     * Advanced search with multiple criteria
     * Replaces: Complex ICEfaces filter combinations
     */
    List<CarDto> searchCars(String chassis, Double minMpg, Double maxCost);
    
    /**
     * Get available chassis types for dropdown population
     * Replaces: ICEfaces managed bean methods for populating select components
     */
    List<String> getAvailableChassisTypes();
    
    /**
     * Get car statistics for dashboard/reporting
     * Replaces: ICEfaces chart data generation logic
     */
    CarStatisticsDto getCarStatistics();
    
    /**
     * Get most fuel efficient cars (for recommendations)
     * Replaces: ICEfaces business logic for recommendations
     */
    List<CarDto> getMostFuelEfficientCars(int limit);
}