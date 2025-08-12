import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Car {
  id?: number;
  name: string;
  chassis: string;
  weight: number;
  acceleration: number;
  mpg: number;
  cost: number;
  formattedMpg?: string;
  formattedCost?: string;
  displayName?: string;
}

export interface CarStatistics {
  totalCars: number;
  averageMpg: number;
  averageCost: number;
  averageWeight: number;
  maxMpg: number;
  minCost: number;
  maxCost: number;
}

@Injectable({
  providedIn: 'root'
})
export class CarService {
  private baseUrl = 'http://localhost:8081/api/v1/cars';

  constructor(private http: HttpClient) {}

  getAllCars(): Observable<Car[]> {
    return this.http.get<Car[]>(this.baseUrl);
  }

  getCarById(id: number): Observable<Car> {
    return this.http.get<Car>(`${this.baseUrl}/${id}`);
  }

  createCar(car: Car): Observable<Car> {
    return this.http.post<Car>(this.baseUrl, car);
  }

  updateCar(id: number, car: Car): Observable<Car> {
    return this.http.put<Car>(`${this.baseUrl}/${id}`, car);
  }

  deleteCar(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }

  searchCarsByName(name: string): Observable<Car[]> {
    const params = new HttpParams().set('name', name);
    return this.http.get<Car[]>(`${this.baseUrl}/search/name`, { params });
  }

  getCarsByChassis(chassis: string): Observable<Car[]> {
    const params = new HttpParams().set('chassis', chassis);
    return this.http.get<Car[]>(`${this.baseUrl}/filter/chassis`, { params });
  }

  getCarsByWeightRange(minWeight: number, maxWeight: number): Observable<Car[]> {
    const params = new HttpParams()
      .set('minWeight', minWeight.toString())
      .set('maxWeight', maxWeight.toString());
    return this.http.get<Car[]>(`${this.baseUrl}/filter/weight`, { params });
  }

  getFuelEfficientCars(minMpg: number): Observable<Car[]> {
    const params = new HttpParams().set('minMpg', minMpg.toString());
    return this.http.get<Car[]>(`${this.baseUrl}/filter/fuel-efficient`, { params });
  }

  getCarsInBudgetRange(minCost: number, maxCost: number): Observable<Car[]> {
    const params = new HttpParams()
      .set('minCost', minCost.toString())
      .set('maxCost', maxCost.toString());
    return this.http.get<Car[]>(`${this.baseUrl}/filter/budget`, { params });
  }

  searchCarsAdvanced(chassis?: string, minMpg?: number, maxCost?: number): Observable<Car[]> {
    let params = new HttpParams();
    if (chassis) params = params.set('chassis', chassis);
    if (minMpg) params = params.set('minMpg', minMpg.toString());
    if (maxCost) params = params.set('maxCost', maxCost.toString());
    
    return this.http.get<Car[]>(`${this.baseUrl}/search/advanced`, { params });
  }

  getAvailableChassisTypes(): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}/chassis-types`);
  }

  getCarStatistics(): Observable<CarStatistics> {
    return this.http.get<CarStatistics>(`${this.baseUrl}/statistics`);
  }

  getMostFuelEfficientCars(limit: number = 5): Observable<Car[]> {
    const params = new HttpParams().set('limit', limit.toString());
    return this.http.get<Car[]>(`${this.baseUrl}/top-fuel-efficient`, { params });
  }
}