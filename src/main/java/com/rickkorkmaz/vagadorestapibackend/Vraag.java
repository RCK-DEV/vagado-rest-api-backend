package com.rickkorkmaz.vagadorestapibackend;

import java.util.List;

public abstract class Vraag<T> {
    private int vraagId;
    private String vraag;
    protected VraagType vraagType;
    protected List<T> antwoorden;


    protected Vraag(int vraagId, String vraag) {
        this.vraagId = vraagId;
        this.vraag = vraag;
    }

    public abstract boolean controleerAntwoord(String antwoord);

    public List<T> getAntwoorden() {
        return antwoorden;
    }
    public void addAntwoord(T antwoord) {
        antwoorden.add(antwoord);
    }

    public void removeAntwoord(T antwoord) {
        antwoorden.remove(antwoord);
    }

    public int getVraagId() {
        return vraagId;
    }

    public String getVraag() {
        return vraag;
    }

    public void setAntwoorden(List<T> antwoorden) {
        this.antwoorden = antwoorden;
    }

    public VraagType getVraagType() {
        return vraagType;
    }
}
