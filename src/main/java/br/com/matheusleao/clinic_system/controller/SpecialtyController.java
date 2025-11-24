package br.com.matheusleao.clinic_system.controller;

import br.com.matheusleao.clinic_system.dto.SpecialtyRequestDTO;
import br.com.matheusleao.clinic_system.dto.SpecialtyResponseDTO;
import br.com.matheusleao.clinic_system.model.SpecialtyEntity;
import br.com.matheusleao.clinic_system.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("specialy")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @PostMapping()
    public ResponseEntity<SpecialtyResponseDTO> create(@RequestBody SpecialtyRequestDTO specialtyRequestDTO){
        SpecialtyResponseDTO specialtyCreated = specialtyService.create(specialtyRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(specialtyCreated);
    }

    @GetMapping()
    public ResponseEntity<List<SpecialtyResponseDTO>> findAll(){
        List<SpecialtyResponseDTO> specialtyEntities = specialtyService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(specialtyEntities);
    }
}
