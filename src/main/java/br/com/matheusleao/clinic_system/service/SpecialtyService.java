package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.dto.SpecialtyRequestDTO;
import br.com.matheusleao.clinic_system.dto.SpecialtyResponseDTO;
import br.com.matheusleao.clinic_system.mapper.SpecialtyMapper;
import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import br.com.matheusleao.clinic_system.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Autowired
    private SpecialtyMapper specialtyMapper;

    public SpecialtyResponseDTO create(SpecialtyRequestDTO specialtyRequestDTO){
        var entity = specialtyMapper.toEntity(specialtyRequestDTO);
        specialtyRepository.save(entity);
        return specialtyMapper.toResponse(entity);
    }

    public List<SpecialtyResponseDTO> findAll(){
        var listEntities = specialtyRepository.findAll();
        return specialtyMapper.toResponseList(listEntities);
    }
}
