package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SavePacienteDto;
import com.pe.pulso.domain.model.entity.Paciente;
import org.springframework.stereotype.Service;

@Service
public interface PacienteService extends GenericService<Paciente, SavePacienteDto, Integer>{
}
