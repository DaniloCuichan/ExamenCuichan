package ec.edu.espe.examen.cuichan.model;

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


public class alumno_asignatura {
    @Id
    @Column(name = "COD_ALUMNO", nullable = false)
     private Integer codAlumno;
     @Id
    @Column(name = "COD_ASIGNATURA",length = 10, nullable = false)
     private Integer codAsignatura;
     @Column(name = "CALIFICACION1", nullable = false)
     private Double  calificacion1;
     @Column(name = "CALIFICACION2", nullable = false)
     private Double  calificacion2;
     @Column(name = "CALIFICACION3", nullable = false)
     private Double  calificacion3;

     @Column(name = "PROMEDIO", nullable = false)
     private Double  promedio;

     @Column(name = "ESTADO", nullable = false)
     private Double  etado;

    public alumno_asignatura() {
    }

    public alumno_asignatura(Integer codAlumno, Integer codAsignatura, Double calificacion1, Double calificacion2,
            Double calificacion3, Double promedio, Double etado) {
        this.codAlumno = codAlumno;
        this.codAsignatura = codAsignatura;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = promedio;
        this.etado = etado;
    }

     

}
