import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

/**
 * Global loading service for managing loading states across the application
 */
@Injectable({
  providedIn: 'root'
})
export class LoadingService {
  private loadingSubject = new BehaviorSubject<boolean>(false);
  private loadingCount = 0;

  public loading$: Observable<boolean> = this.loadingSubject.asObservable();

  /**
   * Set loading state
   */
  setLoading(loading: boolean): void {
    if (loading) {
      this.loadingCount++;
    } else {
      this.loadingCount = Math.max(0, this.loadingCount - 1);
    }

    this.loadingSubject.next(this.loadingCount > 0);
  }

  /**
   * Force loading state (ignores count)
   */
  forceLoading(loading: boolean): void {
    this.loadingCount = loading ? 1 : 0;
    this.loadingSubject.next(loading);
  }

  /**
   * Get current loading state
   */
  isLoading(): boolean {
    return this.loadingSubject.value;
  }
}