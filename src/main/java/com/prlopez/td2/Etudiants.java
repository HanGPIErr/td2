package com.prlopez.td2;

public class Etudiants extends Personne {

    protected int NoteGlobale;


    public Etudiants(String personne, int noteGlobale) {
        super(personne);
        NoteGlobale = noteGlobale;
    }

    public int getNoteGlobale() {
        return NoteGlobale;
    }

    public void setNoteGlobale(int noteGlobale) {
        NoteGlobale = noteGlobale;
    }
}


