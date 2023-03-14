package TA6;

import java.util.Scanner;

public class Ex7App {
    static double eur2usd(double eur) {
        return eur*1.28611;
    }
    static double eur2gbp(double eur) {
        return eur*0.86;
    }
    static double eur2jpy(double eur) {
        return eur*129.852;
    }
    static double eur2currency(double eur, String currency) {
        switch (currency) {
            case "USD":
                return eur2usd(eur);
            case "GBP":
                return eur2gbp(eur);
            case "JPY":
                return eur2jpy(eur);
            default:
                System.out.println("Invalid currency");
                return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency (USD / GBP / JPY): ");
        String currency = sc.nextLine();
        System.out.print("Enter amount of money (in EUR): ");
        double x = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println(eur2currency(x, currency) + " " + currency);
    }
}
