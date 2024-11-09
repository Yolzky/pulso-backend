package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveContactoEmergenciaDto {
    private String nombre;
    private String direccion;
    private String telefono;
}
