package br.com.matheusleao.clinic_system.repository;

import br.com.matheusleao.clinic_system.model.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<PatientEntity, UUID> {
}
