import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatChipsModule } from '@angular/material/chips';
import { MatTooltipModule } from '@angular/material/tooltip';

import { Contact } from '@core/models/contact.model';

/**
 * Reusable contact card component with consistent styling
 * Used throughout the application for displaying contact information
 */
@Component({
  selector: 'app-contact-card',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatChipsModule,
    MatTooltipModule
  ],
  template: `
    <mat-card 
      class="contact-card"
      [class.compact]="layout === 'compact'"
      [class.detailed]="layout === 'detailed'"
      [class.clickable]="!disableNavigation"
      [routerLink]="!disableNavigation ? ['/contact', contact.id] : null">
      
      <!-- Contact Header -->
      <mat-card-header>
        <div mat-card-avatar class="contact-avatar" [style.background]="getAvatarColor()">
          <mat-icon>{{getContactIcon()}}</mat-icon>
        </div>
        <mat-card-title>{{contact.name}}</mat-card-title>
        <mat-card-subtitle *ngIf="contact.title">{{contact.title}}</mat-card-subtitle>
      </mat-card-header>

      <!-- Contact Content -->
      <mat-card-content>
        <!-- Organization Info -->
        <div class="organization-info" *ngIf="showOrganization && (contact.ministry || contact.organizationalUnit)">
          <div class="org-item" *ngIf="contact.ministry">
            <mat-icon class="org-icon">account_balance</mat-icon>
            <span class="org-text" [matTooltip]="contact.ministry.name">
              {{contact.ministry.name}}
            </span>
          </div>
          <div class="org-item" *ngIf="contact.organizationalUnit">
            <mat-icon class="org-icon">business</mat-icon>
            <span class="org-text" [matTooltip]="contact.organizationalUnit.name">
              {{contact.organizationalUnit.name}}
            </span>
          </div>
        </div>

        <!-- Contact Methods -->
        <div class="contact-methods" *ngIf="showContactMethods && (contact.email || contact.phone)">
          <div class="contact-method" *ngIf="contact.email">
            <mat-icon class="method-icon">email</mat-icon>
            <span class="method-text" [matTooltip]="contact.email">{{contact.email}}</span>
          </div>
          <div class="contact-method" *ngIf="contact.phone">
            <mat-icon class="method-icon">phone</mat-icon>
            <span class="method-text" [matTooltip]="contact.phone">{{contact.phone}}</span>
          </div>
        </div>

        <!-- Tags/Chips -->
        <div class="contact-tags" *ngIf="showTags && contact.organizationalUnit?.unitType">
          <mat-chip-listbox>
            <mat-chip-option disabled>
              {{contact.organizationalUnit.unitType | titlecase}}
            </mat-chip-option>
          </mat-chip-listbox>
        </div>

        <!-- Additional Info for detailed layout -->
        <div class="additional-info" *ngIf="layout === 'detailed'">
          <div class="info-row" *ngIf="contact.updatedAt">
            <mat-icon>update</mat-icon>
            <span>Updated {{contact.updatedAt | date:'short'}}</span>
          </div>
        </div>
      </mat-card-content>

      <!-- Contact Actions -->
      <mat-card-actions *ngIf="showActions">
        <button 
          mat-button 
          color="primary" 
          *ngIf="!disableNavigation"
          [routerLink]="['/contact', contact.id]"
          (click)="$event.stopPropagation()">
          <mat-icon>visibility</mat-icon>
          View Details
        </button>
        <button 
          mat-button 
          *ngIf="contact.email && showQuickActions"
          (click)="onEmailClick($event)">
          <mat-icon>email</mat-icon>
          Email
        </button>
        <button 
          mat-button 
          *ngIf="contact.phone && showQuickActions"
          (click)="onPhoneClick($event)">
          <mat-icon>phone</mat-icon>
          Call
        </button>
      </mat-card-actions>
    </mat-card>
  `,
  styles: [`
    .contact-card {
      transition: transform 0.2s ease, box-shadow 0.2s ease;
      border-radius: 12px;
      overflow: hidden;
    }

    .contact-card.clickable {
      cursor: pointer;
    }

    .contact-card.clickable:hover {
      transform: translateY(-4px);
      box-shadow: 0 8px 24px rgba(0,0,0,0.15);
    }

    .contact-card.compact {
      max-width: 300px;
    }

    .contact-card.detailed {
      max-width: 400px;
    }

    .contact-avatar {
      color: white;
      font-weight: 500;
    }

    .organization-info {
      margin: 12px 0;
    }

    .org-item {
      display: flex;
      align-items: center;
      gap: 8px;
      margin-bottom: 8px;
      font-size: 0.9rem;
      color: #666;
    }

    .org-icon {
      font-size: 16px;
      width: 16px;
      height: 16px;
      color: #999;
    }

    .org-text {
      flex: 1;
      white-space: nowrap;
      overflow: hidden;
      text-overflow: ellipsis;
    }

    .contact-methods {
      margin: 12px 0;
    }

    .contact-method {
      display: flex;
      align-items: center;
      gap: 8px;
      margin-bottom: 6px;
      font-size: 0.85rem;
      color: #555;
    }

    .method-icon {
      font-size: 14px;
      width: 14px;
      height: 14px;
      color: #1976d2;
    }

    .method-text {
      flex: 1;
      white-space: nowrap;
      overflow: hidden;
      text-overflow: ellipsis;
    }

    .contact-tags {
      margin: 12px 0;
    }

    .contact-tags mat-chip-option {
      font-size: 0.75rem;
      height: 24px;
      background: #e3f2fd;
      color: #1976d2;
    }

    .additional-info {
      margin-top: 12px;
      padding-top: 12px;
      border-top: 1px solid #f0f0f0;
    }

    .info-row {
      display: flex;
      align-items: center;
      gap: 8px;
      font-size: 0.8rem;
      color: #999;
    }

    .info-row mat-icon {
      font-size: 14px;
      width: 14px;
      height: 14px;
    }

    mat-card-actions {
      padding: 8px 16px;
    }

    mat-card-actions button {
      margin-right: 8px;
    }

    /* Responsive adjustments */
    @media (max-width: 768px) {
      .contact-card {
        margin-bottom: 16px;
      }

      .org-text, .method-text {
        font-size: 0.8rem;
      }

      mat-card-actions {
        flex-direction: column;
        gap: 8px;
      }

      mat-card-actions button {
        width: 100%;
        margin: 0;
      }
    }
  `]
})
export class ContactCardComponent {
  @Input() contact!: Contact;
  @Input() layout: 'compact' | 'detailed' | 'standard' = 'standard';
  @Input() showOrganization = true;
  @Input() showContactMethods = true;
  @Input() showTags = true;
  @Input() showActions = true;
  @Input() showQuickActions = false;
  @Input() disableNavigation = false;

  @Output() emailClick = new EventEmitter<string>();
  @Output() phoneClick = new EventEmitter<string>();

  /**
   * Get avatar background color based on contact name
   */
  getAvatarColor(): string {
    if (!this.contact.name) return '#1976d2';
    
    const colors = [
      '#1976d2', // Blue
      '#388e3c', // Green
      '#f57c00', // Orange
      '#7b1fa2', // Purple
      '#d32f2f', // Red
      '#0097a7', // Cyan
      '#5d4037', // Brown
      '#455a64'  // Blue Grey
    ];
    
    const hash = this.contact.name.split('').reduce((acc, char) => {
      return char.charCodeAt(0) + ((acc << 5) - acc);
    }, 0);
    
    return colors[Math.abs(hash) % colors.length];
  }

  /**
   * Get appropriate icon based on contact role/position
   */
  getContactIcon(): string {
    if (!this.contact.title) return 'person';
    
    const title = this.contact.title.toLowerCase();
    
    if (title.includes('minister') && !title.includes('deputy')) {
      return 'person';
    }
    if (title.includes('deputy')) {
      return 'supervisor_account';
    }
    if (title.includes('director')) {
      return 'business_center';
    }
    if (title.includes('manager')) {
      return 'manage_accounts';
    }
    if (title.includes('spokesperson') || title.includes('communications')) {
      return 'campaign';
    }
    if (title.includes('assistant')) {
      return 'support_agent';
    }
    
    return 'person';
  }

  /**
   * Handle email button click
   */
  onEmailClick(event: Event): void {
    event.stopPropagation();
    if (this.contact.email) {
      this.emailClick.emit(this.contact.email);
      window.location.href = `mailto:${this.contact.email}`;
    }
  }

  /**
   * Handle phone button click
   */
  onPhoneClick(event: Event): void {
    event.stopPropagation();
    if (this.contact.phone) {
      this.phoneClick.emit(this.contact.phone);
      window.location.href = `tel:${this.contact.phone}`;
    }
  }
}