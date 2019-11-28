import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
Product = [
  {
  img: 'https://cdn.pixabay.com/photo/2016/06/07/17/15/yogurt-1442034__340.jpg',
  name: 'Grapes',
  price:67
  },{
    img: 'https://cdn.pixabay.com/photo/2015/12/30/11/57/fruit-basket-1114060__340.jpg',
  name: 'Lemon',
  price:5
  },{
    img: 'https://cdn.pixabay.com/photo/2017/02/27/21/47/yogurt-2104327__340.jpg',
    name: 'cup',
    price:25
  }
]
  constructor() {
   
  }
  ngOnInit() {
  }

}
