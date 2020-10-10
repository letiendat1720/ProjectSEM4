import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BuildPCService {
  baseUrl() {
    return 'http://localhost:21022';
  }
  changeUrl() {
    return 'BuildPc';
}
rootUrl() {
  return this.baseUrl() + '/api/services/app';
}
getCpu(): Observable<any> {
  return  this.http.get( this.rootUrl() + '/Cpu/GetCpus');
}
getSSD(): Observable<any> {
  return  this.http.get( this.rootUrl() + '/SolidStateDrive/GetSolidStateDrives');
}
getMainBroad(): Observable<any> {
  return  this.http.get( this.rootUrl() + '/MainBroad/GetMainBroads');
}
getHDD(): Observable<any> {
  return  this.http.get( this.rootUrl() + '/HardDiskDrive/GetHardDiskDrives');
}
  constructor(private http: HttpClient) { }
}
