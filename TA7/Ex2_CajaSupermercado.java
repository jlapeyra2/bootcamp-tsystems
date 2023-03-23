package TA7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_CajaSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> cantidades = new ArrayList<>();
        double cantidad, precio, precioTotalBruto = 0, precioTotalIVA = 0, iva;
        int numArticulos = 0;
        System.out.println("Introduzca la cantidad y precio de cada articulo comprado (0 0 para finalizar):");
        do {
            cantidad = sc.nextDouble();
            precio = sc.nextDouble();
            if (cantidad != 0 && precio != 0) {
                cantidades.add(cantidad);
                precioTotalBruto += cantidad * precio;
                numArticulos++;
            }
        } while (cantidad != 0 && precio != 0);
        iva = 0.21;
        precioTotalIVA = precioTotalBruto * (1 + iva);
        System.out.println("IVA aplicado: " + (iva * 100) + "%");
        System.out.println("Precio total bruto: " + precioTotalBruto);
        System.out.println("Precio total con IVA: " + precioTotalIVA);
        System.out.println("Numero de articulos comprados: " + numArticulos);
        System.out.print("Cantidad pagada: ");
        double cantidadPagada = sc.nextDouble();
        double cambio = cantidadPagada - precioTotalIVA;
        System.out.println("Cambio a devolver: " + cambio);
        sc.close();
    }
}
