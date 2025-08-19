import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap } from 'rxjs/operators';

/**
 * HTTP Cache Interceptor for performance optimization
 * Caches GET requests to reduce server load and improve response times
 */
@Injectable()
export class CacheInterceptor implements HttpInterceptor {
  private cache = new Map<string, { response: HttpResponse<any>, timestamp: number }>();
  private readonly CACHE_DURATION = 5 * 60 * 1000; // 5 minutes
  private readonly CACHE_SIZE_LIMIT = 100; // Maximum number of cached items

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<any> {
    // Only cache GET requests
    if (req.method !== 'GET') {
      return next.handle(req);
    }

    // Skip caching for certain endpoints
    if (this.shouldSkipCache(req.url)) {
      return next.handle(req);
    }

    const cacheKey = this.getCacheKey(req);
    const cachedItem = this.cache.get(cacheKey);

    // Return cached response if valid
    if (cachedItem && this.isCacheValid(cachedItem.timestamp)) {
      console.log(`Cache HIT for ${req.url}`);
      return of(cachedItem.response.clone());
    }

    // Handle cache miss
    console.log(`Cache MISS for ${req.url}`);
    return next.handle(req).pipe(
      tap(event => {
        if (event instanceof HttpResponse) {
          this.addToCache(cacheKey, event);
        }
      })
    );
  }

  private getCacheKey(req: HttpRequest<any>): string {
    return `${req.method}-${req.url}`;
  }

  private shouldSkipCache(url: string): boolean {
    const skipPatterns = [
      '/api/system/health',
      '/api/system/statistics',
      '/api/contacts/search' // Skip search caching to ensure fresh results
    ];
    
    return skipPatterns.some(pattern => url.includes(pattern));
  }

  private isCacheValid(timestamp: number): boolean {
    return (Date.now() - timestamp) < this.CACHE_DURATION;
  }

  private addToCache(key: string, response: HttpResponse<any>): void {
    // Implement LRU cache eviction
    if (this.cache.size >= this.CACHE_SIZE_LIMIT) {
      const oldestKey = this.cache.keys().next().value;
      this.cache.delete(oldestKey);
    }

    this.cache.set(key, {
      response: response.clone(),
      timestamp: Date.now()
    });
  }

  /**
   * Clear cache manually (useful for data updates)
   */
  public clearCache(): void {
    this.cache.clear();
    console.log('Cache cleared');
  }

  /**
   * Get cache statistics for monitoring
   */
  public getCacheStats(): { size: number, hitRate: number } {
    return {
      size: this.cache.size,
      hitRate: 0 // Would need to implement hit tracking for accurate rate
    };
  }
}