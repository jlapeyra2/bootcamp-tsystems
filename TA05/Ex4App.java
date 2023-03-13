package TA05;

import java.util.Scanner;
import java.lang.Math;

public class Ex4App {
    public static void main(String[] args) {
        System.out.print("Radi: ");
        Scanner sc = new Scanner(System.in);
        double radi = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println("Area: "+(Math.PI*Math.pow(radi, 2)));
    }
}
