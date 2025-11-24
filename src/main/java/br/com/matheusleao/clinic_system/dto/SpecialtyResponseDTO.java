package br.com.matheusleao.clinic_system.dto;

import java.util.List;
import java.util.UUID;

public record SpecialtyResponseDTO(
        UUID id,
        String name,
        List<ProfessionalResponseDTO> professionals) {
}
