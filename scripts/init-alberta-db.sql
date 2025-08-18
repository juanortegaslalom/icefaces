-- Alberta Staff Directory Database Schema

-- Drop tables if they exist (for clean setup)
DROP TABLE IF EXISTS contacts;
DROP TABLE IF EXISTS organizational_units;
DROP TABLE IF EXISTS ministries;

-- Create ministries table
CREATE TABLE ministries (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL UNIQUE,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Create organizational_units table (hierarchical structure)
CREATE TABLE organizational_units (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ministry_id INT NOT NULL,
    parent_id INT NULL,
    name VARCHAR(255) NOT NULL,
    unit_type ENUM('department', 'office', 'division', 'branch', 'section') NOT NULL,
    level INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (ministry_id) REFERENCES ministries(id) ON DELETE CASCADE,
    FOREIGN KEY (parent_id) REFERENCES organizational_units(id) ON DELETE CASCADE,
    INDEX idx_ministry_id (ministry_id),
    INDEX idx_parent_id (parent_id),
    INDEX idx_unit_type (unit_type)
);

-- Create contacts table
CREATE TABLE contacts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ministry_id INT NULL,
    organizational_unit_id INT NULL,
    name VARCHAR(255) NOT NULL,
    title VARCHAR(255),
    phone VARCHAR(50),
    email VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (ministry_id) REFERENCES ministries(id) ON DELETE CASCADE,
    FOREIGN KEY (organizational_unit_id) REFERENCES organizational_units(id) ON DELETE CASCADE,
    INDEX idx_ministry_id (ministry_id),
    INDEX idx_org_unit_id (organizational_unit_id),
    INDEX idx_name (name),
    INDEX idx_email (email)
);

-- Add some indexes for better performance
CREATE INDEX idx_ministries_name ON ministries(name);
CREATE INDEX idx_org_units_name ON organizational_units(name);
CREATE INDEX idx_contacts_name_title ON contacts(name, title);