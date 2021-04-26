package Metodoak;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

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

        if (swap(array1, array2) == true) {
            System.out.print("The arrays can swap. ");
            System.out.print(Arrays.toString(array1));
        } else {
            System.out.print("The arrays can't swap. ");
        }
        System.out.println();
    }

    public static boolean swap(int[] array1, int[] array2) {
        boolean equals = false;
        int temp;
        for (int i = 0; i < array1.length; i++) {
            if (array1.length == array2.length) {
                temp = array1[i];
                array1[2] = array2[i];
                array2[i] = temp;
            }
            equals=true;
        }
        return equals;
    }
}
