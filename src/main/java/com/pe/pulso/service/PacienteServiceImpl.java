package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SavePacienteDto;
import com.pe.pulso.domain.model.entity.Paciente;
import com.pe.pulso.domain.model.entity.Persona;
import com.pe.pulso.domain.repository.PacienteRepository;
import com.pe.pulso.domain.service.ContactoEmergenciaService;
import com.pe.pulso.domain.service.HistorialService;
import com.pe.pulso.domain.service.PacienteService;
import com.pe.pulso.domain.service.PersonaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PacienteServiceImpl implements PacienteService {
    private PacienteRepository pacienteRepository;
    private PersonaService personaService;

    @Override
    public Paciente create(SavePacienteDto dto) {
        Paciente paciente = buildPacienteEntity(dto);
        Persona persona = personaService.create(dto.getSavePersonaDto());
        paciente.setPersona(persona);
        buildHistorial(dto, paciente);
        buildContactoEmergencia(dto, paciente);
        return pacienteRepository.save(paciente);
    }

    private static void buildContactoEmergencia(SavePacienteDto dto, Paciente paciente) {
        if (dto.getIdContactoEmergencia()!=null){
            paciente.setIdContactoEmergencia(dto.getIdContactoEmergencia());
        }
    }

    private static void buildHistorial(SavePacienteDto dto, Paciente paciente) {
        if (dto.getIdHistorial()!=null) {
            paciente.setIdHistorial(dto.getIdHistorial());
        }
    }

    @Override
    public Paciente update(Paciente dto) {
        return pacienteRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Paciente findById(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    //Utils
    private Paciente buildPacienteEntity(SavePacienteDto dto) {
        return Paciente.builder()
                .persona(personaService.create(dto.getSavePersonaDto()))
                .alergias(dto.getAlergias())
                .enfermedades(dto.getEnfermedades())
                .build();
    }
}
