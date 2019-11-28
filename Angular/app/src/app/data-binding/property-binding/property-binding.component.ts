import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name : string = 'Mikel';
imgUrl : string='https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg' ;
address: string = 'Yelahanka,Bangalore-50064';
colorName: string = 'red';
isActive: boolean = false;
colSpanValue : number = 2;
constructor() {
  setInterval(() => {
    this.colorName = 'red';
    this.isActive = !this.isActive;
  },2000);

  
 }

  ngOnInit() {
    setInterval(()=>{                      //after few min it gets the change of color and original color get remove
      this.colorName = 'yellow';
    }, 2000);


    
  }

}
