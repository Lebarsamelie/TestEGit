
public class Etat {
	private String id;
	private String libelle;

	
	public void setid (String unid){
		this.id = unid;
	}
	
	public String getid (){
		return this.id;
	}
	
	public void setlibelle (String unlibelle){
		this.libelle = unlibelle;
	}
	
	public String getlibelle (){
		return this.libelle;
	}
	
	public Etat (String unid, String unlibelle){
		this.id = unid;
		this.libelle = unlibelle;
	}
	
	
}
