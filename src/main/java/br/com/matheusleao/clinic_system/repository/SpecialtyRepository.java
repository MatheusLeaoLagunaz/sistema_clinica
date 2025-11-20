package br.com.matheusleao.clinic_system.repository;

import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecialtyRepository extends JpaRepository<SpecialtyEntity, UUID> {
}
