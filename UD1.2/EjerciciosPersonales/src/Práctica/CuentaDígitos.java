package Práctica;

import java.util.Scanner;

public class CuentaDígitos {

    public static void main(String[] args) {
       long N;
       Scanner in=new Scanner(System.in);
       
       System.out.print("Introduce un número entero positivo: ");
       N=in.nextInt();
       
       System.out.print("El número tiene " + Cifras(N) + " cifras.");
       System.out.println();
    }
    
    public static int Cifras(long N) {
        int Cifras=0;
        while (N>0) {
            Cifras += 1;
            N/=10;
        }
        return Cifras;
    }
}
