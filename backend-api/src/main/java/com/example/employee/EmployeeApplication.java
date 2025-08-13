package com.example.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Employee Management API - Spring Boot Application
 * 
 * Modern replacement for ICEfaces Mini Employee Directory
 * 
 * Key improvements over the legacy ICEfaces application:
 * - Clean separation of concerns (Controller -> Service -> Repository)
 * - REST API instead of server-side rendering
 * - Modern JPA with Spring Data repositories
 * - Proper validation and error handling
 * - Search and pagination capabilities
 * - Comprehensive logging and monitoring
 * - Database auditing (created/updated timestamps)
 * - Type-safe, testable code
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
public class EmployeeApplication {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);
    
    public static void main(String[] args) {
        logger.info("Starting Employee Management API...");
        logger.info("This application modernizes the ICEfaces Mini Employee Directory");
        logger.info("Key features: REST API, JPA repositories, search, pagination");
        
        SpringApplication.run(EmployeeApplication.class, args);
        
        logger.info("Employee Management API started successfully!");
        logger.info("API Documentation: http://localhost:8080/api/employees/health");
        logger.info("ICEfaces comparison available at: http://localhost:8090/mini-employee-directory/employeeDirectory.jsf");
    }
}