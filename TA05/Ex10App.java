package TA05;

import java.util.Scanner;

public class Ex10App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de ventas: ");
        int n = Integer.parseInt(sc.nextLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Venta "+(i+1)+": ");
            sum += Double.parseDouble(sc.nextLine());
        }
        sc.close();
        System.out.println("Suma: "+sum);
    }
}