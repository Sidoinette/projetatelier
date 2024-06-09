import { Component } from '@angular/core';
import { BarreComponent } from "../../../components/barre/barre.component";
import { HeaderComponent } from "../../../components/header/header.component";
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { TrajetServiceImpl } from '../../services/impl/trajet.service.impl';
import { CommonModule } from '@angular/common';
import { TrajetList } from '../../models/trajet.list';

@Component({
    selector: 'app-trajet.form',
    standalone: true,
    templateUrl: './trajet.form.component.html',
    styleUrl: './trajet.form.component.css',
    imports: [BarreComponent, HeaderComponent,ReactiveFormsModule, CommonModule, FormsModule]
})
export class TrajetFormComponent {

  Dto:TrajetList={
    "depart" : "",
    "arriver":"",
    "date": "",
    "placeTotal": 0,
    "placeDispo": 0,
    "prix" : 0
  }


  errors:any
  form: FormGroup;
  constructor(private fb: FormBuilder,private trajetService: TrajetServiceImpl,private router : Router){
    this.form = this.fb.group({
      depart:'',
      arriver:'',
      date:'',
      placeTotal:0,
      placeDispo:0,
      prix:0
    })
  }
  
  ngOnInit(): void {}

  onSubmit() {
   
    this.trajetService.create(this.Dto).subscribe(data => {
      if (data.statut == 201) {
        this.router.navigateByUrl('/trajet');
      } else {
        this.errors = data.results;
      }
    });
    console.log(this.Dto);
  }
 
  
}
