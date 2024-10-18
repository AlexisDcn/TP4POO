import java.util.ArrayList;
import java.util.List;

class Colonie {
    private List<Drone> drones;
    private int taille;

    public Colonie(int taille) {
        this.drones = new ArrayList<>();
        this.taille = taille;
    }

    public void ajouterDrone(Drone d) {
        drones.add(d);
    }

    public void supprimerDrone(String nom) {
        drones.removeIf(drone -> drone.getNom().equals(nom));
    }

   
}
