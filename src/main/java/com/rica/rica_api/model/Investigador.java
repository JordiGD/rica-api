package com.rica.rica_api.model;

public class Investigador {
    
    private Long id;
    private String nombreCompleto;
    private String correoinstitucional;
    private String grupoInvestigacion;

    public Investigador() {
    }

    public Investigador(Long id, String nombreCompleto, String correoinstitucional, String grupoInvestigacion) {
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

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    public String getGrupoInvestigacion() {
        return grupoInvestigacion;
    }

    public void setGrupoInvestigacion(String grupoInvestigacion) {
        this.grupoInvestigacion = grupoInvestigacion;
    }
}
