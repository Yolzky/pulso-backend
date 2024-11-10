package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveCirugiaDto;
import com.pe.pulso.domain.model.entity.Cirugia;
import org.springframework.stereotype.Service;

@Service
public interface CirugiaService extends GenericService<Cirugia, SaveCirugiaDto,Integer>{
}
