/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020.pkg11.pkg02beñat;

/**
 *
 * @author vilarchao.benat
 */
public class Marrazkia {
    public static void main(String[] args) {
        marraztu(5, 5, '1', true, true);
        marraztu(6, 3, '2', true, true);
        marraztu(3, 5, '3', true, true);
        marraztu(4, 6, '4', true, true);
        marraztu(7, 3, '5', false, true);
        marraztu(8, 3, '6', true, false);
        marraztu(3, 5, '7', false, false);
        marraztu(6, 3, '8', true, false);
        marraztu(3, 4, '9', false, false);
    }
    public static void marraztu(int alde1, int alde2, char pintzela, boolean tente, boolean betea) {
        if (tente == true) {
            if (betea == true) {
                for (int oinarria = 1; oinarria <= alde1; oinarria++) {
                    for (int altuera = 1; altuera <= alde2; altuera++){
                        System.out.print(pintzela + " ");
                    }
                    System.out.println(" ");
                    }
                System.out.println(" ");
            } else if (betea == false) {
              for (int oinarria = 1; oinarria <= alde1; oinarria++) {
                    for (int altuera = 1; altuera <= alde2; altuera++){
                        if (oinarria == 1 || oinarria == alde1 || altuera == 1 || altuera == alde2) {
                           System.out.print(pintzela + " "); 
                        } else {
                            System.out.print("  "); 
                        }
                    }
                   System.out.println(" "); 
               }
              System.out.println(" ");
            }
        } else if (tente == false) {
            if (betea == true) {
                for (int oinarria = 1; oinarria <= alde2; oinarria++) {
                    for (int altuera = 1; altuera <= alde1; altuera++){
                        System.out.print(pintzela + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
            } else if (betea == false) {
              for (int oinarria = 1; oinarria <= alde1; oinarria++) {
                    for (int altuera = 1; altuera <= alde2; altuera++){
                        if (oinarria == 1 || oinarria == alde1 || altuera == 1 || altuera == alde2) {
                           System.out.print(pintzela + " "); 
                        } else {
                            System.out.print("  "); 
                        }
                    }
                   System.out.println(" "); 
               }
              System.out.println(" ");
            }
        }
    }
}
