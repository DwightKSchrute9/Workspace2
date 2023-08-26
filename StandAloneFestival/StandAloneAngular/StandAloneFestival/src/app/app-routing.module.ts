import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EventsComponent } from './events/events.component';
import { PhotosComponent } from './photos/photos.component';
import { AboutComponent } from './about/about.component';
import { AnimazioneComponent } from './animazione/animazione.component';

const routes: Routes = [
  { path: '', redirectTo: 'animazione', pathMatch: 'full' }, // Rotta iniziale
  { path: 'animazione', component: AnimazioneComponent },
  { path: 'home', component: HomeComponent },
  { path: 'events', component: EventsComponent },
  { path: 'photos', component: PhotosComponent },
  { path: 'about', component: AboutComponent },
  // Altre rotte
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
