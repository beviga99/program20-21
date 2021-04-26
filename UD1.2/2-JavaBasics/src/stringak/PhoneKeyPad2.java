package stringak;

import java.util.Scanner;

public class PhoneKeyPad2 {

    public static void main(String[] args) {
        String inChar;
        int digit = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        inChar = in.next();
        inChar.length();
        
        System.out.print("The Keypad digits are: "); 
        for (int charIdx = 0; charIdx < inChar.length(); ++charIdx) {
            switch (inChar.toUpperCase().charAt(charIdx)) { 
                case 'A': case 'B': case 'C': digit = 2; break;
                case 'D': case 'E': case 'F': digit = 3; break;    
                case 'G': case 'H': case 'I': digit = 4; break;
                case 'J': case 'K': case 'L': digit = 5; break;
                case 'M': case 'N': case 'O': digit = 6; break;
                case 'P': case 'Q': case 'R': case 'S': digit = 7; break;
                case 'T': case 'U': case 'V': digit = 8; break;
                case 'W': case 'X': case 'Y': case 'Z': digit = 9; break;
                default: digit = 0;
            }
            System.out.print(digit);
        }
 
        System.out.println();
        in.close();
    }
}

