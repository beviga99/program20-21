package stringak;

import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String[] args) {

        String inWord;
        int strLen;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        inWord = in.next();
        strLen = inWord.length();

        for (int fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            char CbIdx = inWord.charAt(fIdx);
            int cInt = CbIdx;
            String StrChange = Character.toString(CbIdx);
            System.out.print(StrChange);
        }
        System.out.println();
        in.close();
    }
}
