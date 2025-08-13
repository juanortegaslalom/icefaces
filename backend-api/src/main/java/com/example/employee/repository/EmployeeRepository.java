package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Employee Repository - modern replacement for the ICEfaces DAO pattern
 * Uses Spring Data JPA for automatic query generation
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    // Find by department (case-insensitive)
    List<Employee> findByDepartmentIgnoreCase(String department);
    
    // Search functionality (not available in original ICEfaces version)
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.email) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.department) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Employee> searchEmployees(@Param("searchTerm") String searchTerm);
    
    // Search with pagination
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.email) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.department) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    Page<Employee> searchEmployees(@Param("searchTerm") String searchTerm, Pageable pageable);
    
    // Check email uniqueness (business rule)
    boolean existsByEmailIgnoreCase(String email);
    
    // Find by email (for duplicate checking during updates)
    Employee findByEmailIgnoreCase(String email);
    
    // Get employees by department with sorting
    List<Employee> findByDepartmentIgnoreCaseOrderByLastNameAsc(String department);
    
    // Get all departments (for dropdown/filter functionality)
    @Query("SELECT DISTINCT e.department FROM Employee e ORDER BY e.department")
    List<String> findAllDepartments();
    
    // Count employees by department (for statistics)
    @Query("SELECT e.department, COUNT(e) FROM Employee e GROUP BY e.department")
    List<Object[]> countEmployeesByDepartment();
    
    // Find employees by name pattern (supporting ICEfaces-style name search)
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(CONCAT(e.firstName, ' ', e.lastName)) LIKE LOWER(CONCAT('%', :namePattern, '%'))")
    List<Employee> findByFullNameContaining(@Param("namePattern") String namePattern);
}