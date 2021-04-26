package azterketa;

import java.util.Arrays;
import java.util.Scanner;

public class Banaketa {

    public static void main(String[] args) {

        String S;
        Scanner in = new Scanner(System.in);

        System.out.print("Sartu esaldi bat: ");
        S = in.nextLine();

        String[] esaldi = S.split(" ");

        if (esaldi.length < 10) {
            System.out.print("[ ");
            for (int i = 0; i < 10; i++) {
                if (i < esaldi.length) {
                    System.out.print(esaldi[i] + ", ");
                } else if (i == 9) {
                    System.out.print("null ]");
                } else if (esaldi.length - 1 < 9) {
                    System.out.print("null, ");
                }
            }
        } else if (esaldi.length == 10) {
            System.out.print(Arrays.toString(esaldi));
        }
        System.out.println();
    }
}
