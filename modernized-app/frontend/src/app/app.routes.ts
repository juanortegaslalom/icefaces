import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: '/directory',
    pathMatch: 'full'
  },
  {
    path: 'directory',
    loadComponent: () => import('./features/directory/directory.component').then(m => m.DirectoryComponent),
    title: 'Alberta Staff Directory'
  },
  {
    path: 'search',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Search Staff Directory'
  },
  {
    path: 'contact/:id',
    loadComponent: () => import('./features/contact-detail/contact-detail.component').then(m => m.ContactDetailComponent),
    title: 'Contact Details'
  },
  {
    path: 'ministries',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Government Ministries'
  },
  {
    path: 'ministry/:id',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Ministry Details'
  },
  {
    path: 'organizational-units/:id',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Organizational Unit'
  },
  {
    path: 'ministers',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Government Ministers'
  },
  {
    path: 'deputy-ministers',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Deputy Ministers'
  },
  {
    path: 'spokespersons',
    loadComponent: () => import('./features/search/search.component').then(m => m.SearchComponent),
    title: 'Government Spokespersons'
  },
  {
    path: 'about',
    loadComponent: () => import('./features/about/about.component').then(m => m.AboutComponent),
    title: 'About This Application'
  },
  {
    path: '**',
    loadComponent: () => import('./shared/components/not-found/not-found.component').then(m => m.NotFoundComponent),
    title: 'Page Not Found'
  }
];