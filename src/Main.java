import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Tunnel tunnel = new Tunnel("Courgetteria", random.nextInt(5, 20+1));

        testerTunnel(tunnel);
    }

    private static void testerTunnel(Tunnel tunnel){
        System.out.println("Tunnel de " + tunnel.getLongueur() + " mètres à destination de " + tunnel.getDestination());
    }
}