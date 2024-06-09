// vehicule.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vehicule } from '../../models/vehicule';

@Injectable({
  providedIn: 'root'
})
export class VehiculeService {
  private apiUrl = 'http://localhost:3000/api/vehicules';

  constructor(private http: HttpClient) {}

  getVehicules(): Observable<Vehicule[]> {
    return this.http.get<Vehicule[]>(this.apiUrl);
  }

  getVehicule(id: number): Observable<Vehicule> {
    return this.http.get<Vehicule>(`${this.apiUrl}/${id}`);
  }

  createVehicule(vehicule: Vehicule): Observable<Vehicule> {
    return this.http.post<Vehicule>(this.apiUrl, vehicule);
  }

  updateVehicule(id: number, vehicule: Vehicule): Observable<Vehicule> {
    return this.http.put<Vehicule>(`${this.apiUrl}/${id}`, vehicule);
  }

  deleteVehicule(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
