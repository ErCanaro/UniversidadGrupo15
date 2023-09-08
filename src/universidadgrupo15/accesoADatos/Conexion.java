
package universidadgrupo15.accesoADatos;

// URL  BD USUARIO PASSWORD Connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL="jdbc:mariadb://localhost/";
    public static final String BD="universidad";
    public static final String USER="root";
    public static final String PASS="";
    public static Connection conexion;
    
    private Conexion(){};
    
    public static Connection getConexion(){
        try {
            //Cargar Driver  
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la  CONEXION
            conexion = DriverManager.getConnection(URL+BD,USER,PASS);
            JOptionPane.showMessageDialog(null, "Conexion a " + BD + " establecida");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la BD");
        }
        
        return conexion;
    }
}
