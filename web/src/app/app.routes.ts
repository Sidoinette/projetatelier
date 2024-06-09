import { Routes } from '@angular/router';
import { NotFoundComponent } from './core/pages/not-found/not-found.component';
import { LoginComponent } from './core/pages/login/login.component';
import { TrajetComponent } from './core/pages/trajet/trajet/trajet.component';
import { TrajetFormComponent } from './core/pages/trajet.form/trajet.form.component';
import { HomeComponent } from './core/pages/home/home.component';

export const routes: Routes = [
    {
        path:"",
        component: HomeComponent
      },
    
      {
        path:"login",
        component: LoginComponent
      },
      {
        path:"trajet",
        component: TrajetComponent
      }
      ,
      {
        path:"trajet/form",
        component: TrajetFormComponent
      }
      ,
      {
        path:"**",
        component: NotFoundComponent,
      }
    
];
