package com.example.employee.exception;

/**
 * Exception thrown when trying to create an employee that already exists
 */
public class DuplicateEmployeeException extends RuntimeException {
    
    public DuplicateEmployeeException(String message) {
        super(message);
    }
    
    public DuplicateEmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}