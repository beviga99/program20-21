package Metodoak;

import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {
        
        int N;
        int[] array;
        int arrayL;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        N=in.nextInt();
        System.out.print("Enter the length of the array: ");
        arrayL = in.nextInt();

        array = new int[arrayL];

        System.out.print("Enter the array with spaces :");
        for (int i = 0; i < arrayL; ++i) {
            array[i] = in.nextInt();
        }
        if (contains(array,N)) {
            System.out.print("The array contains the number.");
        } else {
            System.out.print("The array doesn't contain the number.");
        }
       
        System.out.println();
    }
    
    public static boolean contains(int[] array, int N) {
        boolean contains = false;
        for (int i=0;i<array.length;i++) {
            if(array[i]==N) {
                contains=true;
                break;
            }
        }
        return contains;
    }
    
}
