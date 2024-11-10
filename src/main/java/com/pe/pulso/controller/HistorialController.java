package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveHistorialDto;
import com.pe.pulso.domain.model.entity.Historial;
import com.pe.pulso.domain.service.HistorialService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/historial")
@CrossOrigin(origins = "*")
public class HistorialController {
    private HistorialService historialService;

    @PostMapping
    public Historial create(@RequestBody SaveHistorialDto request) {
        return historialService.create(request);
    }

    @GetMapping("/{historialId}")
    public Historial findById(@PathVariable Integer historialId) {
        return historialService.findById(historialId);
    }

    @PutMapping
    public Historial update(@RequestBody Historial dto) {
        return historialService.update(dto);
    }

    @DeleteMapping("/{historialId}")
    public void delete(@PathVariable Integer historialId) {
        historialService.delete(historialId);
    }

    @GetMapping("/all")
    public List<Historial> findAll() {
        return historialService.findAll();
    }
}
