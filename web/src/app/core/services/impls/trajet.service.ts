// trajet.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Trajet, TrajetAdd } from '../../models/trajet';

@Injectable({
  providedIn: 'root'
})
export class TrajetService {
  private apiUrl = 'http://localhost:3000/api/trajets';

  constructor(private http: HttpClient) {}

  getTrajets(): Observable<Trajet[]> {
    return this.http.get<Trajet[]>(this.apiUrl);
  }

  getTrajet(id: number): Observable<Trajet> {
    return this.http.get<Trajet>(`${this.apiUrl}/${id}`);
  }

  createTrajet(trajet: TrajetAdd): Observable<Trajet> {
    return this.http.post<Trajet>(this.apiUrl, trajet);
  }

  updateTrajet(id: number, trajet: Trajet): Observable<Trajet> {
    return this.http.put<Trajet>(`${this.apiUrl}/${id}`, trajet);
  }

  deleteTrajet(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
