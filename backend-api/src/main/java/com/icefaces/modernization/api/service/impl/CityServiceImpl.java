package com.icefaces.modernization.api.service.impl;

import com.icefaces.modernization.api.dto.CityDto;
import com.icefaces.modernization.api.dto.CityStatisticsDto;
import com.icefaces.modernization.api.entity.City;
import com.icefaces.modernization.api.repository.CityRepository;
import com.icefaces.modernization.api.service.CityService;
import com.icefaces.modernization.api.util.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementation of CityService
 * Replaces business logic from ICEfaces managed beans:
 * - org.icefaces.samples.showcase.example.ace.autocompleteentry.AutoCompleteEntryBean
 * - org.icefaces.samples.showcase.example.compat.autocomplete.AutocompleteBean
 * - Geographic/map-related managed beans
 */
@Service
@Transactional
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getAllCities() {
        return cityRepository.findAll().stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CityDto> getCityById(Long id) {
        return cityRepository.findById(id)
                .map(cityMapper::toDto);
    }

    @Override
    public CityDto createCity(CityDto cityDto) {
        City city = cityMapper.toEntity(cityDto);
        city.setId(null); // Ensure new entity
        City savedCity = cityRepository.save(city);
        return cityMapper.toDto(savedCity);
    }

    @Override
    public CityDto updateCity(Long id, CityDto cityDto) {
        return cityRepository.findById(id)
                .map(existingCity -> {
                    City updatedCity = cityMapper.toEntity(cityDto);
                    updatedCity.setId(id);
                    return cityMapper.toDto(cityRepository.save(updatedCity));
                })
                .orElseThrow(() -> new RuntimeException("City not found with id: " + id));
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> autocompleteCities(String searchTerm) {
        // Limit autocomplete results for performance
        return cityRepository.findByNameContainingIgnoreCaseOrderByName(searchTerm).stream()
                .limit(10)
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> searchCitiesByName(String name) {
        return cityRepository.findByNameContainingIgnoreCase(name).stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getCitiesByCountry(String country) {
        return cityRepository.findByCountryIgnoreCase(country).stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CityDto> findCityByNameAndCountry(String name, String country) {
        return cityRepository.findByNameIgnoreCaseAndCountryIgnoreCase(name, country)
                .map(cityMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getCitiesInBoundingBox(Double minLat, Double maxLat, 
                                                Double minLon, Double maxLon) {
        return cityRepository.findCitiesInBoundingBox(minLat, maxLat, minLon, maxLon).stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getCitiesNearPoint(Double latitude, Double longitude, Double radius) {
        // Simplified distance calculation - in production, use PostGIS or similar
        // This is a basic implementation for demonstration
        return cityRepository.findAll().stream()
                .filter(city -> {
                    if (city.getLatitude() == null || city.getLongitude() == null) {
                        return false;
                    }
                    double distance = calculateDistance(latitude, longitude, 
                                                      city.getLatitude(), city.getLongitude());
                    return distance <= radius;
                })
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getAllCountries() {
        return cityRepository.findDistinctCountries();
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> getCitiesByCountryOrdered(String country) {
        return cityRepository.findByCountryIgnoreCaseOrderByName(country).stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> searchCities(String name, String country) {
        return cityRepository.findByMultipleCriteria(name, country).stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public CityStatisticsDto getCityStatistics() {
        List<City> cities = cityRepository.findAll();
        
        if (cities.isEmpty()) {
            return new CityStatisticsDto(0L, 0L, 0.0, 0.0, 0.0);
        }

        long totalCities = cities.size();
        long totalCountries = cityRepository.findDistinctCountries().size();
        
        // Calculate geographic statistics
        double avgLatitude = cities.stream()
                .filter(city -> city.getLatitude() != null)
                .mapToDouble(City::getLatitude)
                .average()
                .orElse(0.0);
        
        double avgLongitude = cities.stream()
                .filter(city -> city.getLongitude() != null)
                .mapToDouble(City::getLongitude)
                .average()
                .orElse(0.0);
        
        double avgAltitude = cities.stream()
                .filter(city -> city.getAltitude() != null)
                .mapToDouble(City::getAltitude)
                .average()
                .orElse(0.0);

        return new CityStatisticsDto(totalCities, totalCountries, avgLatitude, avgLongitude, avgAltitude);
    }

    /**
     * Calculate distance between two points using Haversine formula
     * Simple implementation for demonstration purposes
     */
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radius of the earth in km

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}