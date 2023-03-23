package T10;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la longitud de las contraseñas: ");
        int longitud = sc.nextInt();
        
        System.out.print("Introduce el tamaño del array de Passwords: ");
        int tamaño = sc.nextInt();
        
        Password[] contraseñas = new Password[tamaño];
        boolean[] esFuerteArray = new boolean[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            contraseñas[i] = new Password(longitud);
            esFuerteArray[i] = contraseñas[i].esFuerte();
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println(contraseñas[i].getContraseña() + " " + esFuerteArray[i]);
        }
    }
}

