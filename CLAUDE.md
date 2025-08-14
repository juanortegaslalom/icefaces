# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is ICEfaces 3.4.0, a Java-based JSF (JavaServer Faces) framework for building rich Internet applications. The project is structured as a Maven multi-module build with Ant fallback support.

## Build System

### Maven (Primary Build System)
- **Root POM**: `pom.xml` - Main parent POM with version 3.3.0 (note: some modules use 3.4.0-SNAPSHOT)
- **Build Command**: `mvn clean install`
- **Module Structure**: Multi-module Maven project with modules: core, ace, compat, samples
- **Java Version**: Targets Java 1.5 (legacy project)

### Ant (Legacy Build System)
- **Root Build**: `build.xml` - Main Ant build file
- **Build Command**: `ant world` (builds all components)
- **Clean Command**: `ant allclean`
- **Individual Components**: `ant core`, `ant ace`, `ant compat`, `ant samples`

## Project Architecture

### Core Modules

1. **core/** - ICEfaces core framework
   - Main JSF integration and DOM-based partial rendering
   - Push functionality (via ICEpush when available) 
   - Window scoping and session management
   - Source: `core/src/main/java/org/icefaces/`

2. **ace/** - Advanced Component Environment
   - Modern jQuery UI-based components (DataTable, Chart, etc.)
   - Theme support with jQuery ThemeRoller integration
   - Component generators and build tools
   - Source: `ace/component/src/org/icefaces/ace/component/`

3. **compat/** - Backwards Compatibility 
   - ICEfaces 1.x compatibility layer
   - Legacy ICE Components 
   - Migration support for existing applications
   - Source: `compat/components/src/main/java/`

4. **samples/** - Example Applications
   - **showcase/** - Main demo application showing all components
   - **core/** - Basic core framework examples (auction, chat)
   - **compat/** - Legacy component examples
   - Build individual samples: `mvn clean install` in sample directory

### Key Dependencies
- JSF Implementation: Mojarra 2.1.26 (configurable to MyFaces)
- Servlet API: 3.0.1
- Portlet support via Liferay Faces Bridge or PortletFaces Bridge
- jQuery and jQuery UI for ACE components

## Development Workflow

### Building the Framework
```bash
# Build everything (Maven)
mvn clean install

# Build everything (Ant)  
ant world

# Build individual modules
cd core && mvn clean install
c2d ace && mvn clean install
cd compat && mvn clean install
```

### Running Examples
```bash
# Build and run showcase sample
cd samples/showcase/showcase
mvn clean install
# Deploy the generated WAR to servlet container
```

### Working with Components

**ACE Components** (`ace/component/src/org/icefaces/ace/component/`):
- Each component has: Component class, Meta class, Renderer class
- Resources in `ace/component/resources/icefaces.ace/[component-name]/`
- JavaScript and CSS assets are automatically processed

**ICE Components** (`compat/components/`):
- Legacy 1.x style components for backward compatibility
- TLD generation and documentation

## Important Paths

- **Libraries**: `lib/` - Contains all runtime JARs after build
- **Documentation**: Generated in `docs/` during bundle creation
- **Themes**: `ace/themes/` - jQuery ThemeRoller theme JARs
- **JavaScript**: `core/src/main/javascript/` - Core ICEfaces JS
- **CSS Tools**: `ace/tools/cssurlmapper/` - CSS URL processing utility

## Development Notes

- This is a **legacy framework** (ICEfaces 3.x) marked as ABANDONED in build.properties
- Uses older Java/JSF versions - be mindful when suggesting modern alternatives  
- Build system supports both servlet containers (Tomcat) and portal containers
- Heavy use of code generation for component metadata and renderers
- Resources are coalesceable for performance optimization