package Metodoak;

import java.util.Scanner;

public class ArrayToString {

    public static void main(String[] args) {

        int[] array;
        int arrayL;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        arrayL = in.nextInt();

        array = new int[arrayL];

        System.out.print("Enter the array with spaces :");
        for (int i = 0; i < arrayL; ++i) {
            array[i] = in.nextInt();
        }
        System.out.print("[");
        System.out.print(arrayToString(array));
        System.out.print("]");
        System.out.println();
    }

    public static String arrayToString(int[] array2) {
        String arrayS = "";
        for (int i = 0; i < array2.length; i++) {
            if (i < array2.length - 1) {
                System.out.print(Integer.toString(array2[i]) + " ,");
            } else {
                System.out.print(" " + Integer.toString(array2[i]));
            }   
        }
        return arrayS;
    }
   
}
