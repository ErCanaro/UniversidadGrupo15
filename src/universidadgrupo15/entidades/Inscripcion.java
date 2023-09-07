
package universidadgrupo15.entidades;


public class Inscripcion {
    private int idInscripcion;
    private double nota;//revisar si es double o int
    private Materia materia;
    private Alumno alumno;

    public Inscripcion() {
    }

    public Inscripcion(double nota, Materia materia, Alumno alumno) {
        this.nota = nota;
        this.materia = materia;
        this.alumno = alumno;
    }

    public Inscripcion(int idInscripcion, double nota, Materia materia, Alumno alumno) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.materia = materia;
        this.alumno = alumno;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        String insc = "ID: "+ idInscripcion+" - "+ "Alumno: " + alumno.getApellido() + ", "+alumno.getNombre()
                      + ", Materia: "+ materia.getNombre()+ ", Nota: "  + nota;
        return insc;
    }
    
    
    
}
