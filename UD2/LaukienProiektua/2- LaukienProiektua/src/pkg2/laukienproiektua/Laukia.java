package pkg2.laukienproiektua;


public class Laukia {

    private int altuera;
    private int zabalera;
    
    public Laukia() {
        altuera = 5;
        zabalera = 5;
    }
    public Laukia(int a, int z) {
        altuera = a;
        zabalera = z;
    }
    public int getZabalera() {
        return zabalera;
    }
    public int getAltuera() {
        return altuera;
    }
    public int getAzalera() {
        return zabalera * altuera;
    }
    public int getPerimetroa() {
        return (zabalera * 2) + (altuera * 2);
    }
    public void setZabalera(int z) {
        zabalera = z;
    }
    public void setAltuera(int a) {
        altuera = a;
    }
    @Override
    public String toString() {
        return "Laukia["+altuera+", "+zabalera+"]";
    }
    public String getMota() {
        String mota = " ";
        if (zabalera < altuera) {
            mota = "Bertikala";
        } else if (altuera < zabalera) {
            mota = "Horizontala";
        } else if (zabalera == altuera) {
            mota = "Karratua";
        } 
        return mota;
    }
    public void marrastuBeteta() {
        for (int row = 1; row <= zabalera; row++){
            for (int col = 1; col <= altuera; col++){
                System.out.print("* ");
        }
            System.out.println(" ");
        }
    }
    public void marrastuHutsa() {
        for (int row = 1; row <= zabalera; row++){
            for (int col = 1; col <= altuera; col++){
                if (row == 1 || row == zabalera|| col == altuera || col == 1 ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
        }
            System.out.println(" ");
        }
    }    
}
