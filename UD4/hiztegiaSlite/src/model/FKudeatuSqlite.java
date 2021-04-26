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
import java.util.ArrayList;

/**
 *
 * @author vilarchao.benat
 */
public class FKudeatuSqlite {
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/sqlite/hiztegia.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void Tsortu(){

        
        String sql = "CREATE TABLE hiztegia ("
                    + "ID INT,"
                    + "HitzaEs VARCHAR(25),"
                    + "HitzaEus VARCHAR(25)"
                    + ")";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    
    }

    public void Tgehitu(Terminoa t) {
        
        int ident = Tautoid();
        
        t.setIdentificator(ident);
        
        String sql = "INSERT INTO hiztegia VALUES ("+ t.getIdentificator()+", '"+ t.getHitzaEs() + "', '"+ t.getHitzaEus()+"')";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public String Tikusi(String hitza){
        String sql = "SELECT HitzaEs, HitzaEus FROM hiztegia";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                if(rs.getString("HitzaEs").equals(hitza)) {
                    return rs.getString("HitzaEus");
                }else if (rs.getString("HitzaEus").equals(hitza)) {
                    return rs.getString("HitzaEs");
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
        public ArrayList<Terminoa> TikusiTerminoa(){
        String sql = "SELECT ID, HitzaEs, HitzaEus FROM hiztegia";
        ArrayList<Terminoa> datuak = new ArrayList<>();
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getString("HitzaEs"), rs.getString("HitzaEus"));
                t.setIdentificator(rs.getInt("ID"));
                datuak.add(t);
            }
        } catch (SQLException e) {
        }
        return datuak;
    }
    
    public int Tautoid(){
        String sql = "SELECT ID FROM hiztegia";
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
    
    public boolean sortutaDago(){
        
        // SQLite connection string
        String url = "jdbc:sqlite:C:/sqlite/hiztegia.db";
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

