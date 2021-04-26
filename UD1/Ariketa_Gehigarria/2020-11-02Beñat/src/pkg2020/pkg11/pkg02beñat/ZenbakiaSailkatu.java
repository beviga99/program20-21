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
public class ZenbakiaSailkatu {
    public static void main(String[] args) {
        
        int num;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu zenbaki oso positibo bat: ");
        num = in.nextInt();
        
        while (num < 0) {
            
            System.out.println("Zenbaki ezegokia.");
            System.out.println("Sartu zenbaki oso positibo bat: ");
            num = in.nextInt();
        }
        
        if (num % 2 ==0) {
            if (num < 100 && num > 0) {
                System.out.println("Sartu dozun zenbakia txikia bikoitia da.");
            } else if (num > 100) {
                System.out.println("Sartu dozun zenbakia handia bikoitia da.");
            }
        } else {
            if (num < 100 && num > 0) {
                System.out.println("Sartu dozun zenbakia txikia bakioitia da.");
            } else if (num > 100) {
                System.out.println("Sartu dozun zenbakia handia bakoitia da.");
            }
        }
        
    }
}
