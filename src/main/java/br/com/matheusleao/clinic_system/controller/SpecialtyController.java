package br.com.matheusleao.clinic_system.controller;

import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import br.com.matheusleao.clinic_system.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("specialy")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @PostMapping()
    public ResponseEntity<SpecialtyEntity> create(@RequestBody SpecialtyEntity specialtyEntity){
        SpecialtyEntity specialtyCreated = specialtyService.create(specialtyEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(specialtyCreated);
    }
}
