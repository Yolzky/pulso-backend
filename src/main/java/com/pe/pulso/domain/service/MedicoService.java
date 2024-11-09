package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveMedicoDto;
import com.pe.pulso.domain.model.entity.Medico;
import org.springframework.stereotype.Service;

@Service
public interface MedicoService extends GenericService<Medico, SaveMedicoDto, Integer>{
}
