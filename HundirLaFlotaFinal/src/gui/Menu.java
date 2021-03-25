/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Texto;
import model.Ventana;
import model.*;
import static model.Ventana.SB;


public class Menu {
    
    private static Tablero t_player1 = Player.tablero1;
		
    private static Tablero t_player2 = Player.tablero2;
    
    private static Tablero t_temp = Player.temp;
    
    private static Ventana opciones = new Ventana();
    
    private static Texto texto = opciones.texto;
    
    private static Player player1 = new Player(1);
    
    private static Player player2 = new Player(2);
    
    private static int turn;
    
    public static int bucle = 1;

    public static int bucleX = 1;
    
    
    public static void main(String s[]) { 
        
        SqlConnection n = new SqlConnection();
        if(n.sortutaDago()== false) {
            n.Tsortu();
        }
        
        Ventana.SB.addActionListener(e -> {
            t_temp.showShip(t_player1, t_player2, turn);
        });
        
        
        Ventana.EB.addActionListener(e -> {
            System.exit(0);
         
        });
        switch(bucleX){
            case 1:
                start();
            case 2:
                turno0();
            case 3:
                while (bucle == 1) {
                    turno();
                }
                break;
        
        }
        
    }  
    
    public static void start() {
        
        texto.setTexto("Los jugadores estan introduciendo su nickname");
        
        player1.PlayerTablero(player1.getId());
        player2.PlayerTablero(player2.getId());

    }

    public static void colocarBarco(Tablero tabla, int cant) {
        
        tabla.anadirBarco(cant);
        while (tabla.proceso == 1) {
        waiter(1);
        }
    }
    
    public static void waiter(int num) {

            try{
                    Thread.sleep(num);
                } catch (Exception e) {
                    System.out.println("Issue");
                    //This can be anything to let the user/programmer know something's wrong
                }
    }
    
    public static void change() {
        for(int x = 0; x<100;x++) {
            t_temp.boton[x].setActivo(t_player1.boton[x].getActivo());
            t_temp.boton[x].setTocado(t_player1.boton[x].getTocado());
            t_player1.boton[x].setActivo(false);
            t_player1.boton[x].setTocado(false);
            t_player1.boton[x].setColorDefault();
            t_player1.boton[x].setActivo(t_player2.boton[x].getActivo());
            t_player1.boton[x].setTocado(t_player2.boton[x].getTocado());
            t_player2.boton[x].setActivo(false);
            t_player2.boton[x].setTocado(false);
            t_player2.boton[x].setColorDefault();
            t_player2.boton[x].setActivo(t_temp.boton[x].getActivo());
            t_player2.boton[x].setTocado(t_temp.boton[x].getTocado());
            /*if(t_player2.boton[x].getActivo()){
                t_player1.boton[x].setColorEleccionVerde();
            }
            if(t_player1.boton[x].getActivo()){
                t_player2.boton[x].setColorEleccionVerde();
            }*/
            
        }
    }
    
    public static void turno0() {
        
        texto.setTexto("El "+ player1.getNick() +" esta colocando los barcos.");
        
        colocarBarco(Player.tablero1, 5);
        /*colocarBarco(Player.tablero1, 4);
        colocarBarco(Player.tablero1, 4);
        colocarBarco(Player.tablero1, 3);
        colocarBarco(Player.tablero1, 3);
        
        texto.setTexto("El "+ player2.getNick() +" esta colocando los barcos.");
        
        colocarBarco(Player.tablero2, 5);
        colocarBarco(Player.tablero2, 4);
        colocarBarco(Player.tablero2, 4);
        colocarBarco(Player.tablero2, 3);
        colocarBarco(Player.tablero2, 3);*/
        change();
        bucleX++;
  
        
    }
    
   public static void turno()
	{
		int contador1 = 0;
		int contador2 = 0;
                turn = 1;
                int casilla = 0;
		texto.setTexto("El "+ player1.getNick() +" esta escogiendo casilla.");
		
		
		
		
		t_player1.elegirCasilla();
		
		while(t_player1.proceso==1)
		{
			waiter(1);
		}
		
		//-------------------------------------------------------------
		
		for(int x = 0; x<100;x++) {
			if(t_player1.boton[x].getActivo())
			{
				contador1++;
                                casilla = x;
                                t_player1.boton[x].setOcupado(true);
                               
			}
			if(t_player1.boton[x].getTocado())
			{
				contador2++;
                                casilla = x;
                                t_player1.boton[x].setOcupado(true);
			}
                    
		}
		
		
		if(contador1==contador2)
		{

			bucle = 0;
			texto.setTexto("El "+ player1.getNick() +" ha ganado.");
                        SqlConnection n = new SqlConnection();
                        n.Tgehitu(player1, player2, player1);
		}
		
		//--------------------------------------------------------------
		
                else if(contador1!=contador2)
		{
                        texto.setTexto("El "+ player2.getNick() +" esta escogiendo casilla.");
			contador1 =0;
			contador2 = 0;
			turn = 2;
			t_player2.elegirCasilla();
		
			while(t_player2.proceso==1)
				{
			waiter(1);
			}
			
			for(int x = 0; x<100;x++) {
				if(t_player2.boton[x].getActivo())
				{
					contador1++;
				}
				if(t_player2.boton[x].getHundido() && t_player2.boton[x].getOcupado() == false)
				{
					contador2++;
				}
                            
			}
			
			if(contador1==contador2)
			{
				
				bucle = 0;
				texto.setTexto("El "+ player2.getNick() +" ha ganado.");
                                SqlConnection n = new SqlConnection();
                                n.Tgehitu(player1, player2, player2);
				
			}
			
		}
		
	}
}

