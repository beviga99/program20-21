package javabasics;

import java.util.Scanner;

public class NumberPattern2 {

    public static void main(String[] args) {

        int size;
        int numb;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    numb = col;
                    System.out.print((numb - row + 1) +  (" "));

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}