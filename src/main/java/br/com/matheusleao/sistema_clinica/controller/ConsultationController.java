package br.com.matheusleao.sistema_clinica.controller;

import br.com.matheusleao.sistema_clinica.model.ConsultationEntity;
import br.com.matheusleao.sistema_clinica.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @GetMapping()
    public ResponseEntity<ConsultationEntity> findId(@RequestParam UUID id) {
        ConsultationEntity consultationEntity = consultationService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(consultationEntity);
    }

    @GetMapping
    public ResponseEntity<List<ConsultationEntity>> findAll() {
        List<ConsultationEntity> consultationEntities = consultationService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(consultationEntities);
    }

    @PostMapping()
    public ResponseEntity<ConsultationEntity> create(@RequestBody ConsultationEntity consultationEntity) {
        ConsultationEntity consultationCreated = consultationService.createConsultation(consultationEntity);
        return ResponseEntity.ok(consultationCreated);
    }

    @DeleteMapping()
    public ResponseEntity<ConsultationEntity> delete(@RequestBody UUID id) {
        consultationService.deleteConsultation(id);
        return ResponseEntity.ok().build();
    }

}
