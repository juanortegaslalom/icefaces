package ca.alberta.gov.staffdirectory.service;

import ca.alberta.gov.staffdirectory.entity.Contact;
import ca.alberta.gov.staffdirectory.entity.Ministry;
import ca.alberta.gov.staffdirectory.entity.OrganizationalUnit;
import ca.alberta.gov.staffdirectory.repository.ContactRepository;
import ca.alberta.gov.staffdirectory.repository.MinistryRepository;
import ca.alberta.gov.staffdirectory.repository.OrganizationalUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * READ-ONLY service for Alberta Staff Directory
 * Maintains compatibility with ICEfaces legacy application
 */
@Service
@Transactional(readOnly = true)
public class StaffDirectoryService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private MinistryRepository ministryRepository;

    @Autowired
    private OrganizationalUnitRepository organizationalUnitRepository;

    // ========== CONTACT SERVICES ==========

    /**
     * Enhanced search across all contact fields with debouncing support
     */
    public List<Contact> searchContacts(String searchTerm) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return List.of();
        }
        return contactRepository.searchContacts(searchTerm.trim());
    }

    /**
     * Paginated search for better performance
     */
    public Page<Contact> searchContactsPaginated(String searchTerm, Pageable pageable) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return Page.empty(pageable);
        }
        return contactRepository.searchContactsPaginated(searchTerm.trim(), pageable);
    }

    /**
     * Advanced search with filters
     */
    public Page<Contact> searchWithFilters(String searchTerm, Integer ministryId, String unitType, Pageable pageable) {
        return contactRepository.findWithFilters(searchTerm, ministryId, unitType, pageable);
    }

    /**
     * Get contact by ID
     */
    public Optional<Contact> getContactById(Integer id) {
        return contactRepository.findById(id);
    }

    /**
     * Get contacts by ministry
     */
    public List<Contact> getContactsByMinistry(Integer ministryId) {
        return contactRepository.findByMinistryId(ministryId);
    }

    /**
     * Get contacts by organizational unit
     */
    public List<Contact> getContactsByOrganizationalUnit(Integer unitId) {
        return contactRepository.findByOrganizationalUnitId(unitId);
    }

    // ========== SPECIALIZED CONTACT SERVICES ==========

    /**
     * Get minister contacts (Executive Branch)
     */
    public List<Contact> getMinisterContacts() {
        return contactRepository.findByMinistryNameContainingIgnoreCase("Executive");
    }

    /**
     * Get deputy minister contacts
     */
    public List<Contact> getDeputyMinisterContacts() {
        return contactRepository.findDeputyMinisters();
    }

    /**
     * Get spokesperson contacts
     */
    public List<Contact> getSpokespersonContacts() {
        return contactRepository.findSpokespersons();
    }

    /**
     * Get administrative contacts
     */
    public List<Contact> getAdministrativeContacts() {
        return contactRepository.findAdministrativeContacts();
    }

    // ========== MINISTRY SERVICES ==========

    /**
     * Get all ministries ordered by name
     */
    public List<Ministry> getAllMinistries() {
        return ministryRepository.findAllOrderedByName();
    }

    /**
     * Get ministry by ID
     */
    public Optional<Ministry> getMinistryById(Integer id) {
        return ministryRepository.findById(id);
    }

    /**
     * Get ministry by name
     */
    public Optional<Ministry> getMinistryByName(String name) {
        return ministryRepository.findByNameIgnoreCase(name);
    }

    /**
     * Search ministries by name
     */
    public List<Ministry> searchMinistries(String name) {
        return ministryRepository.findByNameContainingIgnoreCase(name);
    }

    /**
     * Get ministries with their organizational structure
     */
    public List<Ministry> getMinistriesWithStructure() {
        return ministryRepository.findAllWithOrganizationalUnits();
    }

    // ========== ORGANIZATIONAL UNIT SERVICES ==========

    /**
     * Get organizational unit by ID
     */
    public Optional<OrganizationalUnit> getOrganizationalUnitById(Integer id) {
        return organizationalUnitRepository.findById(id);
    }

    /**
     * Get root organizational units for a ministry
     */
    public List<OrganizationalUnit> getRootUnitsForMinistry(Integer ministryId) {
        return organizationalUnitRepository.findByMinistryIdAndParentIdIsNull(ministryId);
    }

    /**
     * Get child organizational units
     */
    public List<OrganizationalUnit> getChildUnits(Integer parentId) {
        return organizationalUnitRepository.findByParentId(parentId);
    }

    /**
     * Get all organizational units for a ministry with hierarchy
     */
    public List<OrganizationalUnit> getMinistryHierarchy(Integer ministryId) {
        return organizationalUnitRepository.findByMinistryIdOrderedByHierarchy(ministryId);
    }

    /**
     * Search organizational units by name
     */
    public List<OrganizationalUnit> searchOrganizationalUnits(String name) {
        return organizationalUnitRepository.findByNameContainingIgnoreCase(name);
    }

    // ========== SPECIALIZED ORGANIZATIONAL SERVICES ==========

    /**
     * Get deputy minister offices
     */
    public List<OrganizationalUnit> getDeputyMinisterOffices() {
        return organizationalUnitRepository.findDeputyMinisterOffices();
    }

    /**
     * Get spokesperson departments
     */
    public List<OrganizationalUnit> getSpokespersonDepartments() {
        return organizationalUnitRepository.findSpokespersonDepartments();
    }

    /**
     * Get administrative departments
     */
    public List<OrganizationalUnit> getAdministrativeDepartments() {
        return organizationalUnitRepository.findAdministrativeDepartments();
    }

    // ========== COMPATIBILITY VERIFICATION SERVICES ==========

    /**
     * Get system statistics for compatibility verification
     */
    public Map<String, Long> getSystemStatistics() {
        return Map.of(
            "totalContacts", contactRepository.countAllContacts(),
            "totalMinistries", ministryRepository.countAllMinistries(),
            "totalOrganizationalUnits", organizationalUnitRepository.countAllOrganizationalUnits()
        );
    }

    /**
     * Verify data integrity with legacy system
     */
    public boolean verifyDataIntegrity() {
        long contactCount = contactRepository.countAllContacts();
        long ministryCount = ministryRepository.countAllMinistries();
        long unitCount = organizationalUnitRepository.countAllOrganizationalUnits();
        
        // Expected minimums based on legacy data
        return contactCount >= 285 && ministryCount > 0 && unitCount > 0;
    }
}