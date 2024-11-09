package com.pe.pulso.service;

import com.pe.pulso.domain.model.dto.save.SaveRolDto;
import com.pe.pulso.domain.model.entity.Rol;
import com.pe.pulso.domain.repository.RolRepository;
import com.pe.pulso.domain.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol create(SaveRolDto dto) {
        Rol rol = buildRolEntity(dto);
        return rolRepository.save(rol);
    }

    @Override
    public Rol update(Rol dto) {
        return rolRepository.save(dto);
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    //Utils
    private Rol buildRolEntity(SaveRolDto dto) {
        return Rol.builder()
                .nombre(dto.getNombre())
                .codigo(dto.getCodigo())
                .estado(dto.getEstado())
                .build();
    }
}
