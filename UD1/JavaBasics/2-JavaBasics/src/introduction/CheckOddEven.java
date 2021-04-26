package introduction;

public class CheckOddEven {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
      int number = 49;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( (number % 2) == 0 ) {
         System.out.println( "Even number" );   // even number
      } else {
         System.out.println( "Odd number" );   // odd number
      }
      System.out.println( "DONE" );
   }
}
