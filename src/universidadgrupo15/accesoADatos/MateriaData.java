
package universidadgrupo15.accesoADatos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import universidadgrupo15.entidades.Materia;

public class MateriaData {
     private Connection con=null;
    
    public MateriaData(){
        con= Conexion.getConexion();
    }

    public Connection getCon() {
        return con;
    }
    //CRUD Create Read Update Delete
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
            //System.out.println(materia);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla materia");
        }
        return materia;

    }
        public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, anio =?  WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "La materia con el ID "+ materia.getIdMateria() + " ha sido modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
    }
       
        public void borrarMateria(int id){
        String sql = "UPDATE materia SET estado = ? WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, id);
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "La materia con el ID "+ id + " ha sido borrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
        
    }
        
        public void altaMateriaBorrada(int id){
        String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, id);
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "La materia con el ID "+ id + " ha sido restablecida");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
        
    }
    
        //Listar Materias
       public List<Materia> listarMaterias() {
        String sql = "SELECT idMateria, nombre, anio FROM materia WHERE estado = 1 ";

        ArrayList<Materia> listaMaterias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnio(rs.getInt("anio"));
                //mate.setEstado(rs.getBoolean("estado"));

                listaMaterias.add(mate);
            }

            if (listaMaterias.size() < 1) {
                JOptionPane.showMessageDialog(null, "NO hay materias para mostrar");
            }
            ps.close();

            for (Materia m : listaMaterias) {
                System.out.println(m);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro al conectar con tabala Materia");
        }

        return listaMaterias;
    }
       
        
}