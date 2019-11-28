import { Component, OnInit} from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component ({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']


})
export class HomeComponent {
    news;
    constructor(private http: HttpClient) {
        this.getNews();
    }
    ngOnInit(){
        
    }


getNews() {
this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c81e3630b5b04cf58f21edb0b24bb5fd').subscribe(data => {

this.news = data.articles;
}, err => {
    console.log(err);

}, () => {
    console.log('news got successfully');
});
}
}
