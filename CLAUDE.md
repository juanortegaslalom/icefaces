# CLAUDE.md

This file provides guidance to Claude Code when working with the Alberta Staff Directory legacy application and its modernization to Spring Boot + Angular.

## Project Overview

This is the Alberta Staff Directory project - a legacy ICEfaces 3.4.0 application that serves as the baseline for a Spring Boot + Angular modernization. The project demonstrates a government staff directory with contact search and administrative functions.

## Technology Stack

### Legacy Application (Current Implementation)
- **Framework**: ICEfaces 3.4.0 (JavaServer Faces)
- **Backend**: Java 8 POJOs with basic data access layer
- **Database**: MySQL 8.0 with single contacts table
- **Frontend**: XHTML template with 3-view navigation
- **Container**: Apache Tomcat 8.5
- **Build System**: Maven 3.x
- **Architecture**: Main page, Ministers view, All Staff view


## Quick Start

### Prerequisites
- Docker and Docker Compose
- Java 8+ 
- Maven 3.x

### Running the Legacy Application

1. **Start the containers**:
```bash
docker-compose up -d
```

2. **Access the application**:
```
http://localhost:8080/alberta-staff-directory/
```

3. **Database access** (if needed):
```bash
# MySQL container: icefaces-mysql
# Port: 3306
# Database: employeedb
# User: iceuser / Password: icepass
```

### Building from Source

```bash
cd samples/core/alberta-staff-directory
mvn clean package
```

### Current Database Schema
The application uses a single `contacts` table with the following sample data:
- **10 Ministers** with titles and contact information
- **5 Deputy Ministers** across various ministries  
- **45+ Staff members** in administrative roles
- **All contacts** include: name, title, phone, email, ministry, role_type

## Application Features

### Functional Features
- ✅ **Contact Directory**: Browse staff contacts across Alberta government
- ✅ **Search**: Search by name, title, ministry, or keyword  
- ✅ **Role Filtering**: View ministers, deputy ministers, or all staff
- ✅ **Contact Display**: Name, phone, title, ministry in table format
- ✅ **Responsive Design**: Mobile-friendly layouts

### Database Schema
**Primary Table: `contacts`**
```sql
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
```
- **60+ sample contacts** across Alberta ministries
- **Indexed fields**: name, ministry, role_type for search performance
- **PostgreSQL-compatible naming**: Uses snake_case field naming

## Development Notes

### Architecture & Components

**Data Layer:**
- **DatabaseManager**: Basic JDBC connection management
- **AlbertaDirectoryDAO**: Data access with methods:
  - `getAllContacts()` - retrieves all contact records
  - `searchContacts(String term)` - searches across name, title, ministry
  - `filterByRole(List<Contact> contacts, String role)` - client-side filtering utility

**Business Layer:**
- **Contact**: POJO model with fields: name, title, phone, email, ministry, role_type
- **StaffDirectoryBean**: Controller class managing 3 views (main, ministers, staff)

**Presentation Layer:**
- **index.xhtml**: JSF template with conditional view rendering
- **alberta-style.css**: Responsive CSS with table layouts

**Database Configuration:**
- Connection: `jdbc:mysql://mysql-db:3306/employeedb`
- Schema: Auto-loaded via `init-alberta-db.sql`

### Docker Configuration
```yaml
services:
  mysql-db:          # Database (port 3306)
  alberta-staff-directory:  # Application (port 8080)
```

## Project Structure

```
icefaces/
├── samples/core/alberta-staff-directory/     # Legacy Application
│   ├── src/main/java/org/icefaces/samples/showcase/alberta/
│   │   ├── bean/StaffDirectoryBean.java       # Controller logic
│   │   ├── dao/AlbertaDirectoryDAO.java        # Data access layer
│   │   ├── model/Contact.java                  # Entity model
│   │   └── util/DatabaseManager.java          # Database connection
│   ├── src/main/webapp/
│   │   ├── index.xhtml                        # JSF template
│   │   └── resources/css/alberta-style.css    # Styling
│   └── pom.xml                                # Maven dependencies
├── init-alberta-db.sql                        # Database schema and data
├── docker-compose.yml                         # Container configuration
└── CLAUDE.md                                  # This documentation
```

### Key Migration Mappings

| **Legacy Component** | **Modern Component** | **Purpose** |
|---------------------|---------------------|-------------|
| `Contact.java` | JPA Entity with @Entity | Data model |
| `AlbertaDirectoryDAO.java` | Spring Repository | Data access |
| `StaffDirectoryBean.java` | REST Controller | API endpoints |
| `index.xhtml` (3 views) | Angular Components | UI views |
| `DatabaseManager.java` | Spring Data config | DB connection |
| `init-alberta-db.sql` | PostgreSQL schema | Database setup |

