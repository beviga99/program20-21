/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vilarchao.benat
 */
public class Player {

    private int id;
    public static Tablero tablero1 = new Tablero(true);
    public static Tablero tablero2 = new Tablero(true);
    public static Tablero temp = new Tablero(false);

     public Player(int id) {
         

        if (id == 1) {
            JFrame p1Frame = new JFrame("Player1");
            JPanel p1Panel = new JPanel();
            p1Panel.setLayout(new FlowLayout());
        
            p1Frame.add(p1Panel);
            p1Frame.setBounds(250,220,400,400);
            tablero1.setVisible(true);
            p1Frame.add(tablero1);
            
            p1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            p1Frame.setVisible(true);

        } else {
            JFrame p2Frame = new JFrame("Player2");
            JPanel p2Panel = new JPanel();
            p2Panel.setLayout(new FlowLayout());
            p2Frame.setBounds(700,220,400,400);
            tablero2.setVisible(true);
            p2Frame.add(tablero2);
            
            
            p2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            p2Frame.setVisible(true);
        }
        

        
        
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    
}
