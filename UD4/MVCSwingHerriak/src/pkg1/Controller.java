
package pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controller implements ActionListener {
    private Model model;
    private View view;
    private ArrayList<Herria> herriak = new ArrayList<>();

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
        view.jButtonL.addActionListener(listener);
        view.jButtonI.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                gehitudena();
                view.jButtonGarbitu.doClick();
                break;
            case "ALDATU":
                aldatudena();
                break;
            case "EZABATU":
                System.out.println("Ezabatzen...");
                model.ezabatu(view.jTextFieldHerria.getText());
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            case "Local":
                view.jButtonL.setBackground(Color.green);
                view.jButtonI.setBackground(Color.red);
                model.dblo = false;
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            case "Internet":
                view.jButtonL.setBackground(Color.red);
                view.jButtonI.setBackground(Color.green);
                model.dblo = true;
                view.jTableInformazioa.setModel(new TerminoenTableModela());
                break;
            default:
                System.out.println("???");
        }        
    }
    
    public void gehitudena() {
        System.out.println("Gehitzen...");
        Herria h = new Herria(view.jTextFieldHerria.getText(), 
                view.jComboBoxProbintzia.getSelectedItem().toString(), 
                view.jCheckBoxHondartza.isSelected(), 
                view.jTextAreaOharra.getText());
        model.gehitu(h);
        
        view.jTableInformazioa.setModel(new TerminoenTableModela());
        
    }
    
    public void aldatudena() {
        System.out.println("Aldatzen...");
        Herria h = new Herria(view.jTextFieldHerria.getText(), 
                view.jComboBoxProbintzia.getSelectedItem().toString(), 
                view.jCheckBoxHondartza.isSelected(), 
                view.jTextAreaOharra.getText());
        model.aldatu(h);
        
        
        view.jTableInformazioa.setModel(new TerminoenTableModela());
    }
    
}
