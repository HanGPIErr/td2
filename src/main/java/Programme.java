import com.prlopez.td2.Ecole;
import com.prlopez.td2.Etudiants;
import com.prlopez.td2.Evaluation;

import java.util.ArrayList;

public class Programme {

    public static void main(String[] args){



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
}
