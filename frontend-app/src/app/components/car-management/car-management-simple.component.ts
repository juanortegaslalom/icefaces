import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule, MatTableDataSource } from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { CarService, Car } from '../../services/car.service';

@Component({
  selector: 'app-car-management-simple',
  standalone: true,
  imports: [
    CommonModule,
    MatCardModule,
    MatTableModule,
    MatButtonModule,
    MatIconModule
  ],
  template: `
    <div class="container">
      <mat-card>
        <mat-card-header>
          <mat-card-title>Car Management</mat-card-title>
          <mat-card-subtitle>Browse car inventory</mat-card-subtitle>
        </mat-card-header>
        <mat-card-content>
          <button mat-raised-button color="primary" (click)="loadCars()">
            <mat-icon>refresh</mat-icon>
            Refresh Cars
          </button>
          
          <div class="table-container">
            <table mat-table [dataSource]="dataSource" class="cars-table">
              
              <ng-container matColumnDef="name">
                <th mat-header-cell *matHeaderCellDef>Name</th>
                <td mat-cell *matCellDef="let car">{{car.name}}</td>
              </ng-container>

              <ng-container matColumnDef="chassis">
                <th mat-header-cell *matHeaderCellDef>Chassis</th>
                <td mat-cell *matCellDef="let car">{{car.chassis}}</td>
              </ng-container>

              <ng-container matColumnDef="mpg">
                <th mat-header-cell *matHeaderCellDef>MPG</th>
                <td mat-cell *matCellDef="let car">{{car.mpg}}</td>
              </ng-container>

              <ng-container matColumnDef="cost">
                <th mat-header-cell *matHeaderCellDef>Cost</th>
                <td mat-cell *matCellDef="let car">\${{car.cost | number}}</td>
              </ng-container>

              <tr mat-header-row *matHeaderRowDef="displayedColumns"></tr>
              <tr mat-row *matRowDef="let row; columns: displayedColumns;"></tr>
            </table>
            
            <p *ngIf="cars.length === 0">No cars found. Click refresh to load data.</p>
            <p>Total cars: {{cars.length}}</p>
          </div>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    .container { 
      padding: 20px; 
      max-width: 1200px; 
      margin: 0 auto; 
    }
    .table-container { 
      margin-top: 20px; 
    }
    .cars-table { 
      width: 100%; 
    }
  `]
})
export class CarManagementSimpleComponent implements OnInit {
  displayedColumns: string[] = ['name', 'chassis', 'mpg', 'cost'];
  dataSource = new MatTableDataSource<Car>();
  cars: Car[] = [];

  constructor(private carService: CarService) {}

  ngOnInit(): void {
    this.loadCars();
  }

  loadCars(): void {
    console.log('Loading cars...');
    this.carService.getAllCars().subscribe({
      next: (cars) => {
        console.log('Cars loaded:', cars.length);
        this.cars = cars;
        this.dataSource.data = cars;
      },
      error: (error) => {
        console.error('Error loading cars:', error);
      }
    });
  }
}