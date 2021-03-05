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
		megaDemon = new Boisson("Mega Demon",(float) 16);
		crazyTiger = new Boisson("Crazy Tiger");
		maximator = new Boisson("Maximator",(float) -10);
		muscatDeRivesaltes = new Boisson("MuscatDeRiveslates", (float) 102);
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
		muscatDeRivesaltes.prix = (float)-5;
		assertFalse(muscatDeRivesaltes.prix<0);
	}
	
	@Test 
	public void limiteVolume() {
		muscatDeRivesaltes.volume = (float)-100;
		assertFalse(muscatDeRivesaltes.volume<0);
	}
	
	@Test
	public void testToString() {
		assertNotNull(megaDemon.toString());
	}

}
