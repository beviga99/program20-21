
package model;

import java.time.LocalDate;


public class EpekakoErosketa extends Erosketa{
    private int epeak = 12;
    private boolean odainketaBukatua = false;
    private double kuota;

    public EpekakoErosketa(double kuota, String kodea, Bezeroa bezeroa, String data, double guztira) {
        super(kodea, bezeroa, data, guztira);
        this.kuota = kuota;
    }
    
    public double gainetikOrdainduBeharrekoa() {
        return epeak * kuota;
    }
    

    
}
