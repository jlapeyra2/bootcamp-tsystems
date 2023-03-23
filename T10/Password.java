package T10;

import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public boolean esFuerte() {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char caracterActual = contraseña.charAt(i);

            if (Character.isUpperCase(caracterActual)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(caracterActual)) {
                contadorMinusculas++;
            } else if (Character.isDigit(caracterActual)) {
                contadorNumeros++;
            }
        }

        return (contadorMayusculas > 2 && contadorMinusculas > 1 && contadorNumeros > 5);
    }

    public String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            sb.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
        }

        return sb.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public String getContraseña() {
        return contraseña;
    }
}
