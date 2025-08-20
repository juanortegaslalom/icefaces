# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is the Alberta Staff Directory project - a legacy ICEfaces 3.4.0 application that serves as the baseline for a Spring Boot + Angular modernization. The project demonstrates a government staff directory with contact search and administrative functions.

## Technology Stack

### Legacy Application (Current Implementation)
- **Framework**: ICEfaces 3.4.0 (JavaServer Faces)
- **Backend**: Java 8 with JSF managed beans
- **Database**: MySQL 8.0
- **Frontend**: XHTML with ICEfaces components
- **Container**: Apache Tomcat 8.5
- **Build System**: Maven 3.x


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

## Application Features

### Functional Features
- ✅ **Administrative contact list**: 144 contacts across government departments
- ✅ **Search functionality**: Search by name, title, ministry, or keyword  
- ✅ **Contact display**: Name, phone, title in structured format
- ✅ **Responsive design**: Mobile-friendly grid layouts

### Database Schema
- **ministries**: Government ministries/departments (30 entries)
- **organizational_units**: Hierarchical structure within ministries
- **contacts**: Staff contact information (286 entries)

## Development Notes

### Database Connection
- Uses HikariCP connection pooling
- Configuration: `samples/core/alberta-staff-directory/src/main/java/.../util/DatabaseManager.java`
- Schema: Auto-loaded via Docker initialization

### Key Components
- **StaffDirectoryBean**: Main JSF managed bean
- **AlbertaDirectoryDAO**: Database access layer
- **Contact/OrganizationalUnit**: Entity models
- **index.xhtml**: Main JSF page template
- **alberta-style.css**: Custom styling

### Docker Configuration
```yaml
services:
  mysql-db:          # Database (port 3306)
  alberta-staff-directory:  # Application (port 8080)
```

## Project Structure

```
icefaces/
├── core/                           # ICEfaces core framework
├── samples/core/alberta-staff-directory/  # MAIN APPLICATION
│   ├── src/main/java/             # Java source code
│   ├── src/main/webapp/           # Web resources (XHTML, CSS)
│   ├── target/                    # Build output
│   └── pom.xml                    # Maven configuration
├── lib/                           # Runtime libraries
├── docker-compose.yml             # Container orchestration
└── CLAUDE.md                      # This documentation
```

## Modernization Scope

This legacy application serves as the reference implementation for a complete modernization to:
- Spring Boot REST API backend
- Angular standalone component frontend  
- PostgreSQL with modern schema design
- Containerized deployment
- Modern authentication and security

The current implementation provides the baseline functionality and data structure for the modernization effort.