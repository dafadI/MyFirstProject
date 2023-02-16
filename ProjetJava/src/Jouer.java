public class Jouer {
    private int idActeur;
    private int idFilm;
    private String role;

    //les const****************************************

    public Jouer() {
        this.idActeur = idActeur;
        this.idFilm = idFilm;
        this.role = role;
    } // Fin const sans args

    public Jouer(int idActeur, int idFilm, String role) {
        this.idActeur = idActeur;
        this.idFilm = idFilm;
        this.role = role;
    } // Fin const avec args

    //Les methodes**********************************************************
    public String toString(){
        return "L'acteur a vec l'ID : " + this.idActeur + " a joué dans le film ID " + this.idFilm + " avec le rôle : " + this.role;
    }



}// Find e la classe Jouer

