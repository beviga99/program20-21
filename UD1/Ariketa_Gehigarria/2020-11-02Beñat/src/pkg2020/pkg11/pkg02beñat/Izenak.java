/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020.pkg11.pkg02beñat;

import java.util.Scanner;

/**
 *
 * @author vilarchao.benat
 */
public class Izenak {
    public static void main(String[] args) {
        String[] izenak = {"Jon", "Jone", "June", "Julian", "Julen"};
        
        String izena;
        
        boolean x = false;
        
        int num = 0;
        
        Scanner in = new Scanner(System.in);
    
        
        System.out.print("Noren bila zabiltza? ");
        izena = in.next();
        
        /*switch (izena) {
            case "Jon":
                System.out.print(izenak[0] + " zerrendako 1.a da.");
                break;
            case "Jone":
                System.out.print(izenak[1] + " zerrendako 2.a da.");
                break;
            case "June":
                System.out.print(izenak[2] + " zerrendako 3.a da.");
                break;
            case "Julian":
                System.out.print(izenak[3] + " zerrendako 4.a da.");
                break;
            case "Julen":
                System.out.print(izenak[4] + " zerrendako 5.a da.");
                break;
            default:
                System.out.print(izena + " ez dago zerrendan.");
        }*/
        
        for (int i = 0; i < izenak.length; i++) {
            if (izenak[i].equals(izena)) {
                num = i;
                x = true;
                break;
            } else {
                x = false;
            }
        }
        
        if (x == true) {
            System.out.println(izena + " zerrendako " + num+1 + ".a da.");
        } else {
            System.out.println(izena + " ez dago zerrendan.");
        }
        
    }
}
