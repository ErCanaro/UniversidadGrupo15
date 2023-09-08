
package universidadgrupo15.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo15.entidades.Alumno;


public class AlumnoData {
    private Connection con=null;
    
    public AlumnoData(){
        con= Conexion.getConexion();
    }

    public Connection getCon() {
        return con;
    }

    
    //Agregar Alumno
    public void agregarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
                     
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado satisfactoriamente con el ID" + rs.getInt(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar alumno");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Algo no anda. "+ npe.getMessage());
        }
        
    }
    
}
