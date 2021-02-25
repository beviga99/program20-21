package model;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	
	public static Texto texto;
        public static JPanel panel;
        public static JButton SB;
        public static JButton RB;
        public static JButton EB;
	
	public Ventana()
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
                SB.setText("Barcos"); 
                panel.add(SB);
               
                
                EB = new JButton(); 
                EB.setPreferredSize(new Dimension(80, 30));
                EB.setText("Exit"); 
                panel.add(EB); 
                
		
		//-------------------------
				
		setVisible(true);
		
	}
	
	

}
