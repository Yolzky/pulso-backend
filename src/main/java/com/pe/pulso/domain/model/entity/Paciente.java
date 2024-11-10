package com.pe.pulso.domain.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer idPaciente;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @Column(name = "alergias")
    private String alergias;

    @Column(name = "enfermedades")
    private String enfermedades;

    @Column(name = "id_historial")
    private Integer idHistorial;

    @Column(name = "id_contacto_emergencia")
    private Integer idContactoEmergencia;
}
