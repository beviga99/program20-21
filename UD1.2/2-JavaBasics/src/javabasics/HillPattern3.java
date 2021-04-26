package javabasics;

import java.util.Scanner;

public class HillPattern3 {

    public static void main(String[] args) {

        int numRows;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        numRows = in.nextInt();
        int numCol = 2 * numRows - 1;

        for (int row = 1; row <= numRows; row++) {

            for (int col = 1; col <= numCol; col++) {
                if ((row + col <= numRows * 2) && (row <= col) && (row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
