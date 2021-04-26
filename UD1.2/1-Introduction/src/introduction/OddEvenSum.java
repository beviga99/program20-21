package introduction;

public class OddEvenSum {  
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound
      int sumOdd  = 0;    // For accumulating odd numbers, init to 0
      int sumEven = 0;    // For accumulating even numbers, init to 0
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         if (number % 2 == 0) {  // Even
            sumEven += number;   // Same as sumEven = sumEven + number
         } else {                // Odd
            sumOdd += number;    // Same as sumOdd = sumOdd + number
         }
         ++number;  // Next number
      } 
      // Print the result
      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sumOdd);
      System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + "  is " + sumEven);
      System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
   }
}
