public class Professeur {
    private String nom;
    private String prenom;
    private String specialite;
    private double salaire;

    public Professeur(String nom, String prenom, String specialite, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.salaire = salaire;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
