package TA05;

import javax.swing.JOptionPane;

public class Ex3App {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog(null, "Introdueix el teu nom");
        System.out.println("Benvingut "+nom);
    }
}