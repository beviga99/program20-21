
package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FKudeatu {
    
    private FileOutputStream fout;
    private ObjectOutputStream out;
    
    public void tSortu(String name) {

        try {
            fout = new FileOutputStream("C:/Users/vilarchao.benat/Desktop/" + name);
            out = new ObjectOutputStream(fout);
            
            Terminoa t1 = new Terminoa("Hola", "Kaixo");
            Terminoa t2 = new Terminoa("Hombre", "Gizon");
            Terminoa t3 = new Terminoa("Mujer", "Andrea");
            Terminoa t4 = new Terminoa("Manzana", "Sagarra");
            Terminoa t5 = new Terminoa("Adios", "Agur");
            
            out.writeObject(t1);
            out.writeObject(t2);
            out.writeObject(t3);
            out.writeObject(t4);
            out.writeObject(t5);

        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /*public Terminoa tBilatu(String hitza) {
        
    }*/
    
    public void tGehitu(Terminoa t) {
        
        try {
        
            out.writeObject(t);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
