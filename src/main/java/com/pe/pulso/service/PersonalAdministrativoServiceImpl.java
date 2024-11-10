package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SavePersonalAdministrativoDto;
import com.pe.pulso.domain.model.entity.Persona;
import com.pe.pulso.domain.model.entity.PersonalAdministrativo;
import com.pe.pulso.domain.repository.PersonalAdministrativoRepository;
import com.pe.pulso.domain.service.PersonaService;
import com.pe.pulso.domain.service.PersonalAdministrativoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PersonalAdministrativoServiceImpl implements PersonalAdministrativoService {

    @Autowired
    private PersonalAdministrativoRepository personalAdministrativoRepository;
    @Autowired
    private PersonaService personaService;

    @Override
    public PersonalAdministrativo create(SavePersonalAdministrativoDto dto) {
        Persona persona = personaService.create(dto.getSavePersonaDto());
        PersonalAdministrativo personalAdministrativo = buildPersonalAdministrativoEntity(dto, persona);
        return personalAdministrativoRepository.save(personalAdministrativo);
    }

    @Override
    public PersonalAdministrativo update(PersonalAdministrativo dto) {
        return personalAdministrativoRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        personalAdministrativoRepository.deleteById(id);
    }

    @Override
    public PersonalAdministrativo findById(Integer id) {
        return personalAdministrativoRepository.findById(id).orElse(null);
    }

    @Override
    public List<PersonalAdministrativo> findAll() {
        return personalAdministrativoRepository.findAll();
    }

    //Utils
    private PersonalAdministrativo buildPersonalAdministrativoEntity(SavePersonalAdministrativoDto dto, Persona persona) {
        return PersonalAdministrativo.builder()
                .persona(persona)
                .horaInicio(dto.getHoraInicio())
                .horaFin(dto.getHoraFin())
                .idRol(dto.getIdRol())
                .password(dto.getPassword())
                .build();
    }
}
