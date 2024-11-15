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
    private SavePersonaDto savePersonaDto;
}
