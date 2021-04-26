package Metodoak;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {

        int number;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != -1) {
            if (isMagic(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.print("The magic sum is: " + sum);
        System.out.println();
    }

    public static boolean isMagic(int number) {
        boolean isMagic = false;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 8) {
                isMagic = true;
                break;
            }
            number /= 10;
        }
         return isMagic;
                 
    }
}
