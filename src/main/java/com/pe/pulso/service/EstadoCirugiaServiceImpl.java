package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveEstadoCirugiaDto;
import com.pe.pulso.domain.model.entity.EstadoCirugia;
import com.pe.pulso.domain.repository.EstadoCirugiaRepository;
import com.pe.pulso.domain.service.EstadoCirugiaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EstadoCirugiaServiceImpl implements EstadoCirugiaService {

    @Autowired
    private EstadoCirugiaRepository estadoCirugiaRepository;

    @Override
    public EstadoCirugia create(SaveEstadoCirugiaDto dto) {
        EstadoCirugia estadoCirugia = buildEstadoCirugiaEntity(dto);
        return estadoCirugiaRepository.save(estadoCirugia);
    }

    @Override
    public EstadoCirugia update(EstadoCirugia dto) {
        return estadoCirugiaRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        estadoCirugiaRepository.deleteById(id);
    }

    @Override
    public EstadoCirugia findById(Integer id) {
        return estadoCirugiaRepository.findById(id).orElse(null);
    }

    @Override
    public List<EstadoCirugia> findAll() {
        return estadoCirugiaRepository.findAll();
    }

    //Utils
    private EstadoCirugia buildEstadoCirugiaEntity(SaveEstadoCirugiaDto dto) {
        return EstadoCirugia.builder()
                .codigo(dto.getCodigo())
                .nombre(dto.getNombre())
                .estado(dto.getEstado())
                .build();
    }

    @Override
    public EstadoCirugia findByCodigo(String codigo) {
        return estadoCirugiaRepository.findByCodigo(codigo);
    }
}
