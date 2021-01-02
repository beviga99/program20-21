
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class christmasbox extends JFrame{

    public christmasbox() {

        initPanel();
        initPantalla();
 

    }

    private void initPanel() {

        JPanel panel = new JPanel(); //Inicializo panel
        add(panel); //Lo añado al JFrame
        panel.setPreferredSize(new Dimension(1000, 600)); //Establezco dimensiones del panel
        panel.setBackground(Color.pink);

    }

    public void paint(Graphics g) {
        super.paint(g);


        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        int[] ekisak = {200, 220, 200, 220};
        int[] yak = {300, 400, 400, 300};
        g2d.fillPolygon(ekisak, yak, 4);
        /*g.drawLine (300, 200, 400, 220);
        g.drawLine (400, 220, 500, 200);
        g.drawLine (300, 180, 400, 200);
        g.drawLine (400, 200, 500, 180);
        g.drawLine (400, 160, 500, 180);
        g.drawLine (305, 200, 305, 300);
        g.drawLine (495, 200, 495, 300);
        g.drawLine (400, 220, 400, 320);
        g.drawLine (400, 160, 300, 180);
        g.drawLine (400, 200, 400, 220);
        g.drawLine (300, 180, 300, 200);
        g.drawLine (500, 200, 500, 180);
        g.drawLine (305, 300, 400, 320);
        g.drawLine (400, 320, 495, 300);*/
        

        /*g.drawLine (300, 180, 500, 180);
        g.drawLine (305, 200, 305, 350);
        g.drawLine (495, 200, 495, 350);
        g.drawLine (305, 350, 495, 350);*/
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