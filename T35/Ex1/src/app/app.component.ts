import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ex1';

  atributs = ['Nombre', 'NIF', 'Dirección', 'Grupo'];
  llistaClients : string[][] = [];

  actualitzar = (client : string[]) => {
    this.llistaClients.push(client);
    console.log(this.llistaClients);
  }
}
