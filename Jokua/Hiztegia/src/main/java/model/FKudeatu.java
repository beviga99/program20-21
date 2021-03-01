
package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FKudeatu {
    
    
    public void tSortu(String name) throws FileNotFoundException, IOException{
        FileOutputStream fout = new FileOutputStream("C:/Users/vilarchao.benat/Desktop/" + name);
        ObjectOutputStream out = new ObjectOutputStream(fout);
    }
    
    public Terminoa tBilatu(String hitza) {
        
    }
    
    public void tGehitu(Terminoa t) {
        
    }
    
}
