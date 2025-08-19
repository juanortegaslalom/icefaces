package ca.alberta.gov.staffdirectory.repository;

import ca.alberta.gov.staffdirectory.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * READ-ONLY repository for Contact entities
 * Maintains compatibility with ICEfaces legacy application
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    /**
     * Enhanced search across name, title, and email with case-insensitive matching
     */
    @Query("SELECT c FROM Contact c WHERE " +
           "LOWER(c.name) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(c.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(c.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Contact> searchContacts(@Param("searchTerm") String searchTerm);

    /**
     * Paginated search for better performance with large datasets
     */
    @Query("SELECT c FROM Contact c WHERE " +
           "LOWER(c.name) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(c.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "LOWER(c.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    Page<Contact> searchContactsPaginated(@Param("searchTerm") String searchTerm, Pageable pageable);

    /**
     * Find contacts by ministry ID
     */
    List<Contact> findByMinistryId(Integer ministryId);

    /**
     * Find contacts by organizational unit ID
     */
    List<Contact> findByOrganizationalUnitId(Integer organizationalUnitId);

    /**
     * Find contacts by ministry name (for minister contacts)
     */
    @Query("SELECT c FROM Contact c JOIN c.ministry m WHERE LOWER(m.name) LIKE LOWER(CONCAT('%', :ministryName, '%'))")
    List<Contact> findByMinistryNameContainingIgnoreCase(@Param("ministryName") String ministryName);

    /**
     * Find deputy minister contacts
     */
    @Query("SELECT c FROM Contact c JOIN c.organizationalUnit ou WHERE " +
           "LOWER(ou.name) LIKE LOWER('%deputy minister%') OR " +
           "LOWER(c.title) LIKE LOWER('%deputy minister%')")
    List<Contact> findDeputyMinisters();

    /**
     * Find spokesperson contacts
     */
    @Query("SELECT c FROM Contact c JOIN c.organizationalUnit ou WHERE " +
           "LOWER(ou.name) LIKE LOWER('%spokesperson%') OR " +
           "LOWER(c.title) LIKE LOWER('%spokesperson%') OR " +
           "LOWER(c.title) LIKE LOWER('%communications%')")
    List<Contact> findSpokespersons();

    /**
     * Find administrative contacts
     */
    @Query("SELECT c FROM Contact c JOIN c.ministry m WHERE " +
           "LOWER(m.name) LIKE LOWER('%administrative%') OR " +
           "LOWER(c.title) LIKE LOWER('%administrative%')")
    List<Contact> findAdministrativeContacts();

    /**
     * Count total contacts (for compatibility verification)
     */
    @Query("SELECT COUNT(c) FROM Contact c")
    long countAllContacts();

    /**
     * Advanced search with multiple filters
     */
    @Query("SELECT c FROM Contact c " +
           "JOIN c.ministry m " +
           "LEFT JOIN c.organizationalUnit ou " +
           "WHERE (:searchTerm IS NULL OR " +
           "       LOWER(c.name) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "       LOWER(c.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
           "       LOWER(c.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))) " +
           "AND (:ministryId IS NULL OR c.ministryId = :ministryId) " +
           "AND (:unitType IS NULL OR ou.unitType = :unitType)")
    Page<Contact> findWithFilters(@Param("searchTerm") String searchTerm,
                                  @Param("ministryId") Integer ministryId,
                                  @Param("unitType") String unitType,
                                  Pageable pageable);
}