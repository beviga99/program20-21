
public class PrintLeapYears {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      int lowerbound = 999, upperbound = 2010;  // lowerbound and upperbound
      int count  = 0; 
      int sum = 0;
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         if (((number % 4 == 0) && (number % 100 != 0)) || (number % 400 == 0)) {  // Even
            sum += number;   // Same as sumEven = sumEven + number
            System.out.println("The year is" + number);
            ++count;
         } 
         ++number;  // Next number
         
      } 
      // Print the result
      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + count);
}
}