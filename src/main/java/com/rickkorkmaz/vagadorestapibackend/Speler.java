package com.rickkorkmaz.vagadorestapibackend;

import java.util.ArrayList;

public class Speler {
    private int muntenSaldo;
    private String gebruikersnaam;
    private ArrayList<LifetimeBest> lifetimeBests;
    private ArrayList<Aanschaffing> aanschaffingen;

    public Speler(int muntenSaldo, String gebruikersnaam, ArrayList<LifetimeBest> lifetimeBests, ArrayList<Aanschaffing> aanschaffingen) {
        this.muntenSaldo = muntenSaldo;
        this.gebruikersnaam = gebruikersnaam;
        this.lifetimeBests = lifetimeBests;
        this.aanschaffingen = aanschaffingen;
    }

    public ArrayList<Vragenlijst> getActieveVragenlijsten() {
        ArrayList<Vragenlijst> vragenlijst = new ArrayList<>();
        for (Aanschaffing aanschaffing : aanschaffingen) {
            if (aanschaffing.isActief()) {
//                vragenlijst.add(aanschaffing.);
            }
        }
        return vragenlijst;
    }
}
