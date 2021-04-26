package stringak;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        String inChar;
        char StrChar;
        int digit = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        inChar=in.next();
        inChar.length();

        System.out.print("The Keypad digits are: ");
        for (int charIdx = 0; charIdx < inChar.length(); ++charIdx) {
            StrChar = inChar.toLowerCase().charAt(charIdx);
            
            if ((StrChar == 'a') || (StrChar == 'b') || (StrChar == 'c')) {
                digit = 2; 
            } else if ((StrChar == 'd') || (StrChar == 'e') || (StrChar == 'f')) {
                digit = 3;
            } else if ((StrChar == 'g') || (StrChar == 'h') || (StrChar == 'i')) {
                digit = 4;
            } else if ((StrChar== 'j') || (StrChar == 'k') || (StrChar == 'l')) {
                digit = 5;
            } else if ((StrChar == 'm') || (StrChar == 'n') || (StrChar == 'o')) {
                digit = 6;
            } else if ((StrChar == 'p') || (StrChar == 'q') || (StrChar == 'r') || (StrChar == 's')) {
                digit = 7;
            } else if ((StrChar == 't') || (StrChar == 'u') || (StrChar == 'v')) {
                digit = 8;
            } else if ((StrChar == 'w') || (StrChar == 'x') || (StrChar == 'y') || (StrChar == 'z')) {
                digit = 9;
            }
            System.out.print(digit); 
        }
        System.out.println();
        in.close();
    }
}
