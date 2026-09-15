package com.rica.rica_api.investigadores;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "investigadores")
public class Investigador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    @Column(name = "nombre_completo", nullable = false, length = 150)
    private String nombreCompleto;
    @Embedded
    @AttributeOverride(name = "valor", 
    column = @Column(name = "correo_institucional", nullable = false, unique = true, length = 150)) 
    private CorreoInstitucional correoinstitucional;
    @Column(name = "grupo_investigacion", nullable = false, length = 150)
    private String grupoInvestigacion;

    public Investigador() {
    }

    public Investigador(Long id, String nombreCompleto, CorreoInstitucional correoinstitucional, String grupoInvestigacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correoinstitucional = correoinstitucional;
        this.grupoInvestigacion = grupoInvestigacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public CorreoInstitucional getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(CorreoInstitucional correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    public String getGrupoInvestigacion() {
        return grupoInvestigacion;
    }

    public void setGrupoInvestigacion(String grupoInvestigacion) {
        this.grupoInvestigacion = grupoInvestigacion;
    }
}
