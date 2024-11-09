package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveTipoDocumentoDto {
    private String nombre;
    private String codigo;
    private String descripcion;
    private Integer longitudMinima;
    private Integer longitudMaxima;
}
