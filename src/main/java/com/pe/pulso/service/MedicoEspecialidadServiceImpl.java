package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveMedicoEspecialidadDto;
import com.pe.pulso.domain.model.entity.Especialidad;
import com.pe.pulso.domain.model.entity.Medico;
import com.pe.pulso.domain.model.entity.MedicoEspecialidad;
import com.pe.pulso.domain.repository.MedicoEspecialidadRepository;
import com.pe.pulso.domain.service.EspecialidadService;
import com.pe.pulso.domain.service.MedicoEspecialidadService;
import com.pe.pulso.domain.service.MedicoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class MedicoEspecialidadServiceImpl implements MedicoEspecialidadService {
    private MedicoEspecialidadRepository medicoEspecialidadRepository;
    private MedicoService medicoService;
    private EspecialidadService especialidadService;

    @Override
    public MedicoEspecialidad create(SaveMedicoEspecialidadDto dto) {
        validateCreateMedicoEspecialidad(dto);
        MedicoEspecialidad medicoEspecialidad = buildMedicoEspecialidadEntity(dto);
        Medico medico = medicoService.findById(dto.getIdMedico());
        Especialidad especialidad = especialidadService.findById(dto.getIdEspecialidad());
        medicoEspecialidad.setMedico(medico);
        medicoEspecialidad.setEspecialidad(especialidad);
        return medicoEspecialidadRepository.save(medicoEspecialidad);
    }

    @Override
    public MedicoEspecialidad update(MedicoEspecialidad dto) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        medicoEspecialidadRepository.deleteById(id);
    }

    @Override
    public MedicoEspecialidad findById(Integer id) {
        return medicoEspecialidadRepository.findById(id).orElse(null);
    }

    @Override
    public List<MedicoEspecialidad> findAll() {
        return medicoEspecialidadRepository.findAll();
    }

    @Override
    public List<MedicoEspecialidad> findAllByMedicoId(Integer medicoId) {
        return medicoEspecialidadRepository.findAllByMedicoId(medicoId);
    }

    @Override
    public List<MedicoEspecialidad> findAllByEspecialidadId(Integer especialidadId) {
        return medicoEspecialidadRepository.findAllByEspecialidadId(especialidadId);
    }

    //Utils
    private MedicoEspecialidad buildMedicoEspecialidadEntity(SaveMedicoEspecialidadDto dto) {
        return MedicoEspecialidad.builder()
                .numeroCertificado(dto.getNumeroCertificado())
                .fechaEspecializacion(dto.getFechaEspecializacion())
                .nivelExperiencia(dto.getNivelExperiencia())
                .build();
    }

    private void validateCreateMedicoEspecialidad(SaveMedicoEspecialidadDto dto) {
        if (medicoService.findById(dto.getIdMedico()) == null) {
            throw new RuntimeException("El medico no existe");
        }
        if (especialidadService.findById(dto.getIdEspecialidad()) == null) {
            throw new RuntimeException("La especialidad no existe");
        }
    }
}
