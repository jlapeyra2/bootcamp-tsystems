package T8;

enum Color {
    BLANCO, NEGRO, ROJO, AZUL, GRIS
}

enum Consumo {
    A, B, C, D, E, F
}

public class Electrodomestico {
    protected double precio = 100;
    protected Color color = Color.BLANCO;
    protected Consumo consumo_energetico = Consumo.F;
    protected double peso = 5;

    Electrodomestico() {}

    Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    Electrodomestico(double precio, double peso, Color color, Consumo consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo_energetico = consumo;
    }

    
    public void setColor(Color color) {
        this.color = color;
    }
    public void setConsumo_energetico(Consumo consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Color getColor() {
        return color;
    }
    public Consumo getConsumo_energetico() {
        return consumo_energetico;
    }
    public double getPeso() {
        return peso;
    }
    public double getPrecio() {
        return precio;
    }

}
