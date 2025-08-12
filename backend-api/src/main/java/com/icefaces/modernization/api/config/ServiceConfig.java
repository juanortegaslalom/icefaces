package com.icefaces.modernization.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Service layer configuration
 * Enables transaction management and service layer features
 * 
 * This configuration replaces the transaction handling that was previously
 * managed by ICEfaces framework in managed beans.
 */
@Configuration
@EnableTransactionManagement
public class ServiceConfig {
    
    // Transaction management is automatically configured by Spring Boot
    // This class serves as a central point for service layer configuration
    // Additional service-related beans can be added here if needed
    
}