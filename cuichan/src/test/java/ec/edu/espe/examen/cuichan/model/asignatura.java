package ec.edu.espe.examen.cuichan.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

 @Entity
    @Table(name = "ASIGNATURA")
    @Data
    @Builder
   


public class asignatura implements Serializable{
    @Id
    @Column(name = "COD_ASIGNATURA",length = 10, nullable = false)
     private Integer codAsignatura;
     @Column(name = "NOMBRE", length = 50, nullable = false)
     private String nombre;
      @Column(name = "CREDITOS", length = 1, nullable = false)
     private Integer creditos;

    public asignatura() {
    }

    public asignatura(Integer codAsignatura, String nombre, Integer creditos) {
        this.codAsignatura = codAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        asignatura other = (asignatura) obj;
        if (codAsignatura == null) {
            if (other.codAsignatura != null)
                return false;
        } else if (!codAsignatura.equals(other.codAsignatura))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAsignatura == null) ? 0 : codAsignatura.hashCode());
        return result;
    }

    
    
    
    

}
