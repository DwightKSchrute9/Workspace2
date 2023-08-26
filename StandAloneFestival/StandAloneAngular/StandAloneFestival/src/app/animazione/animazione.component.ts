import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-animazione',
  templateUrl: './animazione.component.html',
  styleUrls: ['./animazione.component.scss']
})
export class AnimazioneComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {
    setTimeout(() => {
      this.router.navigate(['/home']); // Passa alla componente Home dopo 2 secondi
    }, 5000);
  }
}
