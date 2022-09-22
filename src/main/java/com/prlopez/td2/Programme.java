package com.prlopez.td2;

import com.prlopez.td2.models.Ecole;
import com.prlopez.td2.models.Etudiants;
import com.prlopez.td2.models.Evaluation;

public class Programme {


    protected static Ecole ecole = new Ecole("4 rue de Mouzon");

    public Programme() {
        Ecole ecole = new Ecole("4 rue de Mouzon");

        Etudiants toto = new Etudiants("toto");
        Etudiants titi = new Etudiants("titi");

        toto.getListeEvaluations().add(new Evaluation(20, "maths"));
        toto.getListeEvaluations().add(new Evaluation(8,"histoire"));

        titi.getListeEvaluations().add(new Evaluation(17,"anglais"));
        titi.getListeEvaluations().add(new Evaluation(5,"JAVA"));

        ecole.getListeEtudiants().add(toto);
        ecole.getListeEtudiants().add(titi);

        System.out.println(ecole.moyenne());
    }
    public static void main(String[] args){

    new Programme();

    }
}
