

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
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Inscripcion;
import universidadgrupo15.entidades.Materia;


public class InscripcionData {
    private Connection con=null;
    private AlumnoData adata = new AlumnoData();
    private MateriaData mdata = new MateriaData();
    
    
    public InscripcionData(){
        this.con = Conexion.getConexion();
    }
    
    public void crearInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha agregado la Inscripción");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }
        
    }
    
    
      public void actualizarNota(double nota, int idAlumno, int idMateria) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada correctamente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripcion");
        }

    }
    
     public void borrarNota(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();

            int filas = ps.executeUpdate();
            if (filas >= 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion anulada");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripcion");
        }

    }
    
    //Obtener inscripciones
     public List<Inscripcion> obtenerInscripciones(){
        String sql = "SELECT * FROM inscripcion";

        ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setNota(rs.getDouble("nota"));
                insc.setAlumno(adata.buscarAlumnoPorID(rs.getInt("idAlumno")));
                insc.setMateria(mdata.buscarMateriaPorID(rs.getInt("idMateria")));
                
                listaInscripciones.add(insc);
            }
            
//            for(Inscripcion  i : listaInscripciones){
//                System.out.println(i);
//            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }
         
        return listaInscripciones;
     }
    
     
     //Obetener inscripciones por alumno
     public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
         ArrayList<Inscripcion> listaInscripcionesPorAlumno = new ArrayList<>();
         
         String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setNota(rs.getDouble("nota"));
                insc.setAlumno(adata.buscarAlumnoPorID(id));
                insc.setMateria(mdata.buscarMateriaPorID(rs.getInt("idMateria")));
                
                listaInscripcionesPorAlumno.add(insc);
            }
            
//            for(Inscripcion  i : listaInscripcionesPorAlumno){
//                System.out.println(i);
//            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }
        
         return listaInscripcionesPorAlumno;
     }
     
     
     //Obteber Materias Cursadas por Alumno
     public List<Materia> obtenerMateriasCursadasPorAlumno(int idAlumno){
         ArrayList<Materia> listaMateriasCursadasPorAlumno = new ArrayList<>();
                 
         String sql = "SELECT idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia mate = mdata.buscarMateriaPorID(rs.getInt("idMateria"));
                listaMateriasCursadasPorAlumno.add(mate);
            }
            
//            for(Materia m : listaMateriasCursadasPorAlumno){
//                System.out.println(m);
//            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }
        
         return listaMateriasCursadasPorAlumno;         
     }
     
     
     //Obteber Materias NO Cursadas por Alumno
     public List<Materia> obtenerMateriasNOCursadasPorAlumno(int idAlumno){
         ArrayList<Materia> listaMateriasNOCursadasPorAlumno = new ArrayList<>();
                 
         String sql = "SELECT materia.idMateria FROM materia "
                    + "LEFT JOIN inscripcion ON materia.idMateria = inscripcion.idMateria AND inscripcion.idAlumno = ? "
                    + "WHERE inscripcion.idAlumno IS NULL";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia mate = mdata.buscarMateriaPorID(rs.getInt("idMateria"));
                listaMateriasNOCursadasPorAlumno.add(mate);
            }
            
//            for(Materia m : listaMateriasNOCursadasPorAlumno){
//                System.out.println(m);
//            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }
        
         return listaMateriasNOCursadasPorAlumno;         
     }
     

     //Obetener alumnos por Materia
     public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
         ArrayList<Alumno> listaAlumnosPorMateria = new ArrayList<>();
         
         String sql = "SELECT DISTINCT inscripcion.idAlumno FROM inscripcion WHERE inscripcion.idMateria = ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
           if(!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No hay alumnos inscriptos en la materia " + mdata.buscarMateriaPorID(idMateria).getNombre());
            }
            
            while(rs.next()) {
                Alumno alu = adata.buscarAlumnoPorID(rs.getInt("idAlumno"));
                
                listaAlumnosPorMateria.add(alu);
            }
             
//            for(Alumno a : listaAlumnosPorMateria){
//                System.out.println(a);
//            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Inscripción");
        }

         return listaAlumnosPorMateria;
     }
     
     public Inscripcion buscarNotaPorAlumnoyMateria(Alumno a, Materia m) {
         String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
         
         Inscripcion insc = new Inscripcion();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, a.getIdAlumno());
            ps.setInt(2, m.getIdMateria());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                insc.setNota(rs.getDouble("nota"));
                insc.setAlumno(adata.buscarAlumnoPorID(rs.getInt("idAlumno")));
                insc.setMateria(mdata.buscarMateriaPorID(rs.getInt("idMateria")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla Inscripcion");
        } 
         return insc;
     }
     
     public List<Alumno> listaAlumnosConInscripcion() {
         String sql =  "SELECT DISTINCT idAlumno FROM inscripcion WHERE idAlumno IS NOT null AND idMateria IS NOT null";
         
         ArrayList<Alumno> listaAlumnosConInscripcion = new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Alumno alu = adata.buscarAlumnoPorID(rs.getInt("idAlumno"));
                listaAlumnosConInscripcion.add(alu);
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla Inscripcion");
        }
        return listaAlumnosConInscripcion;
     }
}
