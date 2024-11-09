package com.pe.pulso.domain.model.dto.save;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@Builder
public class SaveHistorialDto {
    private Integer idMedicoRegistro;
    private Integer idPaciente;
    private String indicacionesUrgentes;
    private String antecedentesMedicos;
}
