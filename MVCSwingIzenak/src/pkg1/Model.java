package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


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
    
}
