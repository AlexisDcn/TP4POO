import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Colonie {
    private ArrayList<Drone> drones;
    private int tailleLigne;
    private int tailleColonne;

    public Colonie(int tailleLigne, int tailleColonne, Drone[] drones) {
        this.tailleLigne = tailleLigne; 
        this.tailleColonne = tailleColonne; 
        this.drones = new ArrayList<>();
    }

    public void ajouterDrone(Drone d) {
        drones.add(d);
    }

    public void supprimerDrone(String nom) {
        drones.removeIf(drone -> drone.getNom().equals(nom));
    }

    public String ListerNom() {
        TreeSet<String> sortedNames = new TreeSet<>();
        drones.forEach(drone -> sortedNames.add(drone.getNom()));
        sortedNames.forEach(System.out::println);
        return sortedNames.toString();  
            
        
    }

    public ArrayList<Case> getDeplacements(String nom) {
        for (Drone drone : drones) {
            if (drone.getNom().equals(nom)) {
                return drone.getDeplacements();
                
            }
        }
        
        return null;
        
    }

    public HashSet<Case> getOccupation() {
        HashSet<Case> occupiedCases = new HashSet<>();
        for (Drone drone : drones) {
            occupiedCases.add(drone.getPosition());
        }
        return occupiedCases;
    }
}
