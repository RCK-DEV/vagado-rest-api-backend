package com.rickkorkmaz.vagadorestapibackend;

import java.util.ArrayList;

public class Vragenlijst {
    private String onderwerp;
    private String thema;
    private ArrayList<Vraag> vragen;

    public Vragenlijst(String onderwerp, String thema, ArrayList<Vraag> vragen) {
        this.onderwerp = onderwerp;
        this.thema = thema;
        this.vragen = vragen;
    }

    public Vragenlijst(String onderwerp, String thema) {
        this.onderwerp = onderwerp;
        this.thema = thema;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public String getThema() {
        return thema;
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }
}
