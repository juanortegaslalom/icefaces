import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterModule } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';

// Angular Material imports
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatListModule } from '@angular/material/list';
import { MatSidenavModule } from '@angular/material/sidenav';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    RouterModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatCardModule,
    MatButtonModule,
    MatListModule,
    MatSidenavModule
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ICEfaces Modernization - Angular Frontend';
  apiResponse: any = null;
  
  private readonly baseUrl = 'http://localhost:8081/api';

  constructor(private http: HttpClient) {}

  /**
   * Test the Spring Boot health endpoint
   */
  testHealthEndpoint(): void {
    this.http.get(`${this.baseUrl}/health`, { responseType: 'text' })
      .subscribe({
        next: (response) => {
          this.apiResponse = {
            endpoint: '/api/health',
            status: 'SUCCESS',
            response: response,
            timestamp: new Date().toISOString()
          };
        },
        error: (error) => {
          this.apiResponse = {
            endpoint: '/api/health',
            status: 'ERROR',
            error: error.message,
            timestamp: new Date().toISOString()
          };
        }
      });
  }

  /**
   * Test the Spring Boot info endpoint
   */
  testInfoEndpoint(): void {
    this.http.get(`${this.baseUrl}/info`)
      .subscribe({
        next: (response) => {
          this.apiResponse = {
            endpoint: '/api/info',
            status: 'SUCCESS',
            response: response,
            timestamp: new Date().toISOString()
          };
        },
        error: (error) => {
          this.apiResponse = {
            endpoint: '/api/info',
            status: 'ERROR',
            error: error.message,
            timestamp: new Date().toISOString()
          };
        }
      });
  }
}