package introduction;
public class ThreeFiveSevenSum {
   public static void main(String[] args) {
   int lowerbound = 1, upperbound = 1000;
   int sumOdd  = 0;    
   int sumEven = 0;   
   int number = lowerbound;
   while (number <= upperbound) {
   if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) &&number % 15 != 0 &&number % 21 != 0 &&number % 35 != 0 &&number % 105 != 0){
      sumOdd += number;
        }
      ++number;
      }
      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sumOdd);
         }
}
