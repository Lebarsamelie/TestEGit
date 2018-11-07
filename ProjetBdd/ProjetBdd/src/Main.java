import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connexion = null;
		try {
			//forName en italique car class static
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost/gsbv2", "root", "");
			System.out.println("Connexion r�ussi");
			Statement st = connexion.createStatement();
		//	int count = st.executeUpdate("INSERT INTO Etat (id,libelle) Values ('GD','Ne sera pas rembourser');");
		//	System.out.println ("il y'a eu" + count + " ligne ajout�");
			
			String id;
			String libelle;
			ResultSet rs = st.executeQuery("SELECT * FROM Etat");
			//Pour acc�der � chacune des lignes du r�sultat de la requete :
			while (rs.next()){
				id = rs.getString("id");
				libelle = rs.getString(2);
				System.out.println(" Code =" + id + libelle);
			}
			rs.close(); //permet de lib�rer la m�moire utilis�e.
			
			connexion.close(); //fermeture de la connexion.
		} 
		catch (ClassNotFoundException erreur) {
			System.out.println("Driver non charg�!" + erreur);
		}
		catch (SQLException erreur){
			System.out.println("La connexion � la base de donn�es a �chou� ou Erreur SQL" + erreur);
		}
		
		
		
	}

}
