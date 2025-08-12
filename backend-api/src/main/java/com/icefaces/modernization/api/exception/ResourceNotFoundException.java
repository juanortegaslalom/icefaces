package com.icefaces.modernization.api.exception;

/**
 * Exception thrown when a requested resource is not found
 * Replaces ICEfaces navigation to error pages with proper HTTP status codes
 */
public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String message) {
        super(message);
    }
    
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public static ResourceNotFoundException forId(String resourceType, Long id) {
        return new ResourceNotFoundException(resourceType + " not found with id: " + id);
    }
    
    public static ResourceNotFoundException forCriteria(String resourceType, String criteria) {
        return new ResourceNotFoundException(resourceType + " not found for criteria: " + criteria);
    }
}