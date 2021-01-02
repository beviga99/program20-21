

import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class christmasbox extends JFrame{

    boxpanel p;
    public christmasbox() {

        /*initPanel();*/
        initPantalla();
        Container contentpane = getContentPane();
        
        p = new boxpanel();
        contentpane.add(p);
    }
 
    private void initPantalla() {
           
        setTitle("BOX");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        christmasbox drawing = new christmasbox();

    }
}