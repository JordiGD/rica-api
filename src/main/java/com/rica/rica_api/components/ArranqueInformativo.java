package com.rica.rica_api.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rica.rica_api.services.SaludoInstitucionalService;

@Component
public class ArranqueInformativo implements CommandLineRunner {

    private final SaludoInstitucionalService saludoInstitucionalService;

    public ArranqueInformativo(SaludoInstitucionalService saludoInstitucionalService) {
        this.saludoInstitucionalService = saludoInstitucionalService;
    }

    @Override
    public void run(String... args) {
        System.out.println(saludoInstitucionalService.mensajeDeBienvenida());
    }
    
}
