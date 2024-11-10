package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveCirugiaDto;
import com.pe.pulso.domain.model.entity.Cirugia;
import com.pe.pulso.domain.model.entity.EstadoCirugia;
import com.pe.pulso.domain.model.enums.CodigoEstadoCirugia;
import com.pe.pulso.domain.repository.CirugiaRepository;
import com.pe.pulso.domain.service.CirugiaService;
import com.pe.pulso.domain.service.EstadoCirugiaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CirugiaServiceImpl implements CirugiaService {

    private CirugiaRepository cirugiaRepository;

    private EstadoCirugiaService estadoCirugiaService;

    @Override
    public Cirugia create(SaveCirugiaDto saveDto) {
        Cirugia cirugia = buildCirugiaEntity(saveDto);
        EstadoCirugia estadoCirugia = estadoCirugiaService.findByCodigo(CodigoEstadoCirugia.PENDIENTE.getCodigo());
        cirugia.setEstadoCirugia(estadoCirugia);
        return cirugiaRepository.save(cirugia);
    }

    @Override
    public Cirugia update(Cirugia dto) {
        return cirugiaRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        cirugiaRepository.deleteById(id);
    }

    @Override
    public Cirugia findById(Integer id) {
        return cirugiaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cirugia> findAll() {
        return cirugiaRepository.findAll();
    }

    //Utils
    private Cirugia buildCirugiaEntity(SaveCirugiaDto dto) {
        return Cirugia.builder()
                .codigo(dto.getCodigo())
                .fecha(dto.getFecha())
                .habitacion(dto.getHabitacion())
                .idMedico(dto.getIdMedico())
                .idPaciente(dto.getIdPaciente())
                .build();
    }
}
