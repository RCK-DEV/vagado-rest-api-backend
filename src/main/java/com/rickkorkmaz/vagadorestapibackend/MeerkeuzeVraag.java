package com.rickkorkmaz.vagadorestapibackend;

import java.util.List;

public class MeerkeuzeVraag extends Vraag<MeerkeuzeAntwoord> {

    public MeerkeuzeVraag(int vraagId, String vraag, List<MeerkeuzeAntwoord> antwoorden) {
        super(vraagId, vraag);
        this.antwoorden = antwoorden;
        this.vraagType = VraagType.MEERKEUZE;
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        for (MeerkeuzeAntwoord a : antwoorden) {
            if (a.equals(antwoord) && a.isCorrect()) {
                return true;
            }
        }
        return false;
    }
}
