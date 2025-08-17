package com.example.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot Application for Employee Management API
 * 
 * This application modernizes the ICEfaces Mini Employee Directory sample
 * by providing a REST API backend that replaces JSF managed beans.
 */
@SpringBootApplication
@EnableTransactionManagement
public class EmployeeApplication {
    
    private static final Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Employee Management API...");
        logger.info("This application modernizes the ICEfaces Mini Employee Directory");
        logger.info("Key features: REST API, JPA repositories, search, pagination");
        
        SpringApplication.run(EmployeeApplication.class, args);
        
        logger.info("Employee Management API started successfully!");
        logger.info("API Documentation: http://localhost:8085/api/employees/health");
    }
}