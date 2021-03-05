package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import pub.Boisson;
import pub.Cave;

class CaveTest extends TestCase {
	private Cave cave1;
	private Boisson ricard;
	private Boisson captainMorgan;
	
	@BeforeEach
	protected void setUp() {
		cave1 = new Cave();
		ricard = new Boisson("ricard");
		captainMorgan = new Boisson("Captain Morgan");
	}

	@Test
	public void emptyCave() {
		assertNotNull(cave1);
	}
	
	@Test
	public void testAdd() {
		cave1.add(ricard);
		assertEquals(cave1.rayons.size(),1);
	}
	
	@Test
	public void testTake() {
		cave1.add(captainMorgan);
		cave1.take("captainMorgan");
		assertEquals(cave1.rayons.size(),0);
	}
	
	@Test
	public void limiteTake() {
		cave1.add(captainMorgan);
		cave1.add(captainMorgan);
		cave1.take("ricard");
		assertEquals(cave1.rayons.size(),2);
	}
	
	@Test
	public void limiteTake2() {
		cave1.take("ricard");
		assertEquals(cave1.rayons.size(),0);
	}
	
	@Test
	public void testToStringCave() {
		assertNotNull(cave1.toString());
	}

}
