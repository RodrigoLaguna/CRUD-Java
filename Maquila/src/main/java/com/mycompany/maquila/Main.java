
package com.mycompany.maquila;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Conexion;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt=null;
        
        try {
            // Conexion con DriverManager
            conn = Conexion.getConnection();
            System.out.println("Conexion exitosa");


        } catch (SQLException ex) {
            System.out.println("Error");
            
        }
    }
}
