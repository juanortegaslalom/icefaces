package com.icefaces.modernization.api.service;

import com.icefaces.modernization.api.dto.EmployeeDto;
import com.icefaces.modernization.api.dto.EmployeeSalaryStatisticsDto;
import com.icefaces.modernization.api.dto.EmployeeStatisticsDto;
import com.icefaces.modernization.api.dto.SalaryRangeCountDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Employee operations
 * Replaces business logic from ICEfaces managed beans like:
 * - org.icefaces.samples.showcase.example.compat.series.SeriesBean
 * - HR-related form and data management beans
 * - Employee chart and reporting beans
 * 
 * This interface defines the contract for employee-related operations,
 * focusing on HR management and reporting functionality.
 */
public interface EmployeeService {
    
    /**
     * Retrieve all employees
     * Replaces: ICEfaces managed bean employee list initialization
     */
    List<EmployeeDto> getAllEmployees();
    
    /**
     * Find employee by ID
     * Replaces: ICEfaces managed bean selection logic
     */
    Optional<EmployeeDto> getEmployeeById(Long id);
    
    /**
     * Create new employee
     * Replaces: ICEfaces managed bean add employee functionality
     */
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    
    /**
     * Update existing employee
     * Replaces: ICEfaces managed bean update employee functionality
     */
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
    
    /**
     * Delete employee
     * Replaces: ICEfaces managed bean delete employee functionality
     */
    void deleteEmployee(Long id);
    
    /**
     * Search employees by last name
     * Replaces: ICEfaces employee search functionality
     */
    List<EmployeeDto> searchEmployeesByLastName(String lastName);
    
    /**
     * Search employees by first name
     * Replaces: ICEfaces employee search functionality
     */
    List<EmployeeDto> searchEmployeesByFirstName(String firstName);
    
    /**
     * Search employees by full name (first + last)
     * Replaces: ICEfaces comprehensive name search
     */
    List<EmployeeDto> searchEmployeesByFullName(String fullName);
    
    /**
     * Find employees within salary range
     * Replaces: ICEfaces salary filter components
     */
    List<EmployeeDto> getEmployeesBySalaryRange(Integer minSalary, Integer maxSalary);
    
    /**
     * Find high earners (above specified salary)
     * Replaces: ICEfaces business logic for high earner reports
     */
    List<EmployeeDto> getHighEarners(Integer minSalary);
    
    /**
     * Search employees by address
     * Replaces: ICEfaces location-based employee search
     */
    List<EmployeeDto> searchEmployeesByAddress(String addressText);
    
    /**
     * Get employees ordered by salary (descending)
     * Replaces: ICEfaces salary ranking functionality
     */
    List<EmployeeDto> getEmployeesOrderedBySalary();
    
    /**
     * Get employees ordered alphabetically by last name
     * Replaces: ICEfaces alphabetical listing
     */
    List<EmployeeDto> getEmployeesOrderedByName();
    
    /**
     * Advanced employee search with multiple criteria
     * Replaces: Complex ICEfaces filter combinations
     */
    List<EmployeeDto> searchEmployees(String firstName, String lastName, 
                                    Integer minSalary, Integer maxSalary);
    
    /**
     * Get salary statistics for reporting and dashboards
     * Replaces: ICEfaces statistical calculation logic
     */
    EmployeeSalaryStatisticsDto getSalaryStatistics();
    
    /**
     * Get top earners (limited list for executive reports)
     * Replaces: ICEfaces business logic for top performer reports
     */
    List<EmployeeDto> getTopEarners(int limit);
    
    /**
     * Get employee count by salary ranges (for chart generation)
     * Replaces: ICEfaces chart data preparation logic
     */
    List<SalaryRangeCountDto> getEmployeeCountBySalaryRanges();
    
    /**
     * Calculate employee statistics for HR reporting
     * Replaces: ICEfaces HR analytics functionality
     */
    EmployeeStatisticsDto getEmployeeStatistics();
}