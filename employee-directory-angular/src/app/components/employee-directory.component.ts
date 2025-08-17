import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Employee, EmployeeDto } from '../models/employee.model';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-directory',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './employee-directory.component.html',
  styleUrl: './employee-directory.component.css'
})
export class EmployeeDirectoryComponent implements OnInit {
  employees: Employee[] = [];
  newEmployee: EmployeeDto = {
    first_name: '',
    last_name: '',
    department: '',
    email: ''
  };
  isLoading = false;
  errorMessage = '';

  constructor(private employeeService: EmployeeService) {}

  ngOnInit(): void {
    this.loadEmployees();
  }

  loadEmployees(): void {
    this.isLoading = true;
    this.errorMessage = '';
    this.employeeService.getAllEmployees().subscribe({
      next: (employees) => {
        this.employees = employees;
        this.isLoading = false;
      },
      error: (error) => {
        this.errorMessage = 'Failed to load employees. Please ensure the backend API is running.';
        this.isLoading = false;
        console.error('Error loading employees:', error);
      }
    });
  }

  addEmployee(): void {
    if (this.isValidEmployee()) {
      this.isLoading = true;
      this.employeeService.createEmployee(this.newEmployee).subscribe({
        next: (employee) => {
          this.employees.push(employee);
          this.resetForm();
          this.isLoading = false;
        },
        error: (error) => {
          this.errorMessage = 'Failed to add employee.';
          this.isLoading = false;
          console.error('Error adding employee:', error);
        }
      });
    }
  }

  deleteEmployee(id: number): void {
    if (confirm('Are you sure you want to delete this employee?')) {
      this.employeeService.deleteEmployee(id).subscribe({
        next: () => {
          this.employees = this.employees.filter(emp => emp.id !== id);
        },
        error: (error) => {
          this.errorMessage = 'Failed to delete employee.';
          console.error('Error deleting employee:', error);
        }
      });
    }
  }

  private isValidEmployee(): boolean {
    return this.newEmployee.first_name.trim() !== '' &&
           this.newEmployee.last_name.trim() !== '' &&
           this.newEmployee.department.trim() !== '' &&
           this.newEmployee.email.trim() !== '';
  }

  private resetForm(): void {
    this.newEmployee = {
      first_name: '',
      last_name: '',
      department: '',
      email: ''
    };
  }
}