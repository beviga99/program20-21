/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vilarchao.benat
 */
public class FKudeatuSqlite {
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/sqlite/hiztegia.db";
        Connection conn = null;
        System.out.println("Connected.");
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Not connected.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void Tsortu(){

        
        String sql = "CREATE TABLE hiztegia ("
                    + "ID INT PRIMARY KEY, "
                    + "HitzaEs VARCHAR(25),"
                    + "HitzaEus VARCHAR(25)"
                    + ")";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }

    public void tGehitu(int ID, Terminoa t) {
        
        String sql = "INSERT INTO hiztegia VALUES ("+ ID +", "+ t.getHitzaEs() + ", "+ t.getHitzaEus()+")";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
