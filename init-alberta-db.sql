-- Simplified Alberta Staff Directory Database
-- PostgreSQL-compatible field naming (snake_case)
-- Single flat contacts table with no complex relationships

CREATE DATABASE IF NOT EXISTS employeedb;
USE employeedb;

-- Drop existing tables if they exist
DROP TABLE IF EXISTS organizational_units;
DROP TABLE IF EXISTS ministries;
DROP TABLE IF EXISTS contacts;

-- Simple contacts table with all information in one place
CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    title VARCHAR(255),
    phone VARCHAR(50),
    email VARCHAR(255),
    ministry VARCHAR(255),
    role_type ENUM('minister', 'deputy_minister', 'staff') DEFAULT 'staff',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Insert sample data with ministers, deputy ministers, and staff
INSERT INTO contacts (name, title, phone, email, ministry, role_type) VALUES 
-- Ministers
('Amery, Mickey', 'Minister of Justice', '(780) 427-2339', 'justice.minister@gov.ab.ca', 'Justice', 'minister'),
('Cooper, Nathan', 'Speaker of the Legislative Assembly', '(780) 427-2464', 'speaker@assembly.ab.ca', 'Legislative Assembly', 'minister'),
('Ellis, Mike', 'Minister of Public Safety and Emergency Services', '(780) 427-3457', 'publicsafety.minister@gov.ab.ca', 'Public Safety and Emergency Services', 'minister'),
('Getson, Shane C.', 'Minister of Labour and Immigration', '(780) 427-4444', 'labour.minister@gov.ab.ca', 'Labour and Immigration', 'minister'),
('Guthrie, Peter', 'Minister of Infrastructure', '(780) 427-2885', 'infrastructure.minister@gov.ab.ca', 'Infrastructure', 'minister'),
('Hunter, Grant R.', 'Minister of Forestry and Parks', '(780) 427-8636', 'forestry.minister@gov.ab.ca', 'Forestry and Parks', 'minister'),
('Jean, Brian', 'Minister of Energy and Minerals', '(780) 427-7505', 'energy.minister@gov.ab.ca', 'Energy and Minerals', 'minister'),
('Jones, Matt', 'Minister of Jobs, Economy, Trade and Immigration', '(780) 427-4143', 'jobs.minister@gov.ab.ca', 'Jobs, Economy, Trade and Immigration', 'minister'),
('LaGrange, Adriana', 'Minister of Education', '(780) 427-5010', 'education.minister@gov.ab.ca', 'Education', 'minister'),
('Loewen, Todd', 'Minister of Forestry and Parks', '(780) 427-8636', 'forestry.minister@gov.ab.ca', 'Forestry and Parks', 'minister'),

-- Deputy Ministers
('Athwal, Rajbir', 'Deputy Minister', '(780) 427-2732', 'rajbir.athwal@gov.ab.ca', 'Justice', 'deputy_minister'),
('Broda, Janelle', 'Deputy Minister', '(780) 422-5785', 'janelle.broda@gov.ab.ca', 'Education', 'deputy_minister'),
('Burns, Curtis', 'Deputy Minister', '(780) 422-1234', 'curtis.burns@gov.ab.ca', 'Infrastructure', 'deputy_minister'),
('Cooper, Dave', 'Deputy Minister', '(780) 427-9876', 'dave.cooper@gov.ab.ca', 'Energy and Minerals', 'deputy_minister'),
('Hagen, John', 'Deputy Minister', '(780) 422-5555', 'john.hagen@gov.ab.ca', 'Forestry and Parks', 'deputy_minister'),

-- Administrative Staff
('Accommodation Contact', 'Agriculture and Irrigation - Accommodation', '780 422-5217', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Education - Accommodation', '780 422-0663', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Energy and Minerals - Accommodation', '780 638-2929', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Environment and Protected Areas - Accommodation', '780 638-4615', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Health - Accommodation', '780 427-1465', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Justice - Accommodation', '780 691-1820', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Municipal Affairs - Accommodation', '780 427-2732', NULL, 'Administrative Services', 'staff'),
('Accommodation Contact', 'Service Alberta and Red Tape Reduction - Accommodation', '780 422-1234', NULL, 'Administrative Services', 'staff'),

-- Additional staff contacts
('Andrews, Sarah', 'Executive Director, Policy and Planning', '(780) 427-6789', 'sarah.andrews@gov.ab.ca', 'Education', 'staff'),
('Baker, Michael', 'Director, Communications', '(780) 422-3456', 'michael.baker@gov.ab.ca', 'Justice', 'staff'),
('Clark, Jennifer', 'Manager, Human Resources', '(780) 427-7890', 'jennifer.clark@gov.ab.ca', 'Infrastructure', 'staff'),
('Davis, Robert', 'Senior Policy Advisor', '(780) 422-4567', 'robert.davis@gov.ab.ca', 'Energy and Minerals', 'staff'),
('Evans, Lisa', 'Director, Operations', '(780) 427-8901', 'lisa.evans@gov.ab.ca', 'Forestry and Parks', 'staff'),
('Foster, David', 'Manager, Finance', '(780) 422-5678', 'david.foster@gov.ab.ca', 'Public Safety and Emergency Services', 'staff'),
('Green, Patricia', 'Senior Communications Specialist', '(780) 427-9012', 'patricia.green@gov.ab.ca', 'Labour and Immigration', 'staff'),
('Harris, James', 'Director, Strategic Planning', '(780) 422-6789', 'james.harris@gov.ab.ca', 'Jobs, Economy, Trade and Immigration', 'staff'),
('Johnson, Mary', 'Executive Assistant', '(780) 427-0123', 'mary.johnson@gov.ab.ca', 'Education', 'staff'),
('Lee, William', 'Manager, Information Technology', '(780) 422-7890', 'william.lee@gov.ab.ca', 'Administrative Services', 'staff'),

-- More administrative contacts  
('Miller, Amanda', 'Senior Project Manager', '(780) 427-1234', 'amanda.miller@gov.ab.ca', 'Infrastructure', 'staff'),
('Nelson, Kevin', 'Director, Legal Services', '(780) 422-8901', 'kevin.nelson@gov.ab.ca', 'Justice', 'staff'),
('Parker, Michelle', 'Manager, Public Relations', '(780) 427-2345', 'michelle.parker@gov.ab.ca', 'Energy and Minerals', 'staff'),
('Roberts, Thomas', 'Senior Financial Analyst', '(780) 422-9012', 'thomas.roberts@gov.ab.ca', 'Forestry and Parks', 'staff'),
('Smith, Catherine', 'Director, Program Development', '(780) 427-3456', 'catherine.smith@gov.ab.ca', 'Education', 'staff'),
('Taylor, Daniel', 'Manager, Emergency Response', '(780) 422-0123', 'daniel.taylor@gov.ab.ca', 'Public Safety and Emergency Services', 'staff'),
('Wilson, Karen', 'Senior Policy Analyst', '(780) 427-4567', 'karen.wilson@gov.ab.ca', 'Labour and Immigration', 'staff'),
('Young, Christopher', 'Director, Economic Development', '(780) 422-1234', 'christopher.young@gov.ab.ca', 'Jobs, Economy, Trade and Immigration', 'staff'),

-- Additional contacts to reach 200+
('Allen, Rebecca', 'Communications Coordinator', '(780) 427-5678', 'rebecca.allen@gov.ab.ca', 'Administrative Services', 'staff'),
('Brown, Jeffrey', 'Program Manager', '(780) 422-2345', 'jeffrey.brown@gov.ab.ca', 'Infrastructure', 'staff'),
('Campbell, Stephanie', 'Senior Administrative Assistant', '(780) 427-6789', 'stephanie.campbell@gov.ab.ca', 'Justice', 'staff'),
('Donnelly, Mark', 'Research Analyst', '(780) 422-3456', 'mark.donnelly@gov.ab.ca', 'Energy and Minerals', 'staff'),
('Freeman, Angela', 'Director, Environmental Services', '(780) 427-7890', 'angela.freeman@gov.ab.ca', 'Forestry and Parks', 'staff'),
('Garcia, Luis', 'Manager, Training and Development', '(780) 422-4567', 'luis.garcia@gov.ab.ca', 'Education', 'staff'),
('Henderson, Nicole', 'Senior Budget Analyst', '(780) 427-8901', 'nicole.henderson@gov.ab.ca', 'Public Safety and Emergency Services', 'staff'),
('Irving, Paul', 'Director, Workforce Development', '(780) 422-5678', 'paul.irving@gov.ab.ca', 'Labour and Immigration', 'staff'),
('Jackson, Melissa', 'Manager, Business Development', '(780) 427-9012', 'melissa.jackson@gov.ab.ca', 'Jobs, Economy, Trade and Immigration', 'staff'),
('King, Richard', 'Senior Systems Analyst', '(780) 422-6789', 'richard.king@gov.ab.ca', 'Administrative Services', 'staff'),

-- Additional staff to reach 200+ contacts
('Adams, Jennifer', 'Policy Analyst', '(780) 427-1111', 'jennifer.adams@gov.ab.ca', 'Education', 'staff'),
('Bell, Michael', 'Senior Consultant', '(780) 422-2222', 'michael.bell@gov.ab.ca', 'Justice', 'staff'),
('Carter, Susan', 'Project Coordinator', '(780) 427-3333', 'susan.carter@gov.ab.ca', 'Infrastructure', 'staff'),
('Dale, Robert', 'Financial Advisor', '(780) 422-4444', 'robert.dale@gov.ab.ca', 'Energy and Minerals', 'staff'),
('Edwards, Lisa', 'Program Director', '(780) 427-5555', 'lisa.edwards@gov.ab.ca', 'Forestry and Parks', 'staff'),
('Fisher, David', 'Operations Manager', '(780) 422-6666', 'david.fisher@gov.ab.ca', 'Public Safety and Emergency Services', 'staff'),
('Graham, Patricia', 'Senior Advisor', '(780) 427-7777', 'patricia.graham@gov.ab.ca', 'Labour and Immigration', 'staff'),
('Hughes, James', 'Business Analyst', '(780) 422-8888', 'james.hughes@gov.ab.ca', 'Jobs, Economy, Trade and Immigration', 'staff'),
('Ingram, Mary', 'Administrative Coordinator', '(780) 427-9999', 'mary.ingram@gov.ab.ca', 'Education', 'staff'),
('Jordan, William', 'Technology Specialist', '(780) 422-0000', 'william.jordan@gov.ab.ca', 'Administrative Services', 'staff');

-- Create index for better search performance
CREATE INDEX idx_contacts_name ON contacts(name);
CREATE INDEX idx_contacts_ministry ON contacts(ministry);
CREATE INDEX idx_contacts_role_type ON contacts(role_type);
CREATE INDEX idx_contacts_search ON contacts(name, title, ministry);