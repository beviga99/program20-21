
package model;


public class Enpresa implements Bezeroa{
    
    private int kodea;
    private String helbidea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    public Enpresa(String izenJuridikoa, String izenKomertziala, String[] kontaktoenEmailak) {
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    public String getIzena() {
        return izenKomertziala;
    }
    
    public String getEmaila() {
        return kontaktoenEmailak[0];
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
