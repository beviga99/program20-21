
package model;


public class Komikia extends Book {

    boolean kolorea;
    
    public Komikia(String name, Author author, double price, int pages, boolean kolorea) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }
    
    public boolean isKolorea() {
        if (this.kolorea = true) {
            return true;
        } else {
            return false;
        }
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }
    
    public String getNolakoa() {
        
        if (this.kolorea = true) {
            return "kolorekoa";
        } else {
            return "zuri-beltza";
        }
        
    }
    
    @Override
    public String toString() {
        return "Komikia: " + super.getName() + ", " + super.getName() + ", " + super.getPrice() + ", " + super.getPages() + ", " + getNolakoa();  
    }
    
}
