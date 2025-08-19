import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';

import { LoadingService } from '../services/loading.service';

/**
 * Loading Interceptor to manage global loading state
 * Shows loading indicators for HTTP requests automatically
 */
@Injectable()
export class LoadingInterceptor implements HttpInterceptor {
  private activeRequests = 0;

  constructor(private loadingService: LoadingService) {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    // Skip loading indicator for certain requests
    if (this.shouldSkipLoading(req.url)) {
      return next.handle(req);
    }

    // Start loading
    this.activeRequests++;
    this.loadingService.setLoading(true);

    return next.handle(req).pipe(
      finalize(() => {
        // Stop loading when request completes
        this.activeRequests--;
        if (this.activeRequests === 0) {
          this.loadingService.setLoading(false);
        }
      })
    );
  }

  private shouldSkipLoading(url: string): boolean {
    const skipPatterns = [
      '/api/system/health', // Health checks shouldn't show loading
      'assets/' // Static assets
    ];
    
    return skipPatterns.some(pattern => url.includes(pattern));
  }
}