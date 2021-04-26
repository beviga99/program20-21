package Práctica;

import java.util.Scanner;

public class PrecioProducto {

    public static void main(String[] args) {
        double N;
        double TP;
        final double IVA =0.21;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el precio de un producto: ");
        N = in.nextInt();
        
       
       TP=N+(N*IVA);
      
       System.out.println("El precio total es: " + TP);
    }
}
