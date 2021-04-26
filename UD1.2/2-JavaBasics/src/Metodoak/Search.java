package Metodoak;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        int N;
        int[] array;
        int arrayL;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        N = in.nextInt();
        System.out.print("Enter the length of the array: ");
        arrayL = in.nextInt();

        array = new int[arrayL];

        System.out.print("Enter the array with spaces :");
        for (int i = 0; i < arrayL; ++i) {
            array[i] = in.nextInt();
        }
        System.out.print(search(array, N));
        System.out.println();
    }

    public static int search(int[] array, int N) {
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                return array[i];
            }
        }
        
        return -1;
    }
}
