import java.util.ArrayList;
import java.util.List;

public class Drone {
    protected String nom;
    protected int adresseMAC;
    protected Case position;
    protected List<Case> deplacements;

    public Drone(String nom, int adresseMAC) {
        this.nom = nom;
        this.adresseMAC = adresseMAC;
        this.position = new Case((int)(Math.random() * 10), (int)(Math.random() * 10)); 
        this.deplacements = new ArrayList<>();
    }

    public void bouger(int numLigne, int numColonne) {
        if (numLigne >= 0 && numLigne < 10 && numColonne >= 0 && numColonne < 10) {
            deplacements.add(this.position);
            this.position = new Case(numLigne, numColonne);
        } else {
            System.out.println("Déplacement impossible.");
        }
    }

    // Getters et autres méthodes...
}