package TA05;

import java.util.Scanner;

public class Ex11App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana: ");
        String dia = sc.nextLine();
        sc.close();
        switch (dia) {
            case "lunes":
                System.out.println("Laboral");
                break;
            case "martes":
                System.out.println("Laboral");
                break;
            case "miercoles":
                System.out.println("Laboral");
                break;
            case "jueves":
                System.out.println("Laboral");
                break;
            case "viernes":
                System.out.println("Laboral");
                break;
            case "sabado":
                System.out.println("Fin de semana");
                break;
            case "domingo":
                System.out.println("Fin de semana");
                break;      
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
