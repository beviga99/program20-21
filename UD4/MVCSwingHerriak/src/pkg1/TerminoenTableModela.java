
package pkg1;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TerminoenTableModela extends AbstractTableModel {

    private final String[] ZUTABEIZENAK = {"Herria", "Probintzia", "Hondartza", "Oharra"};
    private ArrayList<Herria> herriak = new ArrayList<>();

    public TerminoenTableModela() {

        Model m = new Model();
        herriak = m.ikusiHerriak();
    }

    @Override
    public String getColumnName(int col) {
        return ZUTABEIZENAK[col];

    }

    @Override
    public int getRowCount() {
        return herriak.size();
    }

    @Override
    public int getColumnCount() {
        return ZUTABEIZENAK.length;
    }
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0) {
            return herriak.get(rowIndex).getIzena();
        } else if (columnIndex==1){
            return herriak.get(rowIndex).getProbintzia();
        } else if (columnIndex==2){
            return herriak.get(rowIndex).getHondatza();
        } else {
            return herriak.get(rowIndex).getOharra();
        }
    }

}
