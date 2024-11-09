package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveMedicoEspecialidadDto;
import com.pe.pulso.domain.model.entity.MedicoEspecialidad;
import org.springframework.stereotype.Service;

@Service
public interface MedicoEspecialidadService extends GenericService<MedicoEspecialidad, SaveMedicoEspecialidadDto, Integer>{
    MedicoEspecialidad findAllByMedicoId(Integer medicoId);
    MedicoEspecialidad findAllByEspecialidadId(Integer especialidadId);
}
