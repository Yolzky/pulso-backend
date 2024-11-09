package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveContactoEmergenciaDto;
import com.pe.pulso.domain.model.entity.ContactoEmergencia;
import com.pe.pulso.domain.repository.ContactoEmergenciaRepository;
import com.pe.pulso.domain.service.ContactoEmergenciaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ContactoEmergenciaServiceImpl implements ContactoEmergenciaService {

    ContactoEmergenciaRepository contactoEmergenciaRepository;

    @Override
    public ContactoEmergencia create(SaveContactoEmergenciaDto saveDto) {
        ContactoEmergencia contactoEmergencia = buildContactoEmergenciaEntity(saveDto);
        return contactoEmergenciaRepository.save(contactoEmergencia);
    }

    @Override
    public ContactoEmergencia update(ContactoEmergencia contactoEmergenciaRequest) {
        return contactoEmergenciaRepository.save(contactoEmergenciaRequest);
    }

    @Override
    public void delete(Integer id) {
        contactoEmergenciaRepository.deleteById(id);
    }

    @Override
    public ContactoEmergencia findById(Integer id) {
        return contactoEmergenciaRepository.findById(id).orElse(null);
    }

    @Override
    public List<ContactoEmergencia> findAll() {
        return contactoEmergenciaRepository.findAll();
    }

    //Utils
    private ContactoEmergencia buildContactoEmergenciaEntity(SaveContactoEmergenciaDto dto) {
        return ContactoEmergencia.builder()
                .nombre(dto.getNombre())
                .direccion(dto.getDireccion())
                .telefono(dto.getTelefono())
                .build();
    }
}
