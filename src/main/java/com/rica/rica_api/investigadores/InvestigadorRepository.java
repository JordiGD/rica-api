package com.rica.rica_api.investigadores;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {

    boolean existsByCorreoinstitucional_Valor(String valor);
    Investigador findByCorreoinstitucional_Valor(String valor);
}
