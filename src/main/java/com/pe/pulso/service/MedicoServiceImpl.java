package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveMedicoDto;
import com.pe.pulso.domain.model.entity.Medico;
import com.pe.pulso.domain.model.entity.Persona;
import com.pe.pulso.domain.repository.MedicoRepository;
import com.pe.pulso.domain.service.MedicoService;
import com.pe.pulso.domain.service.PersonaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class MedicoServiceImpl implements MedicoService {
    private MedicoRepository medicoRepository;
    private PersonaService personaService;

    @Override
    public Medico create(SaveMedicoDto dto) {
        Persona persona = personaService.create(dto.getSavePersonaDto());
        Medico medico = buildMedicoEntity(dto, persona);
        return medicoRepository.save(medico);
    }

    @Override
    public Medico update(Medico dto) {
        return medicoRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        medicoRepository.deleteById(id);
    }

    @Override
    public Medico findById(Integer id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    //Utils
    private Medico buildMedicoEntity(SaveMedicoDto dto, Persona persona) {
        return Medico.builder()
                .persona(persona)
                .numeroColegiatura(dto.getNumeroColegiatura())
                .horaInicio(dto.getHoraInicio())
                .horaFin(dto.getHoraFin())
                .build();
    }
}
