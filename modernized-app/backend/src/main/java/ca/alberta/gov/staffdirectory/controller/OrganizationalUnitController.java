package ca.alberta.gov.staffdirectory.controller;

import ca.alberta.gov.staffdirectory.entity.OrganizationalUnit;
import ca.alberta.gov.staffdirectory.service.StaffDirectoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Organizational Unit operations
 * READ-ONLY API maintaining compatibility with ICEfaces legacy app
 */
@RestController
@RequestMapping("/organizational-units")
@Tag(name = "Organizational Units", description = "Organizational structure operations")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class OrganizationalUnitController {

    @Autowired
    private StaffDirectoryService staffDirectoryService;

    @Operation(summary = "Get organizational unit by ID", description = "Retrieve a specific organizational unit by ID")
    @ApiResponse(responseCode = "200", description = "Organizational unit retrieved successfully")
    @GetMapping("/{id}")
    public ResponseEntity<OrganizationalUnit> getOrganizationalUnitById(@PathVariable Integer id) {
        return staffDirectoryService.getOrganizationalUnitById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Get root units for ministry", 
               description = "Get top-level organizational units for a specific ministry")
    @GetMapping("/ministry/{ministryId}/roots")
    public ResponseEntity<List<OrganizationalUnit>> getRootUnitsForMinistry(@PathVariable Integer ministryId) {
        List<OrganizationalUnit> units = staffDirectoryService.getRootUnitsForMinistry(ministryId);
        return ResponseEntity.ok(units);
    }

    @Operation(summary = "Get child units", description = "Get child organizational units for a parent unit")
    @GetMapping("/{parentId}/children")
    public ResponseEntity<List<OrganizationalUnit>> getChildUnits(@PathVariable Integer parentId) {
        List<OrganizationalUnit> children = staffDirectoryService.getChildUnits(parentId);
        return ResponseEntity.ok(children);
    }

    @Operation(summary = "Get ministry hierarchy", 
               description = "Get complete organizational hierarchy for a ministry")
    @GetMapping("/ministry/{ministryId}/hierarchy")
    public ResponseEntity<List<OrganizationalUnit>> getMinistryHierarchy(@PathVariable Integer ministryId) {
        List<OrganizationalUnit> hierarchy = staffDirectoryService.getMinistryHierarchy(ministryId);
        return ResponseEntity.ok(hierarchy);
    }

    @Operation(summary = "Search organizational units", 
               description = "Search organizational units by name")
    @GetMapping("/search")
    public ResponseEntity<List<OrganizationalUnit>> searchOrganizationalUnits(
            @Parameter(description = "Search term for organizational unit name")
            @RequestParam String q) {
        
        List<OrganizationalUnit> results = staffDirectoryService.searchOrganizationalUnits(q);
        return ResponseEntity.ok(results);
    }

    // ========== SPECIALIZED ORGANIZATIONAL UNIT ENDPOINTS ==========

    @Operation(summary = "Get deputy minister offices", 
               description = "Get organizational units that are deputy minister offices")
    @GetMapping("/deputy-minister-offices")
    public ResponseEntity<List<OrganizationalUnit>> getDeputyMinisterOffices() {
        List<OrganizationalUnit> offices = staffDirectoryService.getDeputyMinisterOffices();
        return ResponseEntity.ok(offices);
    }

    @Operation(summary = "Get spokesperson departments", 
               description = "Get organizational units that handle communications/spokesperson duties")
    @GetMapping("/spokesperson-departments")
    public ResponseEntity<List<OrganizationalUnit>> getSpokespersonDepartments() {
        List<OrganizationalUnit> departments = staffDirectoryService.getSpokespersonDepartments();
        return ResponseEntity.ok(departments);
    }

    @Operation(summary = "Get administrative departments", 
               description = "Get organizational units that handle administrative functions")
    @GetMapping("/administrative-departments")
    public ResponseEntity<List<OrganizationalUnit>> getAdministrativeDepartments() {
        List<OrganizationalUnit> departments = staffDirectoryService.getAdministrativeDepartments();
        return ResponseEntity.ok(departments);
    }
}