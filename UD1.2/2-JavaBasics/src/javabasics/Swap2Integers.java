package javabasics;

import java.util.Scanner;

public class Swap2Integers {

    public static void main(String[] args) {
        int number1, number2, number1s, number2s;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();

        number1s = number2;
        number2s = number1;

        System.out.println("After the swap, first integer is: " + number1s + ", second integer is: " + number2s);
    }

}
