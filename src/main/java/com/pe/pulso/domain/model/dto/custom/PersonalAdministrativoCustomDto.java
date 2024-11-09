package com.pe.pulso.domain.model.dto.custom;

import com.pe.pulso.domain.model.entity.Persona;
import com.pe.pulso.domain.model.entity.Rol;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonalAdministrativoCustomDto {
    private Integer idPersonalAdministrativo;
    private Persona persona;
    private String horaInicio;
    private String horaFin;
    private Rol rol;
    private String password;
}
