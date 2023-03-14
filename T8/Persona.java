package T8;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;

    public final static String HOMBRE = "H";
    public final static String MUJER = "M";

    Persona() {
        this.sexo = HOMBRE;
    }

    Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
    public String getSexo() {
        return sexo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

