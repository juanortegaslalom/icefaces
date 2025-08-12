import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule, FormControl } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { MatOptionModule } from '@angular/material/core';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatChipsModule } from '@angular/material/chips';
import { MatButtonModule } from '@angular/material/button';

import { Observable, of } from 'rxjs';
import { debounceTime, distinctUntilChanged, switchMap, catchError } from 'rxjs/operators';

import { City, CityService } from '../../services/city.service';

@Component({
  selector: 'app-city-autocomplete',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatAutocompleteModule,
    MatOptionModule,
    MatIconModule,
    MatCardModule,
    MatChipsModule,
    MatButtonModule
  ],
  template: `
    <mat-card class="autocomplete-card">
      <mat-card-header>
        <mat-card-title>City Autocomplete</mat-card-title>
        <mat-card-subtitle>Fast city search with real-time suggestions</mat-card-subtitle>
      </mat-card-header>

      <mat-card-content>
        <!-- Main Autocomplete Input -->
        <div class="search-container">
          <mat-form-field class="full-width" appearance="outline">
            <mat-label>Search for a city</mat-label>
            <input matInput
                   [formControl]="cityControl"
                   [matAutocomplete]="auto"
                   (input)="onInput($event)">
            <mat-icon matSuffix>search</mat-icon>
            
            <mat-autocomplete #auto="matAutocomplete" 
                             [displayWith]="displayFn"
                             (optionSelected)="onCitySelected($event)">
              <mat-option *ngFor="let city of filteredCities | async" 
                         [value]="city"
                         class="city-option">
                <div class="city-option-content">
                  <span class="city-name">{{city.name}}</span>
                  <span class="city-country">{{city.country}}</span>
                </div>
                <div class="city-coordinates">
                  <small>{{city.formattedCoordinates}}</small>
                </div>
              </mat-option>
              
              <mat-option *ngIf="(filteredCities | async)?.length === 0 && cityControl.value?.length >= 2" 
                         disabled>
                <em>No cities found matching "{{cityControl.value}}"</em>
              </mat-option>
            </mat-autocomplete>
          </mat-form-field>
          
          <button mat-raised-button color="primary" class="search-button" (click)="performSearch()">
            <mat-icon>search</mat-icon>
            Search
          </button>
        </div>

        <!-- Selected City Display -->
        <div *ngIf="selectedCity" class="selected-city-section">
          <h3>Selected City</h3>
          <div class="city-details">
            <mat-card class="city-detail-card">
              <mat-card-content>
                <div class="detail-row">
                  <span class="label">Name:</span>
                  <span class="value">{{selectedCity.name}}</span>
                </div>
                <div class="detail-row">
                  <span class="label">Country:</span>
                  <span class="value">{{selectedCity.country}}</span>
                </div>
                <div class="detail-row">
                  <span class="label">Coordinates:</span>
                  <span class="value">{{selectedCity.formattedCoordinates}}</span>
                </div>
                <div class="detail-row" *ngIf="selectedCity.altitude">
                  <span class="label">Altitude:</span>
                  <span class="value">{{selectedCity.formattedAltitude}}</span>
                </div>
              </mat-card-content>
            </mat-card>
            
            <div class="action-buttons">
              <button mat-raised-button color="primary" (click)="findNearbyCities()">
                <mat-icon>location_on</mat-icon>
                Find Nearby Cities
              </button>
              <button mat-raised-button color="accent" (click)="showOnMap()">
                <mat-icon>map</mat-icon>
                Show on Map
              </button>
              <button mat-button (click)="clearSelection()">
                <mat-icon>clear</mat-icon>
                Clear
              </button>
            </div>
          </div>
        </div>

        <!-- Recent Searches -->
        <div *ngIf="recentSearches.length > 0" class="recent-searches-section">
          <h3>Recent Searches</h3>
          <mat-chip-listbox class="recent-chips">
            <mat-chip-option *ngFor="let city of recentSearches; let i = index"
                           (click)="selectFromRecent(city)"
                           [removable]="true"
                           (removed)="removeFromRecent(i)">
              {{city.name}}, {{city.country}}
              <mat-icon matChipRemove>cancel</mat-icon>
            </mat-chip-option>
          </mat-chip-listbox>
        </div>

        <!-- Nearby Cities Display -->
        <div *ngIf="nearbyCities.length > 0" class="nearby-cities-section">
          <h3>Nearby Cities</h3>
          <div class="nearby-cities-grid">
            <mat-card *ngFor="let city of nearbyCities" 
                     class="nearby-city-card"
                     (click)="selectCity(city)">
              <mat-card-content>
                <div class="nearby-city-name">{{city.name}}</div>
                <div class="nearby-city-country">{{city.country}}</div>
                <div class="nearby-city-coords">{{city.formattedCoordinates}}</div>
              </mat-card-content>
            </mat-card>
          </div>
        </div>
      </mat-card-content>
    </mat-card>
  `,
  styles: [`
    .autocomplete-card {
      margin: 20px;
      max-width: 800px;
    }

    .search-container {
      display: flex;
      gap: 12px;
      align-items: flex-start;
      margin-bottom: 20px;
    }

    .full-width {
      flex: 1;
    }

    .search-button {
      margin-top: 0;
      height: 56px;
      min-width: 100px;
    }

    .city-option {
      height: auto !important;
      min-height: 48px;
      padding: 8px 16px;
    }

    .city-option-content {
      display: flex;
      justify-content: space-between;
      align-items: center;
      width: 100%;
    }

    .city-name {
      font-weight: 500;
      font-size: 1em;
    }

    .city-country {
      color: #666;
      font-size: 0.9em;
    }

    .city-coordinates {
      font-size: 0.8em;
      color: #999;
      margin-top: 4px;
    }

    .selected-city-section {
      margin-top: 24px;
    }

    .city-details {
      margin-top: 16px;
    }

    .city-detail-card {
      margin-bottom: 16px;
      background: linear-gradient(135deg, #e3f2fd 0%, #bbdefb 100%);
    }

    .detail-row {
      display: flex;
      justify-content: space-between;
      margin-bottom: 8px;
    }

    .detail-row:last-child {
      margin-bottom: 0;
    }

    .label {
      font-weight: 500;
      color: #555;
    }

    .value {
      color: #333;
    }

    .action-buttons {
      display: flex;
      gap: 12px;
      flex-wrap: wrap;
    }

    .recent-searches-section {
      margin-top: 24px;
    }

    .recent-chips {
      margin-top: 8px;
    }

    .recent-chips mat-chip-option {
      margin: 4px;
    }

    .nearby-cities-section {
      margin-top: 24px;
    }

    .nearby-cities-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
      gap: 12px;
      margin-top: 16px;
    }

    .nearby-city-card {
      cursor: pointer;
      transition: transform 0.2s, box-shadow 0.2s;
    }

    .nearby-city-card:hover {
      transform: translateY(-2px);
      box-shadow: 0 4px 8px rgba(0,0,0,0.2);
    }

    .nearby-city-name {
      font-weight: 500;
      margin-bottom: 4px;
    }

    .nearby-city-country {
      color: #666;
      font-size: 0.9em;
      margin-bottom: 4px;
    }

    .nearby-city-coords {
      font-size: 0.8em;
      color: #999;
    }

    h3 {
      margin-bottom: 16px;
      color: #333;
      font-weight: 500;
    }

    mat-card-header {
      margin-bottom: 16px;
    }
  `]
})
export class CityAutocompleteComponent implements OnInit {
  @Input() placeholder: string = 'Search for a city...';
  @Input() required: boolean = false;
  @Output() citySelected = new EventEmitter<City>();

  cityControl = new FormControl();
  filteredCities: Observable<City[]>;
  selectedCity: City | null = null;
  recentSearches: City[] = [];
  nearbyCities: City[] = [];

  constructor(private cityService: CityService) {
    // Set up the autocomplete observable
    this.filteredCities = this.cityControl.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap(value => {
        if (typeof value === 'string' && value.length >= 2) {
          return this.cityService.autocompleteCities(value).pipe(
            catchError(err => {
              console.error('Autocomplete error:', err);
              return of([]);
            })
          );
        }
        return of([]);
      })
    );
  }

  ngOnInit(): void {
    this.loadRecentSearches();
  }

  onInput(event: any): void {
    const value = event.target.value;
    if (value.length < 2) {
      this.selectedCity = null;
      this.nearbyCities = [];
    }
  }

  performSearch(): void {
    const searchValue = this.cityControl.value;
    if (searchValue && searchValue.length >= 2) {
      console.log('Performing search for:', searchValue);
      // Trigger the autocomplete search manually if needed
    }
  }

  onCitySelected(event: any): void {
    const city: City = event.option.value;
    this.selectCity(city);
  }

  selectCity(city: City): void {
    this.selectedCity = city;
    this.citySelected.emit(city);
    this.addToRecentSearches(city);
    this.nearbyCities = []; // Clear nearby cities when new city is selected
  }

  selectFromRecent(city: City): void {
    this.cityControl.setValue(city);
    this.selectCity(city);
  }

  clearSelection(): void {
    this.selectedCity = null;
    this.cityControl.setValue('');
    this.nearbyCities = [];
  }

  findNearbyCities(): void {
    if (this.selectedCity) {
      const radius = 50; // 50km radius
      this.cityService.getCitiesNearPoint(
        this.selectedCity.latitude,
        this.selectedCity.longitude,
        radius
      ).subscribe({
        next: (cities) => {
          // Filter out the selected city itself
          this.nearbyCities = cities.filter(city => city.id !== this.selectedCity?.id);
        },
        error: (error) => {
          console.error('Error finding nearby cities:', error);
        }
      });
    }
  }

  showOnMap(): void {
    if (this.selectedCity) {
      // Open Google Maps with the city coordinates
      const url = `https://www.google.com/maps?q=${this.selectedCity.latitude},${this.selectedCity.longitude}`;
      window.open(url, '_blank');
    }
  }

  displayFn(city: City): string {
    return city ? `${city.name}, ${city.country}` : '';
  }

  private addToRecentSearches(city: City): void {
    // Remove if already exists
    this.recentSearches = this.recentSearches.filter(c => c.id !== city.id);
    
    // Add to beginning of array
    this.recentSearches.unshift(city);
    
    // Keep only last 5 searches
    this.recentSearches = this.recentSearches.slice(0, 5);
    
    // Save to localStorage
    localStorage.setItem('recentCitySearches', JSON.stringify(this.recentSearches));
  }

  removeFromRecent(index: number): void {
    this.recentSearches.splice(index, 1);
    localStorage.setItem('recentCitySearches', JSON.stringify(this.recentSearches));
  }

  private loadRecentSearches(): void {
    const saved = localStorage.getItem('recentCitySearches');
    if (saved) {
      try {
        this.recentSearches = JSON.parse(saved);
      } catch (error) {
        console.error('Error loading recent searches:', error);
        this.recentSearches = [];
      }
    }
  }
}