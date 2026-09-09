package com.rica.rica_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rica.rica_api.model.Publicacion;
import com.rica.rica_api.repository.InvestigadorRepository;
import com.rica.rica_api.repository.PublicacionRepository;
import com.rica.rica_api.rules.RecursoNoEncontradoException;

@Service
public class PublicacionService {
    
    private final PublicacionRepository publicacionRepository;
    private final InvestigadorRepository investigadorRepository;

    public PublicacionService(PublicacionRepository publicacionRepository, InvestigadorRepository investigadorRepository) {
        this.publicacionRepository = publicacionRepository;
        this.investigadorRepository = investigadorRepository;
    }

    public Publicacion registrar(Publicacion publicacion) {
        if (!investigadorRepository.existsByCorreoinstitucional(publicacion.getInvestigadorCorrreo())) {
            throw new RecursoNoEncontradoException(
                    "No existe un investigador con correo " + publicacion.getInvestigadorCorrreo());
        }
        return publicacionRepository.save(publicacion);
    }

    public List<Publicacion> listarPorInvestigador(String investigadorCorreo) {
        return publicacionRepository.findByInvestigadorCorrreo(investigadorCorreo);
    }

    public Publicacion buscarPorId(String id) {
        return publicacionRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(
                        "No existe una publicación con id " + id));
    }
}
