package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Model {
    
    public boolean dblo;
    
    private Connection connect(boolean t) {
        // SQLite connection string
        if (t == true) {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbd:mariadb://192.168.65.1:3306/HerrienDBa", "dam1", "dam1");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        } else {
            String url = "jdbc:sqlite:C:/Users/vilarchao.benat/Desktop/Class/2.JAVA/GithubProgram/program20-21/MVCSwingHerriak/db/herria.db";
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }
    }
    
    public void gehitu(Herria i) {
              
        String sql = "INSERT INTO Herriak VALUES ('"+ i.getIzena() +"', '"+ i.getProbintzia() +"', "+ i.getHondatza() +", '"+ i.getOharra() + "')";
        
        try (Connection conn = this.connect(dblo);
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
                        
        } catch (SQLException e) {
        }
    }
    
    public ArrayList<Herria> ikusiHerriak(){
        
        String sql = "SELECT Herria, Probintzia, Hondartza, Oharrak FROM Herriak";
        ArrayList<Herria> datuak = new ArrayList<>();
        try (Connection conn = this.connect(dblo);
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
    
    public void aldatu(Herria h1) {
        String sql = "UPDATE Herriak SET Probintzia = '" + h1.getProbintzia() + "', Hondartza = " + h1.getHondatza() + ", Oharrak = '" + h1.getOharra() + "' WHERE Herria = '" + h1.getIzena() + "'";
        try (Connection conn = this.connect(dblo);
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public void ezabatu(String iz){
        
        String sql = "DELETE FROM Herriak WHERE Herria = '" + iz + "'";
        
        try (Connection conn = this.connect(dblo);
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
        
    }
    
}
