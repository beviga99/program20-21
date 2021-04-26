
import java.util.Scanner;

public class NiLangile {
    public static void main(String[] args) {
        
        int id;
        String name, surname;
        double soldata;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu langilearen datuak(id): ");
        id = in.nextInt();
        System.out.print("Sartu langilearen datuak(izena): ");
        name = in.next();
        System.out.print("Sartu langilearen datuak(abizena): ");
        surname = in.next();
        System.out.print("Sartu langilearen datuak(soldata): ");
        soldata = in.nextDouble();
        
        Langilea l1 = new Langilea(id, name, surname, soldata);
        System.out.println("Hau da langilea: "+ l1.toString()+ " eta urteroko soldata: "+l1.getUrterokoSoldata());
        
        l1.soldataIgo(50);
        
        System.out.println("Hau da langilea: "+ l1.toString()+ " eta urteroko soldata berria: "+l1.getUrterokoSoldata());
    }


}
