package introduction;

public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!

      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "TWO" ); break;
         case 3: 
            System.out.println( "THREE" ); break;
         case 4: 
            System.out.println( "FOUR" ); break;
         case 5: 
            System.out.println( "FIVE" ); break;
         case 6: 
            System.out.println( "SIX" ); break;
         case 7: 
            System.out.println( "SEVEN" ); break;
         case 8: 
            System.out.println( "EIGHT" ); break;
         case 9: 
            System.out.println( "NINE" ); break;
         default: System.out.println( "It isnt a correct value." ); 
      }
      System.out.println("Done");
   }
}
