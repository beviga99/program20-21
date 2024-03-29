
public class RunningNumberOddSum {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
      int lowerbound = 1;      // Store the lowerbound
      int upperbound = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         sum = sum + number;  // Accumulate number into sum
         number = number + 2;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
   }
}