package com.pe.pulso.domain.repository;

import com.pe.pulso.domain.model.entity.EstadoCirugia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCirugiaRepository extends JpaRepository<EstadoCirugia, Integer>{
    EstadoCirugia findByCodigo(String codigo);
}
