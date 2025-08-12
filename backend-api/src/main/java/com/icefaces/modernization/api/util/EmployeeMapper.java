package com.icefaces.modernization.api.util;

import com.icefaces.modernization.api.dto.EmployeeDto;
import com.icefaces.modernization.api.entity.Employee;
import org.springframework.stereotype.Component;

/**
 * Mapper utility for Employee Entity <-> DTO conversion
 * Provides clean separation between data layer and API layer
 */
@Component
public class EmployeeMapper {

    /**
     * Convert Employee entity to EmployeeDto
     */
    public EmployeeDto toDto(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setAddress(employee.getAddress());
        dto.setSalary(employee.getSalary());
        return dto;
    }

    /**
     * Convert EmployeeDto to Employee entity
     */
    public Employee toEntity(EmployeeDto dto) {
        if (dto == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setAddress(dto.getAddress());
        employee.setSalary(dto.getSalary());
        return employee;
    }

    /**
     * Update existing entity with DTO data (preserves ID)
     */
    public void updateEntityFromDto(Employee entity, EmployeeDto dto) {
        if (entity == null || dto == null) {
            return;
        }

        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setAddress(dto.getAddress());
        entity.setSalary(dto.getSalary());
    }
}