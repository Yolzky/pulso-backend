package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveContactoEmergenciaDto;
import com.pe.pulso.domain.model.entity.ContactoEmergencia;
import com.pe.pulso.domain.service.ContactoEmergenciaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contacto-emergencia")
@CrossOrigin(origins = "*")
public class ContactoEmergenciaController {
    private ContactoEmergenciaService contactoEmergenciaService;

    @PostMapping
    public ContactoEmergencia create(@RequestBody SaveContactoEmergenciaDto request) {
        return contactoEmergenciaService.create(request);
    }

    @GetMapping("/{contactoEmergenciaId}")
    public ContactoEmergencia findById(@PathVariable Integer contactoEmergenciaId) {
        return contactoEmergenciaService.findById(contactoEmergenciaId);
    }

    @PutMapping
    public ContactoEmergencia update(@RequestBody ContactoEmergencia dto) {
        return contactoEmergenciaService.update(dto);
    }

    @DeleteMapping("/{contactoEmergenciaId}")
    public void delete(@PathVariable Integer contactoEmergenciaId) {
        contactoEmergenciaService.delete(contactoEmergenciaId);
    }

    @GetMapping("/all")
    public List<ContactoEmergencia> findAll() {
        return contactoEmergenciaService.findAll();
    }
}
