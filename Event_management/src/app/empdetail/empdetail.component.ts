import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee.model';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-empdetail',
  templateUrl: './empdetail.component.html',
  styleUrls: ['./empdetail.component.css']
})
export class EmpdetailComponent implements OnInit {

  employeeID: number;
  employees: Employee[];
  employeess:Employee;
  
 
  constructor(private empService: EmployeeService,private formBuilder: FormBuilder, private router: Router, ) {
    
   }
  editForm: FormGroup;
  ngOnInit() {
      this.getEmployeeByID();  
  }
  empid = Number(localStorage.getItem('editEmpId'));
  
  getEmployeeByID() {
    this.empService.getEmployeeById(this.empid)
    .subscribe((data: Employee) => {
      this.employeess = data;
    });
  }

  deleteEmp(employee: Employee): void {
    if( confirm("Do you want to delete the details?")){   
      this.empService.deleteEmployees(employee.id!)
      .subscribe(data => {
        this.employees = this.employees.filter(u => u !== employee); 
      });
    }
    else{
      alert("Operation Cancelled")
    }
  }

  editEmp(employee: Employee): void {
    localStorage.removeItem('editEmpId');
    localStorage.setItem('editEmpId', employee.id!.toString());
    this.router.navigate(['update-emp']);
  }

  addEmp(): void {
    localStorage.removeItem('editEmpId');
    this.router.navigate(['add-emp']);
  }
}