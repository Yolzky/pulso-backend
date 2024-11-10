package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveRolDto {
    private String nombre;
    private String codigo;
    private Boolean estado;
}
