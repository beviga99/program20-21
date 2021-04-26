package Azterketa;

import java.util.Arrays;
import java.util.Scanner;

public class Multiploak {

    public static void main(String[] args) {
        int Zenbaki;
        int Multiplo;
        int[] array = {};
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki bat: ");
        Zenbaki = in.nextInt();
        System.out.print("Sartu multiplikatzaile kopururu bat: ");
        Multiplo = in.nextInt();

        System.out.println(Zenbaki + " Zenbakiaren " + Multiplo + " multiploak:");

        printMultiploak(Zenbaki, Multiplo);

        getMultiploak(array, Zenbaki, Multiplo);
    }

    public static void printMultiploak(int Zenbaki, int Multiplo) {
        for (int i = 1; i < Multiplo; i++) {
            if (Multiplo >= 10) {
                System.out.print(Zenbaki * i + " - ");
            } else {
                System.out.println(Zenbaki * i);
            }
        }
        if (Multiplo >= 10) {
            System.out.print(Zenbaki * Multiplo);
        } else {
            System.out.println(Zenbaki * Multiplo);
        }
        System.out.println();
    }

    public static void getMultiploak(int[] array, int Zenbaki, int Multiplo) {
        array = new int[Multiplo];
        for (int i = 1; i <= Multiplo; i++) {
            array[i - 1] = Zenbaki * i;
        }
        System.out.println(Arrays.toString(array));
    }
}
