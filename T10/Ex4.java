package T10;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese la operación a realizar (+, -, *, /, ^, sqrt, cbrt): ");
        String operacion = sc.next();

        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2; // si num2 = 0 el resultado es Infinty
                break;
            case "^":
                resultado = Math.pow(num1, num2); // si el resultado no es real, es NaN
                break;
            case "sqrt":
                resultado = Math.sqrt(num1); // si num1 es negativo el resultado es NaN
                break;
            case "cbrt":
                resultado = Math.cbrt(num1);
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
