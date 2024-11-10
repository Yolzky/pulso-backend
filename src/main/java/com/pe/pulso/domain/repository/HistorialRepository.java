package com.pe.pulso.domain.repository;

import com.pe.pulso.domain.model.entity.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Integer> {
}
