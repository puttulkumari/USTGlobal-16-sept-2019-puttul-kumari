import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {


  // values = '';
  // movies;
  // ngOnInit() {
  // }

  // onKey(event: any) { // without type info
  //   this.values = event.target.value;
  //   console.log(this.values);
  // }

  // constructor(private http: HttpClient) {
  //     this.getMovies();
  // }


  // getMovies() {
  //     this.http.get<any>('http://www.omdbapi.com/?i=milana&apikey=96b4fb25').subscribe( data => {
  //         this.movies = data.articles;
  //     }, err => {
  //         console.log(err);
  //     }, () => {
  //         console.log('Movies got Successfully');
  //     });
  // }

search;
searchMovies;
constructor(public http: HttpClient) {

}

ngOnInit(){

}
cFun(event) {
  this.http.get<any>('http://www.omdbapi.com/?apikey=96b4fb25&s='+event.target.value).subscribe(data =>{
  this.searchMovies = data.Search;

},err =>{
  console.log(err);
}, () =>{
  console.log('sourcesNews Got Successfuly');
});
  
}
 }
