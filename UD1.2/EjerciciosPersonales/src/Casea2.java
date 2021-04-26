
import java.util.Scanner;

public class Casea2 {

    public static void main(String[] args) {
        String Palabra;
        char Modo;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        Palabra = in.nextLine();

        System.out.print("Introduce un modo de cambio (M,m o G): ");
        Modo = in.next().charAt(0);

        System.out.print("La palabra cambiada es: " + palabraCambiada(Palabra, Modo));
        System.out.println();
    }

    public static String palabraCambiada(String Palabra, char Modo) {
        String palabraCambiada = "";
        char Letra;
        switch (Modo) {
            case 'M':
                palabraCambiada = Palabra.toUpperCase();
                break;
            case 'm':
                palabraCambiada = Palabra.toLowerCase();
                break;
            case 'G':
                for (int i = 0; i < Palabra.length(); i++) {
                    Letra = Palabra.charAt(i);
                    if (Letra >= 65 && Letra <= 90) {
                        palabraCambiada += Character.toString(Letra + 32);
                    } else if (Letra >= 97 && Letra <= 122) {
                        palabraCambiada += Character.toString(Letra - 32);
                    }
                }
                break;
        }

        return palabraCambiada;
    }
}
