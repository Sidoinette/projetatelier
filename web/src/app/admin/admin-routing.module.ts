import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TrajetFormComponent } from './trajet/trajet-form/trajet-form.component';
import { TrajetListComponent } from './trajet/trajet-list/trajet-list.component';

const routes: Routes = [
    { path: 'add/trajet', component: TrajetFormComponent},
    { path: 'list/sessions-cours', component: TrajetListComponent },
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class AdminRoutingModule { }