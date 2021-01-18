
package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Erosketa {

    static double kuota;    
   protected char[] kodea = new char[100]; 
   protected LocalDate data;
   protected Bezeroa bezeroak;
   protected ArrayList<Produktua> produktuak;
   protected ArrayList<Integer> unitateak;
   protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, String data, double guztira) {
        
        for(int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        this.data = LocalDate.parse(data);
        this.guztira = guztira;
        this.bezeroak = bezeroa;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        
        for(int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        this.data = LocalDate.parse(data);
        this.bezeroak = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroak=" + bezeroak + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }

    
   
    
    
}
