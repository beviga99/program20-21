package javabasics;
import java.util.Scanner; 

public class Add2Integers { 
   public static void main (String[] args) {
     
      int number1, number2, sum;
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Put up prompting messages and read inputs as "int"
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter second integer: ");  // No newline for prompting message
      number2 = in.nextInt();                     // Read next input as "int"


      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
      in.close();  // Close Scanner
   }
}
