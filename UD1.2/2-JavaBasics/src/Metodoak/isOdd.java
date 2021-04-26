package Metodoak;

import java.util.Scanner;

public class isOdd {

    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = in.nextInt();

        if (isOdd(number)) {
            System.out.print(number + " is an odd number");
        } else {
            System.out.print(number + " is an even number");
        }
        System.out.println();
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;
        if (number % 2 == 0) {
        } else {
            isOdd = true;
        }
        return isOdd;
    }
}
