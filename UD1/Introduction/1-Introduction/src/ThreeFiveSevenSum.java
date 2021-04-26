
public class ThreeFiveSevenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound
      
      int sum = 0;
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         if (((number % 3 == 0) || (number % 5 == 0) || (number % 7 == 0)) && !((number % 15 == 0) || (number % 21 ==0) || (number % 35 == 0) || (number % 105 == 0) )) {  // Even
            sum += number;   // Same as sumEven = sumEven + number
         }
         ++number;  // Next number
      } 
      // Print the result
      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sum);
   }
}