import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormulariComponent } from './formulari/formulari.component';
import { LlistaComponent } from './llista/llista.component';

@NgModule({
  declarations: [
    AppComponent,
    FormulariComponent,
    LlistaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
