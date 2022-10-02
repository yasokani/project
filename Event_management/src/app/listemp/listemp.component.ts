import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listemp',
  templateUrl: './listemp.component.html',
  styleUrls: ['./listemp.component.css']
})
export class ListempComponent implements OnInit {

  employees: Employee[];
  constructor(private empService: EmployeeService, private router: Router, ) { }

  ngOnInit() {
    this.empService.getEmployees()
      .subscribe((data: Employee[]) => {
        this.employees = data;
      });
  }

  detailEmp(employee: Employee): void {
    localStorage.removeItem('editEmpId');
    localStorage.setItem('editEmpId', employee.id!.toString());
    this.router.navigate(['/detail']);
  }

  addEmp(): void {
    localStorage.removeItem('editEmpId');
    this.router.navigate(['add-emp']);
  }

}
