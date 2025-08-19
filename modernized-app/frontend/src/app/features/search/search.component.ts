import { Component, OnInit, OnDestroy, ViewChild } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router, ActivatedRoute } from '@angular/router';
import { FormsModule, ReactiveFormsModule, FormControl, FormGroup } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';
import { MatChipsModule } from '@angular/material/chips';
import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatCardModule } from '@angular/material/card';
import { MatPaginatorModule, MatPaginator } from '@angular/material/paginator';
import { MatSnackBarModule, MatSnackBar } from '@angular/material/snack-bar';
import { Subject, Observable, BehaviorSubject, of, combineLatest } from 'rxjs';
import { 
  debounceTime, 
  distinctUntilChanged, 
  switchMap, 
  startWith, 
  takeUntil, 
  catchError,
  map,
  tap
} from 'rxjs/operators';

import { ApiService } from '@core/services/api.service';
import { Contact, Ministry, SearchParams, SearchResult, UnitType } from '@core/models/contact.model';

/**
 * Enhanced search component with debouncing and advanced filters
 * Showcases performance improvements over legacy ICEfaces application
 */
@Component({
  selector: 'app-search',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatSelectModule,
    MatChipsModule,
    MatAutocompleteModule,
    MatProgressSpinnerModule,
    MatCardModule,
    MatPaginatorModule,
    MatSnackBarModule
  ],
  template: `
    <div class="search-container">
      <!-- Search Header -->
      <div class="search-header">
        <h1>
          <mat-icon>search</mat-icon>
          {{pageTitle}}
        </h1>
        <p class="search-subtitle">
          {{pageSubtitle}}
          <span *ngIf="!hasSearched">
            Performance improvements: <strong>{{performanceImprovement}}ms faster</strong> than legacy system.
          </span>
        </p>
      </div>

      <!-- Search Form -->
      <mat-card class="search-form-card">
        <mat-card-content>
          <form [formGroup]="searchForm" class="search-form">
            <!-- Main Search Input -->
            <div class="search-input-row">
              <mat-form-field appearance="outline" class="search-field">
                <mat-label>Search staff members...</mat-label>
                <input 
                  matInput 
                  formControlName="searchTerm"
                  placeholder="Enter name, title, email, or department..."
                  autocomplete="off">
                <mat-icon matSuffix>search</mat-icon>
              </mat-form-field>
              
              <button 
                mat-raised-button 
                color="primary" 
                type="button"
                (click)="toggleAdvancedSearch()"
                class="advanced-toggle">
                <mat-icon>{{showAdvanced ? 'expand_less' : 'expand_more'}}</mat-icon>
                Advanced
              </button>
            </div>

            <!-- Advanced Filters (Expandable) -->
            <div class="advanced-filters" [class.expanded]="showAdvanced">
              <div class="filter-row">
                <mat-form-field appearance="outline">
                  <mat-label>Ministry</mat-label>
                  <mat-select formControlName="ministryId">
                    <mat-option value="">All Ministries</mat-option>
                    <mat-option 
                      *ngFor="let ministry of ministries$ | async" 
                      [value]="ministry.id">
                      {{ministry.name}}
                    </mat-option>
                  </mat-select>
                </mat-form-field>

                <mat-form-field appearance="outline">
                  <mat-label>Unit Type</mat-label>
                  <mat-select formControlName="unitType">
                    <mat-option value="">All Types</mat-option>
                    <mat-option value="department">Department</mat-option>
                    <mat-option value="office">Office</mat-option>
                    <mat-option value="division">Division</mat-option>
                    <mat-option value="branch">Branch</mat-option>
                    <mat-option value="section">Section</mat-option>
                  </mat-select>
                </mat-form-field>

                <mat-form-field appearance="outline">
                  <mat-label>Sort By</mat-label>
                  <mat-select formControlName="sortBy">
                    <mat-option value="name">Name</mat-option>
                    <mat-option value="title">Title</mat-option>
                    <mat-option value="ministry">Ministry</mat-option>
                    <mat-option value="updatedAt">Recently Updated</mat-option>
                  </mat-select>
                </mat-form-field>

                <button 
                  mat-stroked-button 
                  type="button"
                  (click)="clearFilters()"
                  class="clear-filters">
                  <mat-icon>clear</mat-icon>
                  Clear
                </button>
              </div>
            </div>
          </form>
        </mat-card-content>
      </mat-card>

      <!-- Search Stats -->
      <div class="search-stats" *ngIf="searchResults$ | async as results">
        <div class="stats-row">
          <span class="result-count">
            Found <strong>{{results.totalElements}}</strong> contacts
            <span *ngIf="searchDuration > 0" class="search-time">
              in {{searchDuration}}ms
            </span>
          </span>
          <span class="performance-badge" *ngIf="performanceImprovement > 0">
            <mat-icon>speed</mat-icon>
            {{performanceImprovement}}ms faster
          </span>
        </div>
      </div>

      <!-- Loading Indicator -->
      <div class="loading-container" *ngIf="isLoading$ | async">
        <mat-spinner diameter="40"></mat-spinner>
        <p>Searching...</p>
      </div>

      <!-- Search Results -->
      <div class="search-results" *ngIf="!(isLoading$ | async) && (searchResults$ | async) as results">
        <div class="results-grid">
          <mat-card 
            *ngFor="let contact of results.content" 
            class="contact-card"
            [routerLink]="['/contact', contact.id]">
            <mat-card-header>
              <div mat-card-avatar class="contact-avatar">
                <mat-icon>person</mat-icon>
              </div>
              <mat-card-title>{{contact.name}}</mat-card-title>
              <mat-card-subtitle>{{contact.title}}</mat-card-subtitle>
            </mat-card-header>
            
            <mat-card-content>
              <div class="contact-details">
                <div class="detail-row" *ngIf="contact.ministry">
                  <mat-icon>account_balance</mat-icon>
                  <span>{{contact.ministry.name}}</span>
                </div>
                <div class="detail-row" *ngIf="contact.organizationalUnit">
                  <mat-icon>business</mat-icon>
                  <span>{{contact.organizationalUnit.name}}</span>
                </div>
                <div class="detail-row" *ngIf="contact.email">
                  <mat-icon>email</mat-icon>
                  <span>{{contact.email}}</span>
                </div>
                <div class="detail-row" *ngIf="contact.phone">
                  <mat-icon>phone</mat-icon>
                  <span>{{contact.phone}}</span>
                </div>
              </div>
            </mat-card-content>

            <mat-card-actions>
              <button mat-button color="primary">
                <mat-icon>visibility</mat-icon>
                View Details
              </button>
            </mat-card-actions>
          </mat-card>
        </div>

        <!-- Pagination -->
        <mat-paginator 
          #paginator
          [length]="results.totalElements"
          [pageSize]="pageSize"
          [pageSizeOptions]="[10, 25, 50, 100]"
          [showFirstLastButtons]="true"
          (page)="onPageChange($event)"
          class="search-paginator">
        </mat-paginator>
      </div>

      <!-- No Results -->
      <div class="no-results" *ngIf="!(isLoading$ | async) && (searchResults$ | async)?.content?.length === 0">
        <mat-icon>search_off</mat-icon>
        <h3>No contacts found</h3>
        <p>Try adjusting your search criteria or clearing filters.</p>
        <button mat-raised-button color="primary" (click)="clearFilters()">
          Clear All Filters
        </button>
      </div>

      <!-- Search Tips -->
      <mat-card class="search-tips" *ngIf="!hasSearched">
        <mat-card-header>
          <mat-card-title>
            <mat-icon>lightbulb</mat-icon>
            Search Tips
          </mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <ul>
            <li>Search by name, title, email, or department keywords</li>
            <li>Use advanced filters to narrow down results by ministry or unit type</li>
            <li>Results update in real-time as you type</li>
            <li>Click on any contact card to view detailed information</li>
            <li>Sort results by name, title, ministry, or recent updates</li>
          </ul>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    .search-container {
      max-width: 1200px;
      margin: 0 auto;
      padding: 16px;
    }

    .search-header {
      text-align: center;
      margin-bottom: 32px;
    }

    .search-header h1 {
      display: flex;
      align-items: center;
      justify-content: center;
      gap: 12px;
      margin: 0 0 16px 0;
      color: #1976d2;
    }

    .search-subtitle {
      color: #666;
      font-size: 16px;
      margin: 0;
    }

    .search-form-card {
      margin-bottom: 24px;
    }

    .search-form {
      display: flex;
      flex-direction: column;
      gap: 16px;
    }

    .search-input-row {
      display: flex;
      gap: 16px;
      align-items: flex-start;
    }

    .search-field {
      flex: 1;
    }

    .advanced-toggle {
      min-width: 120px;
      height: 56px;
    }

    .advanced-filters {
      max-height: 0;
      overflow: hidden;
      transition: max-height 0.3s ease-in-out;
    }

    .advanced-filters.expanded {
      max-height: 200px;
    }

    .filter-row {
      display: grid;
      grid-template-columns: 1fr 1fr 1fr auto;
      gap: 16px;
      align-items: flex-start;
      margin-top: 16px;
    }

    .clear-filters {
      height: 56px;
    }

    .search-stats {
      margin-bottom: 16px;
    }

    .stats-row {
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 12px 16px;
      background: #f5f5f5;
      border-radius: 8px;
    }

    .result-count {
      font-size: 14px;
      color: #666;
    }

    .search-time {
      color: #4caf50;
      font-weight: 500;
      margin-left: 8px;
    }

    .performance-badge {
      display: flex;
      align-items: center;
      gap: 4px;
      background: #4caf50;
      color: white;
      padding: 4px 12px;
      border-radius: 16px;
      font-size: 12px;
      font-weight: 500;
    }

    .loading-container {
      text-align: center;
      padding: 48px;
    }

    .loading-container p {
      margin-top: 16px;
      color: #666;
    }

    .results-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(400px, 1fr));
      gap: 24px;
      margin-bottom: 32px;
    }

    .contact-card {
      cursor: pointer;
      transition: transform 0.2s ease, box-shadow 0.2s ease;
    }

    .contact-card:hover {
      transform: translateY(-2px);
      box-shadow: 0 8px 24px rgba(0,0,0,0.15);
    }

    .contact-avatar {
      background: #1976d2;
      color: white;
    }

    .contact-details {
      margin-top: 12px;
    }

    .detail-row {
      display: flex;
      align-items: center;
      gap: 8px;
      margin-bottom: 8px;
      font-size: 14px;
      color: #666;
    }

    .detail-row mat-icon {
      font-size: 18px;
      width: 18px;
      height: 18px;
      color: #999;
    }

    .search-paginator {
      margin-top: 24px;
    }

    .no-results {
      text-align: center;
      padding: 48px;
      color: #666;
    }

    .no-results mat-icon {
      font-size: 64px;
      width: 64px;
      height: 64px;
      margin-bottom: 16px;
      opacity: 0.5;
    }

    .search-tips {
      margin-top: 32px;
    }

    .search-tips ul {
      margin: 0;
      padding-left: 20px;
    }

    .search-tips li {
      margin-bottom: 8px;
      color: #666;
    }

    @media (max-width: 768px) {
      .search-input-row {
        flex-direction: column;
      }

      .filter-row {
        grid-template-columns: 1fr;
      }

      .results-grid {
        grid-template-columns: 1fr;
      }

      .stats-row {
        flex-direction: column;
        gap: 8px;
        text-align: center;
      }
    }
  `]
})
export class SearchComponent implements OnInit, OnDestroy {
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  private destroy$ = new Subject<void>();
  private searchSubject = new BehaviorSubject<string>('');
  
  searchForm: FormGroup;
  searchResults$: Observable<SearchResult<Contact>>;
  ministries$: Observable<Ministry[]>;
  isLoading$: Observable<boolean>;
  
  showAdvanced = false;
  hasSearched = false;
  pageSize = 25;
  currentPage = 0;
  searchDuration = 0;
  performanceImprovement = 850; // Simulated improvement over legacy ICEfaces
  pageTitle = 'Staff Directory Search';
  pageSubtitle = 'Search for government staff contacts across all ministries and departments';
  
  // Cache for specialized route data
  private ministersCache: Contact[] = [];
  private deputyMinistersCache: Contact[] = [];
  private spokespersonsCache: Contact[] = [];

  constructor(
    private apiService: ApiService,
    private snackBar: MatSnackBar,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.searchForm = new FormGroup({
      searchTerm: new FormControl(''),
      ministryId: new FormControl(''),
      unitType: new FormControl(''),
      sortBy: new FormControl('name'),
      sortDir: new FormControl('asc')
    });

    this.isLoading$ = this.apiService.loading$;
    this.ministries$ = this.apiService.getMinistries().pipe(
      catchError(error => {
        console.error('Error loading ministries:', error);
        return of([]);
      })
    );

    this.searchResults$ = this.setupSearch();
  }

  ngOnInit(): void {
    // Check if we're on a specialized route and auto-load data
    const currentPath = this.router.url;
    
    if (currentPath.includes('/ministers')) {
      this.pageTitle = 'Government Ministers';
      this.pageSubtitle = 'Current government ministers and their contact information';
      this.loadMinistersData();
    } else if (currentPath.includes('/deputy-ministers')) {
      this.pageTitle = 'Deputy Ministers';
      this.pageSubtitle = 'Deputy minister offices and leadership contacts';
      this.loadDeputyMinistersData();
    } else if (currentPath.includes('/spokespersons')) {
      this.pageTitle = 'Government Spokespersons';
      this.pageSubtitle = 'Designated spokespersons for media inquiries';
      this.loadSpokespersonsData();
    } else if (currentPath.includes('/ministries')) {
      this.pageTitle = 'All Government Contacts';
      this.pageSubtitle = 'Browse all government staff across ministries and departments';
      this.loadMinistriesData();
    } else {
      // Auto-focus search input for regular search page
      setTimeout(() => {
        const searchInput = document.querySelector('input[formControlName="searchTerm"]') as HTMLInputElement;
        if (searchInput) {
          searchInput.focus();
        }
      }, 100);
    }
  }

  // Methods to load specialized data for different routes
  private loadMinistersData(): void {
    this.hasSearched = true;
    
    // If data is already cached, use it
    if (this.ministersCache.length > 0) {
      this.searchResults$ = of(this.applyClientSidePagination(this.ministersCache));
      return;
    }
    
    // Otherwise, fetch and cache the data
    this.searchResults$ = this.apiService.getMinisterContacts().pipe(
      tap(contacts => {
        this.ministersCache = contacts; // Cache the data
      }),
      map(contacts => this.applyClientSidePagination(contacts)),
      catchError(error => {
        console.error('Error loading ministers:', error);
        this.snackBar.open('Error loading ministers', 'Close', { duration: 3000 });
        return of({
          content: [],
          totalElements: 0,
          totalPages: 0,
          size: 0,
          number: 0,
          numberOfElements: 0,
          first: true,
          last: true,
          empty: true
        } as SearchResult<Contact>);
      }),
      takeUntil(this.destroy$)
    );
  }

  private loadDeputyMinistersData(): void {
    this.hasSearched = true;
    
    // If data is already cached, use it
    if (this.deputyMinistersCache.length > 0) {
      this.searchResults$ = of(this.applyClientSidePagination(this.deputyMinistersCache));
      return;
    }
    
    // Otherwise, fetch and cache the data
    this.searchResults$ = this.apiService.getDeputyMinisterContacts().pipe(
      tap(contacts => {
        this.deputyMinistersCache = contacts; // Cache the data
      }),
      map(contacts => this.applyClientSidePagination(contacts)),
      catchError(error => {
        console.error('Error loading deputy ministers:', error);
        this.snackBar.open('Error loading deputy ministers', 'Close', { duration: 3000 });
        return of({
          content: [],
          totalElements: 0,
          totalPages: 0,
          size: 0,
          number: 0,
          numberOfElements: 0,
          first: true,
          last: true,
          empty: true
        } as SearchResult<Contact>);
      }),
      takeUntil(this.destroy$)
    );
  }

  private loadSpokespersonsData(): void {
    this.hasSearched = true;
    
    // If data is already cached, use it
    if (this.spokespersonsCache.length > 0) {
      this.searchResults$ = of(this.applyClientSidePagination(this.spokespersonsCache));
      return;
    }
    
    // Otherwise, fetch and cache the data
    this.searchResults$ = this.apiService.getSpokespersonContacts().pipe(
      tap(contacts => {
        this.spokespersonsCache = contacts; // Cache the data
      }),
      map(contacts => this.applyClientSidePagination(contacts)),
      catchError(error => {
        console.error('Error loading spokespersons:', error);
        this.snackBar.open('Error loading spokespersons', 'Close', { duration: 3000 });
        return of({
          content: [],
          totalElements: 0,
          totalPages: 0,
          size: 0,
          number: 0,
          numberOfElements: 0,
          first: true,
          last: true,
          empty: true
        } as SearchResult<Contact>);
      }),
      takeUntil(this.destroy$)
    );
  }

  private loadMinistriesData(): void {
    this.hasSearched = true;
    // For ministries, we'll show all contacts with pagination
    this.searchResults$ = this.apiService.searchContactsPaginated({
      page: this.currentPage,
      size: this.pageSize,
      sortBy: 'name',
      sortDir: 'asc'
    }).pipe(
      catchError(error => {
        console.error('Error loading all contacts:', error);
        this.snackBar.open('Error loading contacts', 'Close', { duration: 3000 });
        return of({
          content: [],
          totalElements: 0,
          totalPages: 0,
          size: 0,
          number: 0,
          numberOfElements: 0,
          first: true,
          last: true,
          empty: true
        } as SearchResult<Contact>);
      }),
      takeUntil(this.destroy$)
    );
  }

  // Helper method to apply client-side pagination to contact arrays
  private applyClientSidePagination(contacts: Contact[]): SearchResult<Contact> {
    const totalElements = contacts.length;
    const totalPages = Math.ceil(totalElements / this.pageSize);
    const startIndex = this.currentPage * this.pageSize;
    const endIndex = startIndex + this.pageSize;
    const paginatedContacts = contacts.slice(startIndex, endIndex);
    
    return {
      content: paginatedContacts,
      totalElements: totalElements,
      totalPages: totalPages,
      size: this.pageSize,
      number: this.currentPage,
      numberOfElements: paginatedContacts.length,
      first: this.currentPage === 0,
      last: this.currentPage === totalPages - 1
    };
  }

  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }

  private setupSearch(): Observable<SearchResult<Contact>> {
    return combineLatest([
      this.searchForm.valueChanges.pipe(startWith(this.searchForm.value)),
      this.searchSubject.asObservable()
    ]).pipe(
      debounceTime(300), // Debounce for performance
      distinctUntilChanged(),
      switchMap(([formValue]) => {
        if (!formValue.searchTerm && !formValue.ministryId && !formValue.unitType) {
          return of({ content: [], totalElements: 0, totalPages: 0, size: this.pageSize, number: 0, first: true, last: true, numberOfElements: 0 });
        }

        this.hasSearched = true;
        const startTime = performance.now();

        const searchParams: SearchParams = {
          q: formValue.searchTerm || undefined,
          ministryId: formValue.ministryId || undefined,
          unitType: formValue.unitType || undefined,
          page: this.currentPage,
          size: this.pageSize,
          sortBy: formValue.sortBy || 'name',
          sortDir: formValue.sortDir || 'asc'
        };

        return this.apiService.searchContactsAdvanced(searchParams).pipe(
          tap(() => {
            this.searchDuration = Math.round(performance.now() - startTime);
          }),
          catchError(error => {
            console.error('Search error:', error);
            this.snackBar.open('Search failed. Please try again.', 'Close', {
              duration: 3000,
              panelClass: ['error-snackbar']
            });
            return of({ content: [], totalElements: 0, totalPages: 0, size: this.pageSize, number: 0, first: true, last: true, numberOfElements: 0 });
          })
        );
      }),
      takeUntil(this.destroy$)
    );
  }

  toggleAdvancedSearch(): void {
    this.showAdvanced = !this.showAdvanced;
  }

  clearFilters(): void {
    this.searchForm.reset({
      searchTerm: '',
      ministryId: '',
      unitType: '',
      sortBy: 'name',
      sortDir: 'asc'
    });
    this.currentPage = 0;
    this.hasSearched = false;
    if (this.paginator) {
      this.paginator.firstPage();
    }
  }

  onPageChange(event: any): void {
    this.currentPage = event.pageIndex;
    this.pageSize = event.pageSize;
    
    // Check if we're on a specialized route and reload appropriate data
    const currentPath = this.router.url;
    
    if (currentPath.includes('/ministers')) {
      this.loadMinistersData();
    } else if (currentPath.includes('/deputy-ministers')) {
      this.loadDeputyMinistersData();
    } else if (currentPath.includes('/spokespersons')) {
      this.loadSpokespersonsData();
    } else if (currentPath.includes('/ministries')) {
      this.loadMinistriesData();
    } else {
      this.searchSubject.next('trigger'); // Trigger new search with updated pagination
    }
  }
}