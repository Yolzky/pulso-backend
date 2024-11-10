package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveMedicoEspecialidadDto;
import com.pe.pulso.domain.model.entity.MedicoEspecialidad;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MedicoEspecialidadService extends GenericService<MedicoEspecialidad, SaveMedicoEspecialidadDto, Integer>{
    List<MedicoEspecialidad> findAllByMedicoId(Integer medicoId);
    List<MedicoEspecialidad> findAllByEspecialidadId(Integer especialidadId);
}
