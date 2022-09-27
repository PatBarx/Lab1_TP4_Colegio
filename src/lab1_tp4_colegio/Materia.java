package lab1_tp4_colegio;

import java.util.Objects;

public class Materia {

    private int id,anio;
    private String nom;

    public Materia(int id, int anio, String nom) {
        this.id = id;
        this.anio = anio;
        this.nom = nom;
    }

    
    

    public Materia() {
        this.id=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   

  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", anio=" + anio + ", nom=" + nom + '}';
    }
    
    
}
