package br.com.matheusleao.clinic_system.controller;

import br.com.matheusleao.clinic_system.model.AppointmentEntity;
import br.com.matheusleao.clinic_system.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("consultation")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/teste")
    public ResponseEntity<AppointmentEntity> findId(@RequestParam UUID id) {
        AppointmentEntity appointmentEntity = appointmentService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(appointmentEntity);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentEntity>> findAll() {
        List<AppointmentEntity> consultationEntities = appointmentService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(consultationEntities);
    }

    @PostMapping()
    public ResponseEntity<AppointmentEntity> create(@RequestBody AppointmentEntity appointmentEntity) {
        AppointmentEntity appointmentCreated = appointmentService.createConsultation(appointmentEntity);
        return ResponseEntity.ok(appointmentCreated);
    }

    @DeleteMapping()
    public ResponseEntity<AppointmentEntity> delete(@RequestBody UUID id) {
        appointmentService.deleteConsultation(id);
        return ResponseEntity.ok().build();
    }

}
