package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveContactoEmergenciaDto;
import com.pe.pulso.domain.model.entity.ContactoEmergencia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactoEmergenciaService extends GenericService<ContactoEmergencia, SaveContactoEmergenciaDto, Integer>{

}
