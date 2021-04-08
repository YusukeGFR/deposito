import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		
		DepositoCombustible d = new DepositoCombustible(80,40);
		
		int actual = (int) d.getDepositoNivel();
		
		assertEquals(40,actual);
		
		
	}

	@Test
	public void testGetDepositoMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaVacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		fail("Not yet implemented");
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
