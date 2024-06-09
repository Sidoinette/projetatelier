import { Directive, OnInit, inject } from '@angular/core';
import { NgIf } from '@angular/common';
import { AuthentificationService } from '../services/auth/authentification.service';

@Directive({
  selector: '[appIfAuthentificated]',
  standalone: true,
  hostDirectives:[{
    directive: NgIf
  }]
})
export class IfAuthentificatedDirective  implements OnInit {

  private authServ:AuthentificationService = inject(AuthentificationService);
  private ngIfDirective = inject(NgIf);


  ngOnInit(): void {
    this.ngIfDirective.ngIf=this.authServ.isAuthentificated;
  }
  constructor() { }


}
