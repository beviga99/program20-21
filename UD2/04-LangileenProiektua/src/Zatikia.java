import java.util.Arrays;


public class Zatikia {

    private int zenbakitzailea;//numerador
    private int izendatzailea;//denominador
    //konstruktoreak

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    /**
     * public Zatikia(java.lang.String zatIdatzia) { zatIdatzia = zenbakitzailea
     * + " / " + izendatzailea; }*
     */
    public Zatikia() {
        zenbakitzailea = (int) (Math.random() * 9 + 1);
        izendatzailea = (int) (Math.random() * 9 + 1);
    }

    //getters
    public int getZenbakitzailea() {
        return zenbakitzailea;
    }

    public int getIzendatzailea() {
        return izendatzailea;
    }

    //setters
    public void setZenbakitzailea(int zenba) {
        zenba = zenbakitzailea;
    }

    public void setIzendatzailea(int izenda) {
        izenda = izendatzailea;
    }

    /**
     * Zatikiaren String errepresentazioa bueltatzen du
     * zenbakitzailea/izendatzailea bezala
     *
     * @return zatikiaren String errepresentazioa
     */
    @Override
    public java.lang.String toString() {
        return getClass().getName() + " " + zenbakitzailea + "/" + izendatzailea;
    }

    /**
     * Bi zatikien arteko biderketa bueltatzen du jasotako zatikiak aldatu gabe
     *
     * @param zat1 lehenengo zatikia
     * @param zat2 bigarren zatikia
     * @return zatikien biderketa
     */
    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia biderketa = new Zatikia(zat1.zenbakitzailea * zat2.zenbakitzailea, zat1.izendatzailea * zat2.izendatzailea);
        return biderketa;
    }

    /**
     * Bi zatikiren batura egingo du eta emaitza bueltatuko du zatiki bezala
     *
     * @param zat1 lehenengo zatikia
     * @param zat2 bigarren zatikia
     * @return zatikien batuketa
     */
    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {

        int hcf = 0;
        int lcm;
        for (int i = 1; i <= zat1.izendatzailea && i <= zat2.izendatzailea; i++) {
            if (zat1.izendatzailea % i == 0 && zat2.izendatzailea % i == 0) {
                hcf = i;
            }
        }

        lcm = (zat1.izendatzailea * zat2.izendatzailea) / hcf;

        Zatikia batuketa = new Zatikia((lcm / zat1.izendatzailea * zat1.zenbakitzailea) + (lcm / zat2.izendatzailea * zat2.zenbakitzailea), lcm);

        return batuketa;
    }

    /**
     * Zatikia aldatuko du beste zatiki baten balioa batuz
     *
     * @param besteZatikiBat zatikia batuta
     */
    public void batu(Zatikia besteZatikiBat) {
        int hcf = 0;
        int lcm;
        for (int i = 1; i <= this.izendatzailea && i <= besteZatikiBat.izendatzailea; i++) {
            if (this.izendatzailea % i == 0 && besteZatikiBat.izendatzailea % i == 0) {
                hcf = i;
            }
        }

        lcm = (this.izendatzailea * besteZatikiBat.izendatzailea) / hcf;

        this.zenbakitzailea = (lcm / this.izendatzailea * this.zenbakitzailea) + (lcm / besteZatikiBat.izendatzailea * besteZatikiBat.zenbakitzailea);
        this.izendatzailea=lcm;
        
    }
    /**
     * Bi zatiki berdinak diren egiaztazen du
     * @param besteZatikiBat konparatuko den zatikia
     * @return true bi zatikiak berdinak badira
     */
    public boolean equals(Zatikia besteZatikiBat) {
        return this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea();
    }
    /**
     * Zatiki baten hamartar baliokidea ateratzen du
     * @return zatiki baten hamartar baliokidea bueltatzen du
     */
    public double hamartarBaliokidea() {
        return (double) this.zenbakitzailea / this.izendatzailea;

    }
    /**
     * Zatiki bat beste bat baino handiagoa den egiaztatzen du
     * @param besteZatikiBat konparatzen den zatikia
     * @return true zatikia handiagoa bada
     */
    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        return this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea();
    }
    /**
     * Zatiki bat beste bat baino handiagoa den egiaztatzen du
     * zat3 bien arteko handiena izango da.
     * @return zat3.
     */
    public static Zatikia BiggestOne(Zatikia zat1, Zatikia zat2) {
        int dib1, dib2;
        dib1 = zat1.zenbakitzailea / zat1.izendatzailea;
        dib2 = zat2.zenbakitzailea / zat2.izendatzailea;
        Zatikia zat3;
        if (dib1 > dib2) {
            zat3 = new Zatikia (zat1.zenbakitzailea, zat1.izendatzailea);
        } else {
            zat3 = new Zatikia (zat2.zenbakitzailea, zat2.izendatzailea);
        }
        
        return zat3;
    }

    /**
     * Zatikia ahalik eta gehien sinplifikatzen du
     */
    public void sinplifikatu() {
      int i;
        if (izendatzailea>zenbakitzailea) {
          i=izendatzailea;
      } else {
            i=zenbakitzailea;
        }
        while (i>0){
            if (izendatzailea % i == 0 && zenbakitzailea % i == 0) {
                izendatzailea = izendatzailea / i;
                zenbakitzailea = zenbakitzailea / i;
            }
            i--;
        }
        System.out.println("Zatikia sinplificatuta: " + toString());
    }
    
    /*
    Zatikia sinplifikatzen du.
    @return zatikia sinplifikatua erakusten du.
    */
    public static Zatikia sinplifikatu2(Zatikia zat1) {
      int i;
      ;
        if (zat1.izendatzailea>zat1.zenbakitzailea) {
          i=zat1.izendatzailea;
      } else {
            i=zat1.zenbakitzailea;
        }
        while (i>0){
            if (zat1.izendatzailea % i == 0 && zat1.zenbakitzailea % i == 0) {
                zat1.izendatzailea = zat1.izendatzailea / i;
                zat1.zenbakitzailea = zat1.zenbakitzailea / i;
            }
            i--;
        }
        Zatikia zat2 = new Zatikia (zat1.zenbakitzailea, zat1.izendatzailea);
        return zat2;
    }
    /**
     * Zatikiak dituen array bat ordenatzen du txikitik handira
     * @param zk zatikien arraya
     */
    public static void zatikiakOrdenatu(Zatikia[] zk) {
        for (int n = 0; n < zk.length - 1; n++) {
            for (int i = n + 1; i < zk.length; i++) {
                if (zk[n] != null && zk[i] != null && zk[n].isBiggerThan(zk[i])) {
                    Zatikia temp = zk[n];
                    zk[n] = zk[i];
                    zk[i] = temp;
                }
            }
        }
        System.out.println("Zatikiak ordenatuta: " + Arrays.toString(zk));
    }

    /**
     * Bi zatiki baliokideak diren egiaztatzen du
     *
     * @param besteZatikiBat bigarren zatikia, lehenengo zatikiarekin
     * konparatuko dena
     * @return baliokideak diren ala ez
     */
    public boolean isBaliokidea(Zatikia besteZatikiBat) {
       return this.zenbakitzailea*besteZatikiBat.izendatzailea==this.izendatzailea*besteZatikiBat.zenbakitzailea;
    }
}