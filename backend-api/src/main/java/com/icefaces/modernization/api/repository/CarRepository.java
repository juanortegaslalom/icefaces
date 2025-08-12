package com.icefaces.modernization.api.repository;

import com.icefaces.modernization.api.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Car entity - replaces ICEfaces managed bean data access
 * Provides modern query methods for car data operations
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    
    /**
     * Find cars by chassis type (case-insensitive)
     * Replaces: ICEfaces filter/selection logic in managed beans
     */
    List<Car> findByChassisIgnoreCase(String chassis);
    
    /**
     * Find cars by name containing search term (case-insensitive)
     * Replaces: ICEfaces autocomplete/search functionality
     */
    List<Car> findByNameContainingIgnoreCase(String searchTerm);
    
    /**
     * Find cars within weight range
     * Useful for filtering heavy/light vehicles
     */
    List<Car> findByWeightBetween(Integer minWeight, Integer maxWeight);
    
    /**
     * Find cars with MPG greater than specified value
     * Useful for fuel efficiency filtering
     */
    List<Car> findByMpgGreaterThan(Double minMpg);
    
    /**
     * Find cars with MPG greater than or equal to specified value
     * Useful for fuel efficiency filtering
     */
    List<Car> findByMpgGreaterThanEqual(Double minMpg);
    
    /**
     * Find cars within cost range
     * Common filtering requirement for price-based searches
     */
    List<Car> findByCostBetween(Double minCost, Double maxCost);
    
    /**
     * Find cars by acceleration performance
     * Useful for performance-based filtering
     */
    List<Car> findByAccelerationLessThan(Integer maxAcceleration);
    
    /**
     * Custom query: Find cars with best fuel efficiency
     * Demonstrates custom JPQL for complex business logic
     */
    @Query("SELECT c FROM Car c ORDER BY c.mpg DESC")
    List<Car> findMostFuelEfficient();
    
    /**
     * Find top cars ordered by MPG (descending)
     * Used for fuel efficiency rankings
     */
    List<Car> findTopByOrderByMpgDesc();
    
    /**
     * Custom query: Find cars by multiple criteria
     * Replaces complex ICEfaces managed bean filtering logic
     */
    @Query("SELECT c FROM Car c WHERE " +
           "(:chassis IS NULL OR LOWER(c.chassis) = LOWER(:chassis)) AND " +
           "(:minMpg IS NULL OR c.mpg >= :minMpg) AND " +
           "(:maxCost IS NULL OR c.cost <= :maxCost)")
    List<Car> findByMultipleCriteria(@Param("chassis") String chassis,
                                    @Param("minMpg") Double minMpg,
                                    @Param("maxCost") Double maxCost);
    
    /**
     * Count cars by chassis type
     * Useful for statistical data that ICEfaces charts might display
     */
    long countByChassis(String chassis);
    
    /**
     * Find all distinct chassis types
     * Useful for populating dropdown/select components
     */
    @Query("SELECT DISTINCT c.chassis FROM Car c ORDER BY c.chassis")
    List<String> findDistinctChassis();
}