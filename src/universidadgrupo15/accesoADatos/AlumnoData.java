
package universidadgrupo15.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar alumno");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Algo no anda. "+ npe.getMessage());
        }
        
    }
    
    //Modificar Alumno
    public void modificarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET dni = ?, apellido =?, nombre=?,fechaNacimiento=? WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "El alumno con el ID "+ alumno.getIdAlumno() + " ha sido modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
    }
    
    //Borrar alumno logicamente
    public void borrarAlumno(int id){
        String sql = "UPDATE alumno SET estado = ? WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, id);
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "El alumno con el ID "+ id + " ha sido borrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
    }
    
    //Dar de alta alumno borrado
    public void altaAlumnoBorrado(int id){
        String sql = "UPDATE alumno SET estado = ? WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, id);
            
            int modificado = ps.executeUpdate();
            
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "El alumno con el ID "+ id + " ha sido reincorporado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con al tabla");
        }
    }
       
    //Buscar alumno por ID
    public Alumno buscarAlumnoPorID(int id) {
        String sql = "SELECT * FROM alumno WHERE idAlumno = ?";

        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeQuery();

            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                alumno = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con el ID " + id);
            }

            ps.close();
            //System.out.println(alumno);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla alumno");
        }
        return alumno;

    }
    
    //Buscar alumno por ID
    public Alumno buscarAlumnoPorDni(int dni) {
        String sql = "SELECT * FROM alumno WHERE dni =  ?";

        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeQuery();

            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                alumno = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con el DNI " + dni);
            }
            ps.close();
            //System.out.println(alumno);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla alumno");
        }
        return alumno;
    }
    
    
    public List<Alumno> listarAlumnos(){
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
        
        List<Alumno> listaAlumnos= new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                Alumno alum = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate());
                listaAlumnos.add(alum);
            }
            
            if (listaAlumnos.size()<1){
                JOptionPane.showMessageDialog(null, "No hay alumnos que mostrar");
            }
            ps.close();
            
//            for(Alumno a : listaAlumnos) {
//                System.out.println(a);
//            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAlumnos;
        
    }
}
