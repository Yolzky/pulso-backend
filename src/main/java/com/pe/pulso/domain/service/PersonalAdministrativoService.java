package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SavePersonalAdministrativoDto;
import com.pe.pulso.domain.model.entity.PersonalAdministrativo;
import org.springframework.stereotype.Service;

@Service
public interface PersonalAdministrativoService extends GenericService<PersonalAdministrativo, SavePersonalAdministrativoDto, Integer>{
}
