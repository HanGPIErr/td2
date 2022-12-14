package com.prlopez.td2.models;

import java.util.ArrayList;

public class Etudiants extends Personne {


    protected ArrayList<Evaluation> listeEvaluations = new ArrayList<>();

    public Etudiants(String nom, int age) {
        super(nom, age);

    }

    public void ajouteNote(String matiere, float note) {

        listeEvaluations.add(new Evaluation(note, matiere));
    }

    public float moyenne() {

        float count = 0;

        for (Evaluation evaluation : listeEvaluations) {
            count += evaluation.getNote();
        }
        return count / listeEvaluations.size();
    }

    public ArrayList<Evaluation> getListeEvaluations() {
        return listeEvaluations;
    }

    public void setListeEvaluations(ArrayList<Evaluation> listeEvaluations) {
        this.listeEvaluations = listeEvaluations;
    }

}


