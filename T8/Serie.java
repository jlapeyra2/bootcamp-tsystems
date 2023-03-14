package T8;

enum Color {
    BLANCO, NEGRO, ROJO, AZUL, GRIS
}

enum Consumo {
    A, B, C, D, E, F
}

public class Serie {
    private String titulo;
    private int num_temporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    Serie() {}

    Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    Serie(String titulo, String creador, int num_temporadas, boolean entregado, String genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.num_temporadas = num_temporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    
    public String getCreador() {
        return creador;
    }
    public boolean getEntregado() {
        return entregado;
    }
    public String getGenero() {
        return genero;
    }
    public int getNum_temporadas() {
        return num_temporadas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
