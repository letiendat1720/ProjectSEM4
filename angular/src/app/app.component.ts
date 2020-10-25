import { Component, OnInit } from '@angular/core';
import { ConnectionService } from 'ng-connection-service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  ngOnInit() {

  }
  title = 'angular';
  status = 'ONLINE';
  isConnected = true ;
constructor(private connectService : ConnectionService) {
  this.connectService.monitor().subscribe(isConnected => {
    this.isConnected = isConnected;
    if (this.isConnected) {
      window.alert('ThienAn thông báo : bạn đang ONLINE')
    } else {
      window.alert('ThienAn thông báo : bạn đang OFFLINE')
    }
  });
}
}

