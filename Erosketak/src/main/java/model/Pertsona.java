
package model;


public class Pertsona implements Bezeroa{
    
    private int kodea;
    private String helbidea;
    private String izena;
    private String abizena;
    private String emaila;

    public Pertsona(String izena, String abizena, String emaila) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    public String getIzena() {
        return izena + " " + abizena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    @Override
    public int getKodea() {
        return kodea;
    }

    @Override
    public String getHelbidea() {
        return helbidea;
    }
    
    
}
