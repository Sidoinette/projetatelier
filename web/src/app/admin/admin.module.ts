import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { TrajetFormComponent } from './trajet/trajet-form/trajet-form.component';

@NgModule({
    declarations: [
      AdminComponent,
      TrajetFormComponent,
    ],
    imports: [
      CommonModule,
      AdminRoutingModule,
    ]
  })
  export class AdminModule { }
  