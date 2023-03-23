package TA7;

import java.util.Hashtable;

public class Ex1_Notas {
    
    public static void main(String[] args) {
        Hashtable<String, Double> notes = new Hashtable<>();
        notes.put("Pere", 7.0);
        notes.put("Andreu",6.0);
        notes.put("Jesús",10.0);
        notes.put("Mateu",9.0);
        notes.put("Felip", 8.0);

        for (String alumne : notes.keySet()) {
            System.out.println(alumne+": "+notes.get(alumne));
        }

    }
}
