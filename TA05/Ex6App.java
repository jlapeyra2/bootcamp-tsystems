package TA05;

import java.util.Scanner;

public class Ex6App {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio: ");
        double x = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println("Precio+IVA: "+(x+x*IVA));
        
    }
}
