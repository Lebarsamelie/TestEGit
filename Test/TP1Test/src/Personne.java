import java.text.Normalizer;


public class Personne {
	private String nom;
	private String prenom;
	private String login;
	
	
	public Personne (String unNom, String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = creerLogin();
	}
	
	private String creerLogin(){
		//tiret
		nom = nom.replaceAll("-", "");
		//Accent
		nom = Normalizer.normalize(nom, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		
		login = this.prenom.toLowerCase().replaceAll(" ", "").charAt(0) + this.nom.toLowerCase().replaceAll(" ", "");
		if(login.length() > 6){
			login = login.substring(0, 6);
		}
		
		
		
		
		return login;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String toString(){
		return ("Nom : " + this.nom + "/nPrenom : " + this.prenom + "/nLogin : " + this.login);
	}
	
	
	
	
}
