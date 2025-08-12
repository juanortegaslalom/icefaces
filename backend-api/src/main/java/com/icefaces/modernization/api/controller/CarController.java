package com.icefaces.modernization.api.controller;

import com.icefaces.modernization.api.dto.CarDto;
import com.icefaces.modernization.api.dto.CarStatisticsDto;
import com.icefaces.modernization.api.service.CarService;
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
 * REST Controller for Car operations
 * Replaces ICEfaces DataTable managed beans with modern REST API
 * 
 * Provides endpoints for:
 * - CRUD operations
 * - Advanced searching and filtering
 * - Statistical data for dashboards
 * - Dropdown population data
 */
@RestController
@RequestMapping("/api/v1/cars")
@Tag(name = "Cars", description = "Car management operations")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @Operation(summary = "Get all cars", description = "Retrieve all cars in the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved all cars"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping
    public ResponseEntity<List<CarDto>> getAllCars() {
        List<CarDto> cars = carService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Get car by ID", description = "Retrieve a specific car by its ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Car found"),
        @ApiResponse(responseCode = "404", description = "Car not found"),
        @ApiResponse(responseCode = "400", description = "Invalid ID format")
    })
    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getCarById(
            @Parameter(description = "Car ID", required = true)
            @PathVariable Long id) {
        Optional<CarDto> car = carService.getCarById(id);
        return car.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Create new car", description = "Add a new car to the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Car created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid car data")
    })
    @PostMapping
    public ResponseEntity<CarDto> createCar(
            @Parameter(description = "Car data", required = true)
            @Valid @RequestBody CarDto carDto) {
        CarDto createdCar = carService.createCar(carDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCar);
    }

    @Operation(summary = "Update car", description = "Update an existing car")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Car updated successfully"),
        @ApiResponse(responseCode = "404", description = "Car not found"),
        @ApiResponse(responseCode = "400", description = "Invalid car data")
    })
    @PutMapping("/{id}")
    public ResponseEntity<CarDto> updateCar(
            @Parameter(description = "Car ID", required = true)
            @PathVariable Long id,
            @Parameter(description = "Updated car data", required = true)
            @Valid @RequestBody CarDto carDto) {
        try {
            CarDto updatedCar = carService.updateCar(id, carDto);
            return ResponseEntity.ok(updatedCar);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Delete car", description = "Remove a car from the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Car deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Car not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(
            @Parameter(description = "Car ID", required = true)
            @PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Search cars by name", description = "Find cars by name (case-insensitive)")
    @GetMapping("/search/name")
    public ResponseEntity<List<CarDto>> searchCarsByName(
            @Parameter(description = "Search term for car name")
            @RequestParam String name) {
        List<CarDto> cars = carService.searchCarsByName(name);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Filter cars by chassis", description = "Get cars by chassis type")
    @GetMapping("/filter/chassis")
    public ResponseEntity<List<CarDto>> getCarsByChassis(
            @Parameter(description = "Chassis type")
            @RequestParam String chassis) {
        List<CarDto> cars = carService.getCarsByChassis(chassis);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Filter cars by weight range", description = "Get cars within weight range")
    @GetMapping("/filter/weight")
    public ResponseEntity<List<CarDto>> getCarsByWeightRange(
            @Parameter(description = "Minimum weight")
            @RequestParam Integer minWeight,
            @Parameter(description = "Maximum weight")
            @RequestParam Integer maxWeight) {
        List<CarDto> cars = carService.getCarsByWeightRange(minWeight, maxWeight);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Get fuel efficient cars", description = "Find cars with MPG above threshold")
    @GetMapping("/filter/fuel-efficient")
    public ResponseEntity<List<CarDto>> getFuelEfficientCars(
            @Parameter(description = "Minimum MPG")
            @RequestParam Double minMpg) {
        List<CarDto> cars = carService.getFuelEfficientCars(minMpg);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Filter cars by budget", description = "Get cars within price range")
    @GetMapping("/filter/budget")
    public ResponseEntity<List<CarDto>> getCarsInBudgetRange(
            @Parameter(description = "Minimum cost")
            @RequestParam Double minCost,
            @Parameter(description = "Maximum cost")
            @RequestParam Double maxCost) {
        List<CarDto> cars = carService.getCarsInBudgetRange(minCost, maxCost);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Advanced car search", description = "Search cars with multiple criteria")
    @GetMapping("/search/advanced")
    public ResponseEntity<List<CarDto>> searchCars(
            @Parameter(description = "Chassis type (optional)")
            @RequestParam(required = false) String chassis,
            @Parameter(description = "Minimum MPG (optional)")
            @RequestParam(required = false) Double minMpg,
            @Parameter(description = "Maximum cost (optional)")
            @RequestParam(required = false) Double maxCost) {
        List<CarDto> cars = carService.searchCars(chassis, minMpg, maxCost);
        return ResponseEntity.ok(cars);
    }

    @Operation(summary = "Get chassis types", description = "Get all available chassis types for dropdowns")
    @GetMapping("/chassis-types")
    public ResponseEntity<List<String>> getAvailableChassisTypes() {
        List<String> chassisTypes = carService.getAvailableChassisTypes();
        return ResponseEntity.ok(chassisTypes);
    }

    @Operation(summary = "Get car statistics", description = "Get statistical data for dashboards")
    @GetMapping("/statistics")
    public ResponseEntity<CarStatisticsDto> getCarStatistics() {
        CarStatisticsDto statistics = carService.getCarStatistics();
        return ResponseEntity.ok(statistics);
    }

    @Operation(summary = "Get most fuel efficient cars", description = "Get top fuel efficient cars")
    @GetMapping("/top-fuel-efficient")
    public ResponseEntity<List<CarDto>> getMostFuelEfficientCars(
            @Parameter(description = "Number of cars to return")
            @RequestParam(defaultValue = "5") int limit) {
        List<CarDto> cars = carService.getMostFuelEfficientCars(limit);
        return ResponseEntity.ok(cars);
    }
}