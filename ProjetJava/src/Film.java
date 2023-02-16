public class Film {

    private int idFilm;
    private int idRealisateur;
    private String titre;
    private String genre;
    private int annee;

    // Les const**********************************************************


    public Film() {
        this.idFilm = idFilm;
        this.idRealisateur = idRealisateur;
        this.titre = titre;
        this.genre = genre;
        this.annee = annee;
    } // Fin de const sans arg

    public Film(int idFilm, int idRealisateur, String titre, String genre, int annee) {
        this.idFilm = idFilm;
        this.idRealisateur = idRealisateur;
        this.titre = titre;
        this.genre = genre;
        this.annee = annee;
    } // Fin de const avec arg

    //Les getters*************************************************


    public int getIdFilm() {
        return idFilm;
    }

    public int getIdRealisateur() {
        return idRealisateur;
    }

    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnnee() {
        return annee;
    }

    // les setters******************************************************

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setIdRealisateur(int idRealisateur) {
        this.idRealisateur = idRealisateur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Les methodes ***********************************************
    public String toString(){
        return "en ce moment au ciné il y a le film : " + this.titre + " numéro, " + this.idFilm + " dont le réalisateur est, " + this.idRealisateur + " et le genre et année : " + this.getGenre() + " " + this.getAnnee();
    }

    public boolean equals(Film f){
        if ( this.idFilm == f.idFilm) return true;
        else return false;
    }


}// Fin de la classe Film
