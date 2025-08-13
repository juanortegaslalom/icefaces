package com.example.employee.mapper;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * MapStruct mapper for Employee entity/DTO conversions
 * Handles clean mapping between JPA entities and API DTOs
 */
@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface EmployeeMapper {
    
    /**
     * Convert Employee entity to DTO
     */
    EmployeeDto toDto(Employee employee);
    
    /**
     * Convert DTO to Employee entity
     */
    Employee toEntity(EmployeeDto employeeDto);
    
    /**
     * Update existing entity from DTO (for updates)
     * Ignores null values to allow partial updates
     */
    void updateEntityFromDto(EmployeeDto dto, @MappingTarget Employee entity);
}