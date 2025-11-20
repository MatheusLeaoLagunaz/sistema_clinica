package br.com.matheusleao.clinic_system.repository;

import br.com.matheusleao.clinic_system.model.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, UUID> {
}
