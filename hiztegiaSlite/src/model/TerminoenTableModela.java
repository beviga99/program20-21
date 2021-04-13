
package model;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TerminoenTableModela extends AbstractTableModel {

    private final String[] ZUTABEIZENAK = {"ID", "Español", "Euskera"};
    private ArrayList<Terminoa> datuak = new ArrayList<>();

    public TerminoenTableModela() {

        FKudeatuSqlite f = new FKudeatuSqlite();
        datuak = f.TikusiTerminoa();
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
            return datuak.get(rowIndex).getIdentificator();
        } else if (columnIndex==1){
            return datuak.get(rowIndex).getHitzaEs();
        } else {
            return datuak.get(rowIndex).getHitzaEus();
        }
    }

}