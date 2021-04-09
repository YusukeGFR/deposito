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
		
		DepositoCombustible d = new DepositoCombustible(80,40);
		
		int maximo = (int) d.getDepositoMax();
		
		assertEquals(80,maximo);
		
	}

	@Test
	public void testEstaVacio() {
		
		DepositoCombustible d = new DepositoCombustible(80,40);
		
		assertFalse(d.estaVacio());
		
		d.consumir(40);
		
		assertTrue(d.estaVacio());
		
	}

	@Test
	public void testEstaLleno() {
		
		DepositoCombustible d = new DepositoCombustible(80,40);

		assertFalse(d.estaLleno());
	}


}
