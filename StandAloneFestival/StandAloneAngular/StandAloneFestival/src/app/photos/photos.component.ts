
import { Component } from '@angular/core';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.scss']
})
export class PhotosComponent {
  // Array di URL delle immagini
  images: string[] = [
    'assets/imgs/foto1.jpg',
    'assets/img/foto12.jpg',
    'assets/img/foto3.jpg',
    'assets/img/foto4.jpg',
    'assets/img/foto5.jpg',
    'assets/img/foto6.jpg',
    'assets/img/foto7.jpg',
    'assets/img/foto8.jpg',
    'assets/img/foto9.jpg',
    'assets/img/foto10.jpg',
    // Aggiungi altri URL delle immagini qui
  ];

  // Variabili per il controllo dei pulsanti "Previous" e "Next"
  activeIndex = 0;

  prevSlide() {
    this.activeIndex = (this.activeIndex - 1 + this.images.length) % this.images.length;
  }

  nextSlide() {
    this.activeIndex = (this.activeIndex + 1) % this.images.length;
  }
}
