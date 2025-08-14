import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable, map } from 'rxjs';
import { Employee, EmployeeDto, PageResponse, EmployeeStats } from '../models/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiUrl = 'http://localhost:8085/api/employees';

  constructor(private http: HttpClient) { }

  // Convert DTO to model
  private mapDtoToEmployee(dto: EmployeeDto): Employee {
    return {
      id: dto.id,
      firstName: dto.first_name,
      lastName: dto.last_name,
      department: dto.department,
      email: dto.email,
      fullName: dto.full_name || `${dto.first_name} ${dto.last_name}`
    };
  }

  // Convert model to DTO
  private mapEmployeeToDto(employee: Employee): EmployeeDto {
    return {
      id: employee.id,
      first_name: employee.firstName,
      last_name: employee.lastName,
      department: employee.department,
      email: employee.email,
      full_name: employee.fullName
    };
  }

  // Get all employees without pagination
  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<EmployeeDto[]>(`${this.apiUrl}/all`).pipe(
      map(dtos => dtos.map(dto => this.mapDtoToEmployee(dto)))
    );
  }

  // Get employees with pagination
  getEmployeesPaginated(page: number = 0, size: number = 10, sortBy: string = 'lastName', sortDir: string = 'asc'): Observable<PageResponse<Employee>> {
    const params = new HttpParams()
      .set('page', page.toString())
      .set('size', size.toString())
      .set('sortBy', sortBy)
      .set('sortDir', sortDir);

    return this.http.get<PageResponse<EmployeeDto>>(`${this.apiUrl}`, { params }).pipe(
      map(response => ({
        ...response,
        content: response.content.map(dto => this.mapDtoToEmployee(dto))
      }))
    );
  }

  // Search employees
  searchEmployees(searchTerm: string): Observable<Employee[]> {
    const params = new HttpParams().set('term', searchTerm);
    return this.http.get<EmployeeDto[]>(`${this.apiUrl}/search`, { params }).pipe(
      map(dtos => dtos.map(dto => this.mapDtoToEmployee(dto)))
    );
  }

  // Get employee by ID
  getEmployee(id: number): Observable<Employee> {
    return this.http.get<EmployeeDto>(`${this.apiUrl}/${id}`).pipe(
      map(dto => this.mapDtoToEmployee(dto))
    );
  }

  // Create new employee
  createEmployee(employee: Employee): Observable<Employee> {
    const dto = this.mapEmployeeToDto(employee);
    return this.http.post<EmployeeDto>(this.apiUrl, dto).pipe(
      map(responseDto => this.mapDtoToEmployee(responseDto))
    );
  }

  // Update employee
  updateEmployee(id: number, employee: Employee): Observable<Employee> {
    const dto = this.mapEmployeeToDto(employee);
    return this.http.put<EmployeeDto>(`${this.apiUrl}/${id}`, dto).pipe(
      map(responseDto => this.mapDtoToEmployee(responseDto))
    );
  }

  // Delete employee
  deleteEmployee(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

  // Get employee count
  getEmployeeCount(): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}/count`);
  }

  // Get all departments
  getAllDepartments(): Observable<string[]> {
    return this.http.get<string[]>(`${this.apiUrl}/departments`);
  }

  // Get employee statistics
  getEmployeeStats(): Observable<EmployeeStats> {
    return this.http.get<EmployeeStats>(`${this.apiUrl}/stats`);
  }
}