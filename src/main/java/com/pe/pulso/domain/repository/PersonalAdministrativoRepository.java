package com.pe.pulso.domain.repository;

import com.pe.pulso.domain.model.entity.PersonalAdministrativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalAdministrativoRepository extends JpaRepository<PersonalAdministrativo, Integer> {
}
