import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  skills = ['C','C++','JAVA','Python'];
 constructor() { }

  ngOnInit() {
  }
form(form : NgForm) {
   console.log(form);
}
}
