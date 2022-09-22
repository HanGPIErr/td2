import com.prlopez.td2.Ecole;
import com.prlopez.td2.Etudiants;

public class Programme {

    public static void main(String[] args){


        Ecole ecole = new Ecole("4 Rue de Mouzon");

        ecole.getListeEtudiants().add(new Etudiants("toto", 12));
        ecole.getListeEtudiants().add(new Etudiants("titi", 17));
        ecole.getListeEtudiants().add(new Etudiants("tata", 5));

        System.out.println(ecole.moyenne());
    }
}
