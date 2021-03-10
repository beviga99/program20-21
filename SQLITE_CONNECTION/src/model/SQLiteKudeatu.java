
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLiteKudeatu {
    public static void Connect() {
        
        Connection conn = null;
        try {
            
            String url = "jdbc:sqlite:C:/sqlite/chinook.db";
                    
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection completed successfuly");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                } 
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
