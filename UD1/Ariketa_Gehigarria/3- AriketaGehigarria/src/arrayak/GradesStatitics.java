
package arrayak;

import java.util.Scanner;

public class GradesStatitics {
    public static void main(String[] args) {
      int numItems;
      int[] items;  
      Scanner in = new Scanner(System.in);
      int min = 100;
      int max = 0;
      int sum = 0;
      
      System.out.print("Enter the number of items: ");
      numItems = in.nextInt();

     
      items = new int[numItems];
             
         for (int i = 0; i < items.length; ++i) {
             System.out.print("Enter the grade for student " + (i+1) + ": ");
            items[i] = in.nextInt();
            sum += items[i];
            if (items[i] > max) {
                max = items[i];
            }
            if (items[i] < min) {
                min = items[i];
            }

         }
         
      System.out.println("Minumum: " + min);
      System.out.println("Maximum: " + max);
      System.out.println("The average: " + (sum/numItems));
      in.close();
    }
}
