package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
    private int likes;
    private int id;
    private String bruker;
    private String dato;

    public Innlegg() {

    }

    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
    }

    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    public String getBruker() {
        return this.bruker;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }


    public String getDato() {
        return this.dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getId() {
        return this.id;
    }

    public int getLikes() {
        return this.likes;
    }

    public void doLike() {
        likes++;
    }

    public boolean erLik(Innlegg innlegg) {
        boolean b = false;
        if (this.id == innlegg.id) {
            b = true;
        }
        return b;
    }

    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {

        throw new UnsupportedOperationException(TODO.method());

    }
}
