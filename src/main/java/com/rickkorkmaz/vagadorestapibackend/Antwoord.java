package com.rickkorkmaz.vagadorestapibackend;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class Antwoord {
    protected String antwoord;

    public Antwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public abstract boolean controleerAntwoord(String antwoord);

    public String getAntwoord() {
        return antwoord;
    }
}
