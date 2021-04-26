package stringak;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {

        String inStr;
        int StrLen;
        char StrChar;
        boolean isValid;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a hex string: ");
        inStr = in.next().toLowerCase();
        StrLen = inStr.length();

        isValid = true;
        for (int StrIdx = 0; StrIdx < StrLen; StrIdx++) {
            StrChar = inStr.charAt(StrIdx);

            if (!((StrChar >= '0' && StrChar <= '9') || (StrChar >= 'a' && StrChar <= 'f'))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is NOT a hex string");
        }
        in.close();
    }
}
