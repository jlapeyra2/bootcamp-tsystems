package T8;

import java.util.Random;

public class Password {
    int longitud = 8;
    String password;

    Password() {}

    Password(int longitud) {
        this.longitud = longitud;
        password = "";
        Random random = new Random();
        for (int i = 0; i < longitud; i++)
        {
            password += (char)(random.nextInt(0x80-0x20) + 0x20);
        }
        //System.out.println(password);
    }

    /*public static void main(String[] args) {
        Password p = new Password(8);
    }*/
}
