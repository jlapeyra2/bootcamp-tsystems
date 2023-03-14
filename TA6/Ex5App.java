package TA6;

import java.util.Scanner;

public class Ex5App {
    static String binary(int x) {
        if (x/2 == 0) return Integer.toString(x%2);
        return binary(x/2) + x%2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println(binary(x));
    }
}
