package lab1_tp4_colegio;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia agregarMateria(Materia m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int cantidadMaterias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
