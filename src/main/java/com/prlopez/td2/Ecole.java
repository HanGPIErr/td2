package com.prlopez.td2;

import java.util.ArrayList;
import java.util.Collections;

public class Ecole{

    protected String adresse;


    public Ecole(String adresse) {
        this.adresse = adresse;
    }

    protected ArrayList<Etudiants> listeEtudiants = new ArrayList<Etudiants>();


    public void setListeEtudiants(ArrayList<Etudiants> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }


    public ArrayList<Etudiants> getListeEtudiants(){
        return listeEtudiants;
    }
    public  float moyenne(){


        float cumul = 0;

        for(Etudiants etudiants : listeEtudiants){

            cumul += etudiants.getNoteGlobale();
        }
        return cumul / listeEtudiants.size();
    }


}
