package array;

import java.util.Scanner;

public class Hiru {

    public static void main(String[] args) {

        String[] postreak = {"Yogurta", "Flana", "Macedonia",
            "Izozkia", "Sagar pastela", "Arroz esnea", "Tiramisua",
            "Pantxineta", "Profiterolak txokolate beroarekin"};
        Scanner in = new Scanner(System.in);
        int aukera = 0;

        //bukatu ariketa 
        System.out.print("Aukeratu ezazu postrea zenbakia idatziz: ");
        aukera = in.nextInt();
       
        if (aukera >= 0 || aukera <= 8) {
           aukera -= 1;
           System.out.println("BEZEROAK " + postreak[aukera].toUpperCase() + " AUKERATU DU.");
        
        } else {
            
            System.out.println("ZENBAKI OKERRA SARTU DUZU. POSTRE BARIK GERATU ZARA.");
        }
       
    }
}
