package TA6;

import java.util.Scanner;

public class Ex3App {

    static boolean esPrimo(int x) {
        if (x < 2) return false;
        if (x%2 == 0) return false;
        for (int i = 3; i*i <= x; i += 2) {
            if (x%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println(x + (esPrimo(x) ? "" : " no") + " es primo");
    }
    
}