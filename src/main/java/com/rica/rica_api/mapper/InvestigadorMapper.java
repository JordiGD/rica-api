package com.rica.rica_api.mapper;

import com.rica.rica_api.InvestigadorRequest;
import com.rica.rica_api.InvestigadorResponse;
import com.rica.rica_api.model.Investigador;

public class InvestigadorMapper {
    
    private InvestigadorMapper() {
    }

    public static Investigador aEntidad(InvestigadorRequest request) {
        Investigador investigador = new Investigador();
        investigador.setNombreCompleto(request.getNombreCompleto());
        investigador.setCorreoinstitucional(request.getCorreoInstitucional());
        investigador.setGrupoInvestigacion(request.getGrupoInvestigacion());
        return investigador;
    }

    public static InvestigadorResponse aResponse(Investigador investigador) {
        return new InvestigadorResponse(
                investigador.getId(),
                investigador.getNombreCompleto(),
                investigador.getGrupoInvestigacion()
        );
    }

}
