package com.pe.pulso.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "nro_documento")
    private String nroDocumento;

    @Column(name = "password")
    private String password;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellido1")
    private String apellido1;

    @Column(name = "apellido2")
    private String apellido2;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "numero_telefono")
    private String numeroTelefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "fecha_registro")
    private String fechaRegistro;

    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;

    @Column(name = "id_rol")
    private Integer idRol;
}
