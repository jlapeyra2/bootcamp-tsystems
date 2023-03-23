package T10;

public class Ex2 {
    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");
            throw new MyException("Esto es un objeto MyException");
        } catch (MyException e) {
            System.out.println("Excepción capturada con mensaje: " + e.getMessage());
        }
        System.out.println("Programa terminado");
    }
}
