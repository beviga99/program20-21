
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.FKudeatu;
import model.Terminoa;

public class TerminoenTableModela extends AbstractTableModel {

    private final String[] ZUTABEIZENAK = {"Español", "Euskera"};
    private ArrayList<Terminoa> datuak = new ArrayList<>();

    public TerminoenTableModela() {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("benat.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa p;
            while (true) {
                p = (Terminoa) inStream.readObject();
                datuak.add(p);
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
                Logger.getLogger(FKudeatu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    
    }

    @Override
    public String getColumnName(int col) {
        return ZUTABEIZENAK[col];

    }

    @Override
    public int getRowCount() {
        return datuak.size();
    }

    @Override
    public int getColumnCount() {
        return ZUTABEIZENAK.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0) {
            return datuak.get(rowIndex).getHitzaEs();
        } else {
            return datuak.get(rowIndex).getHitzaEus();
        }
    }

}