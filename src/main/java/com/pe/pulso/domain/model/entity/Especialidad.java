package com.pe.pulso.domain.model.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private Integer idEspecialidad;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<MedicoEspecialidad> medicoEspecialidades;
}
