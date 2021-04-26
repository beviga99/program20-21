package pattern;



import java.util.Scanner;

public class NumberPatternXA {
   public static void main(String[] args) {
      
      int size; 
      int num = 1;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the size: ");
      size = in.nextInt();   
       
      for (int row = 1; row <= size; row++) {  
         for (int col = 1; col <= size; col++) {  
            if (row >= col) {
                System.out.print(col + " ");
            } else {
                System.out.print("  ");  
            }
            
         }
         
         System.out.println();
      }
   }
}