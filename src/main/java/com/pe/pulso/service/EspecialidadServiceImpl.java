package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveEspecialidadDto;
import com.pe.pulso.domain.model.entity.Especialidad;
import com.pe.pulso.domain.repository.EspecialidadRepository;
import com.pe.pulso.domain.service.EspecialidadService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EspecialidadServiceImpl implements EspecialidadService {
    private EspecialidadRepository especialidadRepository;

    @Override
    public Especialidad create(SaveEspecialidadDto dto) {
        Especialidad especialidad = buildEspecialidadEntity(dto);
        return especialidadRepository.save(especialidad);
    }

    @Override
    public Especialidad update(Especialidad dto) {
        return especialidadRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        especialidadRepository.deleteById(id);
    }

    @Override
    public Especialidad findById(Integer id) {
        return especialidadRepository.findById(id).orElse(null);
    }

    @Override
    public List<Especialidad> findAll() {
        return especialidadRepository.findAll();
    }

    //Utils
    private Especialidad buildEspecialidadEntity(SaveEspecialidadDto dto) {
        return Especialidad.builder()
                .nombre(dto.getNombre())
                .build();
    }
}
