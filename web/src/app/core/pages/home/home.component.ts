import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../../components/header/header.component';
import { BarreComponent } from '../../../components/barre/barre.component';
import { AuthentificationService } from '../../services/auth/authentification.service';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HeaderComponent, BarreComponent, RouterLink],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{
  user:String="";
  constructor(private authService: AuthentificationService, private router:Router){}

  ngOnInit(): void {
    // if(this.authServ.isAuthentificated == false){
    //   this.router.navigateByUrl("/login");
    // }
    this.user = this.authService.username!;
  }
}
