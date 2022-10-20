import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  public loginForm!: FormGroup;
  url="http://localhost:8080/people";
  submitted=false;
  
  constructor(private formBuilder: FormBuilder,private http: HttpClient , private router:Router) { }

  ngOnInit(): void {
    this.loginForm=this.formBuilder.group({
      peopleId : ['',Validators.required],
     mobileno : ['',Validators.required]

  })
  }
  onSubmit() {
    this.submitted=true;
    if(this.loginForm.invalid){
      alert("Form not Filled Properly");
    }

    else if((this.loginForm.get('peopleId')?.value== "101") && (this.loginForm.get('mobileno')?.value=="8967856789")){
      alert("Logged In Successfully");
      this.router.navigate(["/userhome"]);
  }
    else{
      alert("Invalid Credentials");
    }
  }

  //to access the  form control in a view to display the error
  get f(){
    return this.loginForm.controls;
  }
}