package Práctica;

import java.util.Scanner;

public class DíaLaborable {

    public static void main(String[] args) {
        String[] DíasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        Scanner in = new Scanner(System.in);
        String Día;

        System.out.print("Introduce un día de la semana: ");
        Día = in.nextLine();

        if (Laborable(DíasSemana, Día) == true) {
            System.out.print("El día de la semana es laborable");
        } else {
            System.out.print("El día de la semana no es laborable");
        }
        System.out.println();
    }

    private static boolean Laborable(String[] DíasSemana, String Día) {
        boolean Laborable = false;
        for (int i = 0; i < DíasSemana.length; i++) {
            if (Día.equals(DíasSemana[i])) {
                Laborable = true;
            }
        }
        return Laborable;
    }
}
