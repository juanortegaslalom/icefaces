package com.icefaces.modernization.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Spring Boot application class for ICEfaces Modernization Backend API
 * 
 * This application provides REST APIs to replace legacy ICEfaces managed beans
 * and serves as the backend for the Angular frontend.
 */
@SpringBootApplication
@RestController
public class ModernizationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModernizationApiApplication.class, args);
    }

    /**
     * Health check endpoint
     */
    @GetMapping("/api/health")
    public String health() {
        return "ICEfaces Modernization API is running!";
    }

    /**
     * API info endpoint
     */
    @GetMapping("/api/info")
    public ApiInfo info() {
        return new ApiInfo(
            "ICEfaces Modernization Backend API",
            "1.0.0-SNAPSHOT",
            "Spring Boot REST API replacing legacy ICEfaces managed beans",
            "Phase 1: Foundation Setup - CORS enabled, ready for Angular integration"
        );
    }

    /**
     * Simple DTO for API information
     */
    public record ApiInfo(
        String name,
        String version,
        String description,
        String status
    ) {}
}