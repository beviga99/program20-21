package azterketa;

import java.util.Scanner;

public class Azterketa {

    public static void main(String[] args) {
        
        int altuera;
        int zabalera;
        int n = 1;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu altuera: ");
        altuera = in.nextInt();
        while (altuera < 0) {
            System.out.print("Sartu altuera: ");
            altuera = in.nextInt();
        }
        
        System.out.print("Sartu zabalera: ");
        zabalera = in.nextInt();
        while (zabalera < 0) {
            System.out.print("Sartu zabalera: ");
            zabalera = in.nextInt();
        }
        
        for (int row = 1; row <= altuera; row++) {
            for (int col = 1; col <= zabalera; col++) {
                if (n <10) {
                System.out.print("  " + n++ + " ");
                } else {
                    System.out.print(" " + n++ + " ");
                }
            }
             System.out.println();
        }
    }
}
