
package pkg2.laukienproiektua;

import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        int z, a;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu laukiaren altuera: ");
        a = in.nextInt();
        
        System.out.print("Sartu laukiaren zabalera: ");
        z = in.nextInt();
        
        Laukia l1 = new Laukia(a, z);
        System.out.println("Lauki "+ l1.getMota() + " sortu dozu => " + l1.toString());
        
        System.out.println("Hona beteta marraztuta: ");
        l1.marrastuBeteta();
        
        System.out.println("Hona hutsik marraztuta: ");
        l1.marrastuHutsa();
    }

}
