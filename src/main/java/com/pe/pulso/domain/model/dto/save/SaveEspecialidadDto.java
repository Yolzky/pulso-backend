package com.pe.pulso.domain.model.dto.save;

import com.pe.pulso.domain.model.entity.Especialidad;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveEspecialidadDto {
    String nombre;
}
