import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar
Cars = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
    name : 'pic1'
  },{
    
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/13/11/36/volkswagen-158463__340.png',
      name : 'pic2'
    },{
      
        imgUrl : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
        name : 'pic3'
      },{
        
      
          imgUrl : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
          name : 'pic4'
        }
      
    
  
]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
