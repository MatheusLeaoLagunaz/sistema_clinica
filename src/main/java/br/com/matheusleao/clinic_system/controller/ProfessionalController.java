package br.com.matheusleao.clinic_system.controller;

import br.com.matheusleao.clinic_system.dto.ProfessionalRequestDTO;
import br.com.matheusleao.clinic_system.dto.ProfessionalResponseDTO;
import br.com.matheusleao.clinic_system.model.ProfessionalEntity;
import br.com.matheusleao.clinic_system.repository.ProfessionalRepository;
import br.com.matheusleao.clinic_system.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professional")
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @PostMapping()
    public ResponseEntity<ProfessionalResponseDTO> save(@RequestBody ProfessionalRequestDTO professionalRequestDTO) {
        ProfessionalResponseDTO professional = professionalService.save(professionalRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(professional);
    }

    @GetMapping()
    public ResponseEntity<List<ProfessionalEntity>> findAll() {
        List<ProfessionalEntity> professionals = professionalService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(professionals);
    }
}
