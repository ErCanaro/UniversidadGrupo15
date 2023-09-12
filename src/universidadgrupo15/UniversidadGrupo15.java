
package universidadgrupo15;

import java.time.LocalDate;
import universidadgrupo15.accesoADatos.AlumnoData;
import universidadgrupo15.accesoADatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;


public class UniversidadGrupo15 {

  
    public static void main(String[] args) {
        //Connection con = Conexion.getConexion();
        
                
        //Alumno diegoRivero= new Alumno (40357953, "Rivero", "Diego", LocalDate.of(1999, 1, 1), true);
//        Alumno diegoRivero= new Alumno (5, 40357953, "Quito", "Armando Esteban", LocalDate.of(1999, 1, 1), true);
        
//        AlumnoData alu = new AlumnoData();
        
//        alu.agregarAlumno(diegoRivero);
//       
//        System.out.println(diegoRivero.getIdAlumno());
        
//        alu.modificarAlumno(diegoRivero);
//        alu.buscarAlumnoPorDni(32458798);

//        alu.listarAlumnos();

        MateriaData matedata = new MateriaData();
        
        Materia mate = new Materia("Historia", 2, true);
        
//        matedata.AgregarMateria(mate);
        
        matedata.buscarMateriaPorID(4);
        
    }
    
}
