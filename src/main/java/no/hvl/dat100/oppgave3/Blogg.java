package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;

import java.util.ArrayList;

public class Blogg{

    Innlegg[] innlegsTabell;
    int nesteLedig;

    public Blogg() {
        this.innlegsTabell = new Innlegg[20];
        this.nesteLedig = 0;
    }

    ;

    public Blogg(int lengde) {
        this.innlegsTabell = new Innlegg[lengde];
        this.nesteLedig = 0;
    }

    ;

    public int getAntall() {
        return nesteLedig;
    }

    public Innlegg[] getSamling() {
        return innlegsTabell;
    }

    ;

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteLedig; i++) {
            if (innlegsTabell[i] != null && innlegsTabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    ;

    public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i < nesteLedig; i++) {
            if (innlegsTabell[i] != null && innlegsTabell[i].erLik(innlegg)) {
                return true;
            }
        }
        return false;
    }

    public boolean ledigPlass() {
        boolean plass = false;
        if (nesteLedig < innlegsTabell.length) {
            plass = true;
        }
        return plass;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg)) {
            return false;
        }
        if (!ledigPlass()) {
            return false;
        }
        innlegsTabell[nesteLedig] = innlegg;
        nesteLedig++;
        return true;
    }

    public String toString() {
        String resultat = "";
        resultat += nesteLedig + "\n";

        for (int i = 0; i < nesteLedig; i++) {
            Innlegg innlegg = innlegsTabell[i];

            if (innlegg instanceof Bilde) {
                Bilde bildeInnlegg = (Bilde) innlegg;
                resultat += "BILDE\n";
                resultat += bildeInnlegg.getId() + "\n";
                resultat += bildeInnlegg.getBruker() + "\n";
                resultat += bildeInnlegg.getDato() + "\n";
                resultat += bildeInnlegg.getLikes() + "\n";
                resultat += bildeInnlegg.getTekst() + "\n";
                resultat += bildeInnlegg.getUrl() + "\n";
            }
            else if (innlegg instanceof Tekst) {
                Tekst tekstInnlegg = (Tekst) innlegg;
                resultat += "TEKST\n";
                resultat += tekstInnlegg.getId() + "\n";
                resultat += tekstInnlegg.getBruker() + "\n";
                resultat += tekstInnlegg.getDato() + "\n";
                resultat += tekstInnlegg.getLikes() + "\n";
                resultat += tekstInnlegg.getTekst() + "\n";
            }
        }

        return resultat;
    }

    // valgfrie oppgaver nedenfor

    public void utvid() {
        throw new UnsupportedOperationException(TODO.method());
    }

    public boolean leggTilUtvid(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());

    }

    public boolean slett(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());
    }

    public int[] search(String keyword) {

        throw new UnsupportedOperationException(TODO.method());

    }
}