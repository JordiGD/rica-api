package com.rica.rica_api.publicaciones;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicacionRepository extends MongoRepository<Publicacion, String> {
    
    List<Publicacion> findByInvestigadorCorrreo(String investigadorCorrreo);
    
}
