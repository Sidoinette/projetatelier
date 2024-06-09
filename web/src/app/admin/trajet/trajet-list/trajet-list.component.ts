import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Trajet } from '../../../core/models/trajet';
import { TrajetService } from '../../../core/services/impls/trajet.service';

@Component({
  selector: 'app-classe-list',
  templateUrl: './trajet-list.component.html',
  styleUrls: ['./trajet-list.component.css']
})
export class TrajetListComponent implements OnInit{
  trajets:Trajet[]=[]

  constructor(private trajetService:TrajetService,private router:Router){}
  ngOnInit(): void {
    this.trajetService.getTrajets().subscribe(data=>this.trajets=data)
  }
  onUpdate(id:number){
    this.router.navigateByUrl(`/admin/update/trajet/${id}`)
  }
  onDelete(id:number){
    this.trajetService.deleteTrajet(id).subscribe(data=>
      this.router.navigateByUrl("/admin/list/trajet")
    )
  }
}
