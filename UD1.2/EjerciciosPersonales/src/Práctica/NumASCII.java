package Práctica;

import java.util.Scanner;

public class NumASCII {

    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        N = in.nextInt();

        if ((N >= 97 && N <= 122) || (N >= 65 && N <= 90)) {
            char N2 = (char) N;
            System.out.println("The number in ACII is: " + N2);
        }
    }
}
