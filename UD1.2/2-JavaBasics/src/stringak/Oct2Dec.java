package stringak;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {

        String inStrOct;
        int inStrOctLen;
        int dec = 0;
        char StrChar;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an octal string: ");
        inStrOct = in.next();
        inStrOctLen = inStrOct.length();

        for (int OctIdx = 0; OctIdx < inStrOctLen; OctIdx++) {
            StrChar = inStrOct.charAt(OctIdx);
            int expFactor = (int) Math.pow(8, inStrOctLen - 1 - OctIdx);
            if (StrChar == '0') {
            } else if (StrChar >= '1' && StrChar <= '7') {
                dec += (StrChar - '0') * expFactor;
            } else {
                System.out.println("error: invalid hex string \"" + inStrOct + "\"");
                return;
            }
        }
        System.out.println("The equivalent decimal for \"" + inStrOct + "\" is: " + dec);
        in.close();
    }
}

