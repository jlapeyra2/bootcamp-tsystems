import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'calculadora';
  display = document.getElementById("display") as HTMLInputElement;

  calculate = () => {
    let display = document.getElementById("display") as HTMLInputElement;
    let expression = display.value;
    if (expression === "Error") return;
    if (expression === "") return;
    try {
      var result = eval(expression);
      if (result === undefined) throw "Error";
      display.value = result;
    } catch (error) {
      display.value = "Error";
    }
  }

  clearDisplay = () => {
    let display = document.getElementById("display") as HTMLInputElement;
    display.value = "";
  }

  erase = () => {
    let display = document.getElementById("display") as HTMLInputElement;
    display.value = display.value.substring(0, display.value.length - 1);
  }


  addToDisplay = (value:string) => {
    let display = document.getElementById("display") as HTMLInputElement;
    if (display.value === "Error") display.value = value
    else display.value += value;
  }

  handleKeyDown = (event: KeyboardEvent) => {
    var key = event.key;

    if (key === "Enter" || key === "=") {
      event.preventDefault();
      this.calculate();
    } else if (key === "Escape" || key === "C" || key == "c") {
      this.clearDisplay();
    } else if (key === "Backspace") {
      this.erase();
    }
    else if (/^[-+*/\d\s()\.]$/.test(key)) {
      event.preventDefault();
      this.addToDisplay(key);
    }
    //console.log(key)
  }

}
