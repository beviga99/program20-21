package string;

import java.util.Scanner;


public class CountVowelsDigits {

public static void main(String args[]) {
        
        String inStr;        
        int inStrLen;
        int cTotal = 0;
        int cVowels = 0;
        int cDigits = 0;

        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();   
        inStrLen = inStr.length();
   
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
            cTotal++;
            char c = inStr.charAt(charIdx);
            int cInt = c;
            //System.out.println(c);
            //System.out.println(cInt);
            if (cInt >= 48 && cInt <= 57){
                cDigits++;
            }
            if (c == 'a' || c == 'e' || c == 'i'|| c == 'o'||c == 'u'){
                cVowels++;
            } 
        }
        System.out.println("String: "+inStr);
        System.out.println("Vowels: "+cVowels);
        System.out.println("Digits: "+cDigits);
}
}
