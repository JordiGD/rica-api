package com.rica.rica_api.repository;

import java.util.List;
import java.util.Optional;

import com.rica.rica_api.model.Investigador;

public interface InvestigadorRepository {
    
    List<Investigador> findAll();

    Optional<Investigador> findById(Long id);
    
    Investigador save(Investigador investigador);

    boolean existsByCorreoinstitucional(String correoinstitucional);
}
