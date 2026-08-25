package com.rica.rica_api.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoInstitucionalService {
    
    public String mensajeDeBienvenida() {
        return "RICA esta en linea - Red de Investigacion y Colaboracion Academica.";
    }
}
