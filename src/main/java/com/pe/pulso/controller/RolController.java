package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveRolDto;
import com.pe.pulso.domain.model.entity.Rol;
import com.pe.pulso.domain.service.RolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rol")
@CrossOrigin(origins = "*")
public class RolController {
    private RolService rolService;

    @PostMapping
    public Rol create(@RequestBody SaveRolDto request) {
        return rolService.create(request);
    }

    @GetMapping("/{rolId}")
    public Rol findById(@PathVariable Integer rolId) {
        return rolService.findById(rolId);
    }

    @PutMapping
    public Rol update(@RequestBody Rol rolRequest) {
        return rolService.update(rolRequest);
    }

    @DeleteMapping("/{rolId}")
    public void delete(@PathVariable Integer rolId) {
        rolService.delete(rolId);
    }

    @GetMapping("/all")
    public List<Rol> findAll() {
        return rolService.findAll();
    }

    @GetMapping("/findByCodigo/{codigo}")
    public Rol findRolByCodigo(@PathVariable String codigo) {
        return rolService.findRolByCodigo(codigo);
    }

}
