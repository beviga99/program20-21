package javabasics;
public class SumAverageRunningInt5 {   
   public static void main (String[] args) {
            
      double average;      
      int lowerbound = 1;
      int upperbound = 100;
      int sum = 0;
      
      for (int number = lowerbound; number <= upperbound; ++number) {
            
         sum += number*number;     
      }
     
      average = (double)sum/ upperbound;
      
      System.out.println("The sum of squares is: " + sum);
      System.out.println("The average squares is: " + average);
   }
}
