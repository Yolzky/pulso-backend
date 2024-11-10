package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SavePacienteDto;
import com.pe.pulso.domain.model.entity.Paciente;
import com.pe.pulso.domain.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paciente")
@CrossOrigin(origins = "*")
public class PacienteController {
    private PacienteService pacienteService;

    @PostMapping
    public Paciente create(@RequestBody SavePacienteDto request) {
        return pacienteService.create(request);
    }

    @GetMapping("/{pacienteId}")
    public Paciente findById(@PathVariable Integer pacienteId) {
        return pacienteService.findById(pacienteId);
    }

    @PutMapping
    public Paciente update(@RequestBody Paciente dto) {
        return pacienteService.update(dto);
    }

    @DeleteMapping("/{pacienteId}")
    public void delete(@PathVariable Integer pacienteId) {
        pacienteService.delete(pacienteId);
    }

    @GetMapping("/all")
    public List<Paciente> findAll() {
        return pacienteService.findAll();
    }
}
