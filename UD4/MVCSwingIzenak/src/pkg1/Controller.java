
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controller implements ActionListener {
    private Model model;
    private View view;
    private ArrayList<Izena> izenak = new ArrayList<>();
    private String strIzenak = "";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.izenak = this.model.IikusiIzenak();
        anadirActionListener(this);
        update();
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener);  
        view.jButtonEzabatu.addActionListener(listener);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                System.out.println("Gehitzen...");
                Izena i = new Izena(view.jTextFieldIzena.getText());
                model.Igehitu(i);
                update();
                break;
            case "EZABATU":
                System.out.println("Ezabatzen...");
                model.iezabatu(view.jTextFieldIzena.getText());
                update();
                break;
            default:
                System.out.println("???");
        }        
    }
    
    public void update() {
        
        for (Izena iz : izenak) {
            strIzenak += iz.getIzena()+"\n";
        }
        this.view.jTextArea1.setText(strIzenak);
    }
    
}
