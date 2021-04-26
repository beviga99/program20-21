package array;

import java.util.Scanner;

public class Bi {

    public static void main(String[] args) {
        String[] izenak = new String[3];
        int zenbakia = 0;
        Scanner in = new Scanner(System.in);
       
        System.out.print("Idatzi izen bat: ");
        izenak[0] = in.next();
        System.out.print("Idatzi izen bat: ");
        izenak[1] = in.next();
        System.out.print("Idatzi izen bat: ");
        izenak[2] = in.next();
        
        System.out.println("Hauek dira sartu dituzun izenak: ");
        for (int i = 0 ;i < izenak.length; i++) {
            zenbakia += 1;
            System.out.println(zenbakia + ". " + izenak[i]);
        }
    }
}