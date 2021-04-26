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
        String url = "jdbc:sqlite:C:/Users/vilarchao.benat/Desktop/Class/2.JAVA/GithubProgram/program20-21/MVCSwingIzenak/DB/IzenenDBa.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
        
    
    public int Igehitu(Izena i) {
              
       
        String sql = "INSERT INTO Izenak(izena) VALUES (?)";
        
        try (Connection conn = this.connect();
             PreparedStatement stmt  = conn.prepareStatement(sql)) {
            
            stmt.setString(1, i.getIzena());
            return stmt.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
        }
    }

    public String Iirakurri() {
        
        String sql = "SELECT Izena FROM Izenak";
        
        try (Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                return rs.getString("Izena");
            }  
            
        } catch (SQLException e) {
        }
        return null;
        
    }
    
    public ArrayList<Izena> IikusiIzenak(){
        
        String sql = "SELECT Izena FROM Izenak";
        ArrayList<Izena> datuak = new ArrayList<>();
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                Izena i = new Izena(rs.getString("Izena"));
                datuak.add(i);
            }
        } catch (SQLException e) {
        }
        return datuak;
    }
    
    public int iezabatu(String iz){
        
        String sql = "DELETE FROM Izenak WHERE Izena = ?";
        
        try (Connection conn = this.connect();
             PreparedStatement stmt  = conn.prepareStatement(sql)) {
            
            stmt.setString(1, iz);
            return stmt.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
        }
        
    }
    
}
