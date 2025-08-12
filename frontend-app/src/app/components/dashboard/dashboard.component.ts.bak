import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

import { CarService, CarStatistics } from '../../services/car.service';
import { CityService, CityStatistics } from '../../services/city.service';
import { EmployeeService, EmployeeStatistics } from '../../services/employee.service';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatGridListModule,
    MatProgressSpinnerModule
  ],
  template: `
    <div class="dashboard-container">
      <div class="dashboard-header">
        <h1>ICEfaces Modernization Dashboard</h1>
        <p>Welcome to the modernized ICEfaces application built with Angular and Spring Boot</p>
      </div>

      <!-- Quick Stats Overview -->
      <div class="stats-overview">
        <mat-card class="stat-card cars-stat">
          <mat-card-content>
            <div class="stat-content">
              <mat-icon class="stat-icon">directions_car</mat-icon>
              <div class="stat-details">
                <h2>{{carStats?.totalCars || 0}}</h2>
                <p>Total Cars</p>
                <small>Avg MPG: {{carStats?.averageMpg | number:'1.1-1'}} | Avg Cost: \${{carStats?.averageCost | number:'1.0-0'}}</small>
              </div>
            </div>
          </mat-card-content>
        </mat-card>

        <mat-card class="stat-card cities-stat">
          <mat-card-content>
            <div class="stat-content">
              <mat-icon class="stat-icon">location_city</mat-icon>
              <div class="stat-details">
                <h2>{{cityStats?.totalCities || 0}}</h2>
                <p>Cities Available</p>
                <small>{{cityStats?.totalCountries || 0}} Countries | Avg Alt: {{cityStats?.averageAltitude | number:'1.0-0'}}m</small>
              </div>
            </div>
          </mat-card-content>
        </mat-card>

        <mat-card class="stat-card employees-stat">
          <mat-card-content>
            <div class="stat-content">
              <mat-icon class="stat-icon">people</mat-icon>
              <div class="stat-details">
                <h2>{{employeeStats?.totalEmployees || 0}}</h2>
                <p>Employees</p>
                <small>Avg Salary: \${{employeeStats?.averageSalary | number:'1.0-0'}} | {{employeeStats?.highEarners || 0}} High Earners</small>
              </div>
            </div>
          </mat-card-content>
        </mat-card>
      </div>

      <!-- Navigation Cards -->
      <div class="navigation-section">
        <h2>Navigate to Modules</h2>
        <div class="nav-cards">
          <mat-card class="nav-card" routerLink="/cars">
            <mat-card-header>
              <mat-icon mat-card-avatar>directions_car</mat-icon>
              <mat-card-title>Car Management</mat-card-title>
              <mat-card-subtitle>Browse and manage car inventory</mat-card-subtitle>
            </mat-card-header>
            <mat-card-content>
              <p>Advanced car data table with filtering, sorting, and search capabilities. Replaces ICEfaces DataTable component.</p>
              <ul>
                <li>Search by name, chassis, MPG</li>
                <li>Statistical analysis</li>
                <li>Advanced filtering options</li>
              </ul>
            </mat-card-content>
            <mat-card-actions>
              <button mat-raised-button color="primary">
                <mat-icon>launch</mat-icon>
                Open Car Management
              </button>
            </mat-card-actions>
          </mat-card>

          <mat-card class="nav-card" routerLink="/cities">
            <mat-card-header>
              <mat-icon mat-card-avatar>location_city</mat-icon>
              <mat-card-title>City Autocomplete</mat-card-title>
              <mat-card-subtitle>Fast city search and selection</mat-card-subtitle>
            </mat-card-header>
            <mat-card-content>
              <p>Modern autocomplete component with real-time search. Replaces ICEfaces AutoComplete component.</p>
              <ul>
                <li>Real-time search suggestions</li>
                <li>Geographic proximity search</li>
                <li>Recent searches memory</li>
              </ul>
            </mat-card-content>
            <mat-card-actions>
              <button mat-raised-button color="primary">
                <mat-icon>launch</mat-icon>
                Open City Search
              </button>
            </mat-card-actions>
          </mat-card>

          <mat-card class="nav-card" routerLink="/employees">
            <mat-card-header>
              <mat-icon mat-card-avatar>people</mat-icon>
              <mat-card-title>Employee Management</mat-card-title>
              <mat-card-subtitle>HR data and analytics</mat-card-subtitle>
            </mat-card-header>
            <mat-card-content>
              <p>Comprehensive employee management with HR analytics. Replaces ICEfaces SeriesBean and HR components.</p>
              <ul>
                <li>Employee data management</li>
                <li>Salary analysis and statistics</li>
                <li>Advanced search and filtering</li>
              </ul>
            </mat-card-content>
            <mat-card-actions>
              <button mat-raised-button color="primary">
                <mat-icon>launch</mat-icon>
                Open HR Management
              </button>
            </mat-card-actions>
          </mat-card>
        </div>
      </div>

      <!-- Technology Comparison -->
      <div class="comparison-section">
        <h2>Modernization Benefits</h2>
        <div class="comparison-cards">
          <mat-card class="comparison-card legacy-card">
            <mat-card-header>
              <mat-card-title>❌ Legacy ICEfaces</mat-card-title>
            </mat-card-header>
            <mat-card-content>
              <ul>
                <li>Server-side rendering</li>
                <li>Full page reloads</li>
                <li>JSF 2.1 limitations</li>
                <li>Monolithic architecture</li>
                <li>Limited mobile support</li>
                <li>Heavyweight components</li>
              </ul>
            </mat-card-content>
          </mat-card>

          <mat-card class="comparison-card modern-card">
            <mat-card-header>
              <mat-card-title>✅ Modern Angular + Spring Boot</mat-card-title>
            </mat-card-header>
            <mat-card-content>
              <ul>
                <li>Client-side rendering</li>
                <li>SPA navigation</li>
                <li>Latest web standards</li>
                <li>Microservices ready</li>
                <li>Mobile-first design</li>
                <li>Lightweight & fast</li>
              </ul>
            </mat-card-content>
          </mat-card>
        </div>
      </div>

      <!-- Loading States -->
      <div *ngIf="loading" class="loading-container">
        <mat-spinner></mat-spinner>
        <p>Loading dashboard data...</p>
      </div>
    </div>
  `,
  styles: [`
    .dashboard-container {
      padding: 20px;
      max-width: 1400px;
      margin: 0 auto;
    }

    .dashboard-header {
      text-align: center;
      margin-bottom: 40px;
    }

    .dashboard-header h1 {
      font-size: 2.5em;
      margin-bottom: 8px;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      -webkit-background-clip: text;
      -webkit-text-fill-color: transparent;
      background-clip: text;
    }

    .dashboard-header p {
      font-size: 1.2em;
      color: #666;
      margin: 0;
    }

    .stats-overview {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
      gap: 20px;
      margin-bottom: 40px;
    }

    .stat-card {
      transition: transform 0.2s, box-shadow 0.2s;
    }

    .stat-card:hover {
      transform: translateY(-4px);
      box-shadow: 0 8px 16px rgba(0,0,0,0.15);
    }

    .cars-stat {
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      color: white;
    }

    .cities-stat {
      background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
      color: white;
    }

    .employees-stat {
      background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
      color: white;
    }

    .stat-content {
      display: flex;
      align-items: center;
      gap: 16px;
    }

    .stat-icon {
      font-size: 48px;
      width: 48px;
      height: 48px;
      opacity: 0.8;
    }

    .stat-details h2 {
      font-size: 2.5em;
      margin: 0;
      font-weight: bold;
    }

    .stat-details p {
      font-size: 1.1em;
      margin: 4px 0;
      opacity: 0.9;
    }

    .stat-details small {
      opacity: 0.7;
      font-size: 0.9em;
    }

    .navigation-section {
      margin-bottom: 40px;
    }

    .navigation-section h2 {
      text-align: center;
      margin-bottom: 24px;
      color: #333;
    }

    .nav-cards {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
      gap: 24px;
    }

    .nav-card {
      cursor: pointer;
      transition: transform 0.2s, box-shadow 0.2s;
      height: 100%;
    }

    .nav-card:hover {
      transform: translateY(-4px);
      box-shadow: 0 8px 16px rgba(0,0,0,0.15);
    }

    .nav-card mat-card-content ul {
      margin: 16px 0;
      padding-left: 20px;
    }

    .nav-card mat-card-content li {
      margin-bottom: 4px;
      color: #666;
    }

    .comparison-section {
      margin-bottom: 40px;
    }

    .comparison-section h2 {
      text-align: center;
      margin-bottom: 24px;
      color: #333;
    }

    .comparison-cards {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
      gap: 24px;
    }

    .comparison-card {
      text-align: center;
    }

    .legacy-card {
      background: linear-gradient(135deg, #ff6b6b 0%, #ee5a24 100%);
      color: white;
    }

    .modern-card {
      background: linear-gradient(135deg, #6c5ce7 0%, #a29bfe 100%);
      color: white;
    }

    .comparison-card ul {
      text-align: left;
      margin: 16px 0;
    }

    .comparison-card li {
      margin-bottom: 8px;
      opacity: 0.9;
    }

    .loading-container {
      display: flex;
      flex-direction: column;
      align-items: center;
      padding: 40px;
    }

    .loading-container p {
      margin-top: 16px;
      color: #666;
    }

    @media (max-width: 768px) {
      .dashboard-container {
        padding: 16px;
      }

      .dashboard-header h1 {
        font-size: 2em;
      }

      .stats-overview {
        grid-template-columns: 1fr;
      }

      .nav-cards {
        grid-template-columns: 1fr;
      }

      .comparison-cards {
        grid-template-columns: 1fr;
      }
    }
  `]
})
export class DashboardComponent implements OnInit {
  carStats: CarStatistics | null = null;
  cityStats: CityStatistics | null = null;
  employeeStats: EmployeeStatistics | null = null;
  loading: boolean = true;

  constructor(
    private carService: CarService,
    private cityService: CityService,
    private employeeService: EmployeeService
  ) {}

  ngOnInit(): void {
    this.loadAllStatistics();
  }

  private loadAllStatistics(): void {
    this.loading = true;

    // Load car statistics
    this.carService.getCarStatistics().subscribe({
      next: (stats) => {
        this.carStats = stats;
        this.checkLoadingComplete();
      },
      error: (error) => {
        console.error('Error loading car statistics:', error);
        this.checkLoadingComplete();
      }
    });

    // Load city statistics
    this.cityService.getCityStatistics().subscribe({
      next: (stats) => {
        this.cityStats = stats;
        this.checkLoadingComplete();
      },
      error: (error) => {
        console.error('Error loading city statistics:', error);
        this.checkLoadingComplete();
      }
    });

    // Load employee statistics
    this.employeeService.getEmployeeStatistics().subscribe({
      next: (stats) => {
        this.employeeStats = stats;
        this.checkLoadingComplete();
      },
      error: (error) => {
        console.error('Error loading employee statistics:', error);
        this.checkLoadingComplete();
      }
    });
  }

  private checkLoadingComplete(): void {
    // Set a minimum loading time for better UX
    setTimeout(() => {
      this.loading = false;
    }, 1000);
  }
}