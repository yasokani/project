import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  UpdateUser(data:any,id:number){
    return this.http.put<any>('http://localhost:8080/people',data)
    .pipe(map((res:any)=>{
      
      return res;
    }))
  }
}
