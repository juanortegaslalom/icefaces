package ca.alberta.gov.staffdirectory.repository;

import ca.alberta.gov.staffdirectory.entity.Ministry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * READ-ONLY repository for Ministry entities
 * Maintains compatibility with ICEfaces legacy application
 */
@Repository
public interface MinistryRepository extends JpaRepository<Ministry, Integer> {

    /**
     * Find ministry by name (case-insensitive)
     */
    Optional<Ministry> findByNameIgnoreCase(String name);

    /**
     * Search ministries by name containing search term
     */
    List<Ministry> findByNameContainingIgnoreCase(String name);

    /**
     * Get all ministries ordered by name (for main navigation)
     */
    @Query("SELECT m FROM Ministry m ORDER BY m.name")
    List<Ministry> findAllOrderedByName();

    /**
     * Find ministries with organizational units
     */
    @Query("SELECT DISTINCT m FROM Ministry m " +
           "LEFT JOIN FETCH m.organizationalUnits " +
           "ORDER BY m.name")
    List<Ministry> findAllWithOrganizationalUnits();

    /**
     * Find ministries with contacts
     */
    @Query("SELECT DISTINCT m FROM Ministry m " +
           "LEFT JOIN FETCH m.contacts " +
           "ORDER BY m.name")
    List<Ministry> findAllWithContacts();

    /**
     * Find Executive Branch ministry (for Minister contacts)
     */
    @Query("SELECT m FROM Ministry m WHERE LOWER(m.name) LIKE LOWER('%executive%')")
    Optional<Ministry> findExecutiveBranch();

    /**
     * Find Deputy Ministers ministry
     */
    @Query("SELECT m FROM Ministry m WHERE LOWER(m.name) LIKE LOWER('%deputy minister%')")
    Optional<Ministry> findDeputyMinistersMinistry();

    /**
     * Find Spokesperson Contacts ministry
     */
    @Query("SELECT m FROM Ministry m WHERE LOWER(m.name) LIKE LOWER('%spokesperson%')")
    Optional<Ministry> findSpokespersonMinistry();

    /**
     * Find Administrative Services ministry
     */
    @Query("SELECT m FROM Ministry m WHERE LOWER(m.name) LIKE LOWER('%administrative%')")
    Optional<Ministry> findAdministrativeMinistry();

    /**
     * Count total ministries (for compatibility verification)
     */
    @Query("SELECT COUNT(m) FROM Ministry m")
    long countAllMinistries();

    /**
     * Get ministry statistics
     */
    @Query("SELECT m.name, " +
           "(SELECT COUNT(ou) FROM OrganizationalUnit ou WHERE ou.ministryId = m.id) as unitCount, " +
           "(SELECT COUNT(c) FROM Contact c WHERE c.ministryId = m.id) as contactCount " +
           "FROM Ministry m ORDER BY m.name")
    List<Object[]> getMinistryStatistics();
}