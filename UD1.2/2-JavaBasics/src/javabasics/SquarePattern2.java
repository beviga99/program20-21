package javabasics;

import java.util.Scanner;

public class SquarePattern2 {

    public static void main(String[] args) {

        int size;
        int row;
        int col =1;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = in.nextInt();

        do {
            row = 1;
            
            do {
                System.out.print("* ");
                ++row;
            } while (row <= size);
          
            System.out.println();
            ++col;
        } while (col <= size);

    }
}
