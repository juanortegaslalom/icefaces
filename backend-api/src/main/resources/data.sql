-- Sample data for ICEfaces Modernization
-- This data replicates the original ICEfaces showcase data for demonstration

-- Car data (from ICEfaces Car showcase)
INSERT INTO cars (name, chassis, weight, acceleration, mpg, cost) VALUES
('BMW 3 Series', 'Sedan', 3200, 8, 28.5, 35000.00),
('Honda Civic', 'Compact', 2800, 9, 32.0, 22000.00),
('Ford Mustang', 'Sports', 3600, 6, 22.0, 45000.00),
('Toyota Prius', 'Hybrid', 3100, 10, 50.0, 28000.00),
('Chevrolet Corvette', 'Sports', 3400, 4, 18.5, 65000.00),
('Volkswagen Golf', 'Hatchback', 2900, 8, 30.0, 24000.00),
('Mercedes C-Class', 'Luxury', 3500, 7, 26.0, 42000.00),
('Subaru Outback', 'Wagon', 3700, 9, 28.0, 31000.00),
('Mazda MX-5', 'Convertible', 2400, 7, 27.0, 32000.00),
('Audi A4', 'Sedan', 3300, 7, 27.5, 39000.00),
('Nissan Altima', 'Sedan', 3200, 8, 29.0, 26000.00),
('Tesla Model 3', 'Electric', 3800, 5, 120.0, 48000.00),
('Jeep Wrangler', 'SUV', 4200, 10, 21.0, 35000.00),
('Honda Accord', 'Sedan', 3300, 8, 30.0, 28000.00),
('Ford F-150', 'Pickup', 5200, 11, 19.0, 42000.00);

-- City data (from ICEfaces autocomplete showcase)
INSERT INTO cities (name, country, latitude, longitude, altitude) VALUES
('New York', 'USA', 40.7128, -74.0060, 10),
('London', 'UK', 51.5074, -0.1278, 35),
('Tokyo', 'Japan', 35.6762, 139.6503, 40),
('Paris', 'France', 48.8566, 2.3522, 35),
('Sydney', 'Australia', -33.8688, 151.2093, 58),
('Berlin', 'Germany', 52.5200, 13.4050, 34),
('Toronto', 'Canada', 43.6532, -79.3832, 76),
('Madrid', 'Spain', 40.4168, -3.7038, 650),
('Rome', 'Italy', 41.9028, 12.4964, 21),
('Moscow', 'Russia', 55.7558, 37.6176, 156),
('Mumbai', 'India', 19.0760, 72.8777, 8),
('Shanghai', 'China', 31.2304, 121.4737, 4),
('São Paulo', 'Brazil', -23.5505, -46.6333, 760),
('Cairo', 'Egypt', 30.0444, 31.2357, 74),
('Montreal', 'Canada', 45.5017, -73.5673, 233),
('Quebec City', 'Canada', 46.8139, -71.2080, 98),
('Sherbrooke', 'Canada', 45.4042, -71.8929, 241),
('Trois Rivieres', 'Canada', 46.3432, -72.5424, 55),
('Corner Brook', 'Canada', 48.9500, -57.9500, 5),
('St. Johns', 'Canada', 47.5615, -52.7126, 140),
('Charlottetown', 'Canada', 46.2382, -63.1311, 49),
('Vancouver', 'Canada', 49.2827, -123.1207, 70),
('Calgary', 'Canada', 51.0447, -114.0719, 1045),
('Edmonton', 'Canada', 53.5444, -113.4909, 671),
('Winnipeg', 'Canada', 49.8951, -97.1384, 239);

-- Employee data (from ICEfaces employee showcase)
INSERT INTO employees (first_name, last_name, address, salary) VALUES
('John', 'Smith', '123 Main St, New York, NY', 75000),
('Sarah', 'Johnson', '456 Oak Ave, Los Angeles, CA', 82000),
('Michael', 'Brown', '789 Pine Rd, Chicago, IL', 68000),
('Emily', 'Davis', '321 Elm St, Houston, TX', 71000),
('David', 'Wilson', '654 Maple Dr, Phoenix, AZ', 79000),
('Jessica', 'Miller', '987 Cedar Ln, Philadelphia, PA', 73000),
('Christopher', 'Garcia', '147 Birch St, San Antonio, TX', 66000),
('Amanda', 'Martinez', '258 Spruce Ave, San Diego, CA', 77000),
('Matthew', 'Anderson', '369 Willow Rd, Dallas, TX', 81000),
('Ashley', 'Taylor', '741 Aspen Dr, San Jose, CA', 85000),
('Daniel', 'Thomas', '852 Poplar St, Austin, TX', 69000),
('Jennifer', 'Jackson', '963 Hickory Ave, Jacksonville, FL', 72000),
('James', 'White', '159 Sycamore Ln, Fort Worth, TX', 74000),
('Lisa', 'Harris', '357 Magnolia Dr, Columbus, OH', 70000),
('Robert', 'Martin', '486 Dogwood St, Charlotte, NC', 76000),
('Michelle', 'Thompson', '624 Redwood Ave, San Francisco, CA', 88000),
('William', 'Garcia', '791 Sequoia Rd, Indianapolis, IN', 67000),
('Elizabeth', 'Rodriguez', '135 Palmetto Dr, Seattle, WA', 83000),
('Joseph', 'Lewis', '246 Cypress St, Denver, CO', 78000),
('Mary', 'Lee', '468 Juniper Ave, Washington, DC', 92000);