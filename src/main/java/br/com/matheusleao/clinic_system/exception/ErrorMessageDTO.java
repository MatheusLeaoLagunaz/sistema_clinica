package br.com.matheusleao.clinic_system.exception;

public record ErrorMessageDTO(
        String message,
        String field) {
}
