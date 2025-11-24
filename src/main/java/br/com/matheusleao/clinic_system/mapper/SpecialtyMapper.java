package br.com.matheusleao.clinic_system.mapper;

import br.com.matheusleao.clinic_system.dto.SpecialtyRequestDTO;
import br.com.matheusleao.clinic_system.dto.SpecialtyResponseDTO;
import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpecialtyMapper {


    SpecialtyResponseDTO toResponse(SpecialtyEntity specialty);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "professionals", ignore = true)
    SpecialtyEntity toEntity(SpecialtyRequestDTO specialty);


    List<SpecialtyResponseDTO> toResponseList(List<SpecialtyEntity> specialties);

}
