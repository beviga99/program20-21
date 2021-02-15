package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	
	public static Texto texto;
        public static JPanel panel;
        public static JButton SB;
        public static JButton RB;
        public static JButton EB;
	
	Ventana()
	{
		setTitle("Versenken Das Boot");
		
		//--CARACTERISTICAS DE LA VENTANA
		

        
         
                setBounds(505,60,350,150); 
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                setVisible(true);
		
		
		

		
                panel = new JPanel();
                panel.setLayout(new FlowLayout());
                add(panel);
		
		texto = new Texto();
		add(texto, BorderLayout.SOUTH);
		
                SB = new JButton();
                SB.setPreferredSize(new Dimension(100, 30));
                SB.setText("Posición"); 
                panel.add(SB);
                
                RB = new JButton();
                RB.setPreferredSize(new Dimension(80, 30));
                RB.setText("Restart"); 
                panel.add(RB);
                
                EB = new JButton(); 
                EB.setPreferredSize(new Dimension(80, 30));
                EB.setText("Exit"); 
                panel.add(EB); 
                
		
		//-------------------------
				
		setVisible(true);
		
	}
	
	

}
