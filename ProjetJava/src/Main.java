import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
         //Mon Projet CineBase
        // Création des objets ******************************************************************
        ArrayList<Personne> listePerso = new ArrayList<>();
        Personne p1 = new Personne(01,"Denfer","Lisa");
        Personne p2 = new Personne(02,"Oumer","Tom");
        listePerso.add(p1);
        listePerso.add(p2);

        ArrayList<Film> listeFilm = new ArrayList<>();
        Film f1 = new Film(01,01,"Avatar","fiction",2000);
        Film f2 = new Film(02,02,"Avengers","fiction",2003);
        listeFilm.add(f1);
        listeFilm.add(f2);

        System.out.println("Entrez l'id de cinema : ");
        Scanner scancin1 = new Scanner(System.in);
        int idcinema = scancin1.nextInt();
        System.out.println("Entrez le nom du cinema : ");
        Scanner scancin2 = new Scanner(System.in);
        String nomcinema = scancin2.next();
        System.out.println("Entrez l'adresse du cinema : ");
        Scanner scancin3 = new Scanner(System.in);
        String addcinema = scancin3.next();

        System.out.println("Entrez l'id de cinema : ");
        Scanner scancin4 = new Scanner(System.in);
        int idcinema1 = scancin4.nextInt();
        System.out.println("Entrez le nom du cinema : ");
        Scanner scancin5 = new Scanner(System.in);
        String nomcinema2 = scancin5.next();
        System.out.println("Entrez l'adresse du cinema : ");
        Scanner scancin6 = new Scanner(System.in);
        String addcinema3 = scancin6.next();

        ArrayList<Cinema> listeCinema = new ArrayList<>();
        //Cinema c1 = new Cinema("Pathé", "Evry",806);
        //Cinema c2 = new Cinema("UGC", "Bercy",807);
        Cinema c3 = new Cinema(nomcinema,addcinema,idcinema);
        Cinema c4 = new Cinema(nomcinema2,addcinema3,idcinema1);
        //listeCinema.add(c1);
        //listeCinema.add(c2);

        listeCinema.add(c3);
        listeCinema.add(c4);

        System.out.println(listePerso.toString()); // on peut utiliser une boucle pour voir mieux
        System.out.println(listeFilm.toString());
        System.out.println(listeCinema.toString());

        for(Cinema c:listeCinema){
            c.afficheInfo();
        }

        // JDBC PART*************************************************************

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinebase", "root", "");

            Statement stmt = con.createStatement();
            String q1 = "Select nom from personnes where nom like 'S%'";
            String q2 = "Select titre, idFILM from film where titre like '%blanc%'";
            String q3 = "INSERT INTO cinema value(?,?,?)";

            ResultSet res1 = stmt.executeQuery(q1);
            while (res1.next()) {
                System.out.println(res1.getString("nom"));
            }

            ResultSet res2 = stmt.executeQuery(q2);
            while (res2.next()) {
                System.out.println(res2.getString("titre") + "|"  + res2.getInt("idFILM"));
            }

            PreparedStatement ps = con.prepareStatement(q3);

            for( Cinema cin : listeCinema){
                ps.setInt(1,cin.getIdCinema());
                ps.setString(2,cin.getNom());
                ps.setString(3,cin.getAdresse());

                ps.executeUpdate();}

            System.out.println("Entrez l'id de cinema : ");
            Scanner scan = new Scanner(System.in);
            int idcin = scan.nextInt();
            System.out.println("Entrez le nouveau nom du cinema : ");
            Scanner scan1 = new Scanner(System.in);
            String nocin = scan1.next();

            String q4 = "UPDATE cinema set nom = ? where idCINEMA = ?";
            PreparedStatement ps2 = con.prepareStatement(q4);
            int idCINEMA = idcin;
            String nom = nocin;
            ps2.setString(1,nom);
            ps2.setInt(2,idCINEMA);
            ps2.executeUpdate();


            String q5 = "DELETE FROM projection where idFILM = ?";
            PreparedStatement ps3 = con.prepareStatement(q5);
            int idFILM = 3;
            ps3.setInt(1,idFILM);
            ps3.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
















    }// Fin de la methode main
} //Fin de la classe Main
