package stringak;

import java.util.Scanner;

public class CheckBinStr {

    public static void main(String[] args) {
        
        String inStr;
        int inStrLen;
        char StrChar;
        boolean isValid;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a binary String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        
        isValid = true;
        for (int StrIdx = 0; StrIdx < inStrLen; StrIdx++) {
            StrChar = inStr.charAt(StrIdx);
            
            if (!(StrChar == '0' || StrChar == '1')) {
                isValid = false;
                break;
            }   
        }
        if (isValid) {
            System.out.println(inStr + " is a binary string");
        } else {
            System.out.println(inStr + " is NOT a binary string");
        }
        in.close();
    }
}
