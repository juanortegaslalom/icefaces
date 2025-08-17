package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA Repository for Employee entity.
 * Replaces the manual DAO implementation with Spring Data JPA features.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    /**
     * Find employees by department
     */
    List<Employee> findByDepartmentIgnoreCase(String department);
    
    /**
     * Find employees by department with pagination
     */
    Page<Employee> findByDepartmentIgnoreCase(String department, Pageable pageable);
    
    /**
     * Find employees by first name or last name containing the search term (case insensitive)
     */
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Employee> findBySearchTerm(@Param("searchTerm") String searchTerm);
    
    /**
     * Find employees by search term with pagination
     */
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(e.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    Page<Employee> findBySearchTerm(@Param("searchTerm") String searchTerm, Pageable pageable);
    
    /**
     * Find employee by email (for uniqueness validation)
     */
    Optional<Employee> findByEmailIgnoreCase(String email);
    
    /**
     * Check if email exists for another employee (for update operations)
     */
    boolean existsByEmailIgnoreCaseAndIdNot(String email, Long id);
    
    /**
     * Get all distinct departments
     */
    @Query("SELECT DISTINCT e.department FROM Employee e ORDER BY e.department")
    List<String> findDistinctDepartments();
    
    /**
     * Count employees by department
     */
    @Query("SELECT e.department, COUNT(e) FROM Employee e GROUP BY e.department")
    List<Object[]> countEmployeesByDepartment();
    
    /**
     * Find all employees ordered by last name, first name
     */
    List<Employee> findAllByOrderByLastNameAscFirstNameAsc();
    
    /**
     * Find all employees with pagination ordered by last name, first name
     */
    Page<Employee> findAllByOrderByLastNameAscFirstNameAsc(Pageable pageable);
}