package com.rica.rica_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rica.rica_api.model.Investigador;
import com.rica.rica_api.repository.InvestigadorRepository;
import com.rica.rica_api.rules.CorreoDuplicadoException;
import com.rica.rica_api.rules.RecursoNoEncontradoException;

@Service
public class InvestigadorService {
    
    private final InvestigadorRepository investigadorRepository;

    public InvestigadorService(InvestigadorRepository investigadorRepository) {
        this.investigadorRepository = investigadorRepository;
    }

    public List<Investigador> listarTodos() {
        return investigadorRepository.findAll();
    }

    public Investigador buscarPorId(Long id) {
        return investigadorRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(
                        "No existe un investigador con id " + id));
    }

    public Investigador registrar(Investigador investigador) {
        if (investigadorRepository.existsByCorreoinstitucional(investigador.getCorreoinstitucional())) {
            throw new CorreoDuplicadoException(
                "Ya existe un investigador registrado con el correo " + investigador.getCorreoinstitucional());
        }
        return investigadorRepository.save(investigador);
    }
}
