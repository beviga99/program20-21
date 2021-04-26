/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
	
	Juego juego;
	Texto texto;
	Titulo titulo;
	
	
	Ventana()
	{
		setTitle("Hundir la Flota 2.0");
		
		//--CARACTERISTICAS DE LA VENTANA
		
		this.setResizable(false);
		
		this.setIconImage(new ImageIcon("src\\imagenes\\icono.png").getImage());
		
		setBounds(100,100,490,700);
		
		setLocationRelativeTo(null);
			
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		juego = new Juego();
		add(juego, BorderLayout.CENTER);
		
		texto = new Texto();
		add(texto, BorderLayout.SOUTH);
		
		titulo = new Titulo();
		add(titulo, BorderLayout.NORTH);
		
		//-------------------------
				
		setVisible(true);
		
	}
	
	

}
