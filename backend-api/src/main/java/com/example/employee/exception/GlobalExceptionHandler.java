package com.example.employee.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Global exception handler for the Employee API
 * Provides consistent error responses across all endpoints
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    /**
     * Handle employee not found exceptions
     */
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEmployeeNotFound(EmployeeNotFoundException ex) {
        logger.warn("Employee not found: {}", ex.getMessage());
        
        ErrorResponse error = new ErrorResponse(
            "EMPLOYEE_NOT_FOUND",
            ex.getMessage(),
            HttpStatus.NOT_FOUND.value(),
            LocalDateTime.now()
        );
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    
    /**
     * Handle duplicate employee exceptions
     */
    @ExceptionHandler(DuplicateEmployeeException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateEmployee(DuplicateEmployeeException ex) {
        logger.warn("Duplicate employee: {}", ex.getMessage());
        
        ErrorResponse error = new ErrorResponse(
            "DUPLICATE_EMPLOYEE",
            ex.getMessage(),
            HttpStatus.CONFLICT.value(),
            LocalDateTime.now()
        );
        
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }
    
    /**
     * Handle validation errors from @Valid annotations
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException ex) {
        logger.warn("Validation failed: {}", ex.getMessage());
        
        List<String> errors = ex.getBindingResult().getFieldErrors()
            .stream()
            .map(FieldError::getDefaultMessage)
            .collect(Collectors.toList());
        
        ErrorResponse error = new ErrorResponse(
            "VALIDATION_FAILED",
            "Input validation failed: " + String.join(", ", errors),
            HttpStatus.BAD_REQUEST.value(),
            LocalDateTime.now()
        );
        
        // Add field-specific errors
        Map<String, String> fieldErrors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(fieldError -> 
            fieldErrors.put(fieldError.getField(), fieldError.getDefaultMessage())
        );
        error.setFieldErrors(fieldErrors);
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
    
    /**
     * Handle illegal argument exceptions
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException ex) {
        logger.warn("Illegal argument: {}", ex.getMessage());
        
        ErrorResponse error = new ErrorResponse(
            "INVALID_REQUEST",
            ex.getMessage(),
            HttpStatus.BAD_REQUEST.value(),
            LocalDateTime.now()
        );
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
    
    /**
     * Handle all other exceptions
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        logger.error("Unexpected error occurred", ex);
        
        ErrorResponse error = new ErrorResponse(
            "INTERNAL_SERVER_ERROR",
            "An unexpected error occurred. Please try again later.",
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            LocalDateTime.now()
        );
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }
    
    /**
     * Error response DTO
     */
    public static class ErrorResponse {
        private String errorCode;
        private String message;
        private int statusCode;
        private LocalDateTime timestamp;
        private Map<String, String> fieldErrors;
        
        public ErrorResponse() {}
        
        public ErrorResponse(String errorCode, String message, int statusCode, LocalDateTime timestamp) {
            this.errorCode = errorCode;
            this.message = message;
            this.statusCode = statusCode;
            this.timestamp = timestamp;
        }
        
        // Getters and setters
        public String getErrorCode() { return errorCode; }
        public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
        
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        
        public int getStatusCode() { return statusCode; }
        public void setStatusCode(int statusCode) { this.statusCode = statusCode; }
        
        public LocalDateTime getTimestamp() { return timestamp; }
        public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
        
        public Map<String, String> getFieldErrors() { return fieldErrors; }
        public void setFieldErrors(Map<String, String> fieldErrors) { this.fieldErrors = fieldErrors; }
    }
}