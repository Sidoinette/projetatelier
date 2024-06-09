import { Component, ViewChild } from '@angular/core';
import { TrajetAdd } from '../../../core/models/trajet'; 
import { TrajetService } from '../../../core/services/impls/trajet.service';
import { VehiculeService } from '../../../core/services/impls/vehicule.service';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-trajet-form',
  templateUrl: './trajet-form.component.html',
  styleUrls: ['./trajet-form.component.css']
})
export class TrajetFormComponent {
  @ViewChild('trajetForm', { static: false }) trajetForm!: NgForm;
  trajet: TrajetAdd = {
    depart: '',
    arriver: '',
    date: new Date(),
    prix: 0,
  };

  constructor(
    private trajetService: TrajetService,
    private vehiculeService: VehiculeService,
    private route: ActivatedRoute
  ) {}

  onSubmit() {
    console.log(this.trajet);
    this.trajetService.createTrajet(this.trajet).subscribe(() => {
      this.trajetForm.resetForm();
    });
  }
}
