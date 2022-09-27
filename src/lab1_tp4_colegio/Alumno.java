package lab1_tp4_colegio;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String apellido,nombre;
    HashSet<Materia>mat;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
       
    }

   
    

    public Alumno() {
        mat=new HashSet();
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

    public HashSet<Materia> getMat() {
        return mat;
    }

    public void setMat(HashSet<Materia> mat) {
        this.mat = mat;
    }

   

    
  
    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", mat=" + mat + '}';
    }
    
    
    public void AgregarMateria(Materia ma){
        if(mat.add(ma)){
        System.out.println("se anoto en la materia");
         JOptionPane.showMessageDialog(null, "se anoto en la materia");
    }else{
            System.out.println("ya estaba anotado");
            JOptionPane.showMessageDialog(null, "ya estaba anotado");
        }
        for (Materia aux : mat) {
                 System.out.println(aux);
             }
              
    }
     public void cantidadDeMaterias(){
         JOptionPane.showMessageDialog(null, "el alumno esta inscripto a "+mat.size()+" materias");
    }
}
