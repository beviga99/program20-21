package introduction;


public class PrintDayInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
        
      switch(number) {
         case 0: 
             System.out.println("Monday");
         case 1: 
            System.out.println( "Tuesday" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "Wednesday" ); break;
         case 3: 
            System.out.println( "Thursday" ); break;
         case 4: 
            System.out.println( "Friday" ); break;
         case 5: 
            System.out.println( "Saturday" ); break;
         case 6: 
            System.out.println( "Sunday" ); break;
      }
   }
}