package Metodoak;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOf {

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

        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println("The length of the array is: " + array.length);
    }

    public static int[] copyOf(int[] array) {
        int[] array2 = Arrays.copyOf(array,array.length);
        
        return array2;
    }

}

