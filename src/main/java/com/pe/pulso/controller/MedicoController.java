package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveMedicoDto;
import com.pe.pulso.domain.model.entity.Medico;
import com.pe.pulso.domain.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/medico")
@CrossOrigin(origins = "*")
public class MedicoController {
    private MedicoService medicoService;

    @PostMapping
    public Medico create(@RequestBody SaveMedicoDto request) {
        return medicoService.create(request);
    }

    @GetMapping("/{medicoId}")
    public Medico findById(@PathVariable Integer medicoId) {
        return medicoService.findById(medicoId);
    }

    @PutMapping
    public Medico update(@RequestBody Medico dto) {
        return medicoService.update(dto);
    }

    @DeleteMapping("/{medicoId}")
    public void delete(@PathVariable Integer medicoId) {
        medicoService.delete(medicoId);
    }

    @GetMapping("/all")
    public List<Medico> findAll() {
        return medicoService.findAll();
    }
}
