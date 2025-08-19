import { ApplicationConfig, importProvidersFrom } from '@angular/core';
import { provideRouter, withPreloading, PreloadAllModules } from '@angular/router';
import { provideHttpClient, withInterceptorsFromDi, HTTP_INTERCEPTORS } from '@angular/common/http';
import { provideAnimations } from '@angular/platform-browser/animations';
import { provideServiceWorker } from '@angular/service-worker';

import { routes } from './app.routes';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { CacheInterceptor } from './core/interceptors/cache.interceptor';
import { LoadingInterceptor } from './core/interceptors/loading.interceptor';

export const appConfig: ApplicationConfig = {
  providers: [
    // Router with preloading for performance
    provideRouter(routes, withPreloading(PreloadAllModules)),
    
    // HTTP client with interceptors
    provideHttpClient(withInterceptorsFromDi()),
    
    // HTTP Interceptors for performance optimization
    {
      provide: HTTP_INTERCEPTORS,
      useClass: CacheInterceptor,
      multi: true
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: LoadingInterceptor,
      multi: true
    },
    
    // Animations
    provideAnimations(),
    
    // Service Worker disabled for demo
    // provideServiceWorker('ngsw-worker.js', {
    //   enabled: !isDevMode(),
    //   registrationStrategy: 'registerWhenStable:30000'
    // }),
    
    // Material modules
    importProvidersFrom(MatSnackBarModule)
  ]
};

function isDevMode(): boolean {
  return typeof window !== 'undefined' && 
         (window.location.hostname === 'localhost' || 
          window.location.hostname === '127.0.0.1');
}