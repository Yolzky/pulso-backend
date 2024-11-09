package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveEstadoCirugiaDto;
import com.pe.pulso.domain.model.entity.EstadoCirugia;
import org.springframework.stereotype.Service;

@Service
public interface EstadoCirugiaService extends GenericService<EstadoCirugia, SaveEstadoCirugiaDto, Integer>{
    EstadoCirugia findByCodigo(String codigo);
}
