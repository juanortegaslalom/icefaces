-- Initialize the Employee Database
-- This script will run automatically when MySQL starts for the first time

USE employeedb;

-- Create employees table if it doesn't exist
CREATE TABLE IF NOT EXISTS employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL, 
    email VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_employees_department (department),
    INDEX idx_employees_email (email),
    INDEX idx_employees_name (last_name, first_name)
);

-- Insert sample data (will be skipped if table already has data)
INSERT IGNORE INTO employees (id, first_name, last_name, email, department) VALUES
(1, 'John', 'Smith', 'john.smith@company.com', 'Engineering'),
(2, 'Sarah', 'Johnson', 'sarah.johnson@company.com', 'Marketing'), 
(3, 'Mike', 'Brown', 'mike.brown@company.com', 'Sales'),
(4, 'Lisa', 'Davis', 'lisa.davis@company.com', 'HR'),
(5, 'David', 'Wilson', 'david.wilson@company.com', 'Engineering'),
(6, 'Jennifer', 'Miller', 'jennifer.miller@company.com', 'Finance'),
(7, 'Robert', 'Garcia', 'robert.garcia@company.com', 'Sales'),
(8, 'Maria', 'Rodriguez', 'maria.rodriguez@company.com', 'Marketing'),
(9, 'James', 'Martinez', 'james.martinez@company.com', 'Engineering'),
(10, 'Patricia', 'Anderson', 'patricia.anderson@company.com', 'HR');

-- Show table status
SELECT 'Database initialized successfully' as status;
SELECT COUNT(*) as employee_count FROM employees;
EOF < /dev/null