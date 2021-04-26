
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
        return kuota / epeak;
    }

    public int getEpeak() {
        return epeak;
    }

    public boolean isOdainketaBukatua() {
        return odainketaBukatua;
    }

    public void setEpeak(int epeak) {
        this.epeak = epeak;
    }

    public void setOdainketaBukatua(boolean odainketaBukatua) {
        this.odainketaBukatua = odainketaBukatua;
    }  

    public double getKuota() {
        return kuota;
    }

    public void setKuota(double kuota) {
        this.kuota = kuota;
    }
       
}
