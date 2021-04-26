/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author vilarchao.benat
 */
public class Exponent {
   public static void main(String[] args) {
      // Declare variables
      int exp;    // exponent (non-negative integer)
      int base;   // base (integer)
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the base: ");
      base = in.nextInt();
      System.out.print("Enter the exponent: ");
      exp = in.nextInt();
      System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
   }

   public static int exponent(int base, int exp) {
      int product = 1;   // resulting product

      // Multiply product and base for exp number of times
      for (int i =0; i<exp;++i) {
         product *= base;
      }

      return product;
   }
}