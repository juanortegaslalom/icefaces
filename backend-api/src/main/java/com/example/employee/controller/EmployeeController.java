package com.example.employee.controller;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Employee REST Controller - Modern API replacement for ICEfaces EmployeeBean
 * 
 * Provides the same functionality as the original JSF managed bean but as REST endpoints:
 * - GET /api/employees -> replaces EmployeeBean.getEmployees()
 * - POST /api/employees -> replaces EmployeeBean.addEmployee()  
 * - DELETE /api/employees/{id} -> replaces EmployeeBean.removeEmployee()
 * - Plus additional features not available in ICEfaces (search, update, pagination)
 */
@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4201", "http://localhost:3000"})
public class EmployeeController {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    
    @Autowired
    private EmployeeService employeeService;
    
    /**
     * Get all employees with pagination and sorting
     * Enhanced version of EmployeeBean.getEmployees() with server-side pagination
     */
    @GetMapping
    public ResponseEntity<Page<EmployeeDto>> getAllEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "lastName") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {
        
        logger.debug("Getting employees - page: {}, size: {}, sort: {} {}", page, size, sortBy, sortDir);
        
        Sort sort = Sort.by(Sort.Direction.fromString(sortDir), sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);
        
        Page<EmployeeDto> employees = employeeService.getAllEmployees(pageable);
        return ResponseEntity.ok(employees);
    }
    
    /**
     * Get all employees without pagination (for backward compatibility)
     * Direct replacement for EmployeeBean.getEmployees()
     */
    @GetMapping("/all")
    public ResponseEntity<List<EmployeeDto>> getAllEmployeesNoPaging() {
        logger.debug("Getting all employees without pagination");
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
    
    /**
     * Search employees by term (new feature not in ICEfaces)
     */
    @GetMapping("/search")
    public ResponseEntity<List<EmployeeDto>> searchEmployees(
            @RequestParam("term") String searchTerm,
            @RequestParam(defaultValue = "false") boolean paginated,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        
        logger.debug("Searching employees with term: {}", searchTerm);
        
        if (paginated) {
            Pageable pageable = PageRequest.of(page, size, Sort.by("lastName", "firstName"));
            Page<EmployeeDto> employees = employeeService.searchEmployees(searchTerm, pageable);
            // For paginated results, we return the content and let the frontend handle pagination UI
            return ResponseEntity.ok(employees.getContent());
        } else {
            List<EmployeeDto> employees = employeeService.searchEmployees(searchTerm);
            return ResponseEntity.ok(employees);
        }
    }
    
    /**
     * Get employee by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long id) {
        logger.debug("Getting employee by ID: {}", id);
        EmployeeDto employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
    
    /**
     * Create new employee
     * Direct replacement for EmployeeBean.addEmployee(ActionEvent event)
     */
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        logger.debug("Creating new employee: {}", employeeDto);
        EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }
    
    /**
     * Update employee (new feature - ICEfaces only had create/delete)
     */
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeDto employeeDto) {
        
        logger.debug("Updating employee ID: {} with data: {}", id, employeeDto);
        EmployeeDto updatedEmployee = employeeService.updateEmployee(id, employeeDto);
        return ResponseEntity.ok(updatedEmployee);
    }
    
    /**
     * Delete employee
     * Direct replacement for EmployeeBean.removeEmployee(Employee employee)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        logger.debug("Deleting employee with ID: {}", id);
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
    
    /**
     * Get employee count
     * Direct replacement for EmployeeBean.getEmployeeCount()
     */
    @GetMapping("/count")
    public ResponseEntity<Long> getEmployeeCount() {
        long count = employeeService.getEmployeeCount();
        return ResponseEntity.ok(count);
    }
    
    /**
     * Get all departments for dropdown/filter (new feature)
     */
    @GetMapping("/departments")
    public ResponseEntity<List<String>> getAllDepartments() {
        List<String> departments = employeeService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }
    
    /**
     * Health check endpoint
     */
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        long employeeCount = employeeService.getEmployeeCount();
        return ResponseEntity.ok("Employee API is healthy. Total employees: " + employeeCount);
    }
}