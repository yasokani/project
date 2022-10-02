
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListempComponent } from './listemp/listemp.component';
import { AddempComponent } from './addemp/addemp.component';
import { EditempComponent } from './editemp/editemp.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { EmpdetailComponent } from './empdetail/empdetail.component';
import { AdmineditComponent } from './adminedit/adminedit.component';
import { DashboardComponent } from './dashboard/dashboard.component';

const routes: Routes = [
  { path: '', component:AdminComponent  },
  { path: 'detail', component:EmpdetailComponent  },
  { path: 'dash', component:DashboardComponent },
  { path: 'admin', component:AdmineditComponent  },
  {path: 'home', component:HomeComponent  },
  { path: 'list-emp', component: ListempComponent },
  { path: 'add-emp', component: AddempComponent },
  { path: 'update-emp', component: EditempComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
