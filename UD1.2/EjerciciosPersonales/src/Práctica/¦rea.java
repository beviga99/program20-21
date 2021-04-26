package Práctica;

import java.util.Scanner;

public class Área {

    public static void main(String[] args) {
        String Forma;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la forma de la que quieres calcular el área: ");
        Forma = in.nextLine().toLowerCase();

        switch (Forma) {
            case "circulo":
                Circulo(Forma);
                break;

            case "triangulo":
                Triangulo(Forma);
                break;

            case "cuadrado":
                Cuadrado(Forma);
                break;
            default:
                System.out.print("No has introducido una forma válida."); 
        }
        System.out.println();
    }

    public static void Circulo(String Forma) {
        double Radio;
        final double PI = 3.14;
        double AreaCirculo;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el rádio del círculo: ");
        Radio = in.nextInt();

        AreaCirculo = (Radio * Radio) * PI;

        System.out.print("El área de " + Forma + " es: " + AreaCirculo);
    }

    public static void Triangulo(String Forma) {
        double Base;
        double Altura;
        double AreaTriangulo;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        Base = in.nextInt();

        System.out.print("Introduce la altura del triángulo: ");
        Altura = in.nextInt();

        AreaTriangulo = (Base * Altura) / 2;

        System.out.print("El área de " + Forma + " es: " + AreaTriangulo);
    }

    public static void Cuadrado(String Forma) {
        double Lado;
        double AreaCuadrado;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el lado del cuadrado: ");
        Lado = in.nextInt();

        AreaCuadrado = Lado * Lado;

        System.out.print("El área de " + Forma + " es: " + AreaCuadrado);
    }
}
