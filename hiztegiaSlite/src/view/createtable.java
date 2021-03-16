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
        
        Terminoa t1 = new Terminoa("Mujer", "Andrea");
        Terminoa t2 = new Terminoa("Niño", "umea");
        
        FKudeatuSqlite t = new FKudeatuSqlite();
        
        t.Tsortu();
        
        t.Tgehitu(t1);
        t.Tgehitu(t2);
        
        t.Tikusi();
        
    }
    
}
