
import java.util.Scanner;


public class BilatuLangile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        langilea[] lagun = langilea.nireHamarLagunLangile();        
        System.out.println(langilea.bilatu("benito", lagun)+"\n");
        
        String e,b;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nSartu Eremua: ");
        e = in.nextLine().toLowerCase();
        System.out.print("Sartu Balioa: ");
        b = in.nextLine().toLowerCase();
        
        System.out.println(langilea.bilatu(b, lagun, e));
        
        
    }
}
