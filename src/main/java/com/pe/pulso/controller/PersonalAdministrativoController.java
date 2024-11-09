package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SavePersonalAdministrativoDto;
import com.pe.pulso.domain.model.entity.PersonalAdministrativo;
import com.pe.pulso.domain.service.PersonalAdministrativoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/personal-administrativo")
@CrossOrigin(origins = "*")
public class PersonalAdministrativoController {
    private PersonalAdministrativoService personalAdministrativoService;

    @PostMapping
    public PersonalAdministrativo create(@RequestBody SavePersonalAdministrativoDto request) {
        return personalAdministrativoService.create(request);
    }

    @GetMapping("/{personalAdministrativoId}")
    public PersonalAdministrativo findById(@PathVariable Integer personalAdministrativoId) {
        return personalAdministrativoService.findById(personalAdministrativoId);
    }

    @PutMapping
    public PersonalAdministrativo update(@RequestBody PersonalAdministrativo personalAdministrativoRequest) {
        return personalAdministrativoService.update(personalAdministrativoRequest);
    }

    @DeleteMapping("/{personalAdministrativoId}")
    public void delete(@PathVariable Integer personalAdministrativoId) {
        personalAdministrativoService.delete(personalAdministrativoId);
    }

    @GetMapping("/all")
    public List<PersonalAdministrativo> findAll() {
        return personalAdministrativoService.findAll();
    }
}
