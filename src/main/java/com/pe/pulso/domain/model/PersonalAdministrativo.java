package com.pe.pulso.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_personal_administrativo")
public class PersonalAdministrativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal_administrativo")
    private Integer idPersonalAdministrativo;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "hora_fin")
    private String horaFin;
}
