package javabasics;

import java.util.Scanner;

public class ExchangeCipher2 {

    public static void main(String[] args) {

        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        System.out.print("The cipher text is : ");
        for (int i = inStrLen - 1; i >= 0; --i) {
            char c = inStr.charAt(i);
            int cInt = c;

            String StrChange = Character.toString(cInt);

            System.out.print(StrChange);
        }
        System.out.println();
        in.close();
    }
}
