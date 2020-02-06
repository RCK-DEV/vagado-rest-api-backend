package com.rickkorkmaz.vagadorestapibackend;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MeerkeuzeAntwoord extends Antwoord {
    private boolean isCorrect;

    public MeerkeuzeAntwoord(String antwoord, boolean isCorrect) {
        super(antwoord);
        this.isCorrect = isCorrect;
    }

    @Override
    public boolean controleerAntwoord(String answer) {
        return antwoord.equalsIgnoreCase(answer) && isCorrect;
    }

    @JsonIgnore
    public boolean isCorrect(){
        return isCorrect;
    }
}
