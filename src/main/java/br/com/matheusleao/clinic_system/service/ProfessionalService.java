package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.dto.ProfessionalRequestDTO;
import br.com.matheusleao.clinic_system.dto.ProfessionalResponseDTO;
import br.com.matheusleao.clinic_system.mapper.ProfessionalMapper;
import br.com.matheusleao.clinic_system.model.ProfessionalEntity;
import br.com.matheusleao.clinic_system.repository.ProfessionalRepository;
import br.com.matheusleao.clinic_system.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository professionalRepository;

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Autowired
    private ProfessionalMapper professionalMapper;

    public ProfessionalResponseDTO save(ProfessionalRequestDTO dto) {

        var specialty = specialtyRepository.findById(dto.specialtyId())
                .orElseThrow(() -> new RuntimeException("Specialty not found"));

        var entity = professionalMapper.toEntity(dto);

        entity.setSpecialty(specialty);

        var savedEntity = professionalRepository.save(entity);

        return professionalMapper.toResponse(savedEntity);
    }

    public List<ProfessionalEntity> findAll() {
        return professionalRepository.findAll();
    }
}
