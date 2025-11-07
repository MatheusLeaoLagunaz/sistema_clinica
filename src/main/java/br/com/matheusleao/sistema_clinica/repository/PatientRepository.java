package br.com.matheusleao.sistema_clinica.repository;

import br.com.matheusleao.sistema_clinica.model.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<PatientEntity, UUID> {
}
