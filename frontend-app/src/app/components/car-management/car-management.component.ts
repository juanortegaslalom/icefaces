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
import { MatSelectModule } from '@angular/material/select';
import { MatCardModule } from '@angular/material/card';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { MatDialogModule, MatDialog } from '@angular/material/dialog';

import { Car, CarService } from '../../services/car.service';

@Component({
  selector: 'app-car-management',
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
    MatSelectModule,
    MatCardModule,
    MatSnackBarModule,
    MatDialogModule
  ],
  template: `
    <mat-card class="car-management-card">
      <mat-card-header>
        <mat-card-title>Car Management</mat-card-title>
        <mat-card-subtitle>Manage and browse your car inventory</mat-card-subtitle>
      </mat-card-header>

      <mat-card-content>
        <!-- Search and Filter Section -->
        <div class="filter-section">
          <mat-form-field appearance="outline" class="search-field">
            <mat-label>Search by name</mat-label>
            <input matInput 
                   [(ngModel)]="searchName" 
                   (keyup.enter)="searchCars()"
                   placeholder="Enter car name">
            <mat-icon matSuffix>search</mat-icon>
          </mat-form-field>

          <mat-form-field appearance="outline" class="filter-field">
            <mat-label>Filter by chassis</mat-label>
            <mat-select [(ngModel)]="selectedChassis" (selectionChange)="filterByChassis()">
              <mat-option value="">All Chassis Types</mat-option>
              <mat-option *ngFor="let chassis of chassisTypes" [value]="chassis">
                {{chassis}}
              </mat-option>
            </mat-select>
          </mat-form-field>

          <mat-form-field appearance="outline" class="filter-field">
            <mat-label>Min MPG</mat-label>
            <input matInput 
                   type="number" 
                   [(ngModel)]="minMpg"
                   (change)="filterByMpg()"
                   placeholder="0">
          </mat-form-field>

          <button mat-raised-button color="primary" (click)="loadCars()">
            <mat-icon>refresh</mat-icon>
            Refresh
          </button>

          <button mat-raised-button color="accent" (click)="showStatistics()">
            <mat-icon>analytics</mat-icon>
            Statistics
          </button>
        </div>

        <!-- Statistics Display -->
        <div *ngIf="showStats" class="statistics-section">
          <mat-card class="stats-card">
            <mat-card-header>
              <mat-card-title>Car Statistics</mat-card-title>
            </mat-card-header>
            <mat-card-content>
              <div class="stats-grid">
                <div class="stat-item">
                  <span class="stat-label">Total Cars:</span>
                  <span class="stat-value">{{statistics?.totalCars}}</span>
                </div>
                <div class="stat-item">
                  <span class="stat-label">Average MPG:</span>
                  <span class="stat-value">{{statistics?.averageMpg | number:'1.1-1'}}</span>
                </div>
                <div class="stat-item">
                  <span class="stat-label">Average Cost:</span>
                  <span class="stat-value">\${{statistics?.averageCost | number:'1.0-0'}}</span>
                </div>
                <div class="stat-item">
                  <span class="stat-label">Max MPG:</span>
                  <span class="stat-value">{{statistics?.maxMpg | number:'1.1-1'}}</span>
                </div>
              </div>
            </mat-card-content>
          </mat-card>
        </div>

        <!-- Data Table -->
        <div class="table-container">
          <table mat-table [dataSource]="dataSource" mat-sort class="cars-table">
            
            <!-- Name Column -->
            <ng-container matColumnDef="name">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>Name</th>
              <td mat-cell *matCellDef="let car">{{car.name}}</td>
            </ng-container>

            <!-- Chassis Column -->
            <ng-container matColumnDef="chassis">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>Chassis</th>
              <td mat-cell *matCellDef="let car">
                <span class="chassis-badge chassis-{{car.chassis.toLowerCase()}}">
                  {{car.chassis}}
                </span>
              </td>
            </ng-container>

            <!-- Weight Column -->
            <ng-container matColumnDef="weight">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>Weight (lbs)</th>
              <td mat-cell *matCellDef="let car">{{car.weight | number}}</td>
            </ng-container>

            <!-- Acceleration Column -->
            <ng-container matColumnDef="acceleration">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>0-60 (sec)</th>
              <td mat-cell *matCellDef="let car">{{car.acceleration}}</td>
            </ng-container>

            <!-- MPG Column -->
            <ng-container matColumnDef="mpg">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>MPG</th>
              <td mat-cell *matCellDef="let car">
                <span class="mpg-value" [class.high-mpg]="car.mpg > 35" [class.low-mpg]="car.mpg < 20">
                  {{car.mpg | number:'1.1-1'}}
                </span>
              </td>
            </ng-container>

            <!-- Cost Column -->
            <ng-container matColumnDef="cost">
              <th mat-header-cell *matHeaderCellDef mat-sort-header>Cost</th>
              <td mat-cell *matCellDef="let car">
                <span class="cost-value">
                  \${{car.cost | number:'1.0-0'}}
                </span>
              </td>
            </ng-container>

            <!-- Actions Column -->
            <ng-container matColumnDef="actions">
              <th mat-header-cell *matHeaderCellDef>Actions</th>
              <td mat-cell *matCellDef="let car">
                <button mat-icon-button color="primary" (click)="viewCar(car)" matTooltip="View Details">
                  <mat-icon>visibility</mat-icon>
                </button>
                <button mat-icon-button color="accent" (click)="editCar(car)" matTooltip="Edit">
                  <mat-icon>edit</mat-icon>
                </button>
                <button mat-icon-button color="warn" (click)="deleteCar(car)" matTooltip="Delete">
                  <mat-icon>delete</mat-icon>
                </button>
              </td>
            </ng-container>

            <tr mat-header-row *matHeaderRowDef="displayedColumns"></tr>
            <tr mat-row *matRowDef="let row; columns: displayedColumns;"></tr>
          </table>

          <mat-paginator [pageSizeOptions]="[5, 10, 20]" 
                         showFirstLastButtons
                         aria-label="Select page of cars">
          </mat-paginator>
        </div>
      </mat-card-content>
    </mat-card>
  `,
  styles: [`
    .car-management-card {
      margin: 20px;
      max-width: 1200px;
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
      min-width: 150px;
    }

    .statistics-section {
      margin-bottom: 20px;
    }

    .stats-card {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
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

    .table-container {
      margin-top: 20px;
    }

    .cars-table {
      width: 100%;
    }

    .chassis-badge {
      padding: 4px 8px;
      border-radius: 12px;
      font-size: 0.85em;
      font-weight: 500;
      color: white;
    }

    .chassis-sedan { background-color: #3f51b5; }
    .chassis-sports { background-color: #e91e63; }
    .chassis-suv { background-color: #ff9800; }
    .chassis-hybrid { background-color: #4caf50; }
    .chassis-electric { background-color: #2196f3; }
    .chassis-compact { background-color: #9c27b0; }
    .chassis-luxury { background-color: #795548; }
    .chassis-wagon { background-color: #607d8b; }
    .chassis-convertible { background-color: #ff5722; }
    .chassis-hatchback { background-color: #009688; }
    .chassis-pickup { background-color: #8bc34a; }

    .mpg-value.high-mpg {
      color: #4caf50;
      font-weight: bold;
    }

    .mpg-value.low-mpg {
      color: #f44336;
      font-weight: bold;
    }

    .cost-value {
      font-weight: 500;
    }

    mat-card-header {
      margin-bottom: 16px;
    }

    .mat-mdc-table {
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }
  `]
})
export class CarManagementComponent implements OnInit {
  displayedColumns: string[] = ['name', 'chassis', 'weight', 'acceleration', 'mpg', 'cost', 'actions'];
  dataSource = new MatTableDataSource<Car>();
  
  cars: Car[] = [];
  chassisTypes: string[] = [];
  statistics: any = null;
  
  // Filter properties
  searchName: string = '';
  selectedChassis: string = '';
  minMpg: number | null = null;
  showStats: boolean = false;

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(
    private carService: CarService,
    private snackBar: MatSnackBar,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.loadCars();
    this.loadChassisTypes();
  }

  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  loadCars(): void {
    this.carService.getAllCars().subscribe({
      next: (cars) => {
        this.cars = cars;
        this.dataSource.data = cars;
        this.showSnackBar('Cars loaded successfully');
      },
      error: (error) => {
        console.error('Error loading cars:', error);
        this.showSnackBar('Error loading cars');
      }
    });
  }

  loadChassisTypes(): void {
    this.carService.getAvailableChassisTypes().subscribe({
      next: (types) => {
        this.chassisTypes = types;
      },
      error: (error) => {
        console.error('Error loading chassis types:', error);
      }
    });
  }

  searchCars(): void {
    if (this.searchName.trim()) {
      this.carService.searchCarsByName(this.searchName).subscribe({
        next: (cars) => {
          this.dataSource.data = cars;
          this.showSnackBar(`Found ${cars.length} cars matching "${this.searchName}"`);
        },
        error: (error) => {
          console.error('Error searching cars:', error);
          this.showSnackBar('Error searching cars');
        }
      });
    } else {
      this.loadCars();
    }
  }

  filterByChassis(): void {
    if (this.selectedChassis) {
      this.carService.getCarsByChassis(this.selectedChassis).subscribe({
        next: (cars) => {
          this.dataSource.data = cars;
          this.showSnackBar(`Filtered by chassis: ${this.selectedChassis}`);
        },
        error: (error) => {
          console.error('Error filtering cars:', error);
          this.showSnackBar('Error filtering cars');
        }
      });
    } else {
      this.loadCars();
    }
  }

  filterByMpg(): void {
    if (this.minMpg && this.minMpg > 0) {
      this.carService.getFuelEfficientCars(this.minMpg).subscribe({
        next: (cars) => {
          this.dataSource.data = cars;
          this.showSnackBar(`Cars with MPG >= ${this.minMpg}`);
        },
        error: (error) => {
          console.error('Error filtering cars by MPG:', error);
          this.showSnackBar('Error filtering cars by MPG');
        }
      });
    } else {
      this.loadCars();
    }
  }

  showStatistics(): void {
    this.carService.getCarStatistics().subscribe({
      next: (stats) => {
        this.statistics = stats;
        this.showStats = !this.showStats;
      },
      error: (error) => {
        console.error('Error loading statistics:', error);
        this.showSnackBar('Error loading statistics');
      }
    });
  }

  viewCar(car: Car): void {
    // TODO: Implement view dialog
    this.showSnackBar(`Viewing details for ${car.name}`);
  }

  editCar(car: Car): void {
    // TODO: Implement edit dialog
    this.showSnackBar(`Edit functionality for ${car.name} coming soon`);
  }

  deleteCar(car: Car): void {
    if (confirm(`Are you sure you want to delete ${car.name}?`)) {
      // TODO: Implement delete functionality
      this.showSnackBar(`Delete functionality for ${car.name} coming soon`);
    }
  }

  private showSnackBar(message: string): void {
    this.snackBar.open(message, 'Close', {
      duration: 3000,
      horizontalPosition: 'right',
      verticalPosition: 'top'
    });
  }
}