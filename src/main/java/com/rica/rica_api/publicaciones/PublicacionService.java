package com.rica.rica_api.publicaciones;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rica.rica_api.compartido.RecursoNoEncontradoException;
import com.rica.rica_api.investigadores.InvestigadorRepository;

@Service
public class PublicacionService {
    
    private final PublicacionRepository publicacionRepository;
    private final InvestigadorRepository investigadorRepository;
    private final LimitePublicacionesAnualesService limitePublicacionesAnualesService;

    public PublicacionService(PublicacionRepository publicacionRepository, InvestigadorRepository investigadorRepository, LimitePublicacionesAnualesService limitePublicacionesAnualesService) {
        this.publicacionRepository = publicacionRepository;
        this.investigadorRepository = investigadorRepository;
        this.limitePublicacionesAnualesService = limitePublicacionesAnualesService;
    }

    public Publicacion registrar(Publicacion publicacion) {
        if (!investigadorRepository.existsByCorreoinstitucional_Valor(publicacion.getInvestigadorCorreo())) {
            throw new RecursoNoEncontradoException(
                    "No existe un investigador con correo " + publicacion.getInvestigadorCorreo());
        }
        if (!limitePublicacionesAnualesService.puedeRegistrar(
                investigadorRepository.findByCorreoinstitucional_Valor(publicacion.getInvestigadorCorreo()),
                publicacion)) {
            throw new LimiteAnualExcedidoException("El investigador ha alcanzado el límite de publicaciones anuales.");
        }
        return publicacionRepository.save(publicacion);
    }

    public List<Publicacion> listarPorInvestigador(String investigadorCorreo) {
        return publicacionRepository.findByInvestigadorCorreo(investigadorCorreo);
    }

    public Publicacion buscarPorId(String id) {
        return publicacionRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(
                        "No existe una publicación con id " + id));
    }
}
