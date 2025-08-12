import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: '/dashboard',
    pathMatch: 'full'
  },
  {
    path: 'dashboard',
    loadComponent: () => import('./components/dashboard/dashboard.component').then(c => c.DashboardComponent)
  },
  {
    path: 'cars',
    loadComponent: () => import('./components/car-management/car-management-simple.component').then(c => c.CarManagementSimpleComponent)
  },
  {
    path: 'cities',
    loadComponent: () => import('./components/city-autocomplete/city-autocomplete.component').then(c => c.CityAutocompleteComponent)
  },
  {
    path: 'employees',
    loadComponent: () => import('./components/employee-management/employee-management.component').then(c => c.EmployeeManagementComponent)
  },
  {
    path: '**',
    redirectTo: '/dashboard'
  }
];
