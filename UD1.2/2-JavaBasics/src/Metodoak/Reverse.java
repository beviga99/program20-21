package Metodoak;

import java.util.Scanner;

public class Reverse {

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

        System.out.print("The reverse of the array is: ");
        reverse(array);
        System.out.println();
    }

    public static void reverse(int[] array) {
        int t;
        int L = array.length - 1;
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            t = array[fIdx];
            array[fIdx] = array[bIdx - fIdx];
            array[array.length - fIdx - 1] = t;
        }
        System.out.print("[");
        for (int n = 0; n < array.length; n++) {
            if (n < L) {
                System.out.print(array[n] + ", ");
            } else if (n == L) {
                System.out.print(array[n] + "]");
            }
        }
    }
}
