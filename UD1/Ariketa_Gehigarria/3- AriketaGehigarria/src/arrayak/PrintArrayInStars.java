
package arrayak;

import java.util.Scanner;


public class PrintArrayInStars {
    public static void main(String[] args) {
         
      int numItems;
      int[] items;  
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the number of items: ");
      numItems = in.nextInt();

      items = new int[numItems];

      System.out.print("Enter the value of all items (separated by space): ");
      for (int idx = 0; idx < items.length; ++idx) {  
          items[idx] = in.nextInt();
         System.out.print(idx + ": ");
   
         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  
             if (items[idx] == 0) {
            System.out.print(" ");
             } else {
                 System.out.print("*");
             }
         }
         System.out.println("(" + items[idx] + ")");
      }
      in.close();
    }
}
