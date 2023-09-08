
package universidadgrupo15;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo15.accesoADatos.AlumnoData;
import universidadgrupo15.accesoADatos.Conexion;
import universidadgrupo15.entidades.Alumno;


public class UniversidadGrupo15 {

  
    public static void main(String[] args) {
        //Connection con = Conexion.getConexion();
        
                
        Alumno diegoRivero= new Alumno (40357951, "Rivero", "Diego", LocalDate.of(1999, 1, 1), true);
        
        AlumnoData alu = new AlumnoData();
        
        alu.agregarAlumno(diegoRivero);
       
        System.out.println(diegoRivero.getIdAlumno());
        
    }
    
}
