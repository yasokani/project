import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminedit',
  templateUrl: './adminedit.component.html',
  styleUrls: ['./adminedit.component.css']
})
export class AdmineditComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private empService: EmployeeService) {
  }
  addForm: FormGroup;
  editForm: FormGroup;
  ngOnInit() {

    this.editForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', [Validators.required, Validators.maxLength(14)]]
    });
    
    const empid = Number(localStorage.getItem('editEmpId'));
    if (+empid > 0) {
      this.empService.getadminById(+empid).subscribe(data => {
        this.editForm.patchValue(data);
      });
    }
  }

  onUpdate() {
    this.empService.updateadmin(this.editForm.value).subscribe(data => {
      alert("Updated Successfully!")
      this.router.navigate(['']);
    },
      error => {
        alert(error);
      });
  }
  
}