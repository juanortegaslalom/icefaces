# Employee Directory - Angular Frontend

This is the modernized Angular 17 frontend that replaces the legacy ICEfaces JSF application. It provides the same functionality with a modern, responsive UI while maintaining the same look and feel as the original ICEfaces application.

## Features

- **Employee CRUD Operations**: Create, Read, Update, and Delete employees
- **Sortable Table**: Click column headers to sort data
- **Real-time Updates**: Immediate feedback on operations
- **Form Validation**: Client-side validation for employee data
- **RESTful API Integration**: Connects to Spring Boot backend

## Prerequisites

- Node.js 18+ and npm
- Angular CLI 17 (will be installed automatically)
- Spring Boot backend running on port 8080
- MySQL database running on port 3306

## Installation

1. Navigate to the Angular project directory:
```bash
cd employee-directory-angular
```

2. Install dependencies:
```bash
npm install
```

## Running the Application

### Step 1: Start the Backend Services

First, ensure the backend services are running:

1. **Start MySQL Database:**
```bash
# From the root icefaces directory
docker-compose up mysql-db
```

2. **Start Spring Boot API:**
```bash
cd backend-api
mvn spring-boot:run
```
The API will run on http://localhost:8080

### Step 2: Start the Angular Application

```bash
# From the employee-directory-angular directory
npm start
```

This will:
- Start the Angular development server on port 4200
- Open your browser automatically
- Enable hot-reload for development

The application will be available at: http://localhost:4200

## Building for Production

To build the application for production:

```bash
npm run build
```

The build artifacts will be stored in the `dist/` directory.

## Project Structure

```
employee-directory-angular/
├── src/
│   ├── app/
│   │   ├── components/
│   │   │   └── employee-directory/    # Main employee component
│   │   ├── models/
│   │   │   └── employee.model.ts      # TypeScript interfaces
│   │   ├── services/
│   │   │   └── employee.service.ts    # API service
│   │   ├── app.component.*            # Root component
│   │   └── app.config.ts             # App configuration
│   ├── assets/                        # Static assets
│   ├── index.html                     # Main HTML file
│   └── styles.css                     # Global styles
├── proxy.conf.json                    # Proxy configuration for API
└── package.json                       # Dependencies and scripts
```

## API Endpoints

The Angular application communicates with the following API endpoints:

- `GET /api/employees/all` - Get all employees
- `POST /api/employees` - Create new employee
- `DELETE /api/employees/{id}` - Delete employee
- `GET /api/employees/count` - Get employee count
- `GET /api/employees/departments` - Get all departments

## Comparison with Legacy ICEfaces

| Feature | ICEfaces (Legacy) | Angular (Modern) |
|---------|------------------|------------------|
| Technology | JSF 2.1 + ICEfaces 3.3 | Angular 17 |
| Architecture | Server-side rendering | SPA with REST API |
| Build Tool | Maven WAR | Angular CLI + npm |
| Deployment | Tomcat WAR | Static files + API |
| State Management | Session-based | Client-side |
| Performance | Page reloads | Real-time updates |

## Troubleshooting

### Common Issues

1. **CORS Errors**: Ensure the Spring Boot backend has CORS configured for http://localhost:4200

2. **API Connection Failed**: Check that:
   - Spring Boot is running on port 8080
   - MySQL database is accessible
   - Proxy configuration in `proxy.conf.json` is correct

3. **Port Already in Use**: Change the port in package.json:
   ```json
   "start": "ng serve --port 4201 --open"
   ```

## Development Notes

- The UI closely matches the original ICEfaces design for familiarity
- Uses standalone components (Angular 17 feature)
- Implements reactive forms with validation
- Includes error handling and loading states
- Supports sorting by clicking table headers

## Future Enhancements

- Add pagination for large datasets
- Implement search/filter functionality
- Add export to CSV/Excel
- Include more detailed employee profiles
- Add department management
- Implement role-based access control

## License

This is a modernization of the ICEfaces sample application for demonstration purposes.