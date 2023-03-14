package TA6;

import java.util.Scanner;

public class Ex6App {
    static int xifres(int x) {
        if (x == 0) return 1;
        int num_xifres = 0;
        while (x > 0) {
            num_xifres++;
            x = x/10;
        }
        return num_xifres;
    }

    /* Alternativa:
    static int xifres(int x) {
        return Integer.toString(x).length();
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println(xifres(x) + " cifras");
    }
}
