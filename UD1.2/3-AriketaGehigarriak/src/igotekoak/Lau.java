package igotekoak;

import java.util.Scanner;

public class Lau {

    public static void main(String[] args) {

        char karakterea;
        int zenbat;
        char jarraitu = 0;

        Scanner in = new Scanner(System.in);
        
         System.out.print("Aukeratu karaktere bat: ");
            karakterea = in.next().charAt(0);
            System.out.print("Zenbat aldiz inprimatu nahi duzu?");
            zenbat = in.nextInt();
            karaktereakInprimatu(karakterea,zenbat);
            
            System.out.print("Jarraituko dugu(b/e)? ");
        if (jarraitu == 'b') {
            System.out.print("Aukeratu karaktere bat: ");
            karakterea = in.next().charAt(0);
            System.out.print("Zenbat aldiz inprimatu nahi duzu?");
            zenbat = in.nextInt();
            karaktereakInprimatu(karakterea,zenbat); 
            System.out.print("Jarraituko dugu(b/e)? ");
        } else if (jarraitu == 'e') {
            System.out.print("Agur!!!");
        }
    }


    public static void karaktereakInprimatu(char karakterea, int zenbat) {
        
        for (int n = 0; n < zenbat; n++) {
            System.out.print(karakterea);
        }
         System.out.println();
    }
}
