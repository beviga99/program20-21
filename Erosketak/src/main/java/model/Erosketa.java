
package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Erosketa {
    
   protected char[] kodea = new char[100]; 
   protected LocalDate data;
   protected Bezeroa bezeroak;
   protected ArrayList<Produktua> produktuak;
   protected ArrayList<Integer> unitateak;
   protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, String data, double guztira) {
        
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.guztira = guztira;
        this.bezeroak = bezeroa;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroak = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }


    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setBezeroak(Bezeroa bezeroak) {
        this.bezeroak = bezeroak;
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public void setUnitateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

    public char[] getKodea() {
        return kodea;
    }

    public LocalDate getData() {
        return data;
    }

    public Bezeroa getBezeroak() {
        return bezeroak;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroak=" + bezeroak + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }

    
   
    
    
}
