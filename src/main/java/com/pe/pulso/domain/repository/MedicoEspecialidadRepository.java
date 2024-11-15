package com.pe.pulso.domain.repository;

import com.pe.pulso.domain.model.entity.MedicoEspecialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MedicoEspecialidadRepository extends JpaRepository<MedicoEspecialidad, Integer> {
    @Query("SELECT me FROM MedicoEspecialidad me WHERE me.medico.idMedico = :medicoId")
    List<MedicoEspecialidad> findAllByMedicoId(@Param("medicoId") Integer medicoId);

    @Query("SELECT me FROM MedicoEspecialidad me WHERE me.especialidad.idEspecialidad = :especialidadId")
    List<MedicoEspecialidad> findAllByEspecialidadId(@Param("especialidadId") Integer especialidadId);
}
