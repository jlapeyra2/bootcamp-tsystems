package TA05;

import java.util.Scanner;

public class Ex5App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        if (x%2 == 0) System.out.println("par");
        else System.out.println("impar");
    }
}
