import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PersonneTest {
	
	private Personne personne;
	
	@Before
	public void setUp() throws Exception {
		personne = new Personne ("MARTIN", "Laurent");
	}
	
	
	/*@Test
	public void test() {
		Assert.assertEquals("Pas de majuscules", "lmartin", personne.getLogin());
	}
	*/
	
	 
	 @Test
	 public void caracteres(){
		 Assert.assertTrue("Pas plus de 6 caractères",personne.getLogin().length() <= 6);
	}
	
	@Test
	public void espace(){
		Assert.assertEquals("Pas d'espace", "lmarti", personne.getLogin());
	}
	
	@Test
	public void tiret(){
		Assert.assertEquals("Pas de tiret", "lmarti", personne.getLogin() );
	}
	
	@Test
	public void accentués(){
		Assert.assertEquals("Pas de tiret", "lmarti", personne.getLogin() );
	}
	
}
