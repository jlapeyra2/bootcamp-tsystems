package TA05;

public class Ex9App {
    public static void main(String[] args) {
        for (int i = 6; i <= 100; i+=6) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    /* Alternativa:
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0 && i%3 == 0)System.out.print(i + " ");
        }
     */
}
