package com.pe.pulso.domain.repository;

import com.pe.pulso.domain.model.entity.Cirugia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirugiaRepository extends JpaRepository<Cirugia, Integer>{
}
