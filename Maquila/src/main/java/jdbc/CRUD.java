
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD {
    private static final String sql_insert_cliente= "insert into Cliente(Nombre,Direccion) values (?,?)";
    private static final String sql_insert_producto= "insert into Tornillo(Material,PrecioXpieza,Tamaño) values (?,?,?)";
    private static final String sql_select_inventario= "select * from Inventario";
    private static final String sql_actualiza_precio= "update Tornillo set  PrecioXpieza=? where ID_Tornillo=?";
    
    public void inserta_cliente(Cliente cliente){
            
        Connection conn = null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        
        try {
            // Conexion con DriverManager
            conn = Conexion.getConnection();
            // Statement
            stmt = conn.prepareStatement(sql_insert_cliente);
            stmt.setString(1,cliente.getNombre());
            stmt.setString(2,cliente.getDireccion());
            
            // Ejecucion de query
            rs = stmt.executeQuery();
            System.out.println("Cliente registrado");
            
        } catch (SQLException ex) {
            System.out.println("Error al registrar cliente");
            
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
    }
    
    
    public void inserta_producto(Tornillo tornillo){
            
        Connection conn = null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        
        try {
            // Conexion con DriverManager
            conn = Conexion.getConnection();
            // Statement
            stmt = conn.prepareStatement(sql_insert_producto);
            stmt.setString(1,tornillo.getMaterial());
            stmt.setFloat(2,tornillo.getPrecioXpieza());
            stmt.setFloat(2,tornillo.getTamaño());
            
            // Ejecucion de query
            rs = stmt.executeQuery();
            System.out.println("Producto registrado");
            
        } catch (SQLException ex) {
            System.out.println("Error al registrar producto");
            
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    
    
    public List<Inventario> lista_productos(){
        Connection conn = null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Inventario inv = null;
        List<Inventario> inventario=new ArrayList<Inventario>();
        
        try {
            // Conexion con DriverManager
            conn = Conexion.getConnection();
            // Statement
            stmt = conn.prepareStatement(sql_select_inventario);
            // Ejecucion de query
            rs = stmt.executeQuery();
            if(rs.next()){
                int Piezas = rs.getInt("Piezas");
                String Tipo = rs.getString("Tipo");
                inv =new Inventario();
                inv.setPiezas(Piezas);
                inv.setTipo(Tipo);
            }
        } catch (SQLException ex) {
            System.out.println("Error a listar los productos");
            
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return inventario;
    }
    
    
        public boolean Retirar(float precio,int Producto){
        Connection conn = null;
        CallableStatement cst = null;
      
        try {
            // Conexion con DriverManager
            conn = Conexion.getConnection();
            // Statement
            cst = conn.prepareCall(sql_actualiza_precio);
            cst.setFloat(1,precio);
            cst.setInt(2,Producto);
            // Ejecucion de query
            cst.execute();
            System.out.println("Actualizacion exitosa");
           return true;
        } catch (SQLException ex) {
            System.out.println("Actualizacion erronea");
            return false;
            
        }finally{
            Conexion.close(cst);
            Conexion.close(conn);
        }     
    }
}
