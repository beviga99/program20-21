package stringak;

import java.util.Scanner;

public class PalindromicWord2 {

    public static void main(String[] args) {

        String inWord;
        int strLen;
        int count = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        inWord = in.next().toUpperCase();
        strLen = inWord.length();

        for (int i = 0, f = strLen - 1; f >= 0; ++i, --f) {
            char c = inWord.charAt(f);
            char b = inWord.charAt(i);

            if (c == b) {
                count++;
            } else {
                count--;
            }
        }
        if (count == inWord.length()) {
            System.out.print("The word is palindromic.");
        } else {
            System.out.print("The word is not palindromic.");
        }
            
        System.out.println();
        in.close();
    }
}
