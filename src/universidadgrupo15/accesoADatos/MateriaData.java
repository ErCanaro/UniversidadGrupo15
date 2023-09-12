
package universidadgrupo15.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo15.entidades.Alumno;

import universidadgrupo15.entidades.Materia;

public class MateriaData {
     private Connection con=null;
    
    public MateriaData(){
        con= Conexion.getConexion();
    }

    public Connection getCon() {
        return con;
    }
    
    public void AgregarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, anio, estado)"
                + "VALUES(?, ?, ?)";
                     
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregado satisfactoriamente con el ID" + rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la materia");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Algo anda mal. "+ npe.getMessage());
        }
    }
    
        public Materia buscarMateriaPorID(int id) {
        String sql = "SELECT * FROM materia WHERE idMateria =  ? AND estado = 1";

        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeQuery();

            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ninguna materia con el ID " + id);
            }

            ps.close();
            System.out.println(materia);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla materia");
        }
        return materia;

    }
}