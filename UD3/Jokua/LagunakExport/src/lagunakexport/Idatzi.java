package lagunakexport;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import lagunakexport.Laguna;

public class Idatzi {

    public static void main(String[] args) {
        try {
            
            //Creating stream and writing the object    
            FileOutputStream fout = new FileOutputStream("C:/Users/vilarchao.benat/Desktop/BeñatenLagunak.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("Sartu zenbat lagun nahi dituzu sartu: ");
            
            int len = in.nextInt();
            
            for(int i = 1; i <= len; i++) {
                System.out.println("Sartu zure lagunaren izena: ");
                String name = in.next();
                
                Laguna x = new Laguna(i, name);
                out.writeObject(x);
            }
            
            //closing the stream    
            //out.close();
            //System.out.println("Datuak fitxategian idatzi dira.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}