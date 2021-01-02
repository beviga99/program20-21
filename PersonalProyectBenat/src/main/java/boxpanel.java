
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class boxpanel extends JPanel{
    
    
    
    public boxpanel(){
        preinit();
        initcomponent();
    }
   

    private void initcomponent() {
        
    }

    private void preinit() {
        
    }
    
    public void paint(Graphics g) {
        
            
        super.paint(g);
        
        
        Graphics2D g2d = (Graphics2D) g;
        
        String path = "src/image/back.jpg";
        Image img = (new ImageIcon(path)).getImage();
        g2d.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        
        g.setColor(Color.green);
        Polygon box = new Polygon();
        
        box.addPoint(300, 180);
        box.addPoint(400, 160);
        box.addPoint(500, 180);
        box.addPoint(500, 200);
        box.addPoint(495, 200);
        box.addPoint(495, 300);
        box.addPoint(400, 320);
        box.addPoint(305, 300);
        box.addPoint(305, 200);
        box.addPoint(300, 200);
        box.addPoint(300, 180);
        
        g.fillPolygon(box);
        
        g.setColor(Color.BLACK);
        g.drawLine (300, 200, 400, 220);
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
        g.drawLine (400, 320, 495, 300);
        
}
    
}
