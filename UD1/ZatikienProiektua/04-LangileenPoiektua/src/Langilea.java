public class Langilea {

    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    
    public Langilea(int num, String name, String surname, double mon) {
        id = num;
        izena = name;
        abizena = surname;
        soldata = mon;
    }
    public int getId() {
        return id;
    }
    public String getIzena(){
        return izena;
    }
    public String getAbizena() {
        return abizena;
    }
    public String getIzenOsoa(){
        return izena + " " + abizena;
    }
    public double getSoldata() {
        return soldata;
    }
    public double getUrterokoSoldata() {
        return soldata * 12;
    }
    public void setSoldata(double mon) {
        soldata = mon;
    }
    public double soldataIgo(int portzentaia) {
        double soldataplus = soldata*portzentaia/100;
        setSoldata(soldata+soldataplus);
        return soldata;
    }
    @Override
    public String toString() {
        return "Langilea[ID: "+id+", Izena: "+izena+", Abizena: "+abizena+", Soldata: "+soldata+"]";
    }
    public Langilea[] nireHamarLagunLangile(){
        Langilea[] hamarlangile = new Langilea[10];
        hamarlangile[0] = new Langilea(2, "Alexander", "Moreno", 700.0);
        hamarlangile[1] = new Langilea(3, "Jon", "Zengotita", 800.0);
        hamarlangile[2] = new Langilea(4, "Markel", "Uribe", 400.0);
        hamarlangile[3] = new Langilea(5, "Jon", "Suinaga", 1000.0);
        hamarlangile[4] = new Langilea(6, "Iker", "Romero", 1.0);
        hamarlangile[5] = new Langilea(7, "Asier", "Moneo", 500.0);
        hamarlangile[6] = new Langilea(8, "Laura", "Peralta", 500.0);
        hamarlangile[7] = new Langilea(9, "Maitane", "Gallastegui", 500.0);
        hamarlangile[8] = new Langilea(10, "Pedro", "Sanchez", 10000.0);
        hamarlangile[9] = new Langilea(11, "Pablo", "Coletas", 10.0);
        return hamarlangile;
    }
}
