
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class seigarrena {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        langilea[] lagun = langilea.nireHamarLagunLangile();
        
        System.out.printf("%s %15s %15s","ID","Izena","Soldata");
        for(int i = 0; i < lagun.length; i++){
            System.out.printf("\n%d %15s %15.2f",lagun[i].getId(),lagun[i].getIzenOsoa(),lagun[i].getSoldata());
        }
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu Izen bat: ");
        
    }
}
