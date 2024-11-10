package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveTipoDocumentoDto;
import com.pe.pulso.domain.model.entity.TipoDocumento;
import com.pe.pulso.domain.repository.TipoDocumentoRepository;
import com.pe.pulso.domain.service.TipoDocumentoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public TipoDocumento create(SaveTipoDocumentoDto dto) {
        TipoDocumento tipoDocumento = buildTipoDocumentoEntity(dto);
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    @Override
    public TipoDocumento update(TipoDocumento dto) {
        return tipoDocumentoRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        tipoDocumentoRepository.deleteById(id);
    }

    @Override
    public TipoDocumento findById(Integer id) {
        return tipoDocumentoRepository.findById(id).orElse(null);
    }

    @Override
    public List<TipoDocumento> findAll() {
        return tipoDocumentoRepository.findAll();
    }

    //Utils
    private TipoDocumento buildTipoDocumentoEntity(SaveTipoDocumentoDto dto) {
        return TipoDocumento.builder()
                .nombre(dto.getNombre())
                .codigo(dto.getCodigo())
                .descripcion(dto.getDescripcion())
                .longitudMaxima(dto.getLongitudMaxima())
                .longitudMinima(dto.getLongitudMinima())
                .build();
    }
}
