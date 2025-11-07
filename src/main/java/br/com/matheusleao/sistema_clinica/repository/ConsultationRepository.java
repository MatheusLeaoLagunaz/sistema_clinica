package br.com.matheusleao.sistema_clinica.repository;

import br.com.matheusleao.sistema_clinica.model.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsultationRepository extends JpaRepository<ConsultationEntity, UUID> {
}
