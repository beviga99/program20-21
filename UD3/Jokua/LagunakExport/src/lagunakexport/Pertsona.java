
package lagunakexport;

/** 

 */

import java.io.Serializable;

import java.io.Serializable;

/**
 *
 * @author IMadariaga
 */
public class Pertsona implements Serializable {
    int id;
    String izena;

    public Pertsona(int id, String izena) {
        this.id = id;
        this.izena = izena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @Override
    public String toString() {
        return "Pertsona{" + "id=" + id + ", izena=" + izena + '}';
    }
    
    
}
