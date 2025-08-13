-- Database initialization script for ICEfaces Mini Employee Directory
-- This script creates the employees table with proper schema

USE employeedb;

-- Create employees table
CREATE TABLE IF NOT EXISTS employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    department VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Create index on department for better query performance
CREATE INDEX IF NOT EXISTS idx_employees_department ON employees(department);

-- Create index on name fields for search performance
CREATE INDEX IF NOT EXISTS idx_employees_name ON employees(first_name, last_name);

-- Sample data will be inserted by the Java application on startup
-- This ensures the DAO initialization logic works properly