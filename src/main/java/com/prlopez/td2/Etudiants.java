package com.prlopez.td2;

import java.util.ArrayList;

public class Etudiants extends Personne {


    protected ArrayList<Evaluation>listeEvaluations = new ArrayList<>();

    public Etudiants(String personne) {
        super(personne);

    }

    public ArrayList<Evaluation> getListeEvaluations() {
        return listeEvaluations;
    }

    public void setListeEvaluations(ArrayList<Evaluation> listeEvaluations) {
        this.listeEvaluations = listeEvaluations;
    }
}


