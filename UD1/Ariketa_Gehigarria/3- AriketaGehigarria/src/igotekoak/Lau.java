
package igotekoak;

import java.util.Scanner;


public class Lau {
    public static void main(String[] args) {
        
        int num;
        String ch;
        Scanner in = new Scanner(System.in);

        System.out.print("Aukeratu karaktere bat: ");
        ch = in.next();
        char ch2 = ch.charAt(0);
        
        System.out.print("Zenbat aldiz inprimatu nahi duzu? ");
        num = in.nextInt();
        
        karaktereakInprimatu(ch2, num);
    }  
    
    public static void karaktereakInprimatu(char karakterea, int zenbat) {
        
        int num2 = 0;
        
        do{
            System.out.print(karakterea);
            
            num2++;
        }while(num2 < zenbat);
    }
}
