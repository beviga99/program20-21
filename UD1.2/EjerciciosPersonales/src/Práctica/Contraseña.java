package Práctica;

import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        String Contraseña;
        int Intentos = 0;
        Scanner in = new Scanner(System.in);

        while (Intentos < 3) {
            System.out.print("Introduce la contraseña( " + (Intentos + 1)+ " intentos): ");
            Contraseña = in.nextLine();
            if ("Examen".equals(Contraseña)) {
                System.out.println("Acertaste");
                break;
            }
            Intentos++;
        }
    }
}
