import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError, BehaviorSubject } from 'rxjs';
import { catchError, retry, map, tap } from 'rxjs/operators';
import { 
  Contact, 
  Ministry, 
  OrganizationalUnit, 
  SearchResult, 
  SearchParams,
  SystemHealth 
} from '@core/models/contact.model';
import { PerformanceService } from './performance.service';

/**
 * Main API service for communicating with Spring Boot backend
 * Provides type-safe HTTP operations with error handling and caching
 */
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private readonly baseUrl = '/api';
  private loadingSubject = new BehaviorSubject<boolean>(false);
  
  // Loading state for UI components
  public loading$ = this.loadingSubject.asObservable();

  constructor(
    private http: HttpClient,
    private performanceService: PerformanceService
  ) {}

  // ========== CONTACT ENDPOINTS ==========

  /**
   * Search contacts with enhanced debouncing support
   */
  searchContacts(searchTerm: string): Observable<Contact[]> {
    const params = new HttpParams().set('q', searchTerm);
    const endTiming = this.performanceService.startTiming('Basic Contact Search', 'search');
    
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/search`, { params }).pipe(
      tap(() => endTiming())
    );
  }

  /**
   * Search contacts with pagination
   */
  searchContactsPaginated(searchParams: SearchParams): Observable<SearchResult<Contact>> {
    let params = new HttpParams();
    
    if (searchParams.q) params = params.set('q', searchParams.q);
    if (searchParams.page !== undefined) params = params.set('page', searchParams.page.toString());
    if (searchParams.size !== undefined) params = params.set('size', searchParams.size.toString());
    if (searchParams.sortBy) params = params.set('sortBy', searchParams.sortBy);
    if (searchParams.sortDir) params = params.set('sortDir', searchParams.sortDir);

    const endTiming = this.performanceService.startTiming('Paginated Contact Search', 'search');
    
    return this.executeRequest<SearchResult<Contact>>(`${this.baseUrl}/contacts/search/paginated`, { params }).pipe(
      tap(() => endTiming())
    );
  }

  /**
   * Advanced search with filters
   */
  searchContactsAdvanced(searchParams: SearchParams): Observable<SearchResult<Contact>> {
    let params = new HttpParams();
    
    if (searchParams.q) params = params.set('q', searchParams.q);
    if (searchParams.ministryId) params = params.set('ministryId', searchParams.ministryId.toString());
    if (searchParams.unitType) params = params.set('unitType', searchParams.unitType);
    if (searchParams.page !== undefined) params = params.set('page', searchParams.page.toString());
    if (searchParams.size !== undefined) params = params.set('size', searchParams.size.toString());

    return this.executeRequest<SearchResult<Contact>>(`${this.baseUrl}/contacts/search/advanced`, { params });
  }

  /**
   * Get contact by ID
   */
  getContact(id: number): Observable<Contact> {
    return this.executeRequest<Contact>(`${this.baseUrl}/contacts/${id}`);
  }

  /**
   * Get contacts by ministry
   */
  getContactsByMinistry(ministryId: number): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/ministry/${ministryId}`);
  }

  /**
   * Get contacts by organizational unit
   */
  getContactsByUnit(unitId: number): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/unit/${unitId}`);
  }

  // ========== SPECIALIZED CONTACT ENDPOINTS ==========

  /**
   * Get minister contacts
   */
  getMinisterContacts(): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/ministers`);
  }

  /**
   * Get deputy minister contacts
   */
  getDeputyMinisterContacts(): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/deputy-ministers`);
  }

  /**
   * Get spokesperson contacts
   */
  getSpokespersonContacts(): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/spokespersons`);
  }

  /**
   * Get administrative contacts
   */
  getAdministrativeContacts(): Observable<Contact[]> {
    return this.executeRequest<Contact[]>(`${this.baseUrl}/contacts/administrative`);
  }

  // ========== MINISTRY ENDPOINTS ==========

  /**
   * Get all ministries
   */
  getMinistries(): Observable<Ministry[]> {
    return this.executeRequest<Ministry[]>(`${this.baseUrl}/ministries`);
  }

  /**
   * Get ministry by ID
   */
  getMinistry(id: number): Observable<Ministry> {
    return this.executeRequest<Ministry>(`${this.baseUrl}/ministries/${id}`);
  }

  /**
   * Get ministry by name
   */
  getMinistryByName(name: string): Observable<Ministry> {
    return this.executeRequest<Ministry>(`${this.baseUrl}/ministries/name/${encodeURIComponent(name)}`);
  }

  /**
   * Search ministries
   */
  searchMinistries(searchTerm: string): Observable<Ministry[]> {
    const params = new HttpParams().set('q', searchTerm);
    return this.executeRequest<Ministry[]>(`${this.baseUrl}/ministries/search`, { params });
  }

  /**
   * Get ministries with organizational structure
   */
  getMinistriesWithStructure(): Observable<Ministry[]> {
    return this.executeRequest<Ministry[]>(`${this.baseUrl}/ministries/with-structure`);
  }

  // ========== ORGANIZATIONAL UNIT ENDPOINTS ==========

  /**
   * Get organizational unit by ID
   */
  getOrganizationalUnit(id: number): Observable<OrganizationalUnit> {
    return this.executeRequest<OrganizationalUnit>(`${this.baseUrl}/organizational-units/${id}`);
  }

  /**
   * Get root organizational units for ministry
   */
  getRootUnitsForMinistry(ministryId: number): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/ministry/${ministryId}/roots`);
  }

  /**
   * Get child organizational units
   */
  getChildUnits(parentId: number): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/${parentId}/children`);
  }

  /**
   * Get ministry hierarchy
   */
  getMinistryHierarchy(ministryId: number): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/ministry/${ministryId}/hierarchy`);
  }

  /**
   * Search organizational units
   */
  searchOrganizationalUnits(searchTerm: string): Observable<OrganizationalUnit[]> {
    const params = new HttpParams().set('q', searchTerm);
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/search`, { params });
  }

  // ========== SPECIALIZED ORGANIZATIONAL ENDPOINTS ==========

  /**
   * Get deputy minister offices
   */
  getDeputyMinisterOffices(): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/deputy-minister-offices`);
  }

  /**
   * Get spokesperson departments
   */
  getSpokespersonDepartments(): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/spokesperson-departments`);
  }

  /**
   * Get administrative departments
   */
  getAdministrativeDepartments(): Observable<OrganizationalUnit[]> {
    return this.executeRequest<OrganizationalUnit[]>(`${this.baseUrl}/organizational-units/administrative-departments`);
  }

  // ========== SYSTEM ENDPOINTS ==========

  /**
   * Health check
   */
  healthCheck(): Observable<SystemHealth> {
    return this.executeRequest<SystemHealth>(`${this.baseUrl}/system/health`);
  }

  /**
   * Get system statistics
   */
  getSystemStatistics(): Observable<{[key: string]: number}> {
    return this.executeRequest<{[key: string]: number}>(`${this.baseUrl}/system/statistics`);
  }

  /**
   * Verify data integrity
   */
  verifyDataIntegrity(): Observable<any> {
    return this.executeRequest<any>(`${this.baseUrl}/system/verify-integrity`);
  }

  /**
   * Get API information
   */
  getApiInfo(): Observable<any> {
    return this.executeRequest<any>(`${this.baseUrl}/system/info`);
  }

  // ========== PRIVATE HELPER METHODS ==========

  /**
   * Execute HTTP request with loading state and error handling
   */
  private executeRequest<T>(url: string, options?: any): Observable<T> {
    this.setLoading(true);
    
    return this.http.get<T>(url, options).pipe(
      retry(2), // Retry failed requests twice
      map(response => response as T),
      tap(() => this.setLoading(false)),
      catchError((error: HttpErrorResponse) => {
        this.setLoading(false);
        return this.handleError(error);
      })
    );
  }

  /**
   * Set loading state
   */
  private setLoading(loading: boolean): void {
    this.loadingSubject.next(loading);
  }

  /**
   * Handle HTTP errors
   */
  private handleError(error: HttpErrorResponse): Observable<never> {
    let errorMessage = 'An error occurred while processing your request.';
    
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      errorMessage = `Client Error: ${error.error.message}`;
    } else {
      // Server-side error
      switch (error.status) {
        case 404:
          errorMessage = 'The requested resource was not found.';
          break;
        case 500:
          errorMessage = 'Internal server error. Please try again later.';
          break;
        case 0:
          errorMessage = 'Unable to connect to the server. Please check your connection.';
          break;
        default:
          errorMessage = `Server Error: ${error.status} - ${error.message}`;
      }
    }

    console.error('API Error:', error);
    return throwError(() => new Error(errorMessage));
  }
}