import { Component, OnInit, OnDestroy, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatChipsModule } from '@angular/material/chips';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { MatDividerModule } from '@angular/material/divider';
import { MatTabsModule } from '@angular/material/tabs';
import { Subject, Observable, of, forkJoin } from 'rxjs';
import { takeUntil, catchError, switchMap, map } from 'rxjs/operators';

import { ApiService } from '@core/services/api.service';
import { Contact, OrganizationalUnit } from '@core/models/contact.model';

/**
 * Detailed view component for individual contacts
 * Shows comprehensive contact information with modern Material Design
 */
@Component({
  selector: 'app-contact-detail',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatChipsModule,
    MatProgressSpinnerModule,
    MatSnackBarModule,
    MatDividerModule,
    MatTabsModule
  ],
  template: `
    <div class="contact-detail-container" *ngIf="!isLoading">
      <!-- Back Navigation -->
      <div class="back-nav">
        <button mat-stroked-button (click)="goBack()">
          <mat-icon>arrow_back</mat-icon>
          Back to Directory
        </button>
      </div>

      <!-- Contact Header Card -->
      <mat-card class="contact-header-card" *ngIf="contact">
        <mat-card-content>
          <div class="contact-header">
            <div class="contact-avatar">
              <mat-icon>person</mat-icon>
            </div>
            <div class="contact-main-info">
              <h1 class="contact-name">{{contact.name}}</h1>
              <h2 class="contact-title" *ngIf="contact.title">{{contact.title}}</h2>
              <div class="contact-organization">
                <mat-chip-listbox *ngIf="contact.ministry">
                  <mat-chip-option 
                    [routerLink]="['/ministry', contact.ministry.id]"
                    class="ministry-chip">
                    <mat-icon>account_balance</mat-icon>
                    {{contact.ministry.name}}
                  </mat-chip-option>
                </mat-chip-listbox>
                <mat-chip-listbox *ngIf="contact.organizationalUnit">
                  <mat-chip-option 
                    [routerLink]="['/organizational-units', contact.organizationalUnit.id]"
                    class="unit-chip">
                    <mat-icon>business</mat-icon>
                    {{contact.organizationalUnit.name}}
                  </mat-chip-option>
                </mat-chip-listbox>
              </div>
            </div>
            <div class="contact-actions">
              <button mat-raised-button color="primary" *ngIf="contact.email" 
                      (click)="sendEmail(contact.email)">
                <mat-icon>email</mat-icon>
                Email
              </button>
              <button mat-stroked-button *ngIf="contact.phone" 
                      (click)="callPhone(contact.phone)">
                <mat-icon>phone</mat-icon>
                Call
              </button>
            </div>
          </div>
        </mat-card-content>
      </mat-card>

      <!-- Contact Details Tabs -->
      <mat-card class="contact-details-card" *ngIf="contact">
        <mat-tab-group>
          <!-- Contact Information Tab -->
          <mat-tab label="Contact Information">
            <div class="tab-content">
              <div class="info-grid">
                <div class="info-item" *ngIf="contact.email">
                  <mat-icon class="info-icon">email</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Email Address</div>
                    <div class="info-value">
                      <a [href]="'mailto:' + contact.email">{{contact.email}}</a>
                    </div>
                  </div>
                </div>

                <div class="info-item" *ngIf="contact.phone">
                  <mat-icon class="info-icon">phone</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Phone Number</div>
                    <div class="info-value">
                      <a [href]="'tel:' + contact.phone">{{contact.phone}}</a>
                    </div>
                  </div>
                </div>

                <div class="info-item" *ngIf="contact.title">
                  <mat-icon class="info-icon">work</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Position</div>
                    <div class="info-value">{{contact.title}}</div>
                  </div>
                </div>

                <div class="info-item" *ngIf="contact.ministry">
                  <mat-icon class="info-icon">account_balance</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Ministry</div>
                    <div class="info-value">
                      <a [routerLink]="['/ministry', contact.ministry.id]">
                        {{contact.ministry.name}}
                      </a>
                    </div>
                  </div>
                </div>

                <div class="info-item" *ngIf="contact.organizationalUnit">
                  <mat-icon class="info-icon">business</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Department/Unit</div>
                    <div class="info-value">
                      <a [routerLink]="['/organizational-units', contact.organizationalUnit.id]">
                        {{contact.organizationalUnit.name}}
                      </a>
                    </div>
                  </div>
                </div>

                <div class="info-item" *ngIf="contact.organizationalUnit?.unitType">
                  <mat-icon class="info-icon">category</mat-icon>
                  <div class="info-content">
                    <div class="info-label">Unit Type</div>
                    <div class="info-value">{{contact.organizationalUnit?.unitType | titlecase}}</div>
                  </div>
                </div>
              </div>
            </div>
          </mat-tab>

          <!-- Organizational Structure Tab -->
          <mat-tab label="Organizational Structure" *ngIf="contact.organizationalUnit">
            <div class="tab-content">
              <div class="org-structure">
                <h3>Department Hierarchy</h3>
                <div class="hierarchy-path" *ngIf="hierarchyPath.length > 0">
                  <div class="path-item" *ngFor="let unit of hierarchyPath; let last = last">
                    <a [routerLink]="['/organizational-units', unit.id]" class="path-link">
                      {{unit.name}}
                    </a>
                    <mat-icon *ngIf="!last" class="path-separator">chevron_right</mat-icon>
                  </div>
                </div>

                <!-- Child Units -->
                <div class="child-units" *ngIf="childUnits.length > 0">
                  <h4>Sub-departments</h4>
                  <div class="units-grid">
                    <mat-card 
                      *ngFor="let unit of childUnits" 
                      class="unit-card"
                      [routerLink]="['/organizational-units', unit.id]">
                      <mat-card-content>
                        <div class="unit-info">
                          <mat-icon>business</mat-icon>
                          <div>
                            <div class="unit-name">{{unit.name}}</div>
                            <div class="unit-type">{{unit.unitType | titlecase}}</div>
                            <div class="unit-stats" *ngIf="unit.totalContacts">
                              {{unit.totalContacts}} staff members
                            </div>
                          </div>
                        </div>
                      </mat-card-content>
                    </mat-card>
                  </div>
                </div>
              </div>
            </div>
          </mat-tab>

          <!-- Related Contacts Tab -->
          <mat-tab label="Related Contacts">
            <div class="tab-content">
              <div class="related-contacts">
                <!-- Same Ministry Contacts -->
                <div class="related-section" *ngIf="relatedContacts.sameMinistry.length > 0">
                  <h3>Other contacts in {{contact.ministry?.name}}</h3>
                  <div class="contacts-grid">
                    <mat-card 
                      *ngFor="let relatedContact of relatedContacts.sameMinistry" 
                      class="related-contact-card"
                      [routerLink]="['/contact', relatedContact.id]">
                      <mat-card-content>
                        <div class="related-contact">
                          <div class="contact-avatar-small">
                            <mat-icon>person</mat-icon>
                          </div>
                          <div class="contact-info">
                            <div class="contact-name">{{relatedContact.name}}</div>
                            <div class="contact-title">{{relatedContact.title}}</div>
                          </div>
                        </div>
                      </mat-card-content>
                    </mat-card>
                  </div>
                </div>

                <!-- Same Unit Contacts -->
                <div class="related-section" *ngIf="relatedContacts.sameUnit.length > 0">
                  <h3>Other contacts in {{contact.organizationalUnit?.name}}</h3>
                  <div class="contacts-grid">
                    <mat-card 
                      *ngFor="let relatedContact of relatedContacts.sameUnit" 
                      class="related-contact-card"
                      [routerLink]="['/contact', relatedContact.id]">
                      <mat-card-content>
                        <div class="related-contact">
                          <div class="contact-avatar-small">
                            <mat-icon>person</mat-icon>
                          </div>
                          <div class="contact-info">
                            <div class="contact-name">{{relatedContact.name}}</div>
                            <div class="contact-title">{{relatedContact.title}}</div>
                          </div>
                        </div>
                      </mat-card-content>
                    </mat-card>
                  </div>
                </div>
              </div>
            </div>
          </mat-tab>
        </mat-tab-group>
      </mat-card>
    </div>

    <!-- Loading State -->
    <div class="loading-container" *ngIf="isLoading">
      <mat-spinner diameter="50"></mat-spinner>
      <p>Loading contact details...</p>
    </div>

    <!-- Error State -->
    <div class="error-container" *ngIf="!isLoading && !contact">
      <mat-icon class="error-icon">error_outline</mat-icon>
      <h2>Contact Not Found</h2>
      <p>The contact you're looking for could not be found.</p>
      <button mat-raised-button color="primary" routerLink="/directory">
        Return to Directory
      </button>
    </div>
  `,
  styles: [`
    .contact-detail-container {
      max-width: 1000px;
      margin: 0 auto;
      padding: 16px;
    }

    .back-nav {
      margin-bottom: 24px;
    }

    .contact-header-card {
      margin-bottom: 24px;
    }

    .contact-header {
      display: flex;
      align-items: flex-start;
      gap: 24px;
    }

    .contact-avatar {
      width: 80px;
      height: 80px;
      border-radius: 50%;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      color: white;
      display: flex;
      align-items: center;
      justify-content: center;
      flex-shrink: 0;
    }

    .contact-avatar mat-icon {
      font-size: 40px;
      width: 40px;
      height: 40px;
    }

    .contact-main-info {
      flex: 1;
    }

    .contact-name {
      font-size: 2rem;
      font-weight: 400;
      margin: 0 0 8px 0;
      color: #333;
    }

    .contact-title {
      font-size: 1.3rem;
      font-weight: 300;
      margin: 0 0 16px 0;
      color: #666;
    }

    .contact-organization {
      display: flex;
      flex-wrap: wrap;
      gap: 8px;
    }

    .ministry-chip, .unit-chip {
      cursor: pointer;
      transition: transform 0.2s ease;
    }

    .ministry-chip:hover, .unit-chip:hover {
      transform: scale(1.05);
    }

    .contact-actions {
      display: flex;
      flex-direction: column;
      gap: 12px;
      flex-shrink: 0;
    }

    .contact-actions button {
      min-width: 120px;
    }

    .contact-details-card {
      margin-bottom: 24px;
    }

    .tab-content {
      padding: 24px;
    }

    .info-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
      gap: 24px;
    }

    .info-item {
      display: flex;
      align-items: flex-start;
      gap: 16px;
      padding: 16px;
      border: 1px solid #e0e0e0;
      border-radius: 8px;
    }

    .info-icon {
      color: #1976d2;
      margin-top: 4px;
    }

    .info-content {
      flex: 1;
    }

    .info-label {
      font-size: 0.9rem;
      color: #666;
      text-transform: uppercase;
      letter-spacing: 0.5px;
      margin-bottom: 4px;
    }

    .info-value {
      font-size: 1rem;
      color: #333;
      font-weight: 500;
    }

    .info-value a {
      color: #1976d2;
      text-decoration: none;
    }

    .info-value a:hover {
      text-decoration: underline;
    }

    .org-structure h3, .related-contacts h3 {
      margin: 0 0 16px 0;
      color: #333;
    }

    .hierarchy-path {
      display: flex;
      align-items: center;
      flex-wrap: wrap;
      gap: 8px;
      margin-bottom: 24px;
      padding: 16px;
      background: #f5f5f5;
      border-radius: 8px;
    }

    .path-item {
      display: flex;
      align-items: center;
      gap: 8px;
    }

    .path-link {
      color: #1976d2;
      text-decoration: none;
      font-weight: 500;
    }

    .path-link:hover {
      text-decoration: underline;
    }

    .path-separator {
      color: #999;
      font-size: 18px;
    }

    .child-units h4, .related-section h4 {
      margin: 24px 0 16px 0;
      color: #333;
    }

    .units-grid, .contacts-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
      gap: 16px;
    }

    .unit-card, .related-contact-card {
      cursor: pointer;
      transition: transform 0.2s ease;
    }

    .unit-card:hover, .related-contact-card:hover {
      transform: translateY(-2px);
    }

    .unit-info, .related-contact {
      display: flex;
      align-items: center;
      gap: 12px;
    }

    .unit-name, .contact-name {
      font-weight: 500;
      margin-bottom: 4px;
    }

    .unit-type, .contact-title {
      color: #666;
      font-size: 0.9rem;
      margin-bottom: 4px;
    }

    .unit-stats {
      color: #999;
      font-size: 0.8rem;
    }

    .contact-avatar-small {
      width: 40px;
      height: 40px;
      border-radius: 50%;
      background: #1976d2;
      color: white;
      display: flex;
      align-items: center;
      justify-content: center;
      flex-shrink: 0;
    }

    .contact-avatar-small mat-icon {
      font-size: 20px;
      width: 20px;
      height: 20px;
    }

    .related-section {
      margin-bottom: 32px;
    }

    .loading-container, .error-container {
      text-align: center;
      padding: 48px;
    }

    .loading-container p, .error-container p {
      margin-top: 16px;
      color: #666;
    }

    .error-icon {
      font-size: 64px;
      width: 64px;
      height: 64px;
      color: #f44336;
      margin-bottom: 16px;
    }

    @media (max-width: 768px) {
      .contact-header {
        flex-direction: column;
        text-align: center;
        gap: 16px;
      }

      .contact-actions {
        flex-direction: row;
        justify-content: center;
        width: 100%;
      }

      .info-grid {
        grid-template-columns: 1fr;
      }

      .hierarchy-path {
        flex-direction: column;
        align-items: flex-start;
      }

      .units-grid, .contacts-grid {
        grid-template-columns: 1fr;
      }
    }
  `]
})
export class ContactDetailComponent implements OnInit, OnDestroy {
  private destroy$ = new Subject<void>();
  private route = inject(ActivatedRoute);
  private router = inject(Router);

  contact: Contact | null = null;
  isLoading = true;
  hierarchyPath: OrganizationalUnit[] = [];
  childUnits: OrganizationalUnit[] = [];
  relatedContacts = {
    sameMinistry: [] as Contact[],
    sameUnit: [] as Contact[]
  };

  constructor(
    private apiService: ApiService,
    private snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {
    this.route.params.pipe(
      switchMap(params => {
        const contactId = parseInt(params['id']);
        if (isNaN(contactId)) {
          this.isLoading = false;
          return of(null);
        }
        return this.loadContactDetails(contactId);
      }),
      takeUntil(this.destroy$)
    ).subscribe();
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  private loadContactDetails(contactId: number): Observable<Contact | null> {
    return this.apiService.getContact(contactId).pipe(
      switchMap(contact => {
        this.contact = contact;
        
        // Load related data in parallel
        const relatedDataRequests: any = {};
        
        // Load organizational hierarchy if contact has organizational unit
        if (contact.organizationalUnitId) {
          relatedDataRequests.childUnits = this.apiService.getChildUnits(contact.organizationalUnitId);
        }
        
        // Load related contacts
        if (contact.ministryId) {
          relatedDataRequests.ministryContacts = this.apiService.getContactsByMinistry(contact.ministryId);
        }
        
        if (contact.organizationalUnitId) {
          relatedDataRequests.unitContacts = this.apiService.getContactsByUnit(contact.organizationalUnitId);
        }

        return forkJoin(relatedDataRequests).pipe(
          map((results: any) => {
            // Process child units
            if (results.childUnits) {
              this.childUnits = results.childUnits;
            }

            // Process related contacts
            if (results.ministryContacts) {
              this.relatedContacts.sameMinistry = results.ministryContacts
                .filter((c: Contact) => c.id !== contact.id)
                .slice(0, 6); // Limit to 6 contacts
            }

            if (results.unitContacts) {
              this.relatedContacts.sameUnit = results.unitContacts
                .filter((c: Contact) => c.id !== contact.id)
                .slice(0, 6); // Limit to 6 contacts
            }

            this.buildHierarchyPath();
            this.isLoading = false;
            return contact;
          })
        );
      }),
      catchError(error => {
        console.error('Error loading contact details:', error);
        this.snackBar.open('Failed to load contact details', 'Close', {
          duration: 3000,
          panelClass: ['error-snackbar']
        });
        this.isLoading = false;
        return of(null);
      })
    );
  }

  private buildHierarchyPath(): void {
    if (!this.contact?.organizationalUnit) {
      return;
    }

    // Build hierarchy path from organizational unit structure
    // This is a simplified version - in a real app you'd traverse the full hierarchy
    this.hierarchyPath = [];
    
    if (this.contact.organizationalUnit.parent) {
      this.hierarchyPath.push(this.contact.organizationalUnit.parent);
    }
    
    this.hierarchyPath.push(this.contact.organizationalUnit);
  }

  goBack(): void {
    this.router.navigate(['/directory']);
  }

  sendEmail(email: string): void {
    window.location.href = `mailto:${email}`;
  }

  callPhone(phone: string): void {
    window.location.href = `tel:${phone}`;
  }
}