package com.prlopez.td2.models;

public class Evaluation {

    protected float note;
    protected String matiere;

    public Evaluation(float note, String matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public float getNote() {
        return note;
    }


}
