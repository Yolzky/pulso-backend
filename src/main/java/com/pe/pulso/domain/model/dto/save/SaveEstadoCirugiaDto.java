package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveEstadoCirugiaDto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Boolean estado;
}
