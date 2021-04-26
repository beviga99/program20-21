/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;

/**
 *
 * @author vilarchao.benat
 */
public class createtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Terminoa t1 = new Terminoa("Hola", "Kaixo");
        
        FKudeatuSqlite t = new FKudeatuSqlite();
        
        t.tGehitu(1, t1);
        
    }
    
}
