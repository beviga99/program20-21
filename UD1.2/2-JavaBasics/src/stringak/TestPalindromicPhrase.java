package stringak;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void main(String[] args) {

        String inPhrase;
        int strLen;
        int count = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        inPhrase = in.next().toUpperCase();
        strLen = inPhrase.length();

        for (int i = 0, f = strLen - 1; f >= 0; ++i, --f) {
            char c = inPhrase.charAt(f);
            char b = inPhrase.charAt(i);

            if (c == b) {
                count++;
            } else {
                count--;
            }
        }
        if (count == inPhrase.length()) {
            System.out.print("The word is palindromic.");
        } else {
            System.out.print("The word is not palindromic.");
        }
            
        System.out.println();
        in.close();
    }
}