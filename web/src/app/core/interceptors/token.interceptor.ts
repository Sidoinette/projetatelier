import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { AuthentificationService } from '../services/auth/authentification.service';





export const tokenInterceptor: HttpInterceptorFn = (request, next) => {

  const authToken = inject(AuthentificationService).getAuthToken();
        const req=request.clone({
         headers:request.headers.set("Authorization",`Bearer ${authToken}`)
      })


  return next(req);
};
