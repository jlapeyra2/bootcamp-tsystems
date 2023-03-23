package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_ControlStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> diccionario = new HashMap<>();
        // Inicializar el diccionario con 10 artículos predefinidos
        diccionario.put("Leche", 1.20);
        diccionario.put("Pan", 0.80);
        diccionario.put("Huevos", 1.50);
        diccionario.put("Manzanas", 2.00);
        diccionario.put("Naranjas", 1.50);
        diccionario.put("Plátanos", 1.00);
        diccionario.put("Pollo", 5.00);
        diccionario.put("Pescado", 7.00);
        diccionario.put("Arroz", 1.50);
        diccionario.put("Pasta", 1.00);
        while (true) {
            System.out.println("Escoje una opción:");
            System.out.println("1. Añadir un nuevo artículo");
            System.out.println("2. Consultar información de un artículo");
            System.out.println("3. Listar todos los artículos");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Nombre del artículo: ");
                String articulo = sc.next();
                System.out.print("Precio del artículo: ");
                double precio = Double.parseDouble(sc.next());
                diccionario.put(articulo, precio);
                System.out.println("Artículo añadido.");
                System.out.println(diccionario);
            } else if (opcion == 2) {
                System.out.print("Nombre del artículo: ");
                String articulo = sc.next();
                if (diccionario.containsKey(articulo)) {
                    System.out.println("Precio del artículo " + articulo + ": " + diccionario.get(articulo));
                } else {
                    System.out.println("El artículo " + articulo + " no está en la lista.");
                }
            } else if (opcion == 3) {
                System.out.println(diccionario);
            } else if (opcion == 4) {
                break;
            }
        }
        sc.close();
    }
}
