
package methods;

import java.util.Scanner;

/**
 *
 * @author vilarchao.benat
 */
public class OddEvenTest {
    public static void main(String[] args) {
        
        int num;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        num = in.nextInt();
        
        if (isOdd(num) == 1){
            System.out.println(num + " is an even number.");
        } else  {
            System.out.println(num + " is an odd number.");
        }
        
    }
   public static int isOdd (int num) {
       
       int bool;
       
      if (num % 2 == 0){
          bool = 1;
      } else {
          bool = 0;
      }
      return bool;
   }
}
