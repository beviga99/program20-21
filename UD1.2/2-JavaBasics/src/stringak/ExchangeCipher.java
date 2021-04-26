package stringak;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {

        String inTxt;
        char CipherTxtChar = 0;
        char plainTxtChar;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        inTxt = in.next().toUpperCase();
        inTxt.length();

        System.out.print("The ciphertext string is: ");
        for (int charIdx = 0; charIdx < inTxt.length(); ++charIdx) {
            plainTxtChar = inTxt.charAt(charIdx);

            if (plainTxtChar == 'A') {
                CipherTxtChar = 'Z';
            } else if (plainTxtChar == 'B') {
                CipherTxtChar = 'Y';
            } else if (plainTxtChar == 'C') {
                CipherTxtChar = 'X';
            } else if (plainTxtChar == 'D') {
                CipherTxtChar = 'W';
            } else if (plainTxtChar == 'E') {
                CipherTxtChar = 'V';
            } else if (plainTxtChar == 'F') {
                CipherTxtChar = 'U';
            } else if (plainTxtChar == 'G') {
                CipherTxtChar = 'T';
            } else if (plainTxtChar == 'H') {
                CipherTxtChar = 'S';
            } else if (plainTxtChar == 'I') {
                CipherTxtChar = 'R';
            } else if (plainTxtChar == 'J') {
                CipherTxtChar = 'Q';
            } else if (plainTxtChar == 'K') {
                CipherTxtChar = 'P';
            } else if (plainTxtChar == 'L') {
                CipherTxtChar = 'O';
            } else if (plainTxtChar == 'M') {
                CipherTxtChar = 'N';
            } else if (plainTxtChar == 'N') {
                CipherTxtChar = 'M';
            } else if (plainTxtChar == 'O') {
                CipherTxtChar = 'L';
            } else if (plainTxtChar == 'P') {
                CipherTxtChar = 'K';
            } else if (plainTxtChar == 'Q') {
                CipherTxtChar = 'J';
            } else if (plainTxtChar == 'R') {
                CipherTxtChar = 'I';
            } else if (plainTxtChar == 'S') {
                CipherTxtChar = 'H';
            } else if (plainTxtChar == 'T') {
                CipherTxtChar = 'G';
            } else if (plainTxtChar == 'U') {
                CipherTxtChar = 'F';
            } else if (plainTxtChar == 'V') {
                CipherTxtChar = 'E';
            } else if (plainTxtChar == 'W') {
                CipherTxtChar = 'D';
            } else if (plainTxtChar == 'X') {
                CipherTxtChar = 'C';
            } else if (plainTxtChar == 'Y') {
                CipherTxtChar = 'B';
            } else if (plainTxtChar == 'Z') {
                CipherTxtChar = 'A';
            }
            System.out.print(CipherTxtChar); 
        }
        System.out.println();
        in.close();
    }
}
