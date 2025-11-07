package br.com.matheusleao.sistema_clinica.model;

import jakarta.persistence.*;
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

//    @Column(nae = "professional_id")
//    private UUID professionalId;

    @ManyToOne()
    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    private PatientEntity patient;

    private LocalDateTime dataConsulta;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
