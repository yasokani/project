import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AddempComponent } from './addemp/addemp.component';
import { AdmineditComponent } from './adminedit/adminedit.component';
import { AdminComponent } from './admin/admin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EditempComponent } from './editemp/editemp.component';
import { EmpdetailComponent } from './empdetail/empdetail.component';
import { HomeComponent } from './home/home.component';
import { ListempComponent } from './listemp/listemp.component';

@NgModule({
  declarations: [
    AppComponent,
    AddempComponent,
    AdmineditComponent,
    AdminComponent,
    DashboardComponent,
    EditempComponent,
    EmpdetailComponent,
    HomeComponent,
    ListempComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
