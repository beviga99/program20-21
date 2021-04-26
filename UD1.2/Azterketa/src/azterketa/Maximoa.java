package azterketa;

import java.util.Scanner;

public class Maximoa {

    public static void main(String[] args) {
        int zenbaki = 0;
        int max = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("MAXIMOAREN KALKULUA");
        System.out.println("===================");

        while (zenbaki !=-1) {
            System.out.print("Sartu zenbaki positibo bat (Bukatzeko,-1):");
            zenbaki = in.nextInt();
            if (zenbaki > max) {
                max = zenbaki;
            }
        }
        System.out.println("Sartu dituzun zenbaki guztien artean handiena " + max + " izan da.");
        System.out.println();
    }
}
