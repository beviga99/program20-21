package Práctica;

import java.util.Scanner;

public class EliminarEspacios {

    public static void main(String[] args) {
        String Frase;
      
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        Frase = in.nextLine();

        for(int i=0;i<Frase.length();i++) {
            if (' ' == Frase.charAt(i)) {
              System.out.print("");
            } else {
                System.out.print(Frase.charAt(i));
            }
        }
        System.out.println();
    }
}
