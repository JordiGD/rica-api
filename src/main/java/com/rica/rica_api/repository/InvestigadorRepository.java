package com.rica.rica_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rica.rica_api.model.Investigador;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {

    boolean existsByCorreoinstitucional(String correoinstitucional);
}
