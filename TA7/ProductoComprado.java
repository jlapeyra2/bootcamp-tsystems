package TA7;

public class ProductoComprado {
    double iva;
    double precio_bruto;
    double precio() {return precio_bruto + iva;}
    int unidades;
    double pagado;
    double cambio() {return pagado - unidades*precio();}
}
