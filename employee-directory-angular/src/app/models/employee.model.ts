export interface Employee {
  id?: number;
  firstName: string;
  lastName: string;
  department: string;
  email: string;
  fullName?: string;
}

export interface EmployeeDto {
  id?: number;
  first_name: string;
  last_name: string;
  department: string;
  email: string;
  full_name?: string;
}

export interface PageResponse<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
}

export interface EmployeeStats {
  totalEmployees: number;
  departmentCounts: Map<string, number>;
  averageEmployeesPerDepartment: number;
  lastUpdated: Date;
}