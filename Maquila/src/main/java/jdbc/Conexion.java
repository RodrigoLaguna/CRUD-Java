
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
   private static final String url = "jdbc:mysql://localhost:3306/sga?useSSL=false&serverTimezone=UTC";
   private static final String user = "root";
   private static final String pass = "admin";
   
   public static Connection getConnection() throws SQLException{
       return DriverManager.getConnection(url,user,pass);
   }    
   
   public static void close(Statement st){
       try {
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public static void close(Connection conn){
       try {
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
      public static void close(ResultSet conn){
       try {
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
