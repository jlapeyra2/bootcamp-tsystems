package TA05;

public class Ex1App {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        char cmp;
        if (x > y) cmp = '>';
        else if (x < y) cmp = '<';
        else cmp = '=';
        System.out.println(x+" "+cmp+" "+y);
    }
}