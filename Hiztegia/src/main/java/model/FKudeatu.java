
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FKudeatu {
  
        public void tSortu() {

            Terminoa t1 = new Terminoa("Hola", "Kaixo");
            Terminoa t2 = new Terminoa("Hombre", "Gizon");
            Terminoa t3 = new Terminoa("Mujer", "Andrea");
            Terminoa t4 = new Terminoa("Manzana", "Sagarra");
            Terminoa t5 = new Terminoa("Adios", "Agur");
            
        try {

            FileOutputStream fout = new FileOutputStream("benat.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            
            out.writeObject(t1);
            out.writeObject(t2);
            out.writeObject(t3);
            out.writeObject(t4);
            out.writeObject(t5);

        
        } catch (IOException e) {
            
        }
    }
    
    
    public Terminoa tBilatu(String hitza) {
        FileInputStream fin;
        
        try {
            fin = new FileInputStream("benat.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa x;
            while (true) {
                x = (Terminoa) inStream.readObject();
                if(x.getHitzaEs().equals(hitza)) {
                    return x;
                } else if (x.getHitzaEs().equals(hitza)) {
                    return x;
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {
            System.out.println("Ez dago objektu gehiagorik.");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        }
        return null;
    }
    
    public void tGehitu(Terminoa t) {
        
        try {
            FileOutputStream fout = new FileOutputStream("benat.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(t);
        
        } catch (IOException e) {
        }
    }

}
