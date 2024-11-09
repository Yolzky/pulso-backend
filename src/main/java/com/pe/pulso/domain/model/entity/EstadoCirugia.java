package com.pe.pulso.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado_cirugia")
public class EstadoCirugia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_cirugia")
    private Integer idEstadoCirugia;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Boolean estado;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "estadoCirugia")
    private List<Cirugia> cirugias = new ArrayList<>();
}
