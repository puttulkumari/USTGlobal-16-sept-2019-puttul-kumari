import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './home/About/about.component';
import { HelpComponent } from './help/help.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormComponent } from './form/form.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
// import { RegisterPageComponent } from './register-page/register-page.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    FormComponent,
    Form1Component,
    Form2Component,
    // RegisterPageComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe
],

  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
     RouterModule.forRoot([
      
      {path : 'home', component : HomeComponent },
      {path : 'about', component : AboutComponent },
      {path : 'help', component : HelpComponent },
      {path : 'property-binding' , component : PropertyBindingComponent},
      {path : 'event-binding' , component : EventBindingComponent},
      {path : 'two-way-binding' , component : TwoWayBindingComponent},
      {path : 'ngIf' , component : NgIfComponent},
      {path : 'ngFor' , component : NgForComponent},
      {path : 'ngSwitch' , component : NgSwitchComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'form' , component : FormComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      {path : 'reactive-forms' , component : ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent}
      

 ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
