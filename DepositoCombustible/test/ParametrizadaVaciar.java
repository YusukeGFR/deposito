import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizadaVaciar {


	private int actual;
	private int maximo;
	private int cantidad;
	private int res;
	
	public ParametrizadaVaciar(int n1, int n2, int c, int r) {
		maximo = n1;
		actual = n2;
		cantidad = c;
		res = r;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{25,10,100,0},{80,-2,10,0},{-50,50,5,45},{-20,-21,20,1}
		});	
	}
	
	@Test
	public void Llenar() {
		DepositoCombustible d = new DepositoCombustible(maximo,actual);
		d.consumir(cantidad);
		int resultado = (int) d.getDepositoNivel();
		assertEquals(res,resultado);
	}
	
}
