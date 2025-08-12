import { Component, OnInit, ViewChild } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatTableModule, MatTableDataSource } from '@angular/material/table';
import { MatPaginatorModule, MatPaginator } from '@angular/material/paginator';
import { MatSortModule, MatSort } from '@angular/material/sort';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatCardModule } from '@angular/material/card';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { MatTabsModule } from '@angular/material/tabs';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

import { Employee, EmployeeService, EmployeeStatistics, SalaryRangeCount } from '../../services/employee.service';

@Component({
  selector: 'app-employee-management',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatFormFieldModule,
    MatCardModule,
    MatSnackBarModule,
    MatTabsModule,
    MatProgressSpinnerModule
  ],
  template: `
    <mat-card class="employee-management-card">
      <mat-card-header>
        <mat-card-title>Employee Management</mat-card-title>
        <mat-card-subtitle>Manage HR data and view employee analytics</mat-card-subtitle>
      </mat-card-header>

      <mat-card-content>
        <mat-tab-group>
          <!-- Employee List Tab -->
          <mat-tab label="Employee List">
            <div class="tab-content">
              <!-- Search and Filter Section -->
              <div class="filter-section">
                <mat-form-field appearance="outline" class="search-field">
                  <mat-label>Search by name</mat-label>
                  <input matInput 
                         [(ngModel)]="searchTerm" 
                         (keyup.enter)="searchEmployees()"
                         placeholder="Enter first or last name">
                  <mat-icon matSuffix>search</mat-icon>
                </mat-form-field>

                <mat-form-field appearance="outline" class="filter-field">
                  <mat-label>Min Salary</mat-label>
                  <input matInput 
                         type="number" 
                         [(ngModel)]="minSalary"
                         placeholder="0">
                </mat-form-field>

                <mat-form-field appearance="outline" class="filter-field">
                  <mat-label>Max Salary</mat-label>
                  <input matInput 
                         type="number" 
                         [(ngModel)]="maxSalary"
                         placeholder="200000">
                </mat-form-field>

                <button mat-raised-button color="primary" (click)="applyAdvancedSearch()">
                  <mat-icon>search</mat-icon>
                  Search
                </button>

                <button mat-raised-button color="accent" (click)="loadEmployees()">
                  <mat-icon>refresh</mat-icon>
                  Refresh
                </button>

                <button mat-raised-button color="warn" (click)="showTopEarners()">
                  <mat-icon>trending_up</mat-icon>
                  Top Earners
                </button>
              </div>

              <!-- Data Table -->
              <div class="table-container">
                <table mat-table [dataSource]="dataSource" mat-sort class="employees-table">
                  
                  <!-- First Name Column -->
                  <ng-container matColumnDef="firstName">
                    <th mat-header-cell *matHeaderCellDef mat-sort-header>First Name</th>
                    <td mat-cell *matCellDef="let employee">{{employee.firstName}}</td>
                  </ng-container>

                  <!-- Last Name Column -->
                  <ng-container matColumnDef="lastName">
                    <th mat-header-cell *matHeaderCellDef mat-sort-header>Last Name</th>
                    <td mat-cell *matCellDef="let employee">{{employee.lastName}}</td>
                  </ng-container>

                  <!-- Full Name Column -->
                  <ng-container matColumnDef="fullName">
                    <th mat-header-cell *matHeaderCellDef>Full Name</th>
                    <td mat-cell *matCellDef="let employee">
                      <strong>{{employee.firstName}} {{employee.lastName}}</strong>
                    </td>
                  </ng-container>

                  <!-- Address Column -->
                  <ng-container matColumnDef="address">
                    <th mat-header-cell *matHeaderCellDef>Address</th>
                    <td mat-cell *matCellDef="let employee">
                      <div class="address-cell" [title]="employee.address">
                        {{employee.address}}
                      </div>
                    </td>
                  </ng-container>

                  <!-- Salary Column -->
                  <ng-container matColumnDef="salary">
                    <th mat-header-cell *matHeaderCellDef mat-sort-header>Salary</th>
                    <td mat-cell *matCellDef="let employee">
                      <span class="salary-value" 
                            [class.high-salary]="employee.salary > 80000" 
                            [class.medium-salary]="employee.salary >= 60000 && employee.salary <= 80000"
                            [class.low-salary]="employee.salary < 60000">
                        \${{employee.salary | number:'1.0-0'}}
                      </span>
                    </td>
                  </ng-container>

                  <!-- Actions Column -->
                  <ng-container matColumnDef="actions">
                    <th mat-header-cell *matHeaderCellDef>Actions</th>
                    <td mat-cell *matCellDef="let employee">
                      <button mat-icon-button color="primary" (click)="viewEmployee(employee)" matTooltip="View Details">
                        <mat-icon>visibility</mat-icon>
                      </button>
                      <button mat-icon-button color="accent" (click)="editEmployee(employee)" matTooltip="Edit">
                        <mat-icon>edit</mat-icon>
                      </button>
                      <button mat-icon-button color="warn" (click)="deleteEmployee(employee)" matTooltip="Delete">
                        <mat-icon>delete</mat-icon>
                      </button>
                    </td>
                  </ng-container>

                  <tr mat-header-row *matHeaderRowDef="displayedColumns"></tr>
                  <tr mat-row *matRowDef="let row; columns: displayedColumns;"></tr>
                </table>

                <mat-paginator [pageSizeOptions]="[10, 25, 50]" 
                               showFirstLastButtons
                               aria-label="Select page of employees">
                </mat-paginator>
              </div>
            </div>
          </mat-tab>

          <!-- Statistics Tab -->
          <mat-tab label="HR Analytics">
            <div class="tab-content">
              <div *ngIf="loading" class="loading-container">
                <mat-spinner></mat-spinner>
                <p>Loading statistics...</p>
              </div>

              <div *ngIf="!loading" class="statistics-container">
                <!-- General Statistics -->
                <mat-card class="stats-card general-stats">
                  <mat-card-header>
                    <mat-card-title>General Statistics</mat-card-title>
                  </mat-card-header>
                  <mat-card-content>
                    <div class="stats-grid">
                      <div class="stat-item">
                        <span class="stat-label">Total Employees:</span>
                        <span class="stat-value">{{generalStats?.totalEmployees}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">Average Salary:</span>
                        <span class="stat-value">\${{generalStats?.averageSalary | number:'1.0-0'}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">Cities Represented:</span>
                        <span class="stat-value">{{generalStats?.distinctCities}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">High Earners (>80k):</span>
                        <span class="stat-value">{{generalStats?.highEarners}}</span>
                      </div>
                    </div>
                  </mat-card-content>
                </mat-card>

                <!-- Salary Statistics -->
                <mat-card class="stats-card salary-stats">
                  <mat-card-header>
                    <mat-card-title>Salary Analysis</mat-card-title>
                  </mat-card-header>
                  <mat-card-content>
                    <div class="stats-grid">
                      <div class="stat-item">
                        <span class="stat-label">Average:</span>
                        <span class="stat-value">\${{salaryStats?.averageSalary | number:'1.0-0'}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">Median:</span>
                        <span class="stat-value">\${{salaryStats?.medianSalary | number:'1.0-0'}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">Minimum:</span>
                        <span class="stat-value">\${{salaryStats?.minSalary | number:'1.0-0'}}</span>
                      </div>
                      <div class="stat-item">
                        <span class="stat-label">Maximum:</span>
                        <span class="stat-value">\${{salaryStats?.maxSalary | number:'1.0-0'}}</span>
                      </div>
                    </div>
                  </mat-card-content>
                </mat-card>

                <!-- Salary Distribution -->
                <mat-card class="stats-card distribution-stats">
                  <mat-card-header>
                    <mat-card-title>Salary Distribution</mat-card-title>
                  </mat-card-header>
                  <mat-card-content>
                    <div class="distribution-chart">
                      <div *ngFor="let range of salaryRanges" class="range-bar">
                        <div class="range-label">{{range.rangeName}}</div>
                        <div class="range-bar-container">
                          <div class="range-bar-fill" 
                               [style.width.%]="getBarWidth(range.count)">
                          </div>
                          <span class="range-count">{{range.count}}</span>
                        </div>
                      </div>
                    </div>
                  </mat-card-content>
                </mat-card>

                <div class="actions-section">
                  <button mat-raised-button color="primary" (click)="loadStatistics()">
                    <mat-icon>refresh</mat-icon>
                    Refresh Statistics
                  </button>
                  <button mat-raised-button color="accent" (click)="exportData()">
                    <mat-icon>file_download</mat-icon>
                    Export Data
                  </button>
                </div>
              </div>
            </div>
          </mat-tab>
        </mat-tab-group>
      </mat-card-content>
    </mat-card>
  `,
  styles: [`
    .employee-management-card {
      margin: 20px;
      max-width: 1400px;
    }

    .tab-content {
      padding: 20px 0;
    }

    .filter-section {
      display: flex;
      gap: 16px;
      margin-bottom: 20px;
      align-items: flex-end;
      flex-wrap: wrap;
    }

    .search-field {
      flex: 1;
      min-width: 200px;
    }

    .filter-field {
      min-width: 120px;
    }

    .table-container {
      margin-top: 20px;
    }

    .employees-table {
      width: 100%;
    }

    .address-cell {
      max-width: 200px;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
    }

    .salary-value {
      font-weight: 500;
    }

    .salary-value.high-salary {
      color: #4caf50;
      font-weight: bold;
    }

    .salary-value.medium-salary {
      color: #ff9800;
      font-weight: bold;
    }

    .salary-value.low-salary {
      color: #f44336;
    }

    .loading-container {
      display: flex;
      flex-direction: column;
      align-items: center;
      padding: 40px;
    }

    .statistics-container {
      display: grid;
      gap: 20px;
    }

    .stats-card {
      margin-bottom: 16px;
    }

    .general-stats {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      color: white;
    }

    .salary-stats {
      background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
      color: white;
    }

    .distribution-stats {
      background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
      color: white;
    }

    .stats-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
      gap: 16px;
    }

    .stat-item {
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 8px;
      background: rgba(255, 255, 255, 0.1);
      border-radius: 4px;
    }

    .stat-label {
      font-weight: 500;
    }

    .stat-value {
      font-size: 1.2em;
      font-weight: bold;
    }

    .distribution-chart {
      margin-top: 16px;
    }

    .range-bar {
      margin-bottom: 12px;
    }

    .range-label {
      font-weight: 500;
      margin-bottom: 4px;
    }

    .range-bar-container {
      position: relative;
      height: 24px;
      background: rgba(255, 255, 255, 0.2);
      border-radius: 12px;
      overflow: hidden;
    }

    .range-bar-fill {
      height: 100%;
      background: rgba(255, 255, 255, 0.8);
      border-radius: 12px;
      transition: width 0.3s ease;
    }

    .range-count {
      position: absolute;
      right: 8px;
      top: 50%;
      transform: translateY(-50%);
      font-weight: bold;
      color: #333;
      font-size: 0.9em;
    }

    .actions-section {
      display: flex;
      gap: 12px;
      margin-top: 20px;
    }

    mat-card-header {
      margin-bottom: 16px;
    }

    .mat-mdc-table {
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }
  `]
})
export class EmployeeManagementComponent implements OnInit {
  displayedColumns: string[] = ['fullName', 'address', 'salary', 'actions'];
  dataSource = new MatTableDataSource<Employee>();
  
  employees: Employee[] = [];
  generalStats: EmployeeStatistics | null = null;
  salaryStats: any = null;
  salaryRanges: SalaryRangeCount[] = [];
  
  // Filter properties
  searchTerm: string = '';
  minSalary: number | null = null;
  maxSalary: number | null = null;
  loading: boolean = false;

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(
    private employeeService: EmployeeService,
    private snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {
    this.loadEmployees();
    this.loadStatistics();
  }

  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  loadEmployees(): void {
    this.employeeService.getAllEmployees().subscribe({
      next: (employees) => {
        this.employees = employees;
        this.dataSource.data = employees;
        this.showSnackBar('Employees loaded successfully');
      },
      error: (error) => {
        console.error('Error loading employees:', error);
        this.showSnackBar('Error loading employees');
      }
    });
  }

  searchEmployees(): void {
    if (this.searchTerm.trim()) {
      this.employeeService.searchEmployeesByFullName(this.searchTerm).subscribe({
        next: (employees) => {
          this.dataSource.data = employees;
          this.showSnackBar(`Found ${employees.length} employees matching "${this.searchTerm}"`);
        },
        error: (error) => {
          console.error('Error searching employees:', error);
          this.showSnackBar('Error searching employees');
        }
      });
    } else {
      this.loadEmployees();
    }
  }

  applyAdvancedSearch(): void {
    const firstName = this.searchTerm.split(' ')[0] || undefined;
    const lastName = this.searchTerm.split(' ')[1] || undefined;
    
    this.employeeService.searchEmployeesAdvanced(
      firstName, 
      lastName, 
      this.minSalary || undefined, 
      this.maxSalary || undefined
    ).subscribe({
      next: (employees) => {
        this.dataSource.data = employees;
        this.showSnackBar(`Advanced search returned ${employees.length} employees`);
      },
      error: (error) => {
        console.error('Error in advanced search:', error);
        this.showSnackBar('Error in advanced search');
      }
    });
  }

  showTopEarners(): void {
    this.employeeService.getTopEarners(10).subscribe({
      next: (employees) => {
        this.dataSource.data = employees;
        this.showSnackBar('Showing top 10 earners');
      },
      error: (error) => {
        console.error('Error loading top earners:', error);
        this.showSnackBar('Error loading top earners');
      }
    });
  }

  loadStatistics(): void {
    this.loading = true;
    
    // Load general statistics
    this.employeeService.getEmployeeStatistics().subscribe({
      next: (stats) => {
        this.generalStats = stats;
      },
      error: (error) => {
        console.error('Error loading general statistics:', error);
      }
    });

    // Load salary statistics
    this.employeeService.getSalaryStatistics().subscribe({
      next: (stats) => {
        this.salaryStats = stats;
      },
      error: (error) => {
        console.error('Error loading salary statistics:', error);
      }
    });

    // Load salary distribution
    this.employeeService.getEmployeeCountBySalaryRanges().subscribe({
      next: (ranges) => {
        this.salaryRanges = ranges;
        this.loading = false;
      },
      error: (error) => {
        console.error('Error loading salary distribution:', error);
        this.loading = false;
      }
    });
  }

  getBarWidth(count: number): number {
    if (this.salaryRanges.length === 0) return 0;
    const maxCount = Math.max(...this.salaryRanges.map(r => r.count));
    return maxCount > 0 ? (count / maxCount) * 100 : 0;
  }

  viewEmployee(employee: Employee): void {
    this.showSnackBar(`Viewing details for ${employee.firstName} ${employee.lastName}`);
  }

  editEmployee(employee: Employee): void {
    this.showSnackBar(`Edit functionality for ${employee.firstName} ${employee.lastName} coming soon`);
  }

  deleteEmployee(employee: Employee): void {
    if (confirm(`Are you sure you want to delete ${employee.firstName} ${employee.lastName}?`)) {
      this.showSnackBar(`Delete functionality for ${employee.firstName} ${employee.lastName} coming soon`);
    }
  }

  exportData(): void {
    this.showSnackBar('Export functionality coming soon');
  }

  private showSnackBar(message: string): void {
    this.snackBar.open(message, 'Close', {
      duration: 3000,
      horizontalPosition: 'right',
      verticalPosition: 'top'
    });
  }
}