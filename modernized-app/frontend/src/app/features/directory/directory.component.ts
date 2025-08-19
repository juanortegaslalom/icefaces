import { Component, OnInit, OnDestroy } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatChipsModule } from '@angular/material/chips';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { Subject, Observable, of, forkJoin } from 'rxjs';
import { takeUntil, catchError, map } from 'rxjs/operators';

import { ApiService } from '@core/services/api.service';
import { Contact, Ministry, SystemHealth } from '@core/models/contact.model';

interface QuickStats {
  totalContacts: number;
  totalMinistries: number;
  totalOrganizationalUnits: number;
  lastUpdated: string;
}

interface FeaturedSection {
  title: string;
  description: string;
  icon: string;
  route: string;
  color: string;
  contacts?: Contact[];
  count?: number;
}

/**
 * Main directory component - landing page for the staff directory
 * Showcases modern Angular performance and Material Design
 */
@Component({
  selector: 'app-directory',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatGridListModule,
    MatChipsModule,
    MatProgressSpinnerModule,
    MatSnackBarModule
  ],
  template: `
    <div class="directory-container">
      <!-- Hero Section -->
      <section class="hero-section">
        <div class="hero-content">
          <h1 class="hero-title">
            <mat-icon class="hero-icon">people</mat-icon>
            Alberta Government Staff Directory
          </h1>
          <p class="hero-subtitle">
            Modern, fast, and accessible government staff directory powered by Angular 17+ and Spring Boot.
            Experience <strong>dramatically improved performance</strong> over the legacy system.
          </p>
          <div class="hero-actions">
            <button mat-raised-button color="primary" size="large" routerLink="/search">
              <mat-icon>search</mat-icon>
              Start Searching
            </button>
            <button mat-stroked-button color="primary" routerLink="/ministries">
              <mat-icon>account_balance</mat-icon>
              Browse Ministries
            </button>
          </div>
        </div>
      </section>

      <!-- Quick Stats -->
      <section class="stats-section" *ngIf="quickStats$ | async as stats">
        <div class="stats-grid">
          <mat-card class="stat-card">
            <mat-card-content>
              <div class="stat-content">
                <mat-icon class="stat-icon">people</mat-icon>
                <div class="stat-info">
                  <div class="stat-number">{{stats.totalContacts | number}}</div>
                  <div class="stat-label">Staff Members</div>
                </div>
              </div>
            </mat-card-content>
          </mat-card>

          <mat-card class="stat-card">
            <mat-card-content>
              <div class="stat-content">
                <mat-icon class="stat-icon">account_balance</mat-icon>
                <div class="stat-info">
                  <div class="stat-number">{{stats.totalMinistries | number}}</div>
                  <div class="stat-label">Ministries</div>
                </div>
              </div>
            </mat-card-content>
          </mat-card>

          <mat-card class="stat-card">
            <mat-card-content>
              <div class="stat-content">
                <mat-icon class="stat-icon">business</mat-icon>
                <div class="stat-info">
                  <div class="stat-number">{{stats.totalOrganizationalUnits | number}}</div>
                  <div class="stat-label">Departments</div>
                </div>
              </div>
            </mat-card-content>
          </mat-card>

          <mat-card class="stat-card">
            <mat-card-content>
              <div class="stat-content">
                <mat-icon class="stat-icon">check_circle</mat-icon>
                <div class="stat-info">
                  <div class="stat-number">Online</div>
                  <div class="stat-label">System Status</div>
                </div>
              </div>
            </mat-card-content>
          </mat-card>
        </div>
      </section>

      <!-- Featured Sections -->
      <section class="featured-sections">
        <h2 class="section-title">Quick Access</h2>
        <div class="features-grid">
          <mat-card 
            *ngFor="let section of featuredSections" 
            class="feature-card"
            [routerLink]="section.route">
            <div class="feature-header" [style.background]="section.color">
              <mat-icon class="feature-icon">{{section.icon}}</mat-icon>
              <div class="feature-badge" *ngIf="section.count">
                {{section.count}}
              </div>
            </div>
            <mat-card-content>
              <mat-card-title>{{section.title}}</mat-card-title>
              <mat-card-subtitle>{{section.description}}</mat-card-subtitle>
              
              <!-- Preview contacts for some sections -->
              <div class="preview-contacts" *ngIf="section.contacts && section.contacts.length > 0">
                <div class="contact-preview" *ngFor="let contact of section.contacts.slice(0, 3)">
                  <mat-icon>person</mat-icon>
                  <span>{{contact.name}}</span>
                </div>
                <div class="more-indicator" *ngIf="section.contacts.length > 3">
                  +{{section.contacts.length - 3}} more
                </div>
              </div>
            </mat-card-content>
            <mat-card-actions>
              <button mat-button color="primary">
                <mat-icon>arrow_forward</mat-icon>
                View All
              </button>
            </mat-card-actions>
          </mat-card>
        </div>
      </section>


      <!-- Recent Activity -->
      <section class="recent-activity" *ngIf="recentContacts$ | async as recent">
        <h2 class="section-title">Recently Updated</h2>
        <div class="recent-contacts">
          <mat-card 
            *ngFor="let contact of recent" 
            class="recent-contact-card"
            [routerLink]="['/contact', contact.id]">
            <mat-card-content>
              <div class="recent-contact">
                <div class="contact-avatar">
                  <mat-icon>person</mat-icon>
                </div>
                <div class="contact-info">
                  <div class="contact-name">{{contact.name}}</div>
                  <div class="contact-title">{{contact.title}}</div>
                  <div class="contact-ministry" *ngIf="contact.ministry">
                    {{contact.ministry.name}}
                  </div>
                </div>
                <div class="contact-actions">
                  <mat-icon>arrow_forward_ios</mat-icon>
                </div>
              </div>
            </mat-card-content>
          </mat-card>
        </div>
      </section>

      <!-- Loading State -->
      <div class="loading-container" *ngIf="isLoading">
        <mat-spinner diameter="50"></mat-spinner>
        <p>Loading directory data...</p>
      </div>
    </div>
  `,
  styles: [`
    .directory-container {
      max-width: 1200px;
      margin: 0 auto;
      padding: 16px;
    }

    .hero-section {
      text-align: center;
      margin-bottom: 48px;
      padding: 48px 0;
      background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
      border-radius: 16px;
      margin-top: -16px;
      margin-left: -16px;
      margin-right: -16px;
      padding-left: 16px;
      padding-right: 16px;
    }

    .hero-content {
      max-width: 800px;
      margin: 0 auto;
    }

    .hero-title {
      display: flex;
      align-items: center;
      justify-content: center;
      gap: 16px;
      font-size: 2.5rem;
      font-weight: 300;
      margin: 0 0 24px 0;
      color: #1976d2;
    }

    .hero-icon {
      font-size: 3rem;
      width: 3rem;
      height: 3rem;
    }

    .hero-subtitle {
      font-size: 1.2rem;
      color: #666;
      margin: 0 0 32px 0;
      line-height: 1.6;
    }

    .hero-actions {
      display: flex;
      gap: 16px;
      justify-content: center;
      flex-wrap: wrap;
    }

    .hero-actions button {
      min-width: 160px;
      height: 48px;
    }

    .stats-section {
      margin-bottom: 48px;
    }

    .stats-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
      gap: 16px;
    }

    .stat-card {
      text-align: center;
    }

    .stat-content {
      display: flex;
      align-items: center;
      justify-content: center;
      gap: 16px;
    }

    .stat-icon {
      font-size: 2rem;
      width: 2rem;
      height: 2rem;
      color: #1976d2;
    }

    .stat-number {
      font-size: 2rem;
      font-weight: 700;
      color: #1976d2;
    }

    .stat-label {
      font-size: 0.9rem;
      color: #666;
      text-transform: uppercase;
      letter-spacing: 0.5px;
    }

    .featured-sections {
      margin-bottom: 48px;
    }

    .section-title {
      font-size: 1.8rem;
      font-weight: 400;
      margin: 0 0 24px 0;
      color: #333;
    }

    .features-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
      gap: 24px;
    }

    .feature-card {
      cursor: pointer;
      transition: transform 0.2s ease, box-shadow 0.2s ease;
      overflow: hidden;
    }

    .feature-card:hover {
      transform: translateY(-4px);
      box-shadow: 0 12px 32px rgba(0,0,0,0.15);
    }

    .feature-header {
      position: relative;
      padding: 24px;
      text-align: center;
      color: white;
    }

    .feature-icon {
      font-size: 3rem;
      width: 3rem;
      height: 3rem;
    }

    .feature-badge {
      position: absolute;
      top: 8px;
      right: 8px;
      background: rgba(255,255,255,0.9);
      color: #333;
      padding: 4px 8px;
      border-radius: 12px;
      font-size: 0.8rem;
      font-weight: 600;
    }

    .preview-contacts {
      margin-top: 16px;
      border-top: 1px solid #eee;
      padding-top: 16px;
    }

    .contact-preview {
      display: flex;
      align-items: center;
      gap: 8px;
      margin-bottom: 8px;
      font-size: 0.9rem;
      color: #666;
    }

    .contact-preview mat-icon {
      font-size: 16px;
      width: 16px;
      height: 16px;
    }

    .more-indicator {
      font-size: 0.8rem;
      color: #999;
      font-style: italic;
      margin-top: 8px;
    }


    .recent-activity {
      margin-bottom: 48px;
    }

    .recent-contacts {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
      gap: 16px;
    }

    .recent-contact-card {
      cursor: pointer;
      transition: transform 0.2s ease;
    }

    .recent-contact-card:hover {
      transform: translateY(-2px);
    }

    .recent-contact {
      display: flex;
      align-items: center;
      gap: 16px;
    }

    .contact-avatar {
      width: 48px;
      height: 48px;
      border-radius: 50%;
      background: #1976d2;
      color: white;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .contact-info {
      flex: 1;
    }

    .contact-name {
      font-weight: 500;
      font-size: 1rem;
      margin-bottom: 4px;
    }

    .contact-title {
      color: #666;
      font-size: 0.9rem;
      margin-bottom: 2px;
    }

    .contact-ministry {
      color: #999;
      font-size: 0.8rem;
    }

    .contact-actions {
      color: #ccc;
    }

    .loading-container {
      text-align: center;
      padding: 48px;
    }

    .loading-container p {
      margin-top: 16px;
      color: #666;
    }

    @media (max-width: 768px) {
      .hero-title {
        font-size: 2rem;
        flex-direction: column;
        gap: 8px;
      }

      .hero-actions {
        flex-direction: column;
        align-items: center;
      }

      .stats-grid {
        grid-template-columns: repeat(2, 1fr);
      }

      .features-grid {
        grid-template-columns: 1fr;
      }

      .performance-metrics {
        grid-template-columns: 1fr;
      }

      .recent-contacts {
        grid-template-columns: 1fr;
      }
    }
  `]
})
export class DirectoryComponent implements OnInit, OnDestroy {
  private destroy$ = new Subject<void>();

  quickStats$: Observable<QuickStats>;
  recentContacts$: Observable<Contact[]>;
  isLoading = true;

  featuredSections: FeaturedSection[] = [
    {
      title: 'Ministers',
      description: 'View current government ministers and their contact information',
      icon: 'person',
      route: '/ministers',
      color: 'linear-gradient(135deg, #667eea 0%, #764ba2 100%)',
      count: 0
    },
    {
      title: 'Deputy Ministers',
      description: 'Access deputy minister offices and leadership contacts',
      icon: 'supervisor_account',
      route: '/deputy-ministers',
      color: 'linear-gradient(135deg, #f093fb 0%, #f5576c 100%)',
      count: 0
    },
    {
      title: 'Spokespersons',
      description: 'Find designated spokespersons for media inquiries',
      icon: 'campaign',
      route: '/spokespersons',
      color: 'linear-gradient(135deg, #4facfe 0%, #00f2fe 100%)',
      count: 0
    },
    {
      title: 'All Ministries',
      description: 'Browse all government ministries and departments',
      icon: 'account_balance',
      route: '/ministries',
      color: 'linear-gradient(135deg, #43e97b 0%, #38f9d7 100%)',
      count: 0
    },
    {
      title: 'Advanced Search',
      description: 'Use powerful filters to find exactly who you need',
      icon: 'search',
      route: '/search',
      color: 'linear-gradient(135deg, #fa709a 0%, #fee140 100%)',
      count: 0
    },
    {
      title: 'Organization Chart',
      description: 'Explore hierarchical government structure',
      icon: 'account_tree',
      route: '/ministries',
      color: 'linear-gradient(135deg, #a8edea 0%, #fed6e3 100%)',
      count: 0
    }
  ];

  constructor(
    private apiService: ApiService,
    private snackBar: MatSnackBar
  ) {
    this.quickStats$ = this.loadQuickStats();
    this.recentContacts$ = this.loadRecentContacts();
  }

  ngOnInit(): void {
    this.loadFeaturedData();
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  private loadQuickStats(): Observable<QuickStats> {
    return this.apiService.getSystemStatistics().pipe(
      map(stats => ({
        totalContacts: stats['totalContacts'] || 0,
        totalMinistries: stats['totalMinistries'] || 0,
        totalOrganizationalUnits: stats['totalOrganizationalUnits'] || 0,
        lastUpdated: new Date().toISOString()
      })),
      catchError(error => {
        console.error('Error loading stats:', error);
        return of({
          totalContacts: 0,
          totalMinistries: 0,
          totalOrganizationalUnits: 0,
          lastUpdated: new Date().toISOString()
        });
      }),
      takeUntil(this.destroy$)
    );
  }

  private loadRecentContacts(): Observable<Contact[]> {
    return this.apiService.searchContactsPaginated({
      sortBy: 'updatedAt',
      sortDir: 'desc',
      size: 6
    }).pipe(
      map(result => result.content),
      catchError(error => {
        console.error('Error loading recent contacts:', error);
        return of([]);
      }),
      takeUntil(this.destroy$)
    );
  }

  private loadFeaturedData(): void {
    // Load counts for featured sections
    forkJoin({
      ministers: this.apiService.getMinisterContacts(),
      deputyMinisters: this.apiService.getDeputyMinisterContacts(),
      spokespersons: this.apiService.getSpokespersonContacts(),
      ministries: this.apiService.getMinistries()
    }).pipe(
      takeUntil(this.destroy$),
      catchError(error => {
        console.error('Error loading featured data:', error);
        this.snackBar.open('Some data could not be loaded', 'Close', {
          duration: 3000
        });
        return of({
          ministers: [],
          deputyMinisters: [],
          spokespersons: [],
          ministries: []
        });
      })
    ).subscribe(data => {
      // Update counts
      this.featuredSections[0].count = data.ministers.length;
      this.featuredSections[0].contacts = data.ministers.slice(0, 3);
      
      this.featuredSections[1].count = data.deputyMinisters.length;
      this.featuredSections[1].contacts = data.deputyMinisters.slice(0, 3);
      
      this.featuredSections[2].count = data.spokespersons.length;
      this.featuredSections[2].contacts = data.spokespersons.slice(0, 3);
      
      this.featuredSections[3].count = data.ministries.length;

      this.isLoading = false;
    });
  }
}