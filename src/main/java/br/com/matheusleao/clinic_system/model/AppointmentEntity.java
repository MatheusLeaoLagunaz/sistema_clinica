package br.com.matheusleao.clinic_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class AppointmentEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "professional_id", insertable = false, updatable = false)
    private ProfessionalEntity professional;

    @ManyToOne()
    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    private PatientEntity patient;

    @NotNull
    private LocalDateTime appointmentDate;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
