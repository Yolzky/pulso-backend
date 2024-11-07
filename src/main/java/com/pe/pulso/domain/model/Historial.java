package com.pe.pulso.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_historial")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Integer idHistorial;

    @Column(name = "id_medico", nullable = false)
    private Integer idMedicoRegistro;

    @Column(name = "id_paciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "indicaciones_urgentes")
    private String indicacionesUrgentes;

    @Column(name = "antecedentes_medicos")
    private String antecedentesMedicos;
}
