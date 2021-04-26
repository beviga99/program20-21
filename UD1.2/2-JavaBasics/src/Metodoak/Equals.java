package Metodoak;

import java.util.Arrays;
import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int array1L;
        int array2L;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the array 1: ");
        array1L = in.nextInt();

        array1 = new int[array1L];

        System.out.print("Enter the array 1 with spaces :");
        for (int i = 0; i < array1L; ++i) {
            array1[i] = in.nextInt();
        }

        System.out.print("Enter the length of the array 2: ");
        array2L = in.nextInt();

        array2 = new int[array2L];

        System.out.print("Enter the array 2 with spaces :");
        for (int i = 0; i < array2L; ++i) {
            array2[i] = in.nextInt();
        }

        System.out.print("The arrays are the same: " + equals(array1, array2));

        System.out.println();
    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean equals = false;
        if (Arrays.equals(array1, array2)) {
            equals = true;
        }

        return equals;
    }
}
