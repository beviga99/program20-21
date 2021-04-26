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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Juego extends JPanel{
	
	Tablero t_contrincante;
	Tablero t_jugador;

	Juego()
	{

		GridLayout layout = new GridLayout(2,1);
		setLayout(layout);
		
	
		
		//--TABLERO CONTRINCANTE------
		
		t_contrincante = new Tablero(false);
		add(t_contrincante);
				
		//--AÑADIR TABLERO JUGADOR------
				
		t_jugador = new Tablero(true);
		add(t_jugador);
		
		
	}
	

	
}
