public abstract class Entreprise {
    private String nom;
    private String adresse;

    // Les const********************************************************


    public Entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    // Les getters***********************************************

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    // Le setters******************************************************


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}// Finde la classe abstraite Entreprise
