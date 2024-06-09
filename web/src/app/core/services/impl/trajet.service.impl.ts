import { Injectable } from "@angular/core";
import { TrajetService } from "../inter/trajet.service";
import { Observable } from "rxjs";
import { environment } from "../../../../environments/environment.development";
import { HttpClient } from "@angular/common/http";
import { RestResponse } from "../../models/rest.response copy";
import { TrajetCreate, TrajetList } from "../../models/trajet.list";

@Injectable({
    providedIn: 'root'
  })

export class TrajetServiceImpl  implements TrajetService{
    private apiUrl=`${environment.APIURL}/trajet`
    constructor(private http:HttpClient){

    }
    findAll(page: number=0): Observable<RestResponse<TrajetList[]>> {
       return this.http.get<RestResponse<TrajetList[]>>(`${this.apiUrl}?page=${page}`)
    }
    create(trajetCreate: TrajetCreate): Observable<RestResponse<TrajetCreate>> {
        return this.http.post<RestResponse<TrajetCreate>>(`${this.apiUrl}`,trajetCreate);
    }
}
