package com.rickkorkmaz.vagadorestapibackend;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class OpenVraagAntwoord extends Antwoord {

    public OpenVraagAntwoord(String antwoord) {
        super(antwoord);
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        return this.antwoord.equalsIgnoreCase(antwoord);
    }

    @JsonIgnore
    public String getAntwoord() {
        return antwoord;
    }
}
