package br.com.matheusleao.sistema_clinica.service;

import br.com.matheusleao.sistema_clinica.model.ConsultationEntity;
import br.com.matheusleao.sistema_clinica.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    public ConsultationEntity findById(UUID id) {
        return consultationRepository.findById(id).orElse(null);
    }

    public List<ConsultationEntity> findAll() {
        return consultationRepository.findAll();
    }

    public ConsultationEntity createConsultation(ConsultationEntity consultationEntity) {
        return consultationRepository.save(consultationEntity);
    }

    public void deleteConsultation(UUID id){
        consultationRepository.deleteById(id);
    }


}
