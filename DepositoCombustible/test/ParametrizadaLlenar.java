import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizadaLlenar {

	private int actual;
	private int maximo;
	private int cantidad;
	private int res;
	
	public ParametrizadaLlenar(int n1, int n2, int c, int r) {
		maximo = n1;
		actual = n2;
		cantidad = c;
		res = r;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{25,10,100,25},{80,-2,82,80},{-50,50,5,50},{-20,-21,20,21}
		});	
	}
	
	@Test
	public void Llenar() {
		DepositoCombustible d = new DepositoCombustible(maximo,actual);
		d.fill(cantidad);
		int resultado = (int) d.getDepositoNivel();
		assertEquals(res,resultado);
	}

}
