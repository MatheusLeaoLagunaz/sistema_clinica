package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import br.com.matheusleao.clinic_system.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public SpecialtyEntity create(SpecialtyEntity specialtyEntity){
        return specialtyRepository.save(specialtyEntity);
    }
}
