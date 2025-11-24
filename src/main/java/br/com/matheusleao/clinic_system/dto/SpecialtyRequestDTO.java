package br.com.matheusleao.clinic_system.dto;

import java.util.UUID;

public record SpecialtyRequestDTO(
        UUID id,
        String name) {
}
