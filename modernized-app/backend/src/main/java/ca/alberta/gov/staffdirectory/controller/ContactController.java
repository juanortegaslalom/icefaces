package ca.alberta.gov.staffdirectory.controller;

import ca.alberta.gov.staffdirectory.entity.Contact;
import ca.alberta.gov.staffdirectory.service.StaffDirectoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Contact operations
 * READ-ONLY API maintaining compatibility with ICEfaces legacy app
 */
@RestController
@RequestMapping("/contacts")
@Tag(name = "Contacts", description = "Contact management operations")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class ContactController {

    @Autowired
    private StaffDirectoryService staffDirectoryService;

    @Operation(summary = "Search contacts", description = "Search contacts by name, title, or email")
    @ApiResponse(responseCode = "200", description = "Search results returned successfully")
    @GetMapping("/search")
    public ResponseEntity<List<Contact>> searchContacts(
            @Parameter(description = "Search term for name, title, or email")
            @RequestParam String q) {
        
        List<Contact> results = staffDirectoryService.searchContacts(q);
        return ResponseEntity.ok(results);
    }

    @Operation(summary = "Search contacts with pagination", description = "Search contacts with pagination support")
    @GetMapping("/search/paginated")
    public ResponseEntity<Page<Contact>> searchContactsPaginated(
            @RequestParam String q,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {
        
        Sort sort = sortDir.equals("desc") ? 
            Sort.by(sortBy).descending() : 
            Sort.by(sortBy).ascending();
            
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Contact> results = staffDirectoryService.searchContactsPaginated(q, pageable);
        
        return ResponseEntity.ok(results);
    }

    @Operation(summary = "Advanced search with filters", description = "Search contacts with multiple filters")
    @GetMapping("/search/advanced")
    public ResponseEntity<Page<Contact>> searchWithFilters(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) Integer ministryId,
            @RequestParam(required = false) String unitType,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        
        Pageable pageable = PageRequest.of(page, size, Sort.by("name"));
        Page<Contact> results = staffDirectoryService.searchWithFilters(q, ministryId, unitType, pageable);
        
        return ResponseEntity.ok(results);
    }

    @Operation(summary = "Get contact by ID", description = "Retrieve a specific contact by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Integer id) {
        return staffDirectoryService.getContactById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Get contacts by ministry", description = "Get all contacts for a specific ministry")
    @GetMapping("/ministry/{ministryId}")
    public ResponseEntity<List<Contact>> getContactsByMinistry(@PathVariable Integer ministryId) {
        List<Contact> contacts = staffDirectoryService.getContactsByMinistry(ministryId);
        return ResponseEntity.ok(contacts);
    }

    @Operation(summary = "Get contacts by organizational unit", description = "Get all contacts for a specific organizational unit")
    @GetMapping("/unit/{unitId}")
    public ResponseEntity<List<Contact>> getContactsByUnit(@PathVariable Integer unitId) {
        List<Contact> contacts = staffDirectoryService.getContactsByOrganizationalUnit(unitId);
        return ResponseEntity.ok(contacts);
    }

    // ========== SPECIALIZED CONTACT ENDPOINTS ==========

    @Operation(summary = "Get minister contacts", description = "Get contacts for government ministers")
    @GetMapping("/ministers")
    public ResponseEntity<List<Contact>> getMinisterContacts() {
        List<Contact> contacts = staffDirectoryService.getMinisterContacts();
        return ResponseEntity.ok(contacts);
    }

    @Operation(summary = "Get deputy minister contacts", description = "Get contacts for deputy ministers")
    @GetMapping("/deputy-ministers")
    public ResponseEntity<List<Contact>> getDeputyMinisterContacts() {
        List<Contact> contacts = staffDirectoryService.getDeputyMinisterContacts();
        return ResponseEntity.ok(contacts);
    }

    @Operation(summary = "Get spokesperson contacts", description = "Get contacts for government spokespersons")
    @GetMapping("/spokespersons")
    public ResponseEntity<List<Contact>> getSpokespersonContacts() {
        List<Contact> contacts = staffDirectoryService.getSpokespersonContacts();
        return ResponseEntity.ok(contacts);
    }

    @Operation(summary = "Get administrative contacts", description = "Get contacts for administrative departments")
    @GetMapping("/administrative")
    public ResponseEntity<List<Contact>> getAdministrativeContacts() {
        List<Contact> contacts = staffDirectoryService.getAdministrativeContacts();
        return ResponseEntity.ok(contacts);
    }
}