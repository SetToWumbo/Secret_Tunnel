public class Tunnel {

    private String destination;
    private int longueur;
    private boolean porteOuverte = false;
    private Boolean porteVerouillee = true;

    public Tunnel(String destination, int longueur){
        this.destination = destination;
        this.longueur = longueur;
    }



    public String getDestination(){
        return destination;
    }
    public int getLongueur(){
        return longueur;
    }

    public boolean ouvrirPorte(){
        if (!porteOuverte && !porteVerouillee){
            porteOuverte = true;
            return true;
        }
        return false;
    }
    public boolean fermerPorte(){
        if (porteOuverte){
            porteOuverte = false;
            return true;
        }
        return false;
    }
    public boolean verouillerPorte(){
        if (!porteVerouillee && !porteOuverte){
            porteVerouillee = true;
            return true;
        }
        return false;
    }
    public boolean deverouillerPorte(){
        if (porteVerouillee){
            porteVerouillee = false;
            return true;
        }
        return false;
    }

}
