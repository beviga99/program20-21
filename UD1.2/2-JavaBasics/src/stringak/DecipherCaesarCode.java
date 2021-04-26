package stringak;

import java.util.Scanner;

public class DecipherCaesarCode {

    public static void main(String[] args) {

        int n = 3;
        int Code = 0;
        char StrChar;
        String inCodeStr;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        inCodeStr = in.next().toUpperCase();
        inCodeStr.length();

        System.out.print("The ciphertext string is: ");
        for (int charIdx = 0; charIdx < inCodeStr.length(); ++charIdx) {
            StrChar = inCodeStr.charAt(charIdx);

            if ((StrChar >= 'D') && (StrChar <= 'W')) {
                Code = StrChar - n;
            } else if (StrChar == 'C') {
                Code = 'Z';
            } else if (StrChar == 'B') {
                Code = 'Y';
            } else if (StrChar == 'A') {
                Code = 'X';
            }
            System.out.print(Character.toString(Code)); 
        }
        System.out.println();
        in.close();
    }
}

