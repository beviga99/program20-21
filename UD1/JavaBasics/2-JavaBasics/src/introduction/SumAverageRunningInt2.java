package introduction;

public class SumAverageRunningInt2 {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      int sum = 0;          
      double average;       
      int lowerbound = 1;
      int upperbound = 100;
      int number = 0;
      do {
         sum += number;
         ++number;                    
      } while (number <= upperbound);
     
      average = (double)sum/upperbound;
      System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
      System.out.println("The average is "+average);
   }
}
