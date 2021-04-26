package javabasics;

public class CozaLozaWoza {    

    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 110;
        for (int number = lowerbound; number <= upperbound; ++number) {
            if (number % 3 == 0) {
                System.out.print("Coza");
            }
            
            if (number % 5 == 0) {
                System.out.print("Loza");
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                System.out.print(number);
            }
            // After processing the number, print a newline if number is divisible by 11; 
            // else print a space
            if (number % 11 == 0) {
            System.out.println(); 
            }else {
            System.out.print(" "); 
         }
        }
    }
}
