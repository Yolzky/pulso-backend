package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveHistorialDto;
import com.pe.pulso.domain.model.entity.Historial;
import com.pe.pulso.domain.repository.HistorialRepository;
import com.pe.pulso.domain.service.HistorialService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HistorialServiceImpl implements HistorialService {

    private HistorialRepository historialRepository;

    @Override
    public Historial create(SaveHistorialDto dto) {
        Historial historial = buildHistorialEntity(dto);
        return historialRepository.save(historial);
    }

    @Override
    public Historial update(Historial dto) {
        return historialRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        historialRepository.deleteById(id);
    }

    @Override
    public Historial findById(Integer id) {
        return historialRepository.findById(id).orElse(null);
    }

    @Override
    public List<Historial> findAll() {
        return historialRepository.findAll();
    }

    //Utils
    private Historial buildHistorialEntity(SaveHistorialDto dto) {
        return Historial.builder()
                .idPaciente(dto.getIdPaciente())
                .idMedicoRegistro(dto.getIdMedicoRegistro())
                .antecedentesMedicos(dto.getAntecedentesMedicos())
                .indicacionesUrgentes(dto.getIndicacionesUrgentes())
                .build();
    }
}
