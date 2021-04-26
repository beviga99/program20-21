package stringak;

import java.util.Scanner;

public class CountVowelsDigits {

    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        int cTotal = 0;
        int cDigits = 0;
        int cVowels = 0;
        float Pvowels = 0;
        float Pdigits = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            cTotal++;
            char c = inStr.charAt(charIdx);
            int cInt = c;
            if (cInt >= '0' && cInt <= '9') {
                cDigits++;
            }
            if (c == 'c' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cVowels++;

            }
        }
        Pvowels = cVowels * 100 / cTotal;
        Pdigits = cDigits * 100 / cTotal;
        System.out.println("Number of numbers: " + cDigits + "(" + Pdigits + "%)");
        System.out.print("Number of vowels: " + cVowels + "(" + Pvowels + "%)");
    }
}
