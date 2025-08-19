import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';

/**
 * 404 Not Found component with helpful navigation options
 */
@Component({
  selector: 'app-not-found',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule
  ],
  template: `
    <div class="not-found-container">
      <mat-card class="not-found-card">
        <mat-card-content>
          <div class="not-found-content">
            <mat-icon class="not-found-icon">search_off</mat-icon>
            <h1>404 - Page Not Found</h1>
            <p>The page you're looking for doesn't exist or has been moved.</p>
            
            <div class="suggestions">
              <h3>Here are some helpful links:</h3>
              <div class="suggestion-buttons">
                <button mat-raised-button color="primary" routerLink="/directory">
                  <mat-icon>home</mat-icon>
                  Directory Home
                </button>
                <button mat-stroked-button routerLink="/search">
                  <mat-icon>search</mat-icon>
                  Search Staff
                </button>
                <button mat-stroked-button routerLink="/ministries">
                  <mat-icon>account_balance</mat-icon>
                  Browse Ministries
                </button>
              </div>
            </div>
          </div>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    .not-found-container {
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 60vh;
      padding: 16px;
    }

    .not-found-card {
      max-width: 500px;
      width: 100%;
      text-align: center;
    }

    .not-found-content {
      padding: 32px 16px;
    }

    .not-found-icon {
      font-size: 72px;
      width: 72px;
      height: 72px;
      color: #ccc;
      margin-bottom: 24px;
    }

    h1 {
      font-size: 2rem;
      font-weight: 400;
      margin: 0 0 16px 0;
      color: #333;
    }

    p {
      font-size: 1.1rem;
      color: #666;
      margin: 0 0 32px 0;
      line-height: 1.5;
    }

    .suggestions h3 {
      font-size: 1.2rem;
      font-weight: 500;
      margin: 0 0 24px 0;
      color: #333;
    }

    .suggestion-buttons {
      display: flex;
      flex-direction: column;
      gap: 12px;
    }

    .suggestion-buttons button {
      min-height: 48px;
    }

    @media (min-width: 480px) {
      .suggestion-buttons {
        flex-direction: row;
        justify-content: center;
        flex-wrap: wrap;
      }
    }
  `]
})
export class NotFoundComponent {}