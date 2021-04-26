package stringak;

import java.util.Scanner;

public class CaesarCode {

    public static void main(String[] args) {

        int n = 3;
        int Code = 0;
        char StrChar;
        String inTxt;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        inTxt = in.next().toUpperCase();
        inTxt.length();

        System.out.print("The ciphertext string is: ");
        for (int charIdx = 0; charIdx < inTxt.length(); ++charIdx) {
            StrChar = inTxt.charAt(charIdx);

            if ((StrChar >= 'A') && (StrChar <= 'W')) {
                Code = StrChar + n;
            } else if (StrChar == 'X') {
                Code = 'A';
            } else if (StrChar == 'Y') {
                Code = 'B';
            } else if (StrChar == 'Z') {
                Code = 'C';
            }
            System.out.print(Character.toString(Code)); 
        }
        System.out.println();
        in.close();
    }
}
