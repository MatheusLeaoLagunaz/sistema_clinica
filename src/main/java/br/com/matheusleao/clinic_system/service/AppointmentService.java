package br.com.matheusleao.clinic_system.service;

import br.com.matheusleao.clinic_system.model.AppointmentEntity;
import br.com.matheusleao.clinic_system.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public AppointmentEntity findById(UUID id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public List<AppointmentEntity> findAll() {
        return appointmentRepository.findAll();
    }

    public AppointmentEntity createConsultation(AppointmentEntity appointmentEntity) {
        return appointmentRepository.save(appointmentEntity);
    }

    public void deleteConsultation(UUID id){
        appointmentRepository.deleteById(id);
    }


}
