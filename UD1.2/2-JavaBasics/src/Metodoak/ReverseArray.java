package Metodoak;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
        int n=0;
        int[] ReverseArray={};
        ReverseArray=new int[array.length];
        for (int i=array.length -1;i>=0;i--) {
            ReverseArray[n]=array[i];
            n++;
        }
        System.out.print(Arrays.toString(ReverseArray));
    }
}
