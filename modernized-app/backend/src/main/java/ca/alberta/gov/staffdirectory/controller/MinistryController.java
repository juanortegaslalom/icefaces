package ca.alberta.gov.staffdirectory.controller;

import ca.alberta.gov.staffdirectory.entity.Ministry;
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
 * REST Controller for Ministry operations
 * READ-ONLY API maintaining compatibility with ICEfaces legacy app
 */
@RestController
@RequestMapping("/ministries")
@Tag(name = "Ministries", description = "Ministry information operations")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class MinistryController {

    @Autowired
    private StaffDirectoryService staffDirectoryService;

    @Operation(summary = "Get all ministries", description = "Retrieve all government ministries ordered by name")
    @ApiResponse(responseCode = "200", description = "Ministries retrieved successfully")
    @GetMapping
    public ResponseEntity<List<Ministry>> getAllMinistries() {
        List<Ministry> ministries = staffDirectoryService.getAllMinistries();
        return ResponseEntity.ok(ministries);
    }

    @Operation(summary = "Get ministry by ID", description = "Retrieve a specific ministry by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Ministry> getMinistryById(@PathVariable Integer id) {
        return staffDirectoryService.getMinistryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Get ministry by name", description = "Retrieve a ministry by its exact name (case-insensitive)")
    @GetMapping("/name/{name}")
    public ResponseEntity<Ministry> getMinistryByName(@PathVariable String name) {
        return staffDirectoryService.getMinistryByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Search ministries", description = "Search ministries by name containing the search term")
    @GetMapping("/search")
    public ResponseEntity<List<Ministry>> searchMinistries(
            @Parameter(description = "Search term for ministry name")
            @RequestParam String q) {
        
        List<Ministry> results = staffDirectoryService.searchMinistries(q);
        return ResponseEntity.ok(results);
    }

    @Operation(summary = "Get ministries with organizational structure", 
               description = "Get all ministries with their organizational units loaded")
    @GetMapping("/with-structure")
    public ResponseEntity<List<Ministry>> getMinistriesWithStructure() {
        List<Ministry> ministries = staffDirectoryService.getMinistriesWithStructure();
        return ResponseEntity.ok(ministries);
    }
}