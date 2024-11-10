package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveEspecialidadDto;
import com.pe.pulso.domain.model.entity.Especialidad;
import com.pe.pulso.domain.service.EspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/especialidad")
@CrossOrigin(origins = "*")
public class EspecialidadController {
    private EspecialidadService especialidadService;

    @PostMapping
    public Especialidad create(@RequestBody SaveEspecialidadDto request) {
        return especialidadService.create(request);
    }

    @GetMapping("/{especialidadId}")
    public Especialidad findById(@PathVariable Integer especialidadId) {
        return especialidadService.findById(especialidadId);
    }

    @PutMapping
    public Especialidad update(@RequestBody Especialidad dto) {
        return especialidadService.update(dto);
    }

    @DeleteMapping("/{especialidadId}")
    public void delete(@PathVariable Integer especialidadId) {
        especialidadService.delete(especialidadId);
    }

    @GetMapping("/all")
    public List<Especialidad> findAll() {
        return especialidadService.findAll();
    }
}
