package br.com.matheusleao.clinic_system.controller;

import br.com.matheusleao.clinic_system.model.PatientEntity;
import br.com.matheusleao.clinic_system.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping()
    public ResponseEntity<PatientEntity> create(@RequestBody PatientEntity patientEntity) {
        PatientEntity patient = patientService.save(patientEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(patient);
    }

    @GetMapping()
    public ResponseEntity<List<PatientEntity>> findAll(){
        List<PatientEntity> patients = patientService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(patients);
    }
}
