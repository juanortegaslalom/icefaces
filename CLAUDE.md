# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is ICEfaces 3.4.0, a Java-based JSF (JavaServer Faces) framework for building rich Internet applications. The project is structured as a Maven multi-module build with Ant fallback support.

## Build System

### Maven (Primary Build System)
- **Root POM**: `pom.xml` - Main parent POM with version 3.3.0
- **Build Command**: `mvn clean install`
- **Module Structure**: Multi-module Maven project with modules: core, ace, compat, samples
- **Java Version**: Targets Java 1.5 (legacy project)

### Ant (Legacy Build System)
- **Root Build**: `build.xml` - Main Ant build file
- **Build Command**: `ant world` (builds all components)
- **Clean Command**: `ant allclean`

## Mini Employee Directory Sample

The main sample application is located at:
```
samples/core/mini-employee-directory/
```

### Running the Employee Directory

1. Build the project:
```bash
cd samples/core/mini-employee-directory
mvn clean package
```

2. Deploy the WAR file to a servlet container (Tomcat 8.5):
```bash
cp target/mini-employee-directory.war $TOMCAT_HOME/webapps/
```

3. Access the application:
```
http://localhost:8080/mini-employee-directory/employeeDirectory.jsf
```

### Using Docker

Run the complete application with MySQL:
```bash
docker-compose up mini-employee-directory
```

Access at: http://localhost:8090/mini-employee-directory/employeeDirectory.jsf

## Project Structure

```
icefaces/
├── core/                    # ICEfaces core framework
├── ace/                     # Advanced Component Environment
├── compat/                  # Backwards compatibility
├── samples/                 # Sample applications
│   └── core/
│       └── mini-employee-directory/  # Employee management sample
├── lib/                     # Runtime libraries
└── docker-compose.yml       # Docker configuration
```