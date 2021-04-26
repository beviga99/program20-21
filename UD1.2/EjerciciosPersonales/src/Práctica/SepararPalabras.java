package Práctica;

import java.util.Arrays;
import java.util.Scanner;

public class SepararPalabras {
  
    public static void main(String[] args) {
       String Frase;
       String[] Palabras;
       
       Scanner in=new Scanner(System.in);
               
       System.out.print("Introduce una frase: ");
       Frase=in.nextLine();
       
       Palabras= Frase.split(" ");
       
       System.out.println("La frase separada en palabras es: " + (Arrays.toString(Palabras)));
       
    }
    
}
