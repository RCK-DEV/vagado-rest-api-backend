package com.rickkorkmaz.vagadorestapibackend;

public class LifetimeBest {
    private float totaleTijd;
    private int verdiendePunten;
    private int vragenLijstId;

    public LifetimeBest(float totaleTijd, int verdiendePunten, int vragenLijstId) {
        this.totaleTijd = totaleTijd;
        this.verdiendePunten = verdiendePunten;
        this.vragenLijstId = vragenLijstId;
    }

    public float getTotaleTijd() {
        return totaleTijd;
    }

    public int getVerdiendePunten() {
        return verdiendePunten;
    }

    public int getVragenLijstId() {
        return vragenLijstId;
    }

    public void updateLifetimeBest(int totaleTijd, int verdiendePunten) {
        if (this.totaleTijd < totaleTijd && this.verdiendePunten < verdiendePunten) {
            this.totaleTijd = totaleTijd;
            this.verdiendePunten = verdiendePunten;
        }
    }
}
