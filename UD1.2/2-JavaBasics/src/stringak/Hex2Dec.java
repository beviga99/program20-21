package stringak;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {

        String inStrHex;
        int inStrHexLen;
        int dec = 0;
        char StrChar;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        inStrHex = in.next();
        inStrHexLen = inStrHex.length();

        for (int HexIdx = 0; HexIdx < inStrHexLen; HexIdx++) {
            StrChar = inStrHex.charAt(HexIdx);
            int expFactor = (int) Math.pow(16, inStrHexLen - 1 - HexIdx);
            if (StrChar == '0') {
            } else if (StrChar >= '1' && StrChar <= '9') {
                dec += (StrChar - '0') * expFactor;
            } else if (StrChar >= 'a' && StrChar <= 'f') {
                dec += (StrChar - 'a' + 10) * expFactor;
            } else if (StrChar >= 'A' && StrChar <= 'F') {
                dec += (StrChar - 'A' + 10) * expFactor;
            } else {
                System.out.println("error: invalid hex string \"" + inStrHex + "\"");
                return;
            }
        }
        System.out.println("The equivalent decimal for \"" + inStrHex + "\" is: " + dec);
        in.close();
    }
}
