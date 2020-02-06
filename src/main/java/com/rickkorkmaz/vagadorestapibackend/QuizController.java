package com.rickkorkmaz.vagadorestapibackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class QuizController {

    @RequestMapping("/")
    public Vragenlijst initQuiz() {

        ArrayList<MeerkeuzeAntwoord> antwoordenVraag1 = new ArrayList<>();
        antwoordenVraag1.add(new MeerkeuzeAntwoord("Ronald Koeman", true));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("Danny Blind", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("Fred Grim", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("Dick Advocaat", false));
        Vraag vraag1 = new MeerkeuzeVraag(1, "Wie is momenteel de bondscoach van het Nederlands voetbalelftal?", antwoordenVraag1);

        ArrayList<OpenVraagAntwoord> antwoordenVraag2 = new ArrayList<>();
        antwoordenVraag2.add(new OpenVraagAntwoord("Jonathan de Guzman"));
        antwoordenVraag2.add(new OpenVraagAntwoord("Jonathan Guzman"));
        antwoordenVraag2.add(new OpenVraagAntwoord("Jonathan"));
        antwoordenVraag2.add(new OpenVraagAntwoord("Guzman"));
        Vraag vraag2 = new OpenVraag(2, "Op 30 september 2018 scoorde een Nederlandse voetballer tegen Hannover 96. Hij werd daarmee de eerste Nederlander die in de vier grote competities (Engeland, Spanje, Italië en Duitsland) wist te scoren. Wie is deze voetballer?", antwoordenVraag2);

        ArrayList<Vraag> vragen = new ArrayList<>();
        vragen.add(vraag1);
        vragen.add(vraag2);

        return new Vragenlijst("Voetbal", "Sport", vragen);
    }

}
