package introduction;
public class ArithmeticExercise1 {     // Save as "ArithmeticTest.java"
   public static void main(String[] args) {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5;  // Declare an int variable number2 and initialize it to 5
      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
   
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;
      System.out.print("The sum, difference, product, quotient and remainder of " + number1 + "and " + number2 + "are " + sum + ", " + difference + ", " + product + ", " + quotient + "and " + remainder);
   } 
}