package com.icefaces.modernization.api.util;

import com.icefaces.modernization.api.dto.CarDto;
import com.icefaces.modernization.api.entity.Car;
import org.springframework.stereotype.Component;

/**
 * Mapper utility for Car Entity <-> DTO conversion
 * Provides clean separation between data layer and API layer
 */
@Component
public class CarMapper {

    /**
     * Convert Car entity to CarDto
     */
    public CarDto toDto(Car car) {
        if (car == null) {
            return null;
        }

        CarDto dto = new CarDto();
        dto.setId(car.getId());
        dto.setName(car.getName());
        dto.setChassis(car.getChassis());
        dto.setWeight(car.getWeight());
        dto.setAcceleration(car.getAcceleration());
        dto.setMpg(car.getMpg());
        dto.setCost(car.getCost());
        return dto;
    }

    /**
     * Convert CarDto to Car entity
     */
    public Car toEntity(CarDto dto) {
        if (dto == null) {
            return null;
        }

        Car car = new Car();
        car.setId(dto.getId());
        car.setName(dto.getName());
        car.setChassis(dto.getChassis());
        car.setWeight(dto.getWeight());
        car.setAcceleration(dto.getAcceleration());
        car.setMpg(dto.getMpg());
        car.setCost(dto.getCost());
        return car;
    }

    /**
     * Update existing entity with DTO data (preserves ID)
     */
    public void updateEntityFromDto(Car entity, CarDto dto) {
        if (entity == null || dto == null) {
            return;
        }

        entity.setName(dto.getName());
        entity.setChassis(dto.getChassis());
        entity.setWeight(dto.getWeight());
        entity.setAcceleration(dto.getAcceleration());
        entity.setMpg(dto.getMpg());
        entity.setCost(dto.getCost());
    }
}