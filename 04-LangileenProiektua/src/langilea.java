
public class langilea {
    
    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    
    public langilea(int id, String izena, String abizena, double soldata){
        
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
    }
    
    public int getId() {
        
        return id;
    }
    
    public String getIzena() {
        
        return izena;
    }
    
    public String getAbizena() {
        
        return abizena;
    }
    
    public String getIzenOsoa() {
        
        return izena+" "+abizena;
    }
    
    public double getSoldata() {
        
        return soldata;
    }
    
    public double getUrtekoSoldata() {
        
        return soldata*12;
    }
    
    public void setSoldata(double soldata) {
        
         this.soldata = soldata;  
    }
    
    public double soldataIgo(int portzentaia) {
        
        double soldataplus = soldata*portzentaia/100;
        setSoldata(soldata+soldataplus);
        return soldata;
    }
    
    public String toString() {
        
        return getClass().getName()+"[ ID = "+this.getId()+", Izena = "+this.getIzenOsoa()+", Soldata = "+this.getSoldata()+"]";
    }
    
    public static langilea[] nireHamarLagunLangile() {
        
        langilea[] lagun = new langilea[10];
        
        lagun[0] = new langilea(1,"alex","moreno",700);
        lagun[1] = new langilea(2,"maitane","gallastegi",850);
        lagun[2] = new langilea(3,"asier","moneo",725);
        lagun[3] = new langilea(4,"laura","peralta",900);
        lagun[4] = new langilea(5,"Io","Lo",200);
        lagun[5] = new langilea(6,"benat","vilarchao",1200);
        lagun[6] = new langilea(7,"jon","zengotita",580);
        lagun[7] = new langilea(8,"markel","uribe",875);
        lagun[8] = new langilea(9,"jon","suinaga",1000);
        lagun[9] = new langilea(10,"iker","romero",50);
        
        return lagun;
    }
    
    public static langilea bilatu(String izena, langilea[] lagun) {
        
        for(int i = 0; i < lagun.length; i++){
            if(lagun[i].getIzena().equals(izena)){
                return lagun[i];
            }
        }
        
        return null;
    }
    
    public static langilea bilatu(String balioa, langilea[] lagun, String eremua){
        
        switch(eremua) {
            case("izena"):
                for(int i = 0; i < lagun.length; i++){
                    if(lagun[i].getIzena().equals(balioa)){
                        return lagun[i];
                    }
                }
            
            case("abizena"):
                for(int i = 0; i < lagun.length; i++){
                    if(lagun[i].getAbizena().equals(balioa)){
                        return lagun[i];
                    }
                }
            
            case ("id"):
                for(int i = 0; i < lagun.length; i++){
                    if(lagun[i].getAbizena().equals(Integer.parseInt(balioa))){
                        return lagun[i];
                    }
                }
                
            case ("soldata"):
                for(int i = 0; i < lagun.length; i++){
                    if(lagun[i].getAbizena().equals(Double.parseDouble(balioa))){
                        return lagun[i];
                    }
                }
        }
        return null;        
    }
}
    
