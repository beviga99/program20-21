package Práctica;

public class Bucle23 {

    public static void main(String[] args) {
        int max = 100;
        int min = 0;

        System.out.print("Los números divisibles entre 2 y 3 son:");
        while (min <= max) {
            if (min % 2 == 0 || min % 3 == 0) {
                System.out.println(min);
            }
            min++;
        }

    }
}
