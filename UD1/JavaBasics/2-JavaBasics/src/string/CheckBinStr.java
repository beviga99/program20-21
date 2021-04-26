package string;

import java.util.Scanner;


public class CheckBinStr {

public static void main(String args[]) {
 
      String inStr;        
      int inStrLen;
      int f = 0;
      char inStreverse = 0;
      char inStrSano = 0;
      int ia = 0;
      int ib = 0;
      Scanner in = new Scanner(System.in);

      // Prompt and read input as "String"
      System.out.print("Enter the numbers: ");
      inStr = in.next();   
      inStrLen = inStr.length();
   
      for (int fIdx = 0, bIdx = inStrLen - 1; fIdx < inStrLen; ++fIdx, --bIdx) {  
          
         inStreverse = inStr.charAt(bIdx);
         inStrSano = inStr.charAt(fIdx);
         ia = inStreverse;
         ib = inStrSano;
         
         if (ia == '1' || ia == '0') {
          f = 1;
         } else {
          f = 0;
      }
      }
      if (f == 1){
         System.out.println("This is binari.");
      } else {
          System.out.println("This is not binari.");
      }
      
    }
}

