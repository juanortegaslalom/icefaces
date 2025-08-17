package com.example.employee.service;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service layer for Employee operations.
 * Handles business logic and coordinates between controller and repository.
 */
@Service
@Transactional
public class EmployeeService {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @PostConstruct
    public void init() {
        // Initialize sample data if database is empty
        initializeSampleData();
    }
    
    /**
     * Get all employees without pagination
     */
    @Transactional(readOnly = true)
    public List<EmployeeDto> getAllEmployees() {
        logger.debug("Getting all employees (no pagination)");
        List<Employee> employees = employeeRepository.findAllByOrderByLastNameAscFirstNameAsc();
        return employees.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    /**
     * Get all employees with pagination
     */
    @Transactional(readOnly = true)
    public Page<EmployeeDto> getAllEmployees(Pageable pageable) {
        logger.debug("Getting employees with pagination: {}", pageable);
        Page<Employee> employees = employeeRepository.findAllByOrderByLastNameAscFirstNameAsc(pageable);
        return employees.map(this::convertToDto);
    }
    
    /**
     * Search employees by term without pagination
     */
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployees(String searchTerm) {
        logger.debug("Searching employees with term: {}", searchTerm);
        List<Employee> employees = employeeRepository.findBySearchTerm(searchTerm);
        return employees.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    /**
     * Search employees by term with pagination
     */
    @Transactional(readOnly = true)
    public Page<EmployeeDto> searchEmployees(String searchTerm, Pageable pageable) {
        logger.debug("Searching employees with term: {} and pagination: {}", searchTerm, pageable);
        Page<Employee> employees = employeeRepository.findBySearchTerm(searchTerm, pageable);
        return employees.map(this::convertToDto);
    }
    
    /**
     * Get employee by ID
     */
    @Transactional(readOnly = true)
    public EmployeeDto getEmployeeById(Long id) {
        logger.debug("Getting employee by ID: {}", id);
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        return convertToDto(employee);
    }
    
    /**
     * Create new employee
     */
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        logger.debug("Creating new employee: {}", employeeDto);
        
        // Check for duplicate email
        if (employeeRepository.findByEmailIgnoreCase(employeeDto.getEmail()).isPresent()) {
            throw new RuntimeException("Employee with email " + employeeDto.getEmail() + " already exists");
        }
        
        Employee employee = convertToEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        logger.info("Created employee with ID: {}", savedEmployee.getId());
        
        return convertToDto(savedEmployee);
    }
    
    /**
     * Update employee
     */
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        logger.debug("Updating employee ID: {} with data: {}", id, employeeDto);
        
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        
        // Check for duplicate email (excluding current employee)
        if (employeeRepository.existsByEmailIgnoreCaseAndIdNot(employeeDto.getEmail(), id)) {
            throw new RuntimeException("Employee with email " + employeeDto.getEmail() + " already exists");
        }
        
        // Update fields
        existingEmployee.setFirstName(employeeDto.getFirstName());
        existingEmployee.setLastName(employeeDto.getLastName());
        existingEmployee.setEmail(employeeDto.getEmail());
        existingEmployee.setDepartment(employeeDto.getDepartment());
        
        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        logger.info("Updated employee with ID: {}", updatedEmployee.getId());
        
        return convertToDto(updatedEmployee);
    }
    
    /**
     * Delete employee
     */
    public void deleteEmployee(Long id) {
        logger.debug("Deleting employee with ID: {}", id);
        
        if (!employeeRepository.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        
        employeeRepository.deleteById(id);
        logger.info("Deleted employee with ID: {}", id);
    }
    
    /**
     * Get employee count
     */
    @Transactional(readOnly = true)
    public long getEmployeeCount() {
        return employeeRepository.count();
    }
    
    /**
     * Get all departments
     */
    @Transactional(readOnly = true)
    public List<String> getAllDepartments() {
        return employeeRepository.findDistinctDepartments();
    }
    
    /**
     * Convert Entity to DTO
     */
    private EmployeeDto convertToDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setDepartment(employee.getDepartment());
        dto.setFullName(employee.getFullName());
        return dto;
    }
    
    /**
     * Convert DTO to Entity
     */
    private Employee convertToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setDepartment(dto.getDepartment());
        return employee;
    }
    
    /**
     * Initialize database with sample data if empty
     */
    private void initializeSampleData() {
        long count = employeeRepository.count();
        logger.debug("Current employee count: {}", count);
        
        if (count == 0) {
            logger.info("Database is empty, initializing with sample data...");
            
            employeeRepository.save(new Employee("John", "Smith", "john.smith@company.com", "Software"));
            employeeRepository.save(new Employee("Sarah", "Johnson", "sarah.johnson@company.com", "Software"));
            employeeRepository.save(new Employee("Michael", "Brown", "michael.brown@company.com", "Finance"));
            employeeRepository.save(new Employee("Emily", "Davis", "emily.davis@company.com", "Design"));
            employeeRepository.save(new Employee("Robert", "Wilson", "robert.wilson@company.com", "Software"));
            employeeRepository.save(new Employee("Lisa", "Garcia", "lisa.garcia@company.com", "Human Resources"));
            employeeRepository.save(new Employee("David", "Martinez", "david.martinez@company.com", "Sales"));
            employeeRepository.save(new Employee("Jennifer", "Taylor", "jennifer.taylor@company.com", "Marketing"));
            employeeRepository.save(new Employee("Alejandra", "Campo", "Aleja@gmail.com", "Software"));
            employeeRepository.save(new Employee("Anna", "Toro", "anna.toro@gmail.com", "Marketing"));
            
            logger.info("Sample data initialized successfully.");
        } else {
            logger.debug("Database already has {} employees, skipping sample data initialization", count);
        }
    }
}