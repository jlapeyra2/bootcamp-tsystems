import { Component, EventEmitter, Input, Output } from '@angular/core';


@Component({
  selector: 'app-formulari',
  templateUrl: './formulari.component.html',
  styleUrls: ['./formulari.component.css']
})
export class FormulariComponent {

  @Input() atributs! : string[]
  @Output() guardarClient = new EventEmitter();

  guardar = () => {
    this.guardarClient.emit(
    //console.log(
      Array.from(this.atributs, 
        x => (document.getElementById(x) as (HTMLInputElement|HTMLSelectElement)).value
      )
    );
  }
}
