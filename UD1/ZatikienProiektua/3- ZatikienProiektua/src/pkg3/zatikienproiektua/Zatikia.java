package pkg3.zatikienproiektua;


public class Zatikia {

    private int zenbakitzailea;
    private int izendatzailea;
    
    public Zatikia(int zen, int izen) {
        zenbakitzailea = zen;
        izendatzailea = izen;
    }
    public int getZenbakitzailea() {
        return zenbakitzailea;
    }
    public int getIzendatzailea() {
        return izendatzailea;
    }
    public void setIzendatzailea(int izen) {
        izendatzailea = izen;
    }
    public void setZenbakitzailea(int zen) {
        zenbakitzailea = zen;
    }
    @Override
    public String toString() {
        return zenbakitzailea + "/" + izendatzailea;
    }
    public Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia biderketa = new Zatikia(zat1.zenbakitzailea * zat2.zenbakitzailea, zat1.izendatzailea * zat2.izendatzailea);
        return biderketa;
    }
}
