import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private empService: EmployeeService) {}
  editForm:FormGroup;
  addForm: FormGroup;
  btnvisibility = true;
  ngOnInit() {

    this.addForm = this.formBuilder.group({
      id: [],
      first_name: ['', Validators.required],
      last_name: ['', Validators.required],
      email: ['', Validators.required],
    });

  }
  onSubmit() {
    this.empService.createUser(this.addForm.value)
      .subscribe(data => {
        alert("Employee Added Successfully!");
          this.router.navigate(['list-emp']);
      },
      error => {
        alert(error);
      });
  }
  
  }
