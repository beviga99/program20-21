package azterketa;

import java.util.Scanner;

public class Irudia {

    public static void main(String[] args) {
       char karakterea;
       int zabalera;
       Scanner in=new Scanner(System.in);
       
       System.out.print("Sartu karakterea:");
       karakterea=in.next().charAt(0);
       System.out.print("Sartu zabalera:");
       zabalera=in.nextInt();
       
       laukiHorizontalaIrudia(karakterea,zabalera);
    }
    
    public static void laukiHorizontalaIrudia(char karakterea, int zabalera) {
        int altuera =zabalera/2;
        for(int i = 0; i<zabalera; i++) {
            for (int x = 0; x<altuera; x++){
                System.out.print(karakterea + " ");
            }
                System.out.println("");
        }
    }
    
}
