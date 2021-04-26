package introduction;

public class SumAverageRunningInt1 {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      int sum = 0;          
      double average;       
      int lowerbound = 1;
      int upperbound = 100;

      for (int number = lowerbound; number <= upperbound; ++number) {
          sum += number;     
      }
     
      average = (double)sum/upperbound;
      System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
      System.out.println("The average is "+average);
   }
}
