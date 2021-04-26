package javabasics;

import java.util.Scanner;

public class SumDigtsInt {

    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();
        
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
            sum += inDigit;
        }
        
        in.close();
        System.out.println("The sum of all digits is: " + sum);
    }

}
