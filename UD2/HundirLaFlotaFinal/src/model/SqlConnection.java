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

public class SqlConnection {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C/Users/vilarchao.benat/Desktop/Class/2.JAVA/GithubProgram/program20-21/HundirLaFlotaFinal/db/hiztegia.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void Tsortu(){

        
        String sql = "CREATE TABLE partida ("
                    + "id INT,"
                    + "player1 VARCHAR(25),"
                    + "player2 VARCHAR(25),"
                    + "winner VARCHAR(25)"
                    + ")";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    
    }
    
    public int Tautoid(){
        String sql = "SELECT id FROM partida";
        int i = 1;
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
             
            while (rs.next()) {
                if (rs.getInt("ID") != i) {
                    return i;
                } else {
                    i++;
                }
            }
        } catch (SQLException e) {
        }
            return i;
    }
        
    public void Tgehitu(Player p1, Player p2, Player winner) {
        
        int ident = Tautoid();
        
        String sql = "INSERT INTO partida VALUES ("+ ident +", '"+ p1.getNick()+", '"+ p2.getNick() + "', '"+ winner.getNick()+"')";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public boolean sortutaDago(){
        
        // SQLite connection string
        String url = "jdbc:sqlite:C:/sqlite/barcos.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
