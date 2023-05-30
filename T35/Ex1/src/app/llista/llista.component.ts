import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-llista',
  templateUrl: './llista.component.html',
  styleUrls: ['./llista.component.css']
})
export class LlistaComponent {
  @Input() llista! : string[][];
  @Input() atributs! : string[];
}
