import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Clef {

    private  int[] codage;
    private final int TAILLE_PAR_DEFAUT = 20;
    private final int MAX_CODAGE = 100;
    private Random random = new Random();

    Clef() {
        for (int i = 0; i < TAILLE_PAR_DEFAUT; i++) {
            codage[i] = random.nextInt(MAX_CODAGE + 1);
        }
    }

    public Clef(int taille) throws IllegalArgumentException {
        if (taille > TAILLE_PAR_DEFAUT || taille < 1) {
            throw new IllegalArgumentException("taille saisie invalide");
        }
        for (int i = 0; i < taille; i++) {
            codage[i] = (random.nextInt(MAX_CODAGE + 1));
        }
    }

    public void afficherEncodage(){
       StringBuilder sb = new StringBuilder();
       
        for(int i = 0; i < codage.length; i++){
            sb.append(codage[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public int[] getCodage() {
        return codage;
    }

}
