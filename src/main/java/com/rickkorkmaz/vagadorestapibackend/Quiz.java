package com.rickkorkmaz.vagadorestapibackend;

import java.util.ArrayList;

public class Quiz {
    private int aantalVragen;
    private float totaleTijd;
    private int verdiendePunten;
    private int verdiendeMunten;
    private int aantalVragenGoed;
    private Speler speler;

    public ArrayList<Vragenlijst> initQuiz() {
        aantalVragen = 10;
        totaleTijd = 0f;
        verdiendePunten = 0;
        verdiendeMunten = 0;
        aantalVragenGoed = 0;
        speler = new Speler(10, "rickkorkmaz@gmail.com", null, null);
        return speler.getActieveVragenlijsten();
    }

    protected void startTimer() {
        // TODO: Implement timer
    }


}
