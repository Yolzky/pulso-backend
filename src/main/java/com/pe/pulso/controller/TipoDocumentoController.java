package com.pe.pulso.controller;

import com.pe.pulso.domain.model.dto.save.SaveTipoDocumentoDto;
import com.pe.pulso.domain.model.entity.TipoDocumento;
import com.pe.pulso.domain.service.TipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tipo-documento")
@CrossOrigin(origins = "*")
public class TipoDocumentoController {
    private TipoDocumentoService tipoDocumentoService;

    @PostMapping
    public TipoDocumento create(@RequestBody SaveTipoDocumentoDto request) {
        return tipoDocumentoService.create(request);
    }

    @GetMapping("/{tipoDocumentoId}")
    public TipoDocumento findById(@PathVariable Integer tipoDocumentoId) {
        return tipoDocumentoService.findById(tipoDocumentoId);
    }

    @PutMapping
    public TipoDocumento update(@RequestBody TipoDocumento tipoDocumentoRequest) {
        return tipoDocumentoService.update(tipoDocumentoRequest);
    }

    @DeleteMapping("/{tipoDocumentoId}")
    public void delete(@PathVariable Integer tipoDocumentoId) {
        tipoDocumentoService.delete(tipoDocumentoId);
    }

    @GetMapping("/all")
    public List<TipoDocumento> findAll() {
        return tipoDocumentoService.findAll();
    }
}
