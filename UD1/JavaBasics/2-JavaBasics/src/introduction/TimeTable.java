package introduction;

import java.util.Scanner;

public class TimeTable {
   public static void main(String[] args) {
      
      int size;   
      Scanner in = new Scanner(System.in);

      
      System.out.print("Enter the size: ");
      size = in.nextInt();

    
      System.out.print(" * |");
      for (int col = 1; col <= size; ++col) {
         System.out.printf("%4d", col);
      }
      System.out.println();  
      
      System.out.print("----");
      for (int col = 1; col <= size; ++col) {
         System.out.printf("%4s", "----");
      }
      System.out.println();  
      
      for (int row = 1; row <= size; ++row) {  
         System.out.printf("%2d |", row);      
         for (int col = 1; col <= size; ++col) {  
            System.out.printf("%4d", row*col);
         }
         System.out.println();  
      }
   }
}
