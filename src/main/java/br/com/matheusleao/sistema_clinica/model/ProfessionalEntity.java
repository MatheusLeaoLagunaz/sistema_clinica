package br.com.matheusleao.sistema_clinica.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class ProfessionalEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String nome;
    private String cpf;
    private String especialidade;
    private String registroProfissional;

    @OneToMany(mappedBy = "professional")
    private List<ConsultationEntity> consultations;
}
