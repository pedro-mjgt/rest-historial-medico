package com.example.rest_historial_medico.controller;

import com.example.rest_historial_medico.model.Visita;
import com.example.rest_historial_medico.service.IVisitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/visita")
public class VisitaController {

    private final IVisitaService visitaService;

    @PostMapping
    public ResponseEntity<Visita> registrarVisita(@RequestBody Visita visita) {
        return new ResponseEntity<>(visitaService.guardarVisita(visita),
                HttpStatus.CREATED);
    }

}
