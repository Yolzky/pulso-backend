package com.pe.pulso.domain.service;

import com.pe.pulso.domain.model.dto.save.SaveTipoDocumentoDto;
import com.pe.pulso.domain.model.entity.TipoDocumento;
import org.springframework.stereotype.Service;

@Service
public interface TipoDocumentoService extends GenericService<TipoDocumento, SaveTipoDocumentoDto, Integer>{
}
