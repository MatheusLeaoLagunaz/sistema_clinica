package br.com.matheusleao.clinic_system.dto;

import java.util.UUID;

public record ProfessionalRequestDTO(
        String name,
        String password,
        String email,
        String cpf,
        String crm,
        String telefone,
        UUID specialtyId
) {}
