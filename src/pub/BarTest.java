package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarTest {

	private Bar bar;
	private Boisson boissonAlcoolisee;
	private Boisson boissonNonAlcoolisee;
	private Boisson boissonChaude;
	private Cocktail cocktailAlcoolise;
	private Cocktail cocktailNonAlcoolise;
	
	@BeforeEach
	void setUp() throws Exception {
		bar = new Bar();
		
		boissonAlcoolisee = new Boisson("bièrre");
		boissonAlcoolisee.alcoolise = true;
		
		boissonNonAlcoolisee = new Boisson("jus d'orange");
		boissonNonAlcoolisee.alcoolise = false;
		
		boissonChaude = new Boisson("thé menthe");
		boissonChaude.alcoolise = false;
		
		cocktailAlcoolise = new Cocktail("Mojito");
		cocktailAlcoolise.alcoolise = true;
		
		cocktailNonAlcoolise = new Cocktail("lait fraise");
		cocktailNonAlcoolise.alcoolise = false;
		
	}

	@Test
	void testBar() {
		assertNotNull(bar);
	}

	@Test
	void addBoissonAlcoolise() {
		bar.add(boissonAlcoolisee);
		assertFalse(bar.boissonAlcoolisee.isEmpty());
		assertTrue(bar.boissonFroide.isEmpty());
	}
	
	@Test
	void addBoissonNonAlcoolise() {
		bar.add(boissonNonAlcoolisee);
		assertTrue(bar.boissonAlcoolisee.isEmpty());
		assertFalse(bar.boissonFroide.isEmpty());
	}

	@Test
	void addCocktailAlcoolise() {
		bar.add(cocktailAlcoolise);
		assertFalse(bar.cocktailAvecAlcoole.isEmpty());
		assertTrue(bar.cocktailSansAlcoole.isEmpty());
	}
	
	@Test
	void addCocktailNonAlcoolise() {
		bar.add(cocktailNonAlcoolise);
		assertTrue(bar.cocktailAvecAlcoole.isEmpty());
		assertFalse(bar.cocktailSansAlcoole.isEmpty());
	}

	@Test
	void testServBoissonFroide() {
		bar.add(boissonNonAlcoolisee); //une boisson non alcoolise est une boisson froide
		assertEquals(bar.serv("jus d'orange"),boissonNonAlcoolisee);
	}
	
	@Test
	void testServBoissonAlcoolisee() {
		bar.add(boissonAlcoolisee);
		assertEquals(bar.serv("bièrre"),boissonAlcoolisee);
	}

	@Test
	void testServBoissonChaude() {
		bar.add(boissonChaude);
		assertEquals(bar.serv("thé menthe"),boissonChaude);
	}
	
	@Test
	void testServCocktailNonAlcoolise() {
		bar.add(cocktailNonAlcoolise);
		assertEquals(bar.serv("lait fraise"),cocktailNonAlcoolise);
	}
	
	@Test
	void testServCocktailAlcoolise() {
		bar.add(cocktailAlcoolise);
		assertEquals(bar.serv("mojito"),cocktailAlcoolise);
	}
	
	@Test
	void testLimiteServ() {
		assertEquals(bar.serv("lait fraise"),cocktailNonAlcoolise);
	}

	@Test
	void testToString() {
		assertNotNull(bar.toString());
	}

}
