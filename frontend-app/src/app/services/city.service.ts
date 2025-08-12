import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface City {
  id?: number;
  name: string;
  country: string;
  latitude: number;
  longitude: number;
  altitude?: number;
  formattedCoordinates?: string;
  formattedAltitude?: string;
  autocompleteLabel?: string;
  autocompleteValue?: string;
  displayName?: string;
}

export interface CityStatistics {
  totalCities: number;
  totalCountries: number;
  averageLatitude: number;
  averageLongitude: number;
  averageAltitude: number;
}

@Injectable({
  providedIn: 'root'
})
export class CityService {
  private baseUrl = 'http://localhost:8081/api/v1/cities';

  constructor(private http: HttpClient) {}

  getAllCities(): Observable<City[]> {
    return this.http.get<City[]>(this.baseUrl);
  }

  getCityById(id: number): Observable<City> {
    return this.http.get<City>(`${this.baseUrl}/${id}`);
  }

  createCity(city: City): Observable<City> {
    return this.http.post<City>(this.baseUrl, city);
  }

  updateCity(id: number, city: City): Observable<City> {
    return this.http.put<City>(`${this.baseUrl}/${id}`, city);
  }

  deleteCity(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }

  autocompleteCities(query: string): Observable<City[]> {
    const params = new HttpParams().set('query', query);
    return this.http.get<City[]>(`${this.baseUrl}/autocomplete`, { params });
  }

  searchCitiesByName(name: string): Observable<City[]> {
    const params = new HttpParams().set('name', name);
    return this.http.get<City[]>(`${this.baseUrl}/search/name`, { params });
  }

  getCitiesByCountry(country: string): Observable<City[]> {
    return this.http.get<City[]>(`${this.baseUrl}/country/${country}`);
  }

  getCitiesByCountryOrdered(country: string): Observable<City[]> {
    return this.http.get<City[]>(`${this.baseUrl}/country/${country}/ordered`);
  }

  findCityByNameAndCountry(name: string, country: string): Observable<City> {
    const params = new HttpParams()
      .set('name', name)
      .set('country', country);
    return this.http.get<City>(`${this.baseUrl}/find`, { params });
  }

  getCitiesInBoundingBox(minLat: number, maxLat: number, minLon: number, maxLon: number): Observable<City[]> {
    const params = new HttpParams()
      .set('minLat', minLat.toString())
      .set('maxLat', maxLat.toString())
      .set('minLon', minLon.toString())
      .set('maxLon', maxLon.toString());
    return this.http.get<City[]>(`${this.baseUrl}/geo/bounding-box`, { params });
  }

  getCitiesNearPoint(latitude: number, longitude: number, radius: number): Observable<City[]> {
    const params = new HttpParams()
      .set('latitude', latitude.toString())
      .set('longitude', longitude.toString())
      .set('radius', radius.toString());
    return this.http.get<City[]>(`${this.baseUrl}/geo/near`, { params });
  }

  getAllCountries(): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}/countries`);
  }

  searchCitiesAdvanced(name?: string, country?: string): Observable<City[]> {
    let params = new HttpParams();
    if (name) params = params.set('name', name);
    if (country) params = params.set('country', country);
    
    return this.http.get<City[]>(`${this.baseUrl}/search/advanced`, { params });
  }

  getCityStatistics(): Observable<CityStatistics> {
    return this.http.get<CityStatistics>(`${this.baseUrl}/statistics`);
  }
}