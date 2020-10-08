import { Component, OnInit } from '@angular/core';
import {BuildPCService} from '../service/build-pc.service'
@Component({
  selector: 'app-buildpc',
  templateUrl: './buildpc.component.html',
  styleUrls: ['./buildpc.component.css']
})
export class BuildpcComponent implements OnInit {
 totalPrice =0;
  constructor( public builPcService: BuildPCService) { }
Ram; 
  ngOnInit(): void {
    this.getRam();
  }
    getRam() {
      this.Ram = [];
      this.builPcService.getCpu().subscribe(data => {
        this.Ram = data.result;
      })
    }
}
