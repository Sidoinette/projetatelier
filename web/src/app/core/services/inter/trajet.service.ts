import { Observable } from "rxjs";
import { RestResponse } from "../../models/rest.response copy";
import { TrajetCreate, TrajetList } from "../../models/trajet.list";

export interface TrajetService {
    findAll(page:number):Observable<RestResponse<TrajetList[]>>;
    create(trajetCreate:TrajetCreate):Observable<RestResponse<TrajetCreate>>;
}
