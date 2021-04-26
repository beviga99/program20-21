package stringak;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {

        String inStr;
        String radix;
        char StrChar;
        char StrRad;
        int CharRad = 0;
        int StrLen;
        int dec = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        radix = in.next();
        System.out.print("Enter the string: ");
        inStr = in.next();
        StrLen = inStr.length();

        
        for (int CharIdx = 0; CharIdx < StrLen; CharIdx++) {
            StrChar = inStr.charAt(CharIdx); 
            StrRad = radix.charAt(CharRad);
            int expFactor = (int) Math.pow(StrRad, StrLen - 1 - CharIdx);
            if (StrChar == '0') {
            } else if (StrChar >= '1' && StrChar <= '9') {
                dec += (StrChar - '0') * expFactor;
            } else if (StrChar >= 'a' && StrChar <= 'z') {
                dec += (StrChar - 'a' + 10) * expFactor;
            } else if (StrChar >= 'A' && StrChar <= 'Z') {
                dec += (StrChar - 'A' + 10) * expFactor;
            } else {
                System.out.println("error: invalid hex string \"" + inStr + "\"");
                return;
            }
        }
        System.out.println("The equivalent decimal for \"" + inStr + "\" is: " + dec);
        in.close();
    }
}
