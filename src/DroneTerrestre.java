public class DroneTerrestre extends Drone{

    private int nombreRoues;

    public DroneTerrestre(String nom, int adresseMAC, int nombreRoues) {
        super(nom, adresseMAC);
        this.nombreRoues = nombreRoues;
    }

    @Override
    public void bouger(int numLigne, int numColonne) {
        if (Math.abs(this.position.getLigne() - numLigne) <= 1 && Math.abs(this.position.getColonne() - numColonne) <= 1) {
            super.bouger(numLigne, numColonne);
        } else {
            System.out.println("Déplacement non autorisé pour le drone terrestre.");
        }
    }
}
