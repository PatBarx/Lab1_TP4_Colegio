package lab1_tp4_colegio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author EQUIPO 10
 */
public class Lab1_TP4_Colegio {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        Alumno al=new Alumno();
        
        String r="";
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
        
    }
    
}
