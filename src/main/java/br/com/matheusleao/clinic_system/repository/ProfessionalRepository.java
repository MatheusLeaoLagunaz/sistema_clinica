package br.com.matheusleao.clinic_system.repository;

import br.com.matheusleao.clinic_system.model.ProfessionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface ProfessionalRepository extends JpaRepository<ProfessionalEntity, UUID> {
}
