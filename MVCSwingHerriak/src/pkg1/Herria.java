/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author vilarchao.benat
 */
public class Herria {
    
    private String izena;
    private String probintzia;
    private boolean hondatza;
    private String oharra;

    public Herria(String izena, String probintzia, boolean hondartza, String oharra) {
        this.izena = izena;
        this.probintzia = probintzia;
        this.hondatza = hondartza;
        this.oharra = oharra;
    }

    public String getIzena() {
        return izena;
    }

    public String getProbintzia() {
        return probintzia;
    }

    public String getOharra() {
        return oharra;
    }

    public boolean getHondatza() {
        return hondatza;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    public void setOharra(String oharra) {
        this.oharra = oharra;
    }

    public void setHondatza(boolean hondatza) {
        this.hondatza = hondatza;
    }

}
