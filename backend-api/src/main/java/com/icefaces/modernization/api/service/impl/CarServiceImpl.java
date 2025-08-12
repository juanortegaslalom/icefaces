package com.icefaces.modernization.api.service.impl;

import com.icefaces.modernization.api.dto.CarDto;
import com.icefaces.modernization.api.dto.CarStatisticsDto;
import com.icefaces.modernization.api.entity.Car;
import com.icefaces.modernization.api.repository.CarRepository;
import com.icefaces.modernization.api.service.CarService;
import com.icefaces.modernization.api.util.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementation of CarService
 * Replaces business logic from ICEfaces managed beans:
 * - org.icefaces.samples.showcase.example.compat.dataTable.DataTableBean
 * - org.icefaces.samples.showcase.example.ace.dataTable.DataTableBean
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getAllCars() {
        return carRepository.findAll().stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CarDto> getCarById(Long id) {
        return carRepository.findById(id)
                .map(carMapper::toDto);
    }

    @Override
    public CarDto createCar(CarDto carDto) {
        Car car = carMapper.toEntity(carDto);
        car.setId(null); // Ensure new entity
        Car savedCar = carRepository.save(car);
        return carMapper.toDto(savedCar);
    }

    @Override
    public CarDto updateCar(Long id, CarDto carDto) {
        return carRepository.findById(id)
                .map(existingCar -> {
                    Car updatedCar = carMapper.toEntity(carDto);
                    updatedCar.setId(id);
                    return carMapper.toDto(carRepository.save(updatedCar));
                })
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> searchCarsByName(String name) {
        return carRepository.findByNameContainingIgnoreCase(name).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getCarsByChassis(String chassis) {
        return carRepository.findByChassisIgnoreCase(chassis).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getCarsByWeightRange(Integer minWeight, Integer maxWeight) {
        return carRepository.findByWeightBetween(minWeight, maxWeight).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getFuelEfficientCars(Double minMpg) {
        return carRepository.findByMpgGreaterThanEqual(minMpg).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getCarsInBudgetRange(Double minCost, Double maxCost) {
        return carRepository.findByCostBetween(minCost, maxCost).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> searchCars(String chassis, Double minMpg, Double maxCost) {
        return carRepository.findByMultipleCriteria(chassis, minMpg, maxCost).stream()
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getAvailableChassisTypes() {
        return carRepository.findDistinctChassis();
    }

    @Override
    @Transactional(readOnly = true)
    public CarStatisticsDto getCarStatistics() {
        List<Car> cars = carRepository.findAll();
        
        if (cars.isEmpty()) {
            return new CarStatisticsDto(0L, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }

        long totalCars = cars.size();
        double avgMpg = cars.stream().mapToDouble(Car::getMpg).average().orElse(0.0);
        double avgCost = cars.stream().mapToDouble(Car::getCost).average().orElse(0.0);
        double avgWeight = cars.stream().mapToDouble(Car::getWeight).average().orElse(0.0);
        double maxMpg = cars.stream().mapToDouble(Car::getMpg).max().orElse(0.0);
        double minCost = cars.stream().mapToDouble(Car::getCost).min().orElse(0.0);
        double maxCost = cars.stream().mapToDouble(Car::getCost).max().orElse(0.0);

        return new CarStatisticsDto(totalCars, avgMpg, avgCost, avgWeight, maxMpg, minCost, maxCost);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CarDto> getMostFuelEfficientCars(int limit) {
        return carRepository.findTopByOrderByMpgDesc().stream()
                .limit(limit)
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }
}