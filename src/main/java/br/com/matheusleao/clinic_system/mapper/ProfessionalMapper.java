package br.com.matheusleao.clinic_system.mapper;

import br.com.matheusleao.clinic_system.dto.ProfessionalRequestDTO;
import br.com.matheusleao.clinic_system.dto.ProfessionalResponseDTO;
import br.com.matheusleao.clinic_system.model.ProfessionalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfessionalMapper {

    @Mapping(source = "specialty.id", target = "specialtyId")
    @Mapping(source = "specialty.name", target = "specialtyName")
    ProfessionalResponseDTO toResponse(ProfessionalEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "consultations", ignore = true)
    @Mapping(target = "specialty", ignore = true)
    ProfessionalEntity toEntity(ProfessionalRequestDTO dto);
}
