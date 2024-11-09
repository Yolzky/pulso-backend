package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class SaveCirugiaDto {
    private String codigo;
    private LocalDateTime fecha;
    private Integer habitacion;
    private Integer idMedico;
    private Integer idPaciente;
}
