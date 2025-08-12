package com.icefaces.modernization.api.util;

import com.icefaces.modernization.api.dto.CityDto;
import com.icefaces.modernization.api.entity.City;
import org.springframework.stereotype.Component;

/**
 * Mapper utility for City Entity <-> DTO conversion
 * Provides clean separation between data layer and API layer
 */
@Component
public class CityMapper {

    /**
     * Convert City entity to CityDto
     */
    public CityDto toDto(City city) {
        if (city == null) {
            return null;
        }

        CityDto dto = new CityDto();
        dto.setId(city.getId());
        dto.setName(city.getName());
        dto.setCountry(city.getCountry());
        dto.setLatitude(city.getLatitude());
        dto.setLongitude(city.getLongitude());
        dto.setAltitude(city.getAltitude());
        return dto;
    }

    /**
     * Convert CityDto to City entity
     */
    public City toEntity(CityDto dto) {
        if (dto == null) {
            return null;
        }

        City city = new City();
        city.setId(dto.getId());
        city.setName(dto.getName());
        city.setCountry(dto.getCountry());
        city.setLatitude(dto.getLatitude());
        city.setLongitude(dto.getLongitude());
        city.setAltitude(dto.getAltitude());
        return city;
    }

    /**
     * Update existing entity with DTO data (preserves ID)
     */
    public void updateEntityFromDto(City entity, CityDto dto) {
        if (entity == null || dto == null) {
            return;
        }

        entity.setName(dto.getName());
        entity.setCountry(dto.getCountry());
        entity.setLatitude(dto.getLatitude());
        entity.setLongitude(dto.getLongitude());
        entity.setAltitude(dto.getAltitude());
    }
}