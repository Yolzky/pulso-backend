package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveMedicoEspecialidadDto {
    private Integer idMedico;
    private Integer idEspecialidad;
    private String numeroCertificado;
    private String fechaEspecializacion;
    private String nivelExperiencia;
}
