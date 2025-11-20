package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.model.ProfessionalEntity;
import br.com.matheusleao.clinic_system.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository professionalRepository;

    public ProfessionalEntity save(ProfessionalEntity professionalEntity) {
        return professionalRepository.save(professionalEntity);
    }

    public List<ProfessionalEntity> findAll() {
        return professionalRepository.findAll();
    }
}
