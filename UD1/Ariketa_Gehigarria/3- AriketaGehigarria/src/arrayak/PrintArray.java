
package arrayak;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
            Scanner in = new Scanner(System.in);

      // Prompt and read input as "String"
      System.out.print("Enter the number of items: ");
      numItems = in.nextInt();

      // Allocate the array
      items = new int[numItems];

      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {
            items[i] = in.nextInt();
            if (i == 0) {
            // Print the first item without a leading commas
            System.out.print("The value are: [" + items[0]);
         } else {
            // Print the subsequent items with a leading commas
            System.out.print(", " + items[i]);
         }
         }
      }
      System.out.println("]");
      in.close();
   }
}
