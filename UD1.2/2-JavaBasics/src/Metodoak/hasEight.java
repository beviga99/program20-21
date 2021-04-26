package Metodoak;

import java.util.Scanner;

public class hasEight {

    public static void main(String[] args) {
        
        int number;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = in.nextInt();
        
        if (hasEight(number)) {
            System.out.print(number + " has eight");
        } else {
            System.out.print(number + " doesn't has eight");
        }
        System.out.println();
    }
    public static boolean hasEight(int number) {
        boolean hasEight = false;
       
       while (number > 0) {
           int digit = number % 10;
           if (digit == 8) {
               hasEight = true;
               break;
           }
           number/=10;
    }
    return hasEight;
    }
}
