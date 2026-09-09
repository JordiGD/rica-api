package com.rica.rica_api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rica.rica_api.model.Publicacion;

public interface PublicacionRepository extends MongoRepository<Publicacion, String> {
    
    List<Publicacion> findByInvestigadorCorrreo(String investigadorCorrreo);
    
}
