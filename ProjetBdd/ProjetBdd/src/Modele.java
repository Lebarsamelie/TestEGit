import java.sql.*;
import java.util.ArrayList;

public class Modele {
	//class privée
	private static Connection connexion ;
	private static Statement st;
	private static ResultSet rs;
	
	
	//méthode publiques statiques
	public static void connexionBD() {
		Connection connexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost/gsbv2", "root", "");
			System.out.println("Connexion réussi");
		} 
		catch (ClassNotFoundException erreur) {
			System.out.println("Driver non chargé!" + erreur);
		}
		catch (SQLException erreur){
			System.out.println("La connexion à la base de données a échoué ou Erreur SQL" + erreur);
		}
	}
		
	//deconnexion
	public static void deconnexionBD() {
		try {
			connexion.close();
			System.out.println("Deconnexion réussi");
		} catch (SQLException erreur) {
			// TODO Auto-generated catch block
			erreur.printStackTrace();
		} //fermeture de la connexion.
		deconnexionBD();
	}
	
	public static void ajouterEtat(String unid, String unlibelle) {
		connexionBD();
		try {
			PreparedStatement statement = connexion.prepareStatement("INSERT INTO Etat (id, libelle) VALUES (?, ?)");
			statement.setString (1, "88");
			statement.setString (2, "95");
			int nbLignes = statement.executeUpdate();
		}
		catch (SQLException erreur) {
			// TODO Auto-generated catch block
			erreur.printStackTrace();
			System.out.println("La connexion à la base de données a échoué ou Erreur SQL" + erreur);
		}
	}
	
	//getlesEtats
	public static ArrayList <Etat> getLesEtats() {
		connexionBD();
		ArrayList<Etat> lesEtat = new ArrayList<Etat>();
	    try {  
	    	PreparedStatement statement = connexion.prepareStatement("SELECT * FROM Etat where id = ?");
			statement.setString(1, id);
	    	ResultSet res = statement.executeQuery();
			while(rs.next()) {
				Etat unEtat = new Etat(rs.getString(1), rs.getString(2));
				lesEtat.add(unEtat);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deconnexionBD();
		return lesEtat; 
		
	}
	
	
}
