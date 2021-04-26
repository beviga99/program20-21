package Práctica;

import java.util.Scanner;

public class BooleanPrimo {

    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        N = in.nextInt();

        if (Primo(N) == true) {
            System.out.print("El número " + N + " es un número primo.");
        } else {
            System.out.print("El número " + N + " no es un número primo.");
        }
        System.out.println();
    }

    public static boolean Primo(int N) {
        boolean Primo = false;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            Primo = true;
        }
        return Primo;
    }
}
