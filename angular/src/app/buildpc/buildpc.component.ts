import { Component, OnInit } from '@angular/core';
import { BuildPCService } from '../service/build-pc.service';
@Component({
  selector: 'app-buildpc',
  templateUrl: './buildpc.component.html',
  styleUrls: ['./buildpc.component.css']
})
export class BuildpcComponent implements OnInit {
  totalPrice = 0;
  constructor(public builPcService: BuildPCService) { }
  // imageBuildPc;
  ram;
  ssd;
  hdd;
  mainBroad;
  titleRam = 'Ram';
  titleSSD = 'SSD';
  titleHDD = 'HDD';
  titleVGA = 'VGA';
  titleMainBroad = 'Main';
  itemSelectSSD;
  itemSelectRam;
  itemSelectHDD;
  itemSelectMainBroad;
  dataModal;
  totalPrices = [];

  price = 0;

  ngOnInit(): void {
  }
  getRam() {
    this.ram = [];
    this.builPcService.getCpu().subscribe(data => {
      this.ram = data.result;
      this.ram.map(res => {
        res.imageBuildPc = res.imageString.split('--');
      });
    });
  }
  getSSD() {
    this.ssd = [];
    this.builPcService.getSSD().subscribe(data => {
      this.ssd = data.result;
      this.ssd.map(res => {
        res.imageBuildPc = res.imageString.split('--');
      });
    });
  }
  getHDD() {
    this.hdd = [];
    this.builPcService.getHDD().subscribe(data => {
      this.hdd = data.result;
      this.hdd.map(res => {
        res.imageBuildPc = res.imageString.split('--');
      });
    });
  }
  getMainBroad() {
    this.mainBroad = [];
    this.builPcService.getMainBroad().subscribe(data => {
      this.mainBroad = data.result;
      this.mainBroad.map(res => {
        res.imageBuildPc = res.imageString.split('--');
      });
    });
  }
  addRam(data) {
    this.totalPrice -= this.price;
    this.totalPrice += data.price;
    this.itemSelectRam = data;
  }
  addSSD(data) {
    this.totalPrice -= this.price;
    this.totalPrice += data.price ;
    this.itemSelectSSD = data;
  }
  addHDD(data) {
    this.totalPrice -= this.price;
    this.totalPrice += data.price ;
    this.itemSelectHDD = data;
  }
  addMainBroad(data) {
    this.totalPrice -= this.price;
    this.totalPrice += data.price;
    this.itemSelectMainBroad = data;
  }
  openModal(data, item: any) {
    if (item == null || !item.price == null) {
      this. price = 0;
    }
    else this.price = item.price;

    this.dataModal = data;
    console.log(this.dataModal);
    
    if (data === 'Ram') {
      this.getRam();
    } else if (data === 'SSD') {
      this.getSSD();
    } else if (data === 'HDD') {
      this.getHDD();
    } else if(data === 'Main') {
      this.getMainBroad();
    }
  }
  deleteRam(data) {
    if(data) {
    this.itemSelectRam = [];
    }
  }
}
