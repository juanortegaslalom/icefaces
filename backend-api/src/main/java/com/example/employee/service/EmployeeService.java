package com.example.employee.service;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.dto.EmployeeStatsDto;
import com.example.employee.entity.Employee;
import com.example.employee.exception.DuplicateEmployeeException;
import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.mapper.EmployeeMapper;
import com.example.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Employee Service - Clean business logic extracted from ICEfaces EmployeeBean
 * 
 * This service replaces the mixed concerns in the original 354-line EmployeeBean:
 * - Removes UI concerns (JSF Messages, form state)
 * - Removes manual caching logic (Spring handles this better)
 * - Removes manual sorting (database handles this)
 * - Adds proper validation and error handling
 * - Adds new features not available in ICEfaces (search, pagination)
 */
@Service
@Transactional
public class EmployeeService {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private EmployeeMapper employeeMapper;
    
    /**
     * Get all employees with pagination and sorting
     * Replaces: EmployeeBean.getEmployees() with manual sorting
     */
    public Page<EmployeeDto> getAllEmployees(Pageable pageable) {
        logger.debug("Getting employees with pagination: {}", pageable);
        Page<Employee> employees = employeeRepository.findAll(pageable);
        return employees.map(employeeMapper::toDto);
    }
    
    /**
     * Get all employees without pagination (for backward compatibility)
     * Matches: EmployeeBean.getEmployees()
     */
    public List<EmployeeDto> getAllEmployees() {
        logger.debug("Getting all employees (no pagination)");
        List<Employee> employees = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "lastName", "firstName"));
        return employees.stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }
    
    /**
     * Search employees by term (new feature not in ICEfaces)
     * Searches across firstName, lastName, email, and department
     */
    public List<EmployeeDto> searchEmployees(String searchTerm) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return getAllEmployees();
        }
        
        logger.debug("Searching employees with term: {}", searchTerm);
        List<Employee> employees = employeeRepository.searchEmployees(searchTerm.trim());
        return employees.stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }
    
    /**
     * Search employees with pagination
     */
    public Page<EmployeeDto> searchEmployees(String searchTerm, Pageable pageable) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return getAllEmployees(pageable);
        }
        
        logger.debug("Searching employees with term: {} and pagination: {}", searchTerm, pageable);
        Page<Employee> employees = employeeRepository.searchEmployees(searchTerm.trim(), pageable);
        return employees.map(employeeMapper::toDto);
    }
    
    /**
     * Get employee by ID
     */
    public EmployeeDto getEmployeeById(Long id) {
        logger.debug("Getting employee by ID: {}", id);
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
        return employeeMapper.toDto(employee);
    }
    
    /**
     * Create new employee
     * Replaces: EmployeeBean.addEmployee(ActionEvent event)
     */
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        logger.debug("Creating new employee: {}", employeeDto);
        
        // Business validation (extracted from EmployeeBean.isValidEmployee())
        validateEmployeeData(employeeDto);
        
        // Check for duplicate email (business rule)
        if (employeeRepository.existsByEmailIgnoreCase(employeeDto.getEmail())) {
            throw new DuplicateEmployeeException("Employee with email '" + employeeDto.getEmail() + "' already exists");
        }
        
        Employee employee = employeeMapper.toEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        
        logger.info("Created employee with ID: {}", savedEmployee.getId());
        return employeeMapper.toDto(savedEmployee);
    }
    
    /**
     * Update employee
     * New feature - ICEfaces only had create/delete
     */
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        logger.debug("Updating employee ID: {} with data: {}", id, employeeDto);
        
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
        
        // Business validation
        validateEmployeeData(employeeDto);
        
        // Check for email conflicts (excluding current employee)
        Employee employeeWithEmail = employeeRepository.findByEmailIgnoreCase(employeeDto.getEmail());
        if (employeeWithEmail != null && !employeeWithEmail.getId().equals(id)) {
            throw new DuplicateEmployeeException("Employee with email '" + employeeDto.getEmail() + "' already exists");
        }
        
        // Update fields (MapStruct handles this)
        employeeMapper.updateEntityFromDto(employeeDto, existingEmployee);
        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        
        logger.info("Updated employee with ID: {}", updatedEmployee.getId());
        return employeeMapper.toDto(updatedEmployee);
    }
    
    /**
     * Delete employee
     * Replaces: EmployeeBean.removeEmployee(Employee employee)
     */
    public void deleteEmployee(Long id) {
        logger.debug("Deleting employee with ID: {}", id);
        
        if (!employeeRepository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + id);
        }
        
        employeeRepository.deleteById(id);
        logger.info("Deleted employee with ID: {}", id);
    }
    
    /**
     * Get employee count
     * Replaces: EmployeeBean.getEmployeeCount()
     */
    public long getEmployeeCount() {
        return employeeRepository.count();
    }
    
    /**
     * Get all departments (for dropdown/filter)
     * New feature - not available in ICEfaces
     */
    public List<String> getAllDepartments() {
        return employeeRepository.findAllDepartments();
    }
    
    /**
     * Get employee statistics
     * Enhanced version of EmployeeBean.getEmployeeCount()
     */
    public EmployeeStatsDto getEmployeeStats() {
        long totalEmployees = employeeRepository.count();
        
        List<Object[]> departmentCounts = employeeRepository.countEmployeesByDepartment();
        Map<String, Long> employeesByDepartment = departmentCounts.stream()
                .collect(Collectors.toMap(
                    row -> (String) row[0],
                    row -> (Long) row[1]
                ));
        
        EmployeeStatsDto stats = new EmployeeStatsDto(totalEmployees, employeesByDepartment);
        stats.setLastUpdated(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        
        return stats;
    }
    
    /**
     * Initialize sample data if database is empty
     * Replaces: EmployeeDAO.initializeSampleData()
     */
    @PostConstruct
    @Transactional
    public void initializeSampleDataIfNeeded() {
        if (employeeRepository.count() == 0) {
            logger.info("Database is empty, initializing sample data...");
            
            List<Employee> sampleEmployees = List.of(
                new Employee("John", "Smith", "john.smith@company.com", "Engineering"),
                new Employee("Sarah", "Johnson", "sarah.johnson@company.com", "Marketing"),
                new Employee("Mike", "Brown", "mike.brown@company.com", "Sales"),
                new Employee("Lisa", "Davis", "lisa.davis@company.com", "HR"),
                new Employee("David", "Wilson", "david.wilson@company.com", "Engineering"),
                new Employee("Jennifer", "Miller", "jennifer.miller@company.com", "Finance"),
                new Employee("Robert", "Garcia", "robert.garcia@company.com", "Sales"),
                new Employee("Maria", "Rodriguez", "maria.rodriguez@company.com", "Marketing"),
                new Employee("James", "Martinez", "james.martinez@company.com", "Engineering"),
                new Employee("Patricia", "Anderson", "patricia.anderson@company.com", "HR")
            );
            
            employeeRepository.saveAll(sampleEmployees);
            logger.info("Initialized {} sample employees", sampleEmployees.size());
        } else {
            logger.debug("Database already has {} employees, skipping sample data initialization", 
                        employeeRepository.count());
        }
    }
    
    /**
     * Business validation extracted from EmployeeBean.isValidEmployee()
     * Enhanced with proper error messages
     */
    private void validateEmployeeData(EmployeeDto employeeDto) {
        if (employeeDto == null) {
            throw new IllegalArgumentException("Employee data cannot be null");
        }
        
        // The @Valid annotations handle most validation, but we can add business-specific rules here
        if (employeeDto.getFirstName() != null && employeeDto.getLastName() != null &&
            employeeDto.getFirstName().equalsIgnoreCase(employeeDto.getLastName())) {
            logger.warn("Employee has same first and last name: {}", employeeDto.getFirstName());
            // This is allowed but logged as potentially suspicious
        }
        
        // Business rule: certain departments might have restrictions
        if (employeeDto.getDepartment() != null) {
            String dept = employeeDto.getDepartment().trim();
            if (dept.equalsIgnoreCase("CEO") || dept.equalsIgnoreCase("President")) {
                logger.warn("Employee being assigned to executive department: {}", dept);
                // This is allowed but logged for audit purposes
            }
        }
    }
}