package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveRolDto;
import com.pe.pulso.domain.model.entity.Rol;
import org.springframework.stereotype.Service;

@Service
public interface RolService extends GenericService<Rol, SaveRolDto, Integer>{
}
