package ec.edu.espe.examen.cuichan.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

    @Entity
    @Table(name = "COLEGIO")
    @Data
    @Builder


public class colegio implements Serializable  {

    @Id
     @Column(name = "COD_COLEGIO", nullable = false)
     private Integer codColegio;
     @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    public colegio() {
    }
    public colegio(Integer codColegio, String nombre) {
        this.codColegio = codColegio;
        this.nombre = nombre;
    }

    

}
