package Práctica;

import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
        long Euros;
        String Divisa;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cantidad de euros: ");
        Euros = in.nextInt();

        System.out.print("Indica a que divisa deseas convertirlo: ");
        Divisa = in.next().toLowerCase();

        Conversion(Euros, Divisa);
        System.out.println();
    }

    public static void Conversion(long Euros, String Divisa) {
        double Conversion;

        switch (Divisa) {
            case "libras":
                Conversion = Euros * 0.86;
                System.out.print("Conversión = " + Conversion + " libras");
                break;

            case "dolares":
                Conversion = Euros * 1.28611;
                System.out.print("Conversión = " + Conversion + "dolares");
                break;

            case "yenes":
                Conversion = Euros * 129.852;
                System.out.print("Conversión = " + Conversion + " yenes");
                break;
            
            default:
                System.out.print("No has introducido una divisa correcta.");
                break;
        }
    }
}
