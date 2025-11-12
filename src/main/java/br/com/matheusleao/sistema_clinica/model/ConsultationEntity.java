package br.com.matheusleao.sistema_clinica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ConsultationEntity {

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
    private LocalDateTime dataConsulta;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
