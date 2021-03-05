package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoissonTest {
	private Boisson megaDemon;
	private Boisson crazyTiger;
	private Boisson maximator;
	private Boisson muscatDeRivesaltes;
	
	@BeforeEach
	protected void setUp() {
		megaDemon = new Boisson("Mega Demon",16.0f);
		crazyTiger = new Boisson("Crazy Tiger");
		maximator = new Boisson("Maximator",-10.0f);
		muscatDeRivesaltes = new Boisson("MuscatDeRiveslates",102.0f);
	}
	
	
	@Test
	public void emptyBoisson() {
		assertNotNull(crazyTiger);	
	}
	
	@Test
	public void emptyBoisson2() {
		assertNotNull(megaDemon);
	}
	
	@Test
	public void limiteBoisson() {
		assertFalse(maximator.degre<0);
	}
	
	@Test 
	public void limiteBoisson2() {
		assertFalse(muscatDeRivesaltes.degre>100);
	}
	
	@Test 
	public void limitePrix() {
		muscatDeRivesaltes.prix = -5.0f;
		assertFalse(muscatDeRivesaltes.prix<0);
	}
	
	@Test 
	public void limiteVolume() {
		muscatDeRivesaltes.volume = -100.0f;
		assertFalse(muscatDeRivesaltes.volume<0);
	}
	
	@Test
	public void testToString() {
		assertNotNull(megaDemon.toString());
	}

}
