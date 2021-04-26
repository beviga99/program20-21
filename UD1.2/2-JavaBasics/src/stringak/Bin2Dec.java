package stringak;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        
        String inStrBi;
        int inStrBiLen;
        int dec = 0;
        char StrChar;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a Hexadecimal string: ");
        inStrBi = in.next();
        inStrBiLen = inStrBi.length();
        
        for (int Bidx = 0; Bidx < inStrBiLen; Bidx++) {
            StrChar = inStrBi.charAt(inStrBiLen - 1 - Bidx);
            if (StrChar == '1') {
                dec += (int)Math.pow(2,Bidx);
         } else if (StrChar == '0') {
         } else {
            System.out.println("error: invalid binary string \"" + inStrBi + "\"");
            return;
            }
        }
        System.out.println("The equivalent decimal for \"" + inStrBi + "\" is: " + dec);
        in.close();
    }
}
