package com.rickkorkmaz.vagadorestapibackend;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aanschaffing {
    private String vervaldatum;
    private Product product;

    public boolean isActief() {
        boolean result = false;
        try {
            result = new SimpleDateFormat("dd/MM/yyy").parse(vervaldatum).before(new Date());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
