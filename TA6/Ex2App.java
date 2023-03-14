package TA6;

import java.util.Random;
import java.util.Scanner;

public class Ex2App {

    static int random(int min, int max) {
        Random r = new Random();
        return r.nextInt(max+1 - min) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generador de números enteros aleatorios");
        System.out.print("Indique el valor mínimo: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Indique el valor máximo: ");
        int max = Integer.parseInt(sc.nextLine());
        System.out.print("Indique la cantidad de números: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(random(min, max) + " ");
        }
        sc.close();
    }
}