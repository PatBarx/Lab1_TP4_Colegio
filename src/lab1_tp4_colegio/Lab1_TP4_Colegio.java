package lab1_tp4_colegio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author EQUIPO 10
 */
public class Lab1_TP4_Colegio {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String r;
        int id=0;         //(int id, int anio, String nom)
        Materia ing=new Materia(1234, 1, "Inglés");
        Materia mate=new Materia(2345, 1, "Matemáticas");
        Materia lab1=new Materia(3456, 1, "Laboratorio 1");
        
        JOptionPane.showMessageDialog(null,"  -  Colegio Grupo 10  - \n BIENVENIDO");
        
                            //(int legajo, String apellido, String nombre)
        Alumno al1=new Alumno(1001,"LÓPEZ","Martín");       
        Alumno al2=new Alumno(1002,"MARTÍNEZ","Brenda");
        JOptionPane.showMessageDialog(null,"  -  Alumnos Agregados - ");
        al1.AgregarMateria(ing);
        al1.AgregarMateria(mate);
        al1.AgregarMateria(lab1);
        JOptionPane.showMessageDialog(null,"  -  Alumno 1 inscripto - ");
        al2.AgregarMateria(ing);
        al2.AgregarMateria(mate);
        al2.AgregarMateria(lab1);
        
        al2.AgregarMateria(lab1);
        JOptionPane.showMessageDialog(null,"  -  Alumno 2 inscripto - ");
        //inscribimos a al2 en lab1 nuevamente
        //mostrar cant de materias de cada Alumno
        JOptionPane.showMessageDialog(null, "CANTIDAD DE MATERIAS\nAlumno "
                + al1.getApellido() + ", " + al1.getNombre() + "\n"
                + al1.cantidadMaterias() + " materias");
        JOptionPane.showMessageDialog(null, "CANTIDAD DE MATERIAS\nAlumno "
                + al2.getApellido() + ", " + al2.getNombre() + "\n"
                + al2.cantidadMaterias() + " materias");
         
        System.out.println(al1.toString()); 
        System.out.println(al2.toString());
        
        
        
        /* El Manu ahora es Formulario..
        do{
            Materia ma=new Materia();
        JOptionPane.showMessageDialog(null, "ingrese el apellido del alumno");
        al.setApellido(leer.next());
        JOptionPane.showMessageDialog(null, "ingrese el id de la materia");
        ma.setId(leer.nextInt());
         al.AgregarMateria(ma);
            System.out.println("desea ingresar otra materia");
            r=leer.next();
        }while(r.equalsIgnoreCase("s"));
        System.out.println(al.getApellido());
        */        
    }    
}
