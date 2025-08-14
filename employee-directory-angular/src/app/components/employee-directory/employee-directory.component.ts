import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Employee } from '../../models/employee.model';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-employee-directory',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './employee-directory.component.html',
  styleUrls: ['./employee-directory.component.css']
})
export class EmployeeDirectoryComponent implements OnInit {
  employees: Employee[] = [];
  totalEmployees: number = 0;
  
  // Form fields for new employee
  newEmployee: Employee = {
    firstName: '',
    lastName: '',
    department: '',
    email: ''
  };
  
  // UI state
  loading: boolean = false;
  errorMessage: string = '';
  successMessage: string = '';
  
  // Sorting
  sortColumn: string = '';
  sortDirection: 'asc' | 'desc' = 'asc';

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.loadEmployees();
  }

  loadEmployees(): void {
    this.loading = true;
    this.errorMessage = '';
    
    this.employeeService.getAllEmployees().subscribe({
      next: (data) => {
        this.employees = data;
        this.totalEmployees = data.length;
        this.loading = false;
      },
      error: (error) => {
        console.error('Error loading employees:', error);
        this.errorMessage = 'Failed to load employees. Please ensure the backend API is running.';
        this.loading = false;
      }
    });
  }

  addEmployee(): void {
    // Validate form
    if (!this.newEmployee.firstName || !this.newEmployee.lastName || 
        !this.newEmployee.department || !this.newEmployee.email) {
      this.errorMessage = 'Please fill in all fields';
      return;
    }

    // Email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(this.newEmployee.email)) {
      this.errorMessage = 'Please enter a valid email address';
      return;
    }

    this.loading = true;
    this.errorMessage = '';
    this.successMessage = '';

    this.employeeService.createEmployee(this.newEmployee).subscribe({
      next: (employee) => {
        // Add to list
        this.employees.push(employee);
        this.totalEmployees = this.employees.length;
        
        // Clear form
        this.newEmployee = {
          firstName: '',
          lastName: '',
          department: '',
          email: ''
        };
        
        this.successMessage = 'Employee added successfully!';
        this.loading = false;
        
        // Clear success message after 3 seconds
        setTimeout(() => {
          this.successMessage = '';
        }, 3000);
        
        // Reload the list to ensure sync
        this.loadEmployees();
      },
      error: (error) => {
        console.error('Error adding employee:', error);
        this.errorMessage = error.error?.message || 'Failed to add employee';
        this.loading = false;
      }
    });
  }

  removeEmployee(employee: Employee): void {
    if (!employee.id) return;
    
    if (confirm(`Are you sure you want to remove ${employee.firstName} ${employee.lastName}?`)) {
      this.loading = true;
      this.errorMessage = '';
      
      this.employeeService.deleteEmployee(employee.id).subscribe({
        next: () => {
          // Remove from list
          this.employees = this.employees.filter(e => e.id !== employee.id);
          this.totalEmployees = this.employees.length;
          this.successMessage = 'Employee removed successfully!';
          this.loading = false;
          
          // Clear success message after 3 seconds
          setTimeout(() => {
            this.successMessage = '';
          }, 3000);
        },
        error: (error) => {
          console.error('Error removing employee:', error);
          this.errorMessage = 'Failed to remove employee';
          this.loading = false;
        }
      });
    }
  }

  sortBy(column: string): void {
    if (this.sortColumn === column) {
      this.sortDirection = this.sortDirection === 'asc' ? 'desc' : 'asc';
    } else {
      this.sortColumn = column;
      this.sortDirection = 'asc';
    }
    
    this.employees.sort((a, b) => {
      let aValue = this.getPropertyValue(a, column);
      let bValue = this.getPropertyValue(b, column);
      
      if (typeof aValue === 'string') {
        aValue = aValue.toLowerCase();
        bValue = bValue.toLowerCase();
      }
      
      if (this.sortDirection === 'asc') {
        return aValue > bValue ? 1 : -1;
      } else {
        return aValue < bValue ? 1 : -1;
      }
    });
  }
  
  private getPropertyValue(obj: any, property: string): any {
    switch(property) {
      case 'name':
        return `${obj.firstName} ${obj.lastName}`;
      case 'id':
        return obj.id || 0;
      default:
        return obj[property];
    }
  }

  getSortIcon(column: string): string {
    if (this.sortColumn !== column) {
      return '↕';
    }
    return this.sortDirection === 'asc' ? '↑' : '↓';
  }
}