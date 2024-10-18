class Main {
    public static void main(String[] args) {
      System.out.println("Les drones !");
  
      DroneTerrestre d1 = new DroneTerrestre("Wall-E1", 11, 4);  // nom adresse nbRoues
      System.out.println("d1 --> " + d1);
  
      DroneTerrestre d2 = new DroneTerrestre("Wall-E2", 12, 4);
      System.out.println("d2 --> " + d2);
  
      DroneAerien d3 = new DroneAerien("Eve1", 21, 2.0f); // nom adresse hauteur
      System.out.println("d3 --> " + d3);
        
      d3.bouger(d3.getPosition().getLigne() + 2, d3.getPosition().getColonne());
      System.out.println("d3 --> " + d3);
  
      d3.bouger(d3.getPosition().getLigne(), d3.getPosition().getColonne() - 2);
      System.out.println("d3 --> " + d3);
  
      d3.bouger(d3.getPosition().getLigne(), d3.getPosition().getColonne() - 2);
      System.out.println("d3 --> " + d3);
  
        // les 2 déplacements suivants ne doivent pas déplacer le drone (déplacement non autorisé)
      d1.bouger(d1.getPosition().getLigne()+4, d1.getPosition().getLigne());
      System.out.println("d1 --> " + d1);
  
      d3.bouger(d3.getPosition().getLigne()+1, d3.getPosition().getLigne()+1);
      System.out.println("d3 --> " + d3);
  
      Colonie colo = new Colonie(20, 20, new Drone[]{d1, d2, d3});
  
      colo.ajouterDrone(new DroneTerrestre("Wall-E3", 13, 4));
      colo.ajouterDrone(new DroneAerien("Eve2", 22));
      colo.ajouterDrone(new DroneAerien("Eve3", 23));
      colo.ajouterDrone(d3);
  
      System.out.println("les noms des drones sont : \n" + colo.ListerNom());
  
      System.out.println("les déplacements de Eve1 sont : \n "+colo.getDeplacements("Eve1"));
  
      System.out.println("les cases occupées sont : \n "+ colo.getOccupation());
    }
  }