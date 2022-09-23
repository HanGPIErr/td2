package com.prlopez.td2;

import com.prlopez.td2.models.Ecole;
import com.prlopez.td2.models.Etudiants;
import com.prlopez.td2.models.Evaluation;

public class Programme {


    protected static Ecole ecole = new Ecole("4 rue de Mouzon");

    public Programme() {


        Etudiants john = new Etudiants("John Doe", 22);

        System.out.println(john.isMajeur());

//        Ecole ecole = new Ecole("4 rue de Mouzon");
//
//        Etudiants toto = new Etudiants("toto", 15);
//        Etudiants titi = new Etudiants("titi", 16);
//
//        ecole.ajoutEtudiants(toto,titi);
//
//
//        System.out.println(ecole.moyenne());
    }

    public static void main(String[] args) {

        new Programme();

    }
}
