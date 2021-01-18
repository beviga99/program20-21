
package model;


public class Enpresa extends Bezeroa{
    
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    public Enpresa(String izenJuridikoa, String izenKomertziala, String[] kontaktoenEmailak) {
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    public String getIzenJuridikoa() {
        return izenJuridikoa;
    }

    public String[] getKontaktoenEmailak() {
        return kontaktoenEmailak;
    }
   
    
}
