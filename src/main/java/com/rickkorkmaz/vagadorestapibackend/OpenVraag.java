package com.rickkorkmaz.vagadorestapibackend;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class OpenVraag extends Vraag<OpenVraagAntwoord> {

    public OpenVraag(int vraagId, String vraag, List<OpenVraagAntwoord> antwoorden) {
        super(vraagId, vraag);
        this.antwoorden = antwoorden;
        this.vraagType = VraagType.OPEN;
    }

    @JsonIgnore
    @Override
    public boolean controleerAntwoord(String antwoord) {
        for (OpenVraagAntwoord a : antwoorden) {
            if (a.equals(antwoord)) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    @Override
    public List<OpenVraagAntwoord> getAntwoorden() {
        return antwoorden;
    }
}
