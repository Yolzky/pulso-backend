package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveCirugiaDto;
import com.pe.pulso.domain.model.entity.Cirugia;
import com.pe.pulso.domain.service.CirugiaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cirugia")
@CrossOrigin(origins = "*")
public class CirugiaController {
    private CirugiaService cirugiaService;

    @PostMapping
    public Cirugia create(@RequestBody SaveCirugiaDto request) {
        return cirugiaService.create(request);
    }

    @GetMapping("/{cirugiaId}")
    public Cirugia findById(@PathVariable Integer cirugiaId) {
        return cirugiaService.findById(cirugiaId);
    }

    @PutMapping
    public Cirugia update(@RequestBody Cirugia dto) {
        return cirugiaService.update(dto);
    }

    @DeleteMapping("/{cirugiaId}")
    public void delete(@PathVariable Integer cirugiaId) {
        cirugiaService.delete(cirugiaId);
    }

    @GetMapping("/all")
    public List<Cirugia> findAll() {
        return cirugiaService.findAll();
    }
}
