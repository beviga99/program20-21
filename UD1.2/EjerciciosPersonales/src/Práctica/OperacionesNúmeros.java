package Práctica;

import java.util.Scanner;

public class OperacionesNúmeros {

    public static void main(String[] args) {
        int N;
        int count = 0;
        int sum = 0;
        int sumP = 0;
        int sumN = 0;
        int max = 0;
        int min = 100;
        float average;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            N = in.nextInt();
            count++;
            sum += N;
            if (N > max) {
                max = N;
            }
            if (N < min) {
                min = N;
            }
            if (N >= 0) {
                sumP += N;
            } else if (N < -1) {
                sumN += N;
            }
        } while (N != -1);
        average=(float) sum/count;

        System.out.println("El mayor número introducido es: " + max);
        System.out.println("El menor número introducido es: " + min);
        System.out.println("La suma de los números es: " + sum);
        System.out.println("La suma de los números positivos es: " + sumP);
        System.out.println("La suma de los números negativos es: " + sumN);
        System.out.println("La media de la suma es: " + average);
    }

}
