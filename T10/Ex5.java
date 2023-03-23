package T10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Random random = new Random();
        int solution = random.nextInt(500)+1;
        Scanner sc = new Scanner(System.in); 
        boolean found = false;
        while (!found) {
            int guess;
            try {
                guess = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Introduce un númemro entero");
                continue;
            }
            if (solution > guess) System.out.println("El número es mayor");
            else if (solution < guess) System.out.println("El número es menor");
            else {
                System.out.println("Correcto");
                found = true;
            }
        }
        sc.close();

    }
}
