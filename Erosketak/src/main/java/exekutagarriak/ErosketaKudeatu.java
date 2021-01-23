
package exekutagarriak;

import static com.sun.tools.attach.VirtualMachine.list;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import model.Bezeroa;
import model.Enpresa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;


public class ErosketaKudeatu {
    private ArrayList<Bezeroa> kontaktua;
    private ArrayList<Produktua> produktuKatalogoa;
    private ArrayList<Erosketa> erosketenZerrenda;
    String[] email = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
    String[] kode = {"C01", "C02", "T01", "T02"};
    
    
    
    public void initialize(){
        
        kontaktua.add(new Pertsona("Martin", "Berastegi", "mbera@donostia.eus"));
        kontaktua.add(new Pertsona("Karlos", "Argillano", "kargi@zarautz.eus"));
        kontaktua.add(new Enpresa("Uni BHI", "Uni Eibar-Ermua", email));
        
        produktuKatalogoa.add(new Produktua(kode[0], "Toshiba SatellLite Pro", 450));
        produktuKatalogoa.add(new Produktua(kode[1], "HP Pavilion", 600));
        produktuKatalogoa.add(new Produktua(kode[2], "Samsung Galaxy", 210));
        produktuKatalogoa.add(new Produktua(kode[3], "iPhone XX", 1300));
        
        erosketenZerrenda.add(new Erosketa("E18-01","2018-09-25", kontaktua.get(0), new ArrayList<Produktua>() {
            {
                add(produktuKatalogoa.get(0)); 
                add(produktuKatalogoa.get(1)); 
                add(produktuKatalogoa.get(2));
            }
            }, new ArrayList<Integer>() {
            {
                add(4); 
                add(2); 
                add(3);
            }
            }, 3630));
    }
    
}
