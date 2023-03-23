package TA7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex4_VentasYStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> stock = new HashMap<>();
        stock.put("Leche", 1.20);
        stock.put("Pan", 0.80);
        stock.put("Huevos", 1.50);
        stock.put("Manzanas", 2.00);
        stock.put("Naranjas", 1.50);
        stock.put("Plátanos", 1.00);
        stock.put("Pollo", 5.00);
        stock.put("Pescado", 7.00);
        stock.put("Arroz", 1.50);
        stock.put("Pasta", 1.00);

        ArrayList<String> carrito = new ArrayList<>();
        double total = 0.0;
        double iva = 0.21;

        while (true) {
            System.out.println("1. Añadir un artículo al carrito");
            System.out.println("2. Consultar información de un artículo");
            System.out.println("3. Listar todos los artículos en stock");
            System.out.println("4. Pagar");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Nombre del artículo: ");
                String articulo = sc.next();
                if (stock.containsKey(articulo)) {
                    carrito.add(articulo);
                    total += stock.get(articulo);
                    System.out.println("Artículo añadido al carrito.");
                } else {
                    System.out.println("El artículo " + articulo + " no está en el stock.");
                }
            } else if (opcion == 2) {
                System.out.print("Nombre del artículo: ");
                String articulo = sc.next();
                if (stock.containsKey(articulo)) {
                    System.out.println("Precio del artículo " + articulo + ": " + stock.get(articulo));
                } else {
                    System.out.println("El artículo " + articulo + " no está en el stock.");
                }
            } else if (opcion == 3) {
                System.out.println(stock);
            } else if (opcion == 4) {
                System.out.println("Carrito: "+carrito);
                System.out.println("A pagar: "+total);
                System.out.print("Cantidad pagada: ");
                double pagado = sc.nextDouble();
                double cambio = pagado - total - (total * iva);
                System.out.println("IVA aplicado: " + iva);
                System.out.println("Precio total bruto: " + total);
                System.out.println("Precio total con IVA: " + (total + (total * iva)));
                System.out.println("Número de artículos comprados: " + carrito.size());
                System.out.println("Cambio a devolver al cliente: " + cambio);
                carrito.clear();
                total = 0.0;
            } else if (opcion == 5) {
                break;
            }
        }
        sc.close();
    }
}
