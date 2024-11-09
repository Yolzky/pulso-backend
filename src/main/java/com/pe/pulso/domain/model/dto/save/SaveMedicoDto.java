package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveMedicoDto{
    private String numeroColegiatura;
    private String horaInicio;
    private String horaFin;
    //dtos persona
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String numeroTelefono;
    private String sexo;
    private String fechaNacimiento;
    private Integer idTipoDocumento;
    private String nroDocumento;
    private String correo;
}
