public class Main {
    public static void main(String[] args) {
        // Créer des étudiants
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 1001, 15.5);
        Etudiant etudiant2 = new Etudiant("Martin", "Marie", 1002, 18.0);
        Etudiant etudiant3 = new Etudiant("Bernard", "Louis", 1003, 12.3);

        // Créer des professeurs
        Professeur prof1 = new Professeur("Leclerc", "Pierre", "Mathématiques", 2500.0);
        Professeur prof2 = new Professeur("Rousseau", "Sophie", "Physique", 2300.0);

        // Créer un directeur
        Directeur directeur = new Directeur("Moreau", "Claude", "Master en Management", 15);

        // Afficher les étudiants
        System.out.println("=== ETUDIANTS ===");
        System.out.println(etudiant1);
        System.out.println(etudiant2);
        System.out.println(etudiant3);

        // Afficher les professeurs
        System.out.println("\n=== PROFESSEURS ===");
        System.out.println(prof1);
        System.out.println(prof2);

        // Afficher le directeur
        System.out.println("\n=== DIRECTEUR ===");
        System.out.println(directeur);

        // Modifier des données
        System.out.println("\n=== MODIFICATIONS ===");
        etudiant1.setMoyenne(16.5);
        System.out.println("Nouvelle moyenne de " + etudiant1.getPrenom() + " " + etudiant1.getNom() + " : " + etudiant1.getMoyenne());

        prof1.setSalaire(2600.0);
        System.out.println("Nouveau salaire de " + prof1.getPrenom() + " " + prof1.getNom() + " : " + prof1.getSalaire() + "€");
    }
}
