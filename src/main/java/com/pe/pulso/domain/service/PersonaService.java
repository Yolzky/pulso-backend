package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SavePersonaDto;
import com.pe.pulso.domain.model.entity.Persona;
import org.springframework.stereotype.Service;

@Service
public interface PersonaService extends GenericService<Persona, SavePersonaDto, Integer>{
}
