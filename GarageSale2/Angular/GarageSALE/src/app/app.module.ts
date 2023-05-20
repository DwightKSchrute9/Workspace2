import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HOMEComponent } from './home/home.component';
import { Routes } from '@angular/router';


const appRoutes: Routes = [

  { path: '', redirectTo: '/animazione', pathMatch: 'full' },
  { path: 'App', component: AppComponent },


];

@NgModule({
  declarations: [
    AppComponent,
    HOMEComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


