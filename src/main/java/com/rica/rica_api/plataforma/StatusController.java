package com.rica.rica_api.plataforma;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StatusController {
    
    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
            "proyecto", "RICA",
            "estado", "operativo");
    }
}