package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SavePacienteDto{
    private String alergias;
    private String enfermedades;
    private Integer idHistorial;
    private Integer idContactoEmergencia;
    //dtos persona
    private SavePersonaDto savePersonaDto;
}
