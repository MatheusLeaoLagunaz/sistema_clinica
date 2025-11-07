package br.com.matheusleao.sistema_clinica.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class PatientEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String nome;
    private String cpf;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "patient")
    private List<ConsultationEntity> consultations;

}
