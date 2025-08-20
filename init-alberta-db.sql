-- Alberta Staff Directory Database Schema
CREATE DATABASE IF NOT EXISTS employeedb;
USE employeedb;

-- Create ministries table
CREATE TABLE IF NOT EXISTS ministries (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create organizational_units table
CREATE TABLE IF NOT EXISTS organizational_units (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ministry_id INT NOT NULL,
    parent_id INT NULL,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    FOREIGN KEY (ministry_id) REFERENCES ministries(id),
    FOREIGN KEY (parent_id) REFERENCES organizational_units(id)
);

-- Create contacts table
CREATE TABLE IF NOT EXISTS contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    title VARCHAR(255),
    phone VARCHAR(50),
    email VARCHAR(255),
    ministry_id INT NOT NULL,
    organizational_unit_id INT NULL,
    FOREIGN KEY (ministry_id) REFERENCES ministries(id),
    FOREIGN KEY (organizational_unit_id) REFERENCES organizational_units(id)
);

-- Sample Alberta Government ministries
INSERT INTO ministries (name) VALUES 
('Advanced Education'),
('Agriculture and Irrigation'),
('Children and Family Services'),
('Education'),
('Energy and Minerals'),
('Environment and Protected Areas'),
('Health'),
('Indigenous Relations'),
('Jobs, Economy and Trade'),
('Justice'),
('Municipal Affairs'),
('Seniors, Community and Social Services'),
('Transportation and Economic Corridors'),
('Treasury Board and Finance'),
('Executive Council Office');

-- Sample contacts for testing
INSERT INTO contacts (name, title, phone, email, ministry_id) VALUES 
('Hon. Rajan Sawhney', 'Minister of Advanced Education', '780-427-2025', 'adved.minister@gov.ab.ca', 1),
('Hon. RJ Sigurdson', 'Minister of Agriculture and Irrigation', '780-427-2727', 'agriculture.minister@gov.ab.ca', 2),
('Hon. Searle Turton', 'Minister of Children and Family Services', '780-644-5135', 'cfs.minister@gov.ab.ca', 3),
('Hon. Demetrios Nicolaides', 'Minister of Education', '780-427-5010', 'education.minister@gov.ab.ca', 4),
('Hon. Brian Jean', 'Minister of Energy and Minerals', '780-427-3740', 'energy.minister@gov.ab.ca', 5);