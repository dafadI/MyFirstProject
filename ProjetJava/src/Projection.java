public class Projection implements CineInfo{
    private int idCinema;
    private int idFilm;
    private String jouer;

    //Les const************************************

    public Projection(int idCinema, int idFilm, String jouer) {
        this.idCinema = idCinema;
        this.idFilm = idFilm;
        this.jouer = jouer;
    }

    // Les getters *********************************

    public int getIdCinema() {
        return idCinema;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getJouer() {
        return jouer;
    }


    // lES setters ************************************


    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setJouer(String jouer) {
        this.jouer = jouer;
    }

    // Les methodes**************************************

    public String toString(){
        return "Le rôle " + this.jouer + "a été joué au film n° " + this.idFilm + ", projeté au ciné n° " + this.idCinema;
    }

    @Override
    public void afficheInfo() {
        System.out.println("La projection du n° de film " + this.idFilm +" , au ciné n° " + this.idCinema + " jouer : " + this.jouer );
    }
}// Fin de la classe Projection
