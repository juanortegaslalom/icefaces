package com.icefaces.modernization.api.repository;

import com.icefaces.modernization.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Employee entity - replaces ICEfaces employee data access
 * Provides modern query methods for employee management operations
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    /**
     * Find employees by last name (case-insensitive)
     * Common search pattern for employee lookups
     */
    List<Employee> findByLastNameContainingIgnoreCase(String lastName);
    
    /**
     * Find employees by first name (case-insensitive)
     */
    List<Employee> findByFirstNameContainingIgnoreCase(String firstName);
    
    /**
     * Find employees by salary range
     * Useful for compensation analysis and HR reporting
     */
    List<Employee> findBySalaryBetween(Integer minSalary, Integer maxSalary);
    
    /**
     * Find employees with salary greater than specified amount
     * Useful for high-earner reports
     */
    List<Employee> findBySalaryGreaterThan(Integer minSalary);
    
    /**
     * Find employees with salary greater than or equal to specified amount
     * Useful for high-earner reports (inclusive)
     */
    List<Employee> findBySalaryGreaterThanEqual(Integer minSalary);
    
    /**
     * Find employees by address containing text
     * Useful for location-based employee searches
     */
    List<Employee> findByAddressContainingIgnoreCase(String addressText);
    
    /**
     * Find employees ordered by salary (descending)
     * Useful for salary ranking reports
     */
    List<Employee> findAllByOrderBySalaryDesc();
    
    /**
     * Find employees ordered by last name
     * Standard alphabetical listing
     */
    List<Employee> findAllByOrderByLastNameAsc();
    
    /**
     * Find employees ordered by last name, then first name
     * More precise alphabetical listing
     */
    List<Employee> findAllByOrderByLastNameAscFirstNameAsc();
    
    /**
     * Search employees by full name (first and last name)
     * Advanced search functionality
     */
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(CONCAT(e.firstName, ' ', e.lastName)) LIKE LOWER(CONCAT('%', :fullName, '%'))")
    List<Employee> findByFullNameContaining(@Param("fullName") String fullName);
    
    /**
     * Find employees with multiple search criteria
     * Replaces complex ICEfaces managed bean filtering logic
     */
    @Query("SELECT e FROM Employee e WHERE " +
           "(:firstName IS NULL OR LOWER(e.firstName) LIKE LOWER(CONCAT('%', :firstName, '%'))) AND " +
           "(:lastName IS NULL OR LOWER(e.lastName) LIKE LOWER(CONCAT('%', :lastName, '%'))) AND " +
           "(:minSalary IS NULL OR e.salary >= :minSalary) AND " +
           "(:maxSalary IS NULL OR e.salary <= :maxSalary)")
    List<Employee> findEmployeesByCriteria(@Param("firstName") String firstName,
                                          @Param("lastName") String lastName,
                                          @Param("minSalary") Integer minSalary,
                                          @Param("maxSalary") Integer maxSalary);
    
    /**
     * Find employees by multiple criteria - alternative method name
     * Used by EmployeeService implementation
     */
    @Query("SELECT e FROM Employee e WHERE " +
           "(:firstName IS NULL OR LOWER(e.firstName) LIKE LOWER(CONCAT('%', :firstName, '%'))) AND " +
           "(:lastName IS NULL OR LOWER(e.lastName) LIKE LOWER(CONCAT('%', :lastName, '%'))) AND " +
           "(:minSalary IS NULL OR e.salary >= :minSalary) AND " +
           "(:maxSalary IS NULL OR e.salary <= :maxSalary)")
    List<Employee> findByMultipleCriteria(@Param("firstName") String firstName,
                                         @Param("lastName") String lastName,
                                         @Param("minSalary") Integer minSalary,
                                         @Param("maxSalary") Integer maxSalary);
    
    /**
     * Get salary statistics
     * Useful for dashboard and reporting widgets
     */
    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();
    
    @Query("SELECT MAX(e.salary) FROM Employee e")
    Integer getMaxSalary();
    
    @Query("SELECT MIN(e.salary) FROM Employee e")
    Integer getMinSalary();
    
    /**
     * Count employees by salary ranges
     * Useful for salary distribution charts (replacing ICEfaces charts)
     */
    @Query("SELECT COUNT(e) FROM Employee e WHERE e.salary BETWEEN :min AND :max")
    long countEmployeesInSalaryRange(@Param("min") Integer minSalary, @Param("max") Integer maxSalary);
    
    /**
     * Find top N highest paid employees
     * Useful for executive reports
     */
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> findTopEarners();
    
    /**
     * Find top employees ordered by salary (descending)
     * Spring Data method for top earners
     */
    List<Employee> findTopByOrderBySalaryDesc();
}