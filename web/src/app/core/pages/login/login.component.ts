import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';

import { AuthentificationService } from '../../services/auth/authentification.service';
import { Router } from '@angular/router';
import { TokenResponse } from '../../models/authentification';
import { RestResponse } from '../../models/rest.response copy';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  form: FormGroup;
  constructor(private fb: FormBuilder, private authService: AuthentificationService, private router: Router) {
    this.form = this.fb.group({ 
      username: '',
      password: '',
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    let data = this.form.getRawValue();
    this.authService.login(data).subscribe((res: RestResponse<TokenResponse>) => {
      if (res.statut==200) {
        this.authService.isAuthentificated=true;
        this.authService.username=res.results.username;
        localStorage.setItem("token",res.results.token);
        this.router.navigateByUrl('/');
      } else {
        this.authService.isAuthentificated=false;
         console.log("Error");
      }

    });
  }
}
