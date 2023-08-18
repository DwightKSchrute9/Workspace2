import { Component } from '@angular/core';
import { trigger, state, style, animate, transition } from '@angular/animations';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
  animations: [
    trigger('rotate', [
      state('normal', style({ transform: 'rotate(0)' })),
      state('hovered', style({ transform: 'rotate(360deg)' })),
      transition('normal => hovered', animate('500ms ease-out')),
      transition('hovered => normal', animate('500ms ease-out'))
    ])
  ]
})
export class NavbarComponent {
  logoRotateState = 'normal';

  onLogoHover() {
    this.logoRotateState = 'hovered';
  }

  onLogoHoverEnd() {
    this.logoRotateState = 'normal';
  }
}
