package ca.alberta.gov.staffdirectory.repository;

import ca.alberta.gov.staffdirectory.entity.OrganizationalUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * READ-ONLY repository for OrganizationalUnit entities
 * Maintains compatibility with ICEfaces legacy application
 */
@Repository
public interface OrganizationalUnitRepository extends JpaRepository<OrganizationalUnit, Integer> {

    /**
     * Find root organizational units (no parent) for a ministry
     */
    List<OrganizationalUnit> findByMinistryIdAndParentIdIsNull(Integer ministryId);

    /**
     * Find child organizational units
     */
    List<OrganizationalUnit> findByParentId(Integer parentId);

    /**
     * Find all organizational units for a ministry
     */
    List<OrganizationalUnit> findByMinistryId(Integer ministryId);

    /**
     * Find organizational units by type
     */
    List<OrganizationalUnit> findByUnitType(OrganizationalUnit.UnitType unitType);

    /**
     * Find organizational units by ministry and type
     */
    List<OrganizationalUnit> findByMinistryIdAndUnitType(Integer ministryId, OrganizationalUnit.UnitType unitType);

    /**
     * Search organizational units by name
     */
    List<OrganizationalUnit> findByNameContainingIgnoreCase(String name);

    /**
     * Get hierarchical structure for a ministry
     */
    @Query("SELECT ou FROM OrganizationalUnit ou " +
           "WHERE ou.ministryId = :ministryId " +
           "ORDER BY ou.level, ou.name")
    List<OrganizationalUnit> findByMinistryIdOrderedByHierarchy(@Param("ministryId") Integer ministryId);

    /**
     * Find deputy minister offices
     */
    @Query("SELECT ou FROM OrganizationalUnit ou WHERE " +
           "LOWER(ou.name) LIKE LOWER('%deputy minister%') OR " +
           "LOWER(ou.name) LIKE LOWER('%office of%')")
    List<OrganizationalUnit> findDeputyMinisterOffices();

    /**
     * Find spokesperson departments
     */
    @Query("SELECT ou FROM OrganizationalUnit ou WHERE " +
           "LOWER(ou.name) LIKE LOWER('%communications%') OR " +
           "LOWER(ou.name) LIKE LOWER('%spokesperson%')")
    List<OrganizationalUnit> findSpokespersonDepartments();

    /**
     * Find administrative departments
     */
    @Query("SELECT ou FROM OrganizationalUnit ou WHERE " +
           "LOWER(ou.name) LIKE LOWER('%administrative%')")
    List<OrganizationalUnit> findAdministrativeDepartments();

    /**
     * Get organizational units with contact counts
     */
    @Query("SELECT ou, " +
           "(SELECT COUNT(c) FROM Contact c WHERE c.organizationalUnitId = ou.id) as contactCount " +
           "FROM OrganizationalUnit ou " +
           "WHERE ou.ministryId = :ministryId " +
           "ORDER BY ou.level, ou.name")
    List<Object[]> findWithContactCounts(@Param("ministryId") Integer ministryId);

    /**
     * Find organizational units with contacts
     */
    @Query("SELECT DISTINCT ou FROM OrganizationalUnit ou " +
           "LEFT JOIN FETCH ou.contacts " +
           "WHERE ou.ministryId = :ministryId " +
           "ORDER BY ou.level, ou.name")
    List<OrganizationalUnit> findByMinistryIdWithContacts(@Param("ministryId") Integer ministryId);

    /**
     * Find organizational units with children
     */
    @Query("SELECT DISTINCT ou FROM OrganizationalUnit ou " +
           "LEFT JOIN FETCH ou.children " +
           "WHERE ou.ministryId = :ministryId AND ou.parentId IS NULL " +
           "ORDER BY ou.name")
    List<OrganizationalUnit> findRootUnitsWithChildren(@Param("ministryId") Integer ministryId);

    /**
     * Count total organizational units (for compatibility verification)
     */
    @Query("SELECT COUNT(ou) FROM OrganizationalUnit ou")
    long countAllOrganizationalUnits();

    /**
     * Get hierarchy statistics
     */
    @Query("SELECT ou.unitType, COUNT(ou) FROM OrganizationalUnit ou GROUP BY ou.unitType")
    List<Object[]> getUnitTypeStatistics();
}