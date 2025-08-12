package com.icefaces.modernization.api.controller;

import com.icefaces.modernization.api.dto.EmployeeDto;
import com.icefaces.modernization.api.dto.EmployeeSalaryStatisticsDto;
import com.icefaces.modernization.api.dto.EmployeeStatisticsDto;
import com.icefaces.modernization.api.dto.SalaryRangeCountDto;
import com.icefaces.modernization.api.service.EmployeeService;
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
 * REST Controller for Employee operations
 * Replaces ICEfaces SeriesBean and HR managed beans with modern REST API
 * 
 * Provides endpoints for:
 * - CRUD operations
 * - Advanced employee search
 * - HR analytics and reporting
 * - Salary analysis and statistics
 */
@RestController
@RequestMapping("/api/v1/employees")
@Tag(name = "Employees", description = "Employee management and HR operations")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Operation(summary = "Get all employees", description = "Retrieve all employees in the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved all employees"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get employee by ID", description = "Retrieve a specific employee by their ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Employee found"),
        @ApiResponse(responseCode = "404", description = "Employee not found"),
        @ApiResponse(responseCode = "400", description = "Invalid ID format")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(
            @Parameter(description = "Employee ID", required = true)
            @PathVariable Long id) {
        Optional<EmployeeDto> employee = employeeService.getEmployeeById(id);
        return employee.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Create new employee", description = "Add a new employee to the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Employee created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid employee data")
    })
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(
            @Parameter(description = "Employee data", required = true)
            @Valid @RequestBody EmployeeDto employeeDto) {
        EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @Operation(summary = "Update employee", description = "Update an existing employee")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Employee updated successfully"),
        @ApiResponse(responseCode = "404", description = "Employee not found"),
        @ApiResponse(responseCode = "400", description = "Invalid employee data")
    })
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(
            @Parameter(description = "Employee ID", required = true)
            @PathVariable Long id,
            @Parameter(description = "Updated employee data", required = true)
            @Valid @RequestBody EmployeeDto employeeDto) {
        try {
            EmployeeDto updatedEmployee = employeeService.updateEmployee(id, employeeDto);
            return ResponseEntity.ok(updatedEmployee);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Delete employee", description = "Remove an employee from the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Employee deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @Parameter(description = "Employee ID", required = true)
            @PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Search employees by last name", description = "Find employees by last name")
    @GetMapping("/search/lastname")
    public ResponseEntity<List<EmployeeDto>> searchEmployeesByLastName(
            @Parameter(description = "Last name search term")
            @RequestParam String lastName) {
        List<EmployeeDto> employees = employeeService.searchEmployeesByLastName(lastName);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Search employees by first name", description = "Find employees by first name")
    @GetMapping("/search/firstname")
    public ResponseEntity<List<EmployeeDto>> searchEmployeesByFirstName(
            @Parameter(description = "First name search term")
            @RequestParam String firstName) {
        List<EmployeeDto> employees = employeeService.searchEmployeesByFirstName(firstName);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Search employees by full name", description = "Find employees by full name")
    @GetMapping("/search/fullname")
    public ResponseEntity<List<EmployeeDto>> searchEmployeesByFullName(
            @Parameter(description = "Full name search term")
            @RequestParam String fullName) {
        List<EmployeeDto> employees = employeeService.searchEmployeesByFullName(fullName);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Filter employees by salary range", description = "Get employees within salary range")
    @GetMapping("/filter/salary-range")
    public ResponseEntity<List<EmployeeDto>> getEmployeesBySalaryRange(
            @Parameter(description = "Minimum salary")
            @RequestParam Integer minSalary,
            @Parameter(description = "Maximum salary")
            @RequestParam Integer maxSalary) {
        List<EmployeeDto> employees = employeeService.getEmployeesBySalaryRange(minSalary, maxSalary);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get high earners", description = "Find employees with salary above threshold")
    @GetMapping("/filter/high-earners")
    public ResponseEntity<List<EmployeeDto>> getHighEarners(
            @Parameter(description = "Minimum salary threshold")
            @RequestParam Integer minSalary) {
        List<EmployeeDto> employees = employeeService.getHighEarners(minSalary);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Search employees by address", description = "Find employees by address")
    @GetMapping("/search/address")
    public ResponseEntity<List<EmployeeDto>> searchEmployeesByAddress(
            @Parameter(description = "Address search term")
            @RequestParam String address) {
        List<EmployeeDto> employees = employeeService.searchEmployeesByAddress(address);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get employees ordered by salary", description = "Get all employees ordered by salary (descending)")
    @GetMapping("/ordered/salary")
    public ResponseEntity<List<EmployeeDto>> getEmployeesOrderedBySalary() {
        List<EmployeeDto> employees = employeeService.getEmployeesOrderedBySalary();
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get employees ordered by name", description = "Get all employees ordered alphabetically")
    @GetMapping("/ordered/name")
    public ResponseEntity<List<EmployeeDto>> getEmployeesOrderedByName() {
        List<EmployeeDto> employees = employeeService.getEmployeesOrderedByName();
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Advanced employee search", description = "Search employees with multiple criteria")
    @GetMapping("/search/advanced")
    public ResponseEntity<List<EmployeeDto>> searchEmployees(
            @Parameter(description = "First name (optional)")
            @RequestParam(required = false) String firstName,
            @Parameter(description = "Last name (optional)")
            @RequestParam(required = false) String lastName,
            @Parameter(description = "Minimum salary (optional)")
            @RequestParam(required = false) Integer minSalary,
            @Parameter(description = "Maximum salary (optional)")
            @RequestParam(required = false) Integer maxSalary) {
        List<EmployeeDto> employees = employeeService.searchEmployees(firstName, lastName, minSalary, maxSalary);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get salary statistics", description = "Get comprehensive salary statistics")
    @GetMapping("/statistics/salary")
    public ResponseEntity<EmployeeSalaryStatisticsDto> getSalaryStatistics() {
        EmployeeSalaryStatisticsDto statistics = employeeService.getSalaryStatistics();
        return ResponseEntity.ok(statistics);
    }

    @Operation(summary = "Get top earners", description = "Get top N highest paid employees")
    @GetMapping("/top-earners")
    public ResponseEntity<List<EmployeeDto>> getTopEarners(
            @Parameter(description = "Number of employees to return")
            @RequestParam(defaultValue = "10") int limit) {
        List<EmployeeDto> employees = employeeService.getTopEarners(limit);
        return ResponseEntity.ok(employees);
    }

    @Operation(summary = "Get salary range distribution", description = "Get employee count by salary ranges for charts")
    @GetMapping("/statistics/salary-ranges")
    public ResponseEntity<List<SalaryRangeCountDto>> getEmployeeCountBySalaryRanges() {
        List<SalaryRangeCountDto> distribution = employeeService.getEmployeeCountBySalaryRanges();
        return ResponseEntity.ok(distribution);
    }

    @Operation(summary = "Get employee statistics", description = "Get general employee statistics for HR dashboard")
    @GetMapping("/statistics")
    public ResponseEntity<EmployeeStatisticsDto> getEmployeeStatistics() {
        EmployeeStatisticsDto statistics = employeeService.getEmployeeStatistics();
        return ResponseEntity.ok(statistics);
    }
}