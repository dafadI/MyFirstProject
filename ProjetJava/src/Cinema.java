public class Cinema extends Entreprise implements CineInfo {

    private int idCinema;

    // Les const*********************************

    public Cinema(String nom, String adresse, int idCinema) {
        super(nom, adresse);
        this.idCinema = idCinema;
    }

    // Les getters ****************************************

    public int getIdCinema() {
        return idCinema;
    }

    // Les setters ******************************************


    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    // Les methodes ********************************************

    public String toString(){
        return "Ce ciné à pour ID " + this.idCinema + " ,il s'appelle " + super.getNom() + " ,et se situe à " + super.getAdresse();
    }

    @Override
    public void afficheInfo() {
        System.out.println(" vous êtes au ciné " + super.getNom() + " ,numéro" + this.idCinema+ " ,exactement à l'adresse : " + super.getAdresse());
    }
} // Find e la classe Cinema
