package ca.alberta.gov.staffdirectory.controller;

import ca.alberta.gov.staffdirectory.service.StaffDirectoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * REST Controller for System operations and compatibility verification
 * Provides health checks and statistics for modernized application
 */
@RestController
@RequestMapping("/system")
@Tag(name = "System", description = "System health and compatibility operations")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class SystemController {

    @Autowired
    private StaffDirectoryService staffDirectoryService;

    @Operation(summary = "Health check", description = "Check if the API is running and database is accessible")
    @ApiResponse(responseCode = "200", description = "System is healthy")
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> healthCheck() {
        try {
            Map<String, Long> stats = staffDirectoryService.getSystemStatistics();
            boolean isHealthy = staffDirectoryService.verifyDataIntegrity();
            
            Map<String, Object> health = Map.of(
                "status", isHealthy ? "UP" : "DOWN",
                "timestamp", System.currentTimeMillis(),
                "statistics", stats,
                "message", isHealthy ? "All systems operational" : "Data integrity issues detected"
            );
            
            return ResponseEntity.ok(health);
        } catch (Exception e) {
            Map<String, Object> health = Map.of(
                "status", "DOWN",
                "timestamp", System.currentTimeMillis(),
                "error", e.getMessage()
            );
            return ResponseEntity.status(500).body(health);
        }
    }

    @Operation(summary = "Get system statistics", 
               description = "Get database statistics for compatibility verification with legacy system")
    @GetMapping("/statistics")
    public ResponseEntity<Map<String, Long>> getStatistics() {
        Map<String, Long> stats = staffDirectoryService.getSystemStatistics();
        return ResponseEntity.ok(stats);
    }

    @Operation(summary = "Verify data integrity", 
               description = "Verify that modernized app has same data as legacy ICEfaces app")
    @GetMapping("/verify-integrity")
    public ResponseEntity<Map<String, Object>> verifyDataIntegrity() {
        boolean isValid = staffDirectoryService.verifyDataIntegrity();
        Map<String, Long> stats = staffDirectoryService.getSystemStatistics();
        
        Map<String, Object> verification = Map.of(
            "dataIntegrityValid", isValid,
            "expectedMinimumContacts", 285,
            "actualContacts", stats.get("totalContacts"),
            "ministryCount", stats.get("totalMinistries"),
            "organizationalUnitCount", stats.get("totalOrganizationalUnits"),
            "timestamp", System.currentTimeMillis()
        );
        
        return ResponseEntity.ok(verification);
    }

    @Operation(summary = "Get API information", description = "Get information about the modernized API")
    @GetMapping("/info")
    public ResponseEntity<Map<String, Object>> getApiInfo() {
        Map<String, Object> info = Map.of(
            "applicationName", "Alberta Staff Directory API",
            "version", "1.0.0",
            "description", "Modern Spring Boot REST API for Alberta Government Staff Directory",
            "technology", "Spring Boot 3.2.0 with Spring Data JPA",
            "compatibility", "READ-ONLY access maintaining compatibility with ICEfaces legacy application",
            "database", "MySQL 8.0 (shared with legacy ICEfaces app)",
            "features", Map.of(
                "enhancedSearch", true,
                "pagination", true,
                "filtering", true,
                "hierarchicalNavigation", true,
                "openApiDocumentation", true
            )
        );
        
        return ResponseEntity.ok(info);
    }
}