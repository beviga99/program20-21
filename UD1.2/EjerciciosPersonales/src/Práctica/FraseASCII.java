package Práctica;

public class FraseASCII {

    public static void main(String[] args) {

        String Frase = "La lluvia en Sevilla es una maravilla";
        Frase = Frase.toLowerCase();

        for (int i = 0; i < Frase.length(); i++) {
            System.out.print((int) Frase.charAt(i) + " ");
        }
    }
}
