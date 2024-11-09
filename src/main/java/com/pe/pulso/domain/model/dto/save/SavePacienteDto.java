package com.pe.pulso.domain.model.dto.save;

import com.pe.pulso.domain.model.entity.Persona;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SavePacienteDto extends SavePersonaDto{
    private String alergias;
    private String enfermedades;
    private Integer idHistorial;
    private Integer idContactoEmergencia;
}
