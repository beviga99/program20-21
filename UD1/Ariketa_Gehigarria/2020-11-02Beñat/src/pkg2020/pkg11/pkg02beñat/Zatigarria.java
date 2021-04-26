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
public class Zatigarria {
    public static void main(String[] args) {
        int zatikizuna, zatitzailea;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu zatikizuna (zenbaki handia): ");
        zatikizuna = in.nextInt();
        
        System.out.print("Sartu zatikizuna (zenbaki txikia): ");
        zatitzailea = in.nextInt();
        
        if (zatigarriaDa(zatikizuna, zatitzailea) == true) {
            System.out.println(zatikizuna + " zenbakia zatigarria da " + zatitzailea + " zenbakiarekin.");
        } else {
            System.out.println(zatikizuna + " zenbakia ez da zatigarria " + zatitzailea + " zenbakiarekin.");
        }
        
    }
    public static boolean zatigarriaDa (int zatikizuna, int zatitzailea) {
                     
        if (zatikizuna % zatitzailea == 0) {
            return true;
        } else {
            return false;
        }
        
    }
    }

