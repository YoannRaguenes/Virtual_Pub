package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pub.Cocktail;

public class CocktailTest {

	private Cocktail mazout;
	
	@BeforeEach
	protected void setUp() throws Exception {
		mazout = new Cocktail("mazout");
	}

	@Test
	void emptyCocktail() {
		assertNotNull(mazout);
	}

	@Test
	void emptyIngrediantCocktail() {
		assertTrue(mazout.ingrediants.isEmpty());
	}
	
	@Test
	void emptyIngrediantCocktail2() {
		mazout.add("bierre", 50.0);
		mazout.add("coca", 50.0);
		assertFalse(mazout.ingrediants.isEmpty());
	}

	@Test
	void alcoolFree() {
		mazout.alcoolise = true;
		assertFalse(mazout.alcoolFree());
	}
	
	@Test
	void alcoolFree2() {
		mazout.alcoolise = false;
		assertTrue(mazout.alcoolFree());
	}

	@Test
	void testToString() {
		assertNotNull(mazout.toString());
	}
	
	@Test
	void limiteAdd() {
		mazout.add("coca", -15.0);
		assertTrue(mazout.ingrediants.isEmpty());
	}

}
