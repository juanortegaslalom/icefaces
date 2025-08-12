import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Employee {
  id?: number;
  firstName: string;
  lastName: string;
  address?: string;
  salary: number;
}

export interface EmployeeSalaryStatistics {
  averageSalary: number;
  medianSalary: number;
  minSalary: number;
  maxSalary: number;
  totalEmployees: number;
}

export interface SalaryRangeCount {
  rangeName: string;
  minSalary: number;
  maxSalary: number;
  count: number;
}

export interface EmployeeStatistics {
  totalEmployees: number;
  averageSalary: number;
  distinctCities: number;
  highEarners: number;
}

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseUrl = 'http://localhost:8081/api/v1/employees';

  constructor(private http: HttpClient) {}

  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseUrl);
  }

  getEmployeeById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.baseUrl}/${id}`);
  }

  createEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.baseUrl, employee);
  }

  updateEmployee(id: number, employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.baseUrl}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }

  searchEmployeesByLastName(lastName: string): Observable<Employee[]> {
    const params = new HttpParams().set('lastName', lastName);
    return this.http.get<Employee[]>(`${this.baseUrl}/search/lastname`, { params });
  }

  searchEmployeesByFirstName(firstName: string): Observable<Employee[]> {
    const params = new HttpParams().set('firstName', firstName);
    return this.http.get<Employee[]>(`${this.baseUrl}/search/firstname`, { params });
  }

  searchEmployeesByFullName(fullName: string): Observable<Employee[]> {
    const params = new HttpParams().set('fullName', fullName);
    return this.http.get<Employee[]>(`${this.baseUrl}/search/fullname`, { params });
  }

  getEmployeesBySalaryRange(minSalary: number, maxSalary: number): Observable<Employee[]> {
    const params = new HttpParams()
      .set('minSalary', minSalary.toString())
      .set('maxSalary', maxSalary.toString());
    return this.http.get<Employee[]>(`${this.baseUrl}/filter/salary-range`, { params });
  }

  getHighEarners(minSalary: number): Observable<Employee[]> {
    const params = new HttpParams().set('minSalary', minSalary.toString());
    return this.http.get<Employee[]>(`${this.baseUrl}/filter/high-earners`, { params });
  }

  searchEmployeesByAddress(address: string): Observable<Employee[]> {
    const params = new HttpParams().set('address', address);
    return this.http.get<Employee[]>(`${this.baseUrl}/search/address`, { params });
  }

  getEmployeesOrderedBySalary(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.baseUrl}/ordered/salary`);
  }

  getEmployeesOrderedByName(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.baseUrl}/ordered/name`);
  }

  searchEmployeesAdvanced(firstName?: string, lastName?: string, minSalary?: number, maxSalary?: number): Observable<Employee[]> {
    let params = new HttpParams();
    if (firstName) params = params.set('firstName', firstName);
    if (lastName) params = params.set('lastName', lastName);
    if (minSalary) params = params.set('minSalary', minSalary.toString());
    if (maxSalary) params = params.set('maxSalary', maxSalary.toString());
    
    return this.http.get<Employee[]>(`${this.baseUrl}/search/advanced`, { params });
  }

  getSalaryStatistics(): Observable<EmployeeSalaryStatistics> {
    return this.http.get<EmployeeSalaryStatistics>(`${this.baseUrl}/statistics/salary`);
  }

  getTopEarners(limit: number = 10): Observable<Employee[]> {
    const params = new HttpParams().set('limit', limit.toString());
    return this.http.get<Employee[]>(`${this.baseUrl}/top-earners`, { params });
  }

  getEmployeeCountBySalaryRanges(): Observable<SalaryRangeCount[]> {
    return this.http.get<SalaryRangeCount[]>(`${this.baseUrl}/statistics/salary-ranges`);
  }

  getEmployeeStatistics(): Observable<EmployeeStatistics> {
    return this.http.get<EmployeeStatistics>(`${this.baseUrl}/statistics`);
  }
}