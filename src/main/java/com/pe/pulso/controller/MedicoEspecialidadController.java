package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveMedicoEspecialidadDto;
import com.pe.pulso.domain.model.entity.MedicoEspecialidad;
import com.pe.pulso.domain.service.MedicoEspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/medico-especialidad")
@CrossOrigin(origins = "*")
public class MedicoEspecialidadController {
    private MedicoEspecialidadService medicoEspecialidadService;

    @PostMapping
    public MedicoEspecialidad create(@RequestBody SaveMedicoEspecialidadDto request) {
        return medicoEspecialidadService.create(request);
    }

    @GetMapping("/{medicoEspecialidadId}")
    public MedicoEspecialidad findById(@PathVariable Integer medicoEspecialidadId) {
        return medicoEspecialidadService.findById(medicoEspecialidadId);
    }

    @PutMapping
    public MedicoEspecialidad update(@RequestBody MedicoEspecialidad dto) {
        return medicoEspecialidadService.update(dto);
    }

    @DeleteMapping("/{medicoEspecialidadId}")
    public void delete(@PathVariable Integer medicoEspecialidadId) {
        medicoEspecialidadService.delete(medicoEspecialidadId);
    }

    @GetMapping("/all")
    public List<MedicoEspecialidad> findAll() {
        return medicoEspecialidadService.findAll();
    }

    @GetMapping("/findByMedicoId/{medicoId}")
    public List<MedicoEspecialidad> findByMedicoId(@PathVariable Integer medicoId) {
        return medicoEspecialidadService.findAllByMedicoId(medicoId);
    }

    @GetMapping("/findByEspecialidadId/{especialidadId}")
    public List<MedicoEspecialidad> findByEspecialidadId(@PathVariable Integer especialidadId) {
        return medicoEspecialidadService.findAllByEspecialidadId(especialidadId);
    }
}
