import { Inject, Injectable, PLATFORM_ID } from '@angular/core';
import { environment } from '../../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { isPlatformBrowser } from '@angular/common';
import { Observable } from 'rxjs';
import { AuthentificationRequest, TokenResponse } from '../../models/authentification';
import { Router } from '@angular/router';
import { RestResponse } from '../../models/rest.response copy';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  dto:TokenResponse={
    "roles" : [],
    "username" : "",
    "token" : ""
  }

  isAuthentificated: boolean = true;

  username:string|null=null
  roles:string[]=[]
  private isBrowser: boolean=false;

  private apiUrl=`${environment.APIURL}`
       constructor(private router:Router,private http:HttpClient,
        @Inject(PLATFORM_ID) private platformId:any
       ) {
            this.isBrowser = isPlatformBrowser(platformId);
        }

  login(data: AuthentificationRequest): Observable<RestResponse<TokenResponse>> {
    return this.http.post<RestResponse<TokenResponse>>(`${this.apiUrl}/login`, data);
  }

  blackList(data: TokenResponse): Observable<RestResponse<TokenResponse>> {
    return this.http.post<RestResponse<TokenResponse>>(`${this.apiUrl}/expiredTokens`, data);
  }

  logout() {
    this.dto.token = this.getAuthToken();
    this.blackList(this.dto).subscribe(data => {
      console.log("out");
    })
    localStorage.removeItem('token');
    this.router.navigateByUrl("/login");
  }

  getAuthToken():string{
      if(this.isBrowser) {
        return localStorage.getItem('token')??"";
      }
      return "";
  }

}
