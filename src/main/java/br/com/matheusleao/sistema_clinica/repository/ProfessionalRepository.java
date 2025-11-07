package br.com.matheusleao.sistema_clinica.repository;

import br.com.matheusleao.sistema_clinica.model.ProfessionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface ProfessionalRepository extends JpaRepository<ProfessionalEntity, UUID> {
}
