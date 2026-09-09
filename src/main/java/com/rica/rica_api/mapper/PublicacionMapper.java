package com.rica.rica_api.mapper;

import com.rica.rica_api.DTO.PublicacionRequest;
import com.rica.rica_api.DTO.PublicacionResponse;
import com.rica.rica_api.model.Publicacion;

public class PublicacionMapper {

    private PublicacionMapper() {
    }

    public static Publicacion aEntidad(PublicacionRequest request) {
        Publicacion publicacion = new Publicacion();
        publicacion.setId(request.getId());
        publicacion.setInvestigadorCorrreo(request.getInvestigadorCorrreo());
        publicacion.setTitulo(request.getTitulo());
        publicacion.setTipo(request.getTipo());
        publicacion.setAnio(request.getAnio());
        publicacion.setDetalles(request.getDetalles());
        return publicacion;
    }

    public static PublicacionResponse aResponse(Publicacion publicacion) {
        return new PublicacionResponse(
                publicacion.getId(),
                publicacion.getInvestigadorCorrreo(),
                publicacion.getTitulo(),
                publicacion.getTipo(),
                publicacion.getAnio(),
                publicacion.getDetalles()
        );
    }
    
}
