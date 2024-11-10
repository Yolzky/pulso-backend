package com.pe.pulso.domain.model.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cirugia")
public class Cirugia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cirugia")
    private Integer idCirugia;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_estado_cirugia")
    private EstadoCirugia estadoCirugia;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "habitacion")
    private Integer habitacion;

    @Column(name = "id_medico")
    private Integer idMedico;

    @Column(name = "id_paciente")
    private Integer idPaciente;
}
