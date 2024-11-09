package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveEstadoCirugiaDto;
import com.pe.pulso.domain.model.entity.EstadoCirugia;
import com.pe.pulso.domain.service.EstadoCirugiaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/estado-cirugia")
@CrossOrigin(origins = "*")
public class EstadoCirugiaController {
    private EstadoCirugiaService estadoCirugiaService;

    @PostMapping
    public EstadoCirugia create(@RequestBody SaveEstadoCirugiaDto request) {
        return estadoCirugiaService.create(request);
    }

    @GetMapping("/{estadoCirugiaId}")
    public EstadoCirugia findById(@PathVariable Integer estadoCirugiaId) {
        return estadoCirugiaService.findById(estadoCirugiaId);
    }

    @PutMapping
    public EstadoCirugia update(@RequestBody EstadoCirugia estadoCirugiaRequest) {
        return estadoCirugiaService.update(estadoCirugiaRequest);
    }

    @DeleteMapping("/{estadoCirugiaId}")
    public void delete(@PathVariable Integer estadoCirugiaId) {
        estadoCirugiaService.delete(estadoCirugiaId);
    }

    @GetMapping("/all")
    public List<EstadoCirugia> findAll() {
        return estadoCirugiaService.findAll();
    }

    @GetMapping("/findByCodigo/{codigo}")
    public EstadoCirugia findByCodigo(@PathVariable String codigo) {
        return estadoCirugiaService.findByCodigo(codigo);
    }
}
