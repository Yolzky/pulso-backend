package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SavePersonaDto;
import com.pe.pulso.domain.model.entity.Persona;
import com.pe.pulso.domain.repository.PersonaRepository;
import com.pe.pulso.domain.service.PersonaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona create(SavePersonaDto request) {
        Persona persona = buildPersonaEntity(request);
        return personaRepository.save(persona);
    }

    @Override
    public Persona update(Persona request) {
        return personaRepository.save(request);
    }

    @Override
    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findById(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    //Utils
    private Persona buildPersonaEntity(SavePersonaDto dto) {
        return Persona.builder()
                .nombres(dto.getNombres())
                .apellido1(dto.getApellido1())
                .apellido2(dto.getApellido2())
                .direccion(dto.getDireccion())
                .numeroTelefono(dto.getNumeroTelefono())
                .sexo(dto.getSexo())
                .fechaNacimiento(dto.getFechaNacimiento())
                .fechaRegistro(LocalDate.now().toString())
                .idTipoDocumento(dto.getIdTipoDocumento())
                .nroDocumento(dto.getNroDocumento())
                .correo(dto.getCorreo())
                .build();
    }
}
