/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayak;

/**
 *
 * @author vilarchao.benat
 */
public class eguntegia {
    public static void main(String[] args) {
     int[] zenbakiak = new int[10];

        zenbakiak[0] = 1;
        for (int i = 1; i < zenbakiak.length; i++) {
            zenbakiak[i] = 2 * zenbakiak[(i-1)] ;
        }
    }
}
