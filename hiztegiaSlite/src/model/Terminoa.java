
package model;

import java.io.Serializable;

public class Terminoa implements Serializable {
    private String hitzaEs;
    private String hitzaEus;
    private int identificator;
    
    public Terminoa (String h1, String h2) {
        this.hitzaEs = h1;
        this.hitzaEus = h2;
    }

    public void setIdentificator(int identificator) {
        this.identificator = identificator;
    }

    public int getIdentificator() {
        return identificator;
    }

    public String getHitzaEs() {
        return hitzaEs;
    }

    public String getHitzaEus() {
        return hitzaEus;
    }

    public void setHitzaEs(String hitzaEs) {
        this.hitzaEs = hitzaEs;
    }

    public void setHitzaEus(String hitzaEus) {
        this.hitzaEus = hitzaEus;
    }
    
}
