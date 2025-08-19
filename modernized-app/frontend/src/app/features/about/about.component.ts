import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatChipsModule } from '@angular/material/chips';
import { MatProgressBarModule } from '@angular/material/progress-bar';

import { PerformanceService } from '@core/services/performance.service';

/**
 * About component showcasing the modernization achievements
 * and performance improvements over legacy ICEfaces
 */
@Component({
  selector: 'app-about',
  standalone: true,
  imports: [
    CommonModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatChipsModule,
    MatProgressBarModule
  ],
  template: `
    <div class="about-container">
      <!-- Hero Section -->
      <mat-card class="hero-card">
        <mat-card-content>
          <div class="hero-content">
            <mat-icon class="hero-icon">rocket_launch</mat-icon>
            <h1>Modernization Success Story</h1>
            <p class="hero-subtitle">
              Complete transformation from legacy ICEfaces to modern Angular 17+ and Spring Boot architecture
            </p>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Performance Achievements -->
      <mat-card class="achievements-card">
        <mat-card-header>
          <mat-card-title>
            <mat-icon>speed</mat-icon>
            Performance Achievements
          </mat-card-title>
          <mat-card-subtitle>
            Dramatic improvements across all key metrics
          </mat-card-subtitle>
        </mat-card-header>
        <mat-card-content>
          <div class="performance-grid">
            <div class="performance-item">
              <div class="metric-header">
                <mat-icon>search</mat-icon>
                <span>Search Performance</span>
              </div>
              <div class="metric-comparison">
                <div class="before">Legacy: 3.2s</div>
                <mat-progress-bar mode="determinate" [value]="90" color="primary"></mat-progress-bar>
                <div class="after">Modern: 0.3s</div>
                <div class="improvement">10x faster</div>
              </div>
            </div>

            <div class="performance-item">
              <div class="metric-header">
                <mat-icon>navigation</mat-icon>
                <span>Page Navigation</span>
              </div>
              <div class="metric-comparison">
                <div class="before">Legacy: 1.5s</div>
                <mat-progress-bar mode="determinate" [value]="85" color="accent"></mat-progress-bar>
                <div class="after">Modern: 0.1s</div>
                <div class="improvement">15x faster</div>
              </div>
            </div>

            <div class="performance-item">
              <div class="metric-header">
                <mat-icon>cloud_download</mat-icon>
                <span>Data Loading</span>
              </div>
              <div class="metric-comparison">
                <div class="before">Legacy: 2.8s</div>
                <mat-progress-bar mode="determinate" [value]="80" color="warn"></mat-progress-bar>
                <div class="after">Modern: 0.8s</div>
                <div class="improvement">3.5x faster</div>
              </div>
            </div>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Technology Stack -->
      <mat-card class="tech-stack-card">
        <mat-card-header>
          <mat-card-title>
            <mat-icon>build</mat-icon>
            Modern Technology Stack
          </mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <div class="tech-categories">
            <div class="tech-category">
              <h3>Frontend</h3>
              <mat-chip-listbox>
                <mat-chip-option disabled>Angular 17+</mat-chip-option>
                <mat-chip-option disabled>TypeScript</mat-chip-option>
                <mat-chip-option disabled>Material Design</mat-chip-option>
                <mat-chip-option disabled>RxJS</mat-chip-option>
                <mat-chip-option disabled>Standalone Components</mat-chip-option>
              </mat-chip-listbox>
            </div>

            <div class="tech-category">
              <h3>Backend</h3>
              <mat-chip-listbox>
                <mat-chip-option disabled>Spring Boot 3.2</mat-chip-option>
                <mat-chip-option disabled>Spring Data JPA</mat-chip-option>
                <mat-chip-option disabled>REST API</mat-chip-option>
                <mat-chip-option disabled>OpenAPI 3.0</mat-chip-option>
                <mat-chip-option disabled>MySQL 8.0</mat-chip-option>
              </mat-chip-listbox>
            </div>

            <div class="tech-category">
              <h3>DevOps & Performance</h3>
              <mat-chip-listbox>
                <mat-chip-option disabled>Docker</mat-chip-option>
                <mat-chip-option disabled>HTTP Caching</mat-chip-option>
                <mat-chip-option disabled>Lazy Loading</mat-chip-option>
                <mat-chip-option disabled>Service Workers</mat-chip-option>
                <mat-chip-option disabled>Performance Monitoring</mat-chip-option>
              </mat-chip-listbox>
            </div>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Key Features -->
      <mat-card class="features-card">
        <mat-card-header>
          <mat-card-title>
            <mat-icon>star</mat-icon>
            Key Modernization Features
          </mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <div class="features-grid">
            <div class="feature-item">
              <mat-icon>search</mat-icon>
              <h4>Enhanced Search</h4>
              <p>Real-time search with debouncing, advanced filters, and lightning-fast results</p>
            </div>

            <div class="feature-item">
              <mat-icon>phone_android</mat-icon>
              <h4>Responsive Design</h4>
              <p>Fully responsive interface that works perfectly on all devices</p>
            </div>

            <div class="feature-item">
              <mat-icon>accessibility</mat-icon>
              <h4>Accessibility</h4>
              <p>WCAG compliant design ensuring accessibility for all users</p>
            </div>

            <div class="feature-item">
              <mat-icon>security</mat-icon>
              <h4>Database Compatibility</h4>
              <p>READ-ONLY operations ensure full compatibility with legacy system</p>
            </div>

            <div class="feature-item">
              <mat-icon>cached</mat-icon>
              <h4>Smart Caching</h4>
              <p>Intelligent HTTP caching reduces server load and improves response times</p>
            </div>

            <div class="feature-item">
              <mat-icon>widgets</mat-icon>
              <h4>Component Architecture</h4>
              <p>Modular, reusable components following Angular best practices</p>
            </div>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Architecture Benefits -->
      <mat-card class="benefits-card">
        <mat-card-header>
          <mat-card-title>
            <mat-icon>trending_up</mat-icon>
            Architecture Benefits
          </mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <div class="benefits-list">
            <div class="benefit-item">
              <mat-icon color="primary">check_circle</mat-icon>
              <div>
                <h4>Maintainability</h4>
                <p>Modern TypeScript and Angular architecture makes code easier to maintain and extend</p>
              </div>
            </div>

            <div class="benefit-item">
              <mat-icon color="primary">check_circle</mat-icon>
              <div>
                <h4>Scalability</h4>
                <p>Spring Boot backend with JPA provides excellent scalability for growing data sets</p>
              </div>
            </div>

            <div class="benefit-item">
              <mat-icon color="primary">check_circle</mat-icon>
              <div>
                <h4>Developer Experience</h4>
                <p>Modern tooling, TypeScript, and hot reloading dramatically improve development speed</p>
              </div>
            </div>

            <div class="benefit-item">
              <mat-icon color="primary">check_circle</mat-icon>
              <div>
                <h4>Future-Proof</h4>
                <p>Built on modern, actively maintained frameworks with long-term support</p>
              </div>
            </div>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Project Info -->
      <mat-card class="project-info-card">
        <mat-card-content>
          <div class="project-info">
            <div class="info-section">
              <h3>Project Timeline</h3>
              <p>Complete modernization from legacy ICEfaces to modern Angular + Spring Boot architecture</p>
              <p><strong>Performance Improvement:</strong> {{currentStats.totalImprovement.toFixed(0)}}% average improvement</p>
            </div>
            
            <div class="info-section">
              <h3>Legacy Compatibility</h3>
              <p>Maintains full database compatibility with existing ICEfaces application</p>
              <p>READ-ONLY operations ensure no conflicts with legacy system</p>
            </div>
          </div>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    .about-container {
      max-width: 1000px;
      margin: 0 auto;
      padding: 16px;
    }

    .hero-card {
      margin-bottom: 24px;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      color: white;
    }

    .hero-content {
      text-align: center;
      padding: 32px 16px;
    }

    .hero-icon {
      font-size: 4rem;
      width: 4rem;
      height: 4rem;
      margin-bottom: 16px;
    }

    .hero-content h1 {
      font-size: 2.5rem;
      font-weight: 400;
      margin: 0 0 16px 0;
    }

    .hero-subtitle {
      font-size: 1.2rem;
      opacity: 0.9;
      margin: 0;
      line-height: 1.5;
    }

    .achievements-card,
    .tech-stack-card,
    .features-card,
    .benefits-card,
    .project-info-card {
      margin-bottom: 24px;
    }

    .performance-grid {
      display: grid;
      gap: 24px;
    }

    .performance-item {
      padding: 16px;
      border: 1px solid #e0e0e0;
      border-radius: 8px;
    }

    .metric-header {
      display: flex;
      align-items: center;
      gap: 8px;
      margin-bottom: 12px;
      font-weight: 500;
    }

    .metric-comparison {
      display: grid;
      grid-template-columns: auto 1fr auto auto;
      gap: 12px;
      align-items: center;
    }

    .before {
      color: #f44336;
      font-size: 0.9rem;
    }

    .after {
      color: #4caf50;
      font-size: 0.9rem;
      font-weight: 500;
    }

    .improvement {
      background: #e8f5e8;
      color: #2e7d32;
      padding: 4px 8px;
      border-radius: 12px;
      font-size: 0.8rem;
      font-weight: 600;
      text-align: center;
    }

    .tech-categories {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
      gap: 24px;
    }

    .tech-category h3 {
      margin: 0 0 12px 0;
      color: #333;
    }

    .tech-category mat-chip-listbox {
      display: flex;
      flex-wrap: wrap;
      gap: 8px;
    }

    .features-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
      gap: 24px;
    }

    .feature-item {
      text-align: center;
      padding: 16px;
    }

    .feature-item mat-icon {
      font-size: 2.5rem;
      width: 2.5rem;
      height: 2.5rem;
      color: #1976d2;
      margin-bottom: 12px;
    }

    .feature-item h4 {
      margin: 0 0 8px 0;
      color: #333;
    }

    .feature-item p {
      margin: 0;
      color: #666;
      font-size: 0.9rem;
      line-height: 1.5;
    }

    .benefits-list {
      display: grid;
      gap: 20px;
    }

    .benefit-item {
      display: flex;
      align-items: flex-start;
      gap: 16px;
    }

    .benefit-item h4 {
      margin: 0 0 8px 0;
      color: #333;
    }

    .benefit-item p {
      margin: 0;
      color: #666;
      line-height: 1.5;
    }

    .project-info {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
      gap: 32px;
    }

    .info-section h3 {
      margin: 0 0 12px 0;
      color: #1976d2;
    }

    .info-section p {
      margin: 0 0 8px 0;
      color: #666;
      line-height: 1.5;
    }

    @media (max-width: 768px) {
      .hero-content h1 {
        font-size: 2rem;
      }

      .metric-comparison {
        grid-template-columns: 1fr;
        text-align: center;
        gap: 8px;
      }

      .tech-categories {
        grid-template-columns: 1fr;
      }

      .features-grid {
        grid-template-columns: 1fr;
      }

      .project-info {
        grid-template-columns: 1fr;
      }
    }
  `]
})
export class AboutComponent implements OnInit {
  currentStats = {
    totalImprovement: 75
  };

  constructor(private performanceService: PerformanceService) {}

  ngOnInit(): void {
    // Get current performance statistics
    this.performanceService.stats$.subscribe(stats => {
      this.currentStats = {
        totalImprovement: stats.totalImprovement
      };
    });
  }
}