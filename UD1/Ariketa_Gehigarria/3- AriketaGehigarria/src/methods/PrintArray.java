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
public class PrintArray {

    public static void main(String[] args) {

        int numItems;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the lenght of the array: ");
        numItems = in.nextInt();

        items = new int[numItems];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int idx = 0; idx < items.length; ++idx) {
            items[idx] = in.nextInt();
        }
        print(items);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; ++idx) {
            if (idx == array.length - 1) {
                System.out.print(array[idx] + "]");
            } else {
                System.out.print(array[idx] + ", ");
            }
        }

    }
}
