import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  loading = false;
  submitted = false;
  returnUrl: string;
  hide = true;
  public equalMatcher: LoginComponent;
  constructor(  private formBuilder: FormBuilder,
    ) { }

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: new FormControl('', [
        Validators.required
      ]),
      password : new FormControl('', [
        Validators.required,
        Validators.minLength(8)
      ])
  });
  }
  get f() { return this.loginForm.controls; }
  onSubmit() {
    this.submitted = true;
    // stop here if form is invalid
    if (this.loginForm.invalid) {
        return;
    }
}

}