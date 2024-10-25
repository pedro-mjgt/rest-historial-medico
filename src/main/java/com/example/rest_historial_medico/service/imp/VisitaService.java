package com.example.rest_historial_medico.service.imp;

import com.example.rest_historial_medico.model.Visita;
import com.example.rest_historial_medico.repository.VisitaRepository;
import com.example.rest_historial_medico.service.IVisitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VisitaService implements IVisitaService {

    private final VisitaRepository visitaRepository;

    @Override
    public Visita guardarVisita(Visita visita) {
        return visitaRepository.save(visita);
    }

}
