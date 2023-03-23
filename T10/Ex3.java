package T10;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Generando número aleatorio...");
        Random random = new Random();
        int num = random.nextInt(1000);
        System.out.println("El número es: "+num);
        try {
            throw new Exception("Es " + (num%2==0 ? "par" : "impar"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
