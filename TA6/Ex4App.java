package TA6;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex4App {
    /*static int factorial(int x) { // Solo puede calcular hasta 12! (ya que 13! > 2^31)
        int r = 1;
        for (int i = 2; i <= x; i++) r *= i;
        return r;
    }*/

    /*static long factorial(int x) { // Solo puede calcular hasta 20! (ya que 21! > 2^63)
        long r = 1;
        for (int i = 2; i <= x; i++) r *= i;
        }
        return r;
    }*/

    static BigInteger factorial(int x) {
        BigInteger r = new BigInteger("1");
        for (int i = 2; i <= x; i++) {
            r = r.multiply(BigInteger.valueOf(i));
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int x = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println(x + "! = " + factorial(x));
    }
}
