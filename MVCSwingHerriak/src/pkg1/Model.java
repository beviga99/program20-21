package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Model {
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/vilarchao.benat/Desktop/Class/2.JAVA/GithubProgram/program20-21/MVCSwingHerriak/db/herria.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
        
    
    public void gehitu(Herria i) {
              
        String sql = "INSERT INTO herria(Herriak) VALUES ("+ i.getIzena() +", "+ i.getProbintzia() +", "+ i.getHondatza() +", "+ i.getOharra();
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public ArrayList<Herria> ikusiHerriak(){
        
        String sql = "SELECT Herria, Probintzia, Hondartza, Oharrak FROM Herriak";
        ArrayList<Herria> datuak = new ArrayList<>();
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Herria i = new Herria(rs.getString("Herria"), rs.getString("Probintzia"), rs.getBoolean("Hondartza"), rs.getString("Oharrak"));
                datuak.add(i);
            }
        } catch (SQLException e) {
        }
        return datuak;
    }
    
    public void aldatu(String iz, String p, int h, String o) {
        String sql = "UPDATE Herriak SET Probintzia = " + p + ", Hondartza = " + h + "Oharrak = " + o + " WHERE Herria = " +iz;
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public int ezabatu(String iz){
        
        String sql = "DELETE FROM Herriak WHERE Herria = ?";
        
        try (Connection conn = this.connect();
             PreparedStatement stmt  = conn.prepareStatement(sql)) {
            
            stmt.setString(1, iz);
            return stmt.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
        }
        
    }
    
}
