package lagunakexport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lagunakexport.Laguna;

public class Irakurri {

    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C:/Users/vilarchao.benat/Desktop/BeñatenLagunak.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Laguna x;
            while (true) {
                x = (Laguna) inStream.readObject(); //
                System.out.println(x);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {
            System.out.println("Ez dago objektu gehiagorik.");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                Logger.getLogger(Irakurri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
