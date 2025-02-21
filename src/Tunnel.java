public class Tunnel {

    private String destination;
    private int longueur;
    private int[] serrure;
    private boolean porteOuverte = false;
    private Boolean porteVerouillee = true;

    public Tunnel(String destination, int longueur) {
        this.destination = destination;
        this.longueur = longueur;
    }


    public String getDestination() {
        return destination;
    }

    public int getLongueur() {
        return longueur;
    }

    public boolean ouvrirPorte() {
        if (!porteOuverte && !porteVerouillee) {
            porteOuverte = true;
            return true;
        }
        return false;
    }

    public boolean fermerPorte() {
        if (porteOuverte) {
            porteOuverte = false;
            return true;
        }
        return false;
    }

    public boolean verouillerPorte(int[] clef) {
        if (clef.length != serrure.length) {
            return false;
        }
        if (!porteVerouillee && !porteOuverte) {
            for (int i = 0; i < serrure.length; i++) {
                serrure[i] = 100 - clef[i];
            }
            porteVerouillee = true;
            return true;
        }
        return false;
    }

    public boolean deverouillerPorte(int[] clef) {
        if (clef.length != serrure.length) {
            return false;
        }
        for (int i = 0; i < serrure.length; i++) {
            if (serrure[i] + clef[i] != 100) {
                return false;
            }
        }
        if (porteVerouillee) {
            porteVerouillee = false;
            return true;
        }
        return false;
    }

}
