package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.model.PatientEntity;
import br.com.matheusleao.clinic_system.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientEntity save(PatientEntity patientEntity) {
        return patientRepository.save(patientEntity);
    }

    public List<PatientEntity> findAll(){
        return patientRepository.findAll();
    }
}
