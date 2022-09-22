package com.prlopez.td2.models;

import java.util.ArrayList;

public class Ecole{

    protected String adresse;


    public Ecole(String adresse) {
        this.adresse = adresse;
    }

    protected ArrayList<Etudiants> listeEtudiants = new ArrayList<>();


    public void setListeEtudiants(ArrayList<Etudiants> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }


    public ArrayList<Etudiants> getListeEtudiants(){
        return listeEtudiants;
    }
    public float moyenne() {

        float cumul = 0;
        float count = 0;

        for (Etudiants etudiant : listeEtudiants) {

            for (Evaluation evaluation : etudiant.getListeEvaluations()) {
                cumul += evaluation.getNote();
                //count ++;
            }

            count += etudiant.getListeEvaluations().size();
        }

        return cumul / count;
    }


}
