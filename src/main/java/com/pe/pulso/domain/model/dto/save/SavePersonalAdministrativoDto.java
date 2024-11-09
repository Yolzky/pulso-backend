package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SavePersonalAdministrativoDto extends SavePersonaDto{
    private String horaInicio;
    private String horaFin;
    private Integer idRol;
    private String password;
}
