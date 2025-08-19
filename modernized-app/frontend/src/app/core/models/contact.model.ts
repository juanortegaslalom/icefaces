/**
 * Contact model matching the Spring Boot backend API
 * Represents a government staff member with enhanced type safety
 */
export interface Contact {
  id: number;
  ministryId?: number;
  organizationalUnitId?: number;
  name: string;
  title?: string;
  phone?: string;
  email?: string;
  createdAt?: string;
  updatedAt?: string;
  
  // Nested objects from JPA relationships
  ministry?: Ministry;
  organizationalUnit?: OrganizationalUnit;
}

/**
 * Ministry model representing government ministries
 */
export interface Ministry {
  id: number;
  name: string;
  description?: string;
  createdAt?: string;
  updatedAt?: string;
  
  // Nested collections
  organizationalUnits?: OrganizationalUnit[];
  contacts?: Contact[];
}

/**
 * Organizational Unit model for hierarchical government structure
 */
export interface OrganizationalUnit {
  id: number;
  ministryId: number;
  parentId?: number;
  name: string;
  unitType: UnitType;
  level: number;
  createdAt?: string;
  updatedAt?: string;
  
  // Nested objects and collections
  ministry?: Ministry;
  parent?: OrganizationalUnit;
  children?: OrganizationalUnit[];
  contacts?: Contact[];
  
  // Helper properties for UI
  expanded?: boolean;
  hasChildren?: boolean;
  hasContacts?: boolean;
  totalContacts?: number;
}

/**
 * Unit type enum matching backend
 */
export type UnitType = 'department' | 'office' | 'division' | 'branch' | 'section';

/**
 * Search result wrapper with pagination support
 */
export interface SearchResult<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
  first: boolean;
  last: boolean;
  numberOfElements: number;
}

/**
 * Search parameters for advanced search
 */
export interface SearchParams {
  q?: string;
  ministryId?: number;
  unitType?: UnitType;
  page?: number;
  size?: number;
  sortBy?: string;
  sortDir?: 'asc' | 'desc';
}

/**
 * System health and statistics
 */
export interface SystemHealth {
  status: 'UP' | 'DOWN';
  timestamp: number;
  statistics?: {
    totalContacts: number;
    totalMinistries: number;
    totalOrganizationalUnits: number;
  };
  message?: string;
  error?: string;
}

/**
 * API response wrapper for error handling
 */
export interface ApiResponse<T> {
  data?: T;
  error?: string;
  message?: string;
  timestamp?: number;
}