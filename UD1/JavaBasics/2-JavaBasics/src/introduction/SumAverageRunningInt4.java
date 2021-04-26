package introduction;


public class SumAverageRunningInt4 {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      int sum = 0;          
      double average;       
      int lowerbound = 111;
      int upperbound = 8899;
      int count = 0;

      for (int number = lowerbound; number <= upperbound; ++number) {
          sum += number;
          count ++;
      }
     
      average = (double)sum/upperbound;
      System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
      System.out.println("The average is "+average);
      System.out.println("It sums "+count+ " times.");
   }
}