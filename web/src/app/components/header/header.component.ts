
import { Component, OnInit } from '@angular/core';
import { RouterLink, RouterLinkActive } from '@angular/router';
import { AuthentificationService } from '../../core/services/auth/authentification.service';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink , RouterLinkActive],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit{

  name?:string|null = "";



  constructor(private auth:AuthentificationService) { }

  ngOnInit(): void {
    this.name = this.auth.username;
  }

  logout(){
    this.auth.logout();
  }
}
