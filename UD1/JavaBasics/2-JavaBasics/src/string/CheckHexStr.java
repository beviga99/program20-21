
import java.util.Scanner;


public class CheckHexStr {

public static void main(String args[]) {
 
      String inStr;        
      int inStrLen;
      int f = 0;
      char inStreverse = 0;
      Scanner in = new Scanner(System.in);

      // Prompt and read input as "String"
      System.out.print("Enter the hex string: ");
      inStr = in.next();   
      inStrLen = inStr.length();
   
      for (int fIdx = 0, bIdx = inStrLen - 1; fIdx < inStrLen; ++fIdx, --bIdx) {  
          
         inStreverse = inStr.charAt(fIdx);
         
         if (((inStreverse >= '0' && inStreverse <= '9')
      || (inStreverse >= 'A' && inStreverse <= 'F')
      || (inStreverse >= 'a' && inStreverse <= 'f'))) {
          f = 1;
         } else {
          f = 0;
      }
      }
      if (f == 1){
         System.out.println("This is hex string.");
      } else {
          System.out.println("This is not hex string.");
      }
      
    }
}
