import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-editemp',
  templateUrl: './editemp.component.html',
  styleUrls: ['./editemp.component.css']
})
export class EditempComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private empService: EmployeeService) {
  }
  addForm: FormGroup;
  editForm: FormGroup;
  ngOnInit() {

    this.editForm = this.formBuilder.group({
      id: [],
      first_name: ['', Validators.required],
      last_name: ['', Validators.required],
      email: ['', Validators.required]
    });

    const empid = Number(localStorage.getItem('editEmpId'));
    if (+empid > 0) {
      this.empService.getEmployeeById(+empid).subscribe(data => {
        this.editForm.patchValue(data);
      });
    }
  }

  onUpdate() {
    this.empService.updateEmployee(this.editForm.value).subscribe(data => {
      alert("Updated Successfully!");
      this.router.navigate(['list-emp']);
    },
      error => {
        alert(error);
      });
  }
}
