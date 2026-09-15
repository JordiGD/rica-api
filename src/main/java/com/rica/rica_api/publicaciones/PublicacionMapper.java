package com.rica.rica_api.publicaciones;

public class PublicacionMapper {

    private PublicacionMapper() {
    }

    public static Publicacion aEntidad(PublicacionRequest request) {
        Publicacion publicacion = new Publicacion();
        publicacion.setId(request.getId());
        publicacion.setInvestigadorCorreo(request.getInvestigadorCorreo());
        publicacion.setTitulo(request.getTitulo());
        publicacion.setTipo(request.getTipo());
        publicacion.setAnio(request.getAnio());
        publicacion.setDetalles(request.getDetalles());
        return publicacion;
    }

    public static PublicacionResponse aResponse(Publicacion publicacion) {
        return new PublicacionResponse(
                publicacion.getId(),
                publicacion.getInvestigadorCorreo(),
                publicacion.getTitulo(),
                publicacion.getTipo(),
                publicacion.getAnio(),
                publicacion.getDetalles()
        );
    }
    
}
