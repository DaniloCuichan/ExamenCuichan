package ec.edu.espe.examen.cuichan.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Builder;
import lombok.Data;


    @Entity
    @Table(name = "ALUMNO")
    @Data
    @Builder


    

public class alumno implements Serializable {

    @Id
    @Column(name = "COD_ALUMNO", nullable = false)
     private Integer codAlumno;
     @Column(name = "COD_COLEGIO", nullable = false)
     private Integer codColegio;
     @Column(name = "CEDULA", length = 10, nullable = false)
    private String cedula;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaNacimiento;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaCreacion;


    public alumno() {
    }


    public alumno(Integer codAlumno, Integer codColegio, String cedula, String nombre, Date fechaNacimiento,
            Date fechaCreacion) {
        this.codAlumno = codAlumno;
        this.codColegio = codColegio;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = fechaCreacion;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        alumno other = (alumno) obj;
        if (codAlumno == null) {
            if (other.codAlumno != null)
                return false;
        } else if (!codAlumno.equals(other.codAlumno))
            return false;
        return true;
    }

    
    
}
