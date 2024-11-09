package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveEspecialidadDto;
import com.pe.pulso.domain.model.entity.Especialidad;
import org.springframework.stereotype.Service;

@Service
public interface EspecialidadService extends GenericService<Especialidad, SaveEspecialidadDto ,Integer>{
}
