package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class SaveMedicoEspecialidadDto {
    private Integer idMedico;
    private Integer idEspecialidad;
    private String numeroCertificado;
    private LocalDate fechaEspecializacion;
    private String nivelExperiencia;
}
