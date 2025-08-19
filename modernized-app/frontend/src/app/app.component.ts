import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterModule } from '@angular/router';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map, shareReplay } from 'rxjs/operators';

/**
 * Root component for Alberta Staff Directory Angular application
 * Features responsive navigation and modern Material Design UI
 */
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    RouterModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatSidenavModule,
    MatListModule
  ],
  template: `
    <div class="app-container">
      <!-- Alberta Government Header -->
      <header class="alberta-header">
        <div class="container">
          <div class="alberta-logo">Alberta</div>
          <div class="alberta-title">Government Staff Directory</div>
          <div class="alberta-subtitle">Modern, fast, and accessible staff directory</div>
        </div>
      </header>

      <!-- Navigation -->
      <mat-sidenav-container class="sidenav-container">
        <mat-sidenav #drawer class="sidenav" fixedInViewport
                    [attr.role]="(isHandset$ | async) ? 'dialog' : 'navigation'"
                    [mode]="(isHandset$ | async) ? 'over' : 'side'"
                    [opened]="(isHandset$ | async) === false">
          <mat-toolbar>Menu</mat-toolbar>
          <mat-nav-list>
            <a mat-list-item routerLink="/directory" routerLinkActive="active">
              <mat-icon>home</mat-icon>
              <span>Directory Home</span>
            </a>
            <a mat-list-item routerLink="/search" routerLinkActive="active">
              <mat-icon>search</mat-icon>
              <span>Advanced Search</span>
            </a>
            <a mat-list-item routerLink="/ministries" routerLinkActive="active">
              <mat-icon>account_balance</mat-icon>
              <span>Ministries</span>
            </a>
            <a mat-list-item routerLink="/ministers" routerLinkActive="active">
              <mat-icon>person</mat-icon>
              <span>Ministers</span>
            </a>
            <a mat-list-item routerLink="/deputy-ministers" routerLinkActive="active">
              <mat-icon>supervisor_account</mat-icon>
              <span>Deputy Ministers</span>
            </a>
            <a mat-list-item routerLink="/spokespersons" routerLinkActive="active">
              <mat-icon>campaign</mat-icon>
              <span>Spokespersons</span>
            </a>
            <mat-divider></mat-divider>
            <a mat-list-item routerLink="/about" routerLinkActive="active">
              <mat-icon>info</mat-icon>
              <span>About</span>
            </a>
          </mat-nav-list>
        </mat-sidenav>
        
        <mat-sidenav-content>
          <!-- Top Toolbar -->
          <mat-toolbar color="primary" class="main-toolbar">
            <button
              type="button"
              aria-label="Toggle sidenav"
              mat-icon-button
              (click)="drawer.toggle()"
              *ngIf="isHandset$ | async">
              <mat-icon aria-label="Side nav toggle icon">menu</mat-icon>
            </button>
            <span class="toolbar-title">Alberta Staff Directory</span>
            <span class="spacer"></span>
            <button mat-icon-button routerLink="/search" aria-label="Search">
              <mat-icon>search</mat-icon>
            </button>
          </mat-toolbar>
          
          <!-- Main Content -->
          <main class="main-content">
            <router-outlet></router-outlet>
          </main>
          
          <!-- Footer -->
          <footer class="footer">
            <div class="container">
              <p>&copy; {{currentYear}} Government of Alberta. All rights reserved.</p>
              <p>Modern Angular application showcasing enhanced performance and user experience.</p>
            </div>
          </footer>
        </mat-sidenav-content>
      </mat-sidenav-container>
    </div>
  `,
  styles: [`
    .app-container {
      height: 100vh;
      display: flex;
      flex-direction: column;
    }

    .container {
      max-width: 1200px;
      margin: 0 auto;
      padding: 0 16px;
    }

    .sidenav-container {
      flex: 1;
    }

    .sidenav {
      width: 250px;
    }

    .sidenav .mat-toolbar {
      background: inherit;
    }

    .main-toolbar {
      position: sticky;
      top: 0;
      z-index: 1000;
    }

    .toolbar-title {
      font-weight: 500;
    }

    .spacer {
      flex: 1 1 auto;
    }

    .main-content {
      min-height: calc(100vh - 64px - 60px); /* Account for toolbar and footer */
      padding: 16px;
    }

    .footer {
      background: #f5f5f5;
      padding: 16px 0;
      border-top: 1px solid #e0e0e0;
      text-align: center;
      color: #666;
      font-size: 14px;
    }

    .footer p {
      margin: 4px 0;
    }

    mat-nav-list a.active {
      background-color: rgba(0, 0, 0, 0.04);
    }

    mat-nav-list mat-icon {
      margin-right: 16px;
      color: #666;
    }

    @media (max-width: 768px) {
      .main-content {
        padding: 8px;
      }
    }
  `]
})
export class AppComponent {
  title = 'Alberta Staff Directory';
  currentYear = new Date().getFullYear();

  isHandset$: Observable<boolean> = this.breakpointObserver.observe(Breakpoints.Handset)
    .pipe(
      map(result => result.matches),
      shareReplay()
    );

  constructor(private breakpointObserver: BreakpointObserver) {}
}