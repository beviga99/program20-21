/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.Menu;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vilarchao.benat
 */
public class Player {

    private int id;
    public static Tablero tablero1 = new Tablero(true);
    public static Tablero tablero2 = new Tablero(true);
    public static Tablero temp = new Tablero(false);
    public static JButton st = new JButton();
    private String PlayerNick;
    
     public Player(int identificator) {

        this.id = identificator;
        
    }
     
    public void PlayerTablero(int id) {
  
        JFrame p1Frame = new JFrame();
        JPanel p1Panel = new JPanel();
        p1Panel.setLayout(new FlowLayout());
        
        p1Frame.add(p1Panel);
        
        if (id == 1) {
            p1Frame.setBounds(250,220,400,400);
        } else {
            p1Frame.setBounds(700,230,400,400);
        }
        JTextField textField = new JTextField(20);   
        p1Panel.add(textField);
        
        
        st.setText("Set name");
        st.setPreferredSize(new Dimension(100, 30));
        p1Panel.add(st);
        
        p1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        p1Frame.setVisible(true);
        
        st.addActionListener(e -> {
            
            setNick(textField.getText());
            p1Frame.setVisible(false);
            JFrame pxFrame = new JFrame(getNick());
            JPanel pxPanel = new JPanel();
            p1Panel.setLayout(new FlowLayout());
        
            if (id == 1) {
                pxFrame.add(pxPanel);
                pxFrame.setBounds(250,220,400,400);
                tablero1.setVisible(true);
                pxFrame.add(tablero1);
            } else {
                pxFrame.add(pxPanel);
                pxFrame.setBounds(700,230,400,400);
                tablero2.setVisible(true);
                pxFrame.add(tablero2);
            }

            pxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            pxFrame.setVisible(true);
            Menu.bucleX++;
        });
        
    }
     
     
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNick() {
        return PlayerNick;
    }

    public void setNick(String PlayerNick) {
        this.PlayerNick = PlayerNick;
    }

}
