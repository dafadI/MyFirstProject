public class Personne {
    private int idPersonne;
    private String nom;
    private String prenom;

    //Les const************************************************************
    public Personne() {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;

    } // Fin const sans arg

    public Personne(int idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
    }// Fin const avec tous les args


    // les getters*************************************************************
    public int getIdPersonne() {
        return idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    // les setters************************************************************


    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Les methodes**************************************************************

    public String toString(){
        return "Mon ID personne est : " + this.getIdPersonne() + " , et je m'appelle : " + this.getPrenom() + " " + this.getNom();
    }
}// Fin classe Personne

