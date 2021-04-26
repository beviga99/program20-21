package javabasics;
public class SumAverageRunningInt6 {   
   public static void main (String[] args) {
                
      int lowerbound = 1;
      int upperbound = 100;
      int sumOdd = 0;
      int sumEven = 0;
      int absDiff;
      
      for (int number = lowerbound; number <= upperbound; ++number) {
         if (number % 2 == 0) { 
         sumEven += number;     
      } else {
         sumOdd += number;
         }
      }
      if (sumOdd > sumEven) {
          absDiff = sumOdd - sumEven;
      } else {
          absDiff = sumEven - sumOdd;
      }
      System.out.println("The sum of odd numbers is: " + sumOdd);
      System.out.println("The sum of even numbers is: " + sumEven);
      System.out.println("the absolute difference between two sums is: " + absDiff);
     
    }
}