/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.SQLiteKudeatu;

/**
 *
 * @author GiantsV3
 */
public class SqliteConection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SQLiteKudeatu app = new SQLiteKudeatu();
        app.selectAll();
    }
    
}
