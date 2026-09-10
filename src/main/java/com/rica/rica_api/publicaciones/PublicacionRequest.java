package com.rica.rica_api.publicaciones;

import java.util.Map;

import com.mongodb.lang.NonNull;

import jakarta.validation.constraints.NotBlank;

public class PublicacionRequest {

    @NotBlank (message = "El id es obligatorio")
    private String id;
    @NotBlank (message = "El correo del investigador es obligatorio")
    private String investigadorCorrreo;
    @NotBlank (message = "El título es obligatorio")
    private String titulo;
    @NotBlank (message = "El tipo es obligatorio")
    private String tipo;
    @NonNull
    private Integer anio;
    private Map<String, String> detalles;
    
    public PublicacionRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvestigadorCorrreo() {
        return investigadorCorrreo;
    }

    public void setInvestigadorCorrreo(String investigadorCorrreo) {
        this.investigadorCorrreo = investigadorCorrreo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Map<String, String> getDetalles() {
        return detalles;
    }

    public void setDetalles(Map<String, String> detalles) {
        this.detalles = detalles;
    }
}
