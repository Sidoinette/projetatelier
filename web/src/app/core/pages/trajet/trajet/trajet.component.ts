import { Component, OnInit } from '@angular/core';
import { BarreComponent } from "../../../../components/barre/barre.component";
import { HeaderComponent } from "../../../../components/header/header.component";
import { DanpaginationComponent } from "../../../../components/danpagination/danpagination.component";
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
// import { TrajetList } from '../../../models/trajet.list';
import { TrajetServiceImpl } from '../../../services/impl/trajet.service.impl';
import { RestResponse } from '../../../models/rest.response copy';
import { TrajetList } from '../../../models/trajet.list';
import { PaginationModel } from '../../../models/pagination';
// import { PaginationModel } from '../../../models/pagination';

@Component({
    selector: 'app-trajet',
    standalone: true,
    templateUrl: './trajet.component.html',
    styleUrl: './trajet.component.css',
    imports: [BarreComponent, HeaderComponent, DanpaginationComponent,TrajetComponent, RouterLink]
})
export class TrajetComponent  implements OnInit{
  response?: RestResponse<TrajetList[]>;
  constructor(private trajetService: TrajetServiceImpl){

  }
  ngOnInit(): void {
    this.refresh();

  }

  // refresh(page:number=0){

  // }
  dataPagination:PaginationModel={
    pages:[],
    currentPage:0,
    totalPages:0
  }
  refresh(page:number = 0){
    this.trajetService.findAll(page).subscribe(data =>{
      this.response=data;
      this.dataPagination.pages=data.pages!;
      this.dataPagination.currentPage=data.currentPage!;
      this.dataPagination.totalPages=data.totalPages!;
    });
  }

  paginate(page: any) {
    this.refresh(page);
  }

  selectedValueSelect(id:string=""){
    const selectElement = document.getElementById(id) as HTMLSelectElement;
    return selectElement!=null?selectElement.value:"";
  }
  
  
}
