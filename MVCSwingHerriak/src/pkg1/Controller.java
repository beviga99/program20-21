
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controller implements ActionListener {
    private Model model;
    private View view;
    private ArrayList<Herria> herriak = new ArrayList<>();
    private String strHerriak = "";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.herriak = this.model.ikusiHerriak();
        this.view.jTableInformazioa.setModel(new TerminoenTableModela());
        anadirActionListener(this);
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener); 
        view.jButtonAldatu.addActionListener(listener);
        view.jButtonEzabatu.addActionListener(listener);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                System.out.println("Gehitzen...");
                Herria h = new Herria(view.jTextFieldHerria.getText(), view.jComboBoxProbintzia.getSelectedItem().toString(), view.jCheckBoxHondartza.isSelected(), view.jTextAreaOharra.getText());
                model.gehitu(h);
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            case "ALDATU":
                System.out.println("Aldatzen...");
                model.aldatu(view.jTextFieldHerria.getText(), view.jComboBoxProbintzia.getSelectedItem().toString(), isnumber(view.jCheckBoxHondartza.isSelected()), view.jTextAreaOharra.getText());
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            case "EZABATU":
                System.out.println("Ezabatzen...");
                model.ezabatu(view.jTextFieldHerria.getText());
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            default:
                System.out.println("???");
        }        
    }
    
    public int isnumber(boolean x) {
        if(x == false) {
            return 0;
        } else {
            return 1;
        }
    }
    
}
