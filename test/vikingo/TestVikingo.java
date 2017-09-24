package vikingo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestVikingo {

	private Vikingo ragna;
	private Vikingo ignir;

	@Before
	public void iniciar() {
		ragna = new Vikingo();
		ignir = new Vikingo();
	}

	@Test
	public void testBasico() {
		ragna.atacar(ignir);
		/* Le logro sacar 5 */
		assertEquals(95, ignir.getSalud());
		ignir.atacar(ragna);
		/* Le logro sacar 5 */
		assertEquals(95, ignir.getSalud());
	}

	@Test
	public void testEmborrachar() {
		ragna.convidarBebida(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 8 */
		assertEquals(92, ignir.getSalud());
		ignir.atacar(ragna);
		/* Le logro sacar 2 */
		assertEquals(98, ragna.getSalud());

		ragna.convidarBebida(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 8 */
		assertEquals(84, ignir.getSalud());

		ragna.agitarHermano(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 5 */
		assertEquals(79, ignir.getSalud());
		ignir.atacar(ragna);
		/* Le logro sacar 5 */
		assertEquals(93, ragna.getSalud());
	}

	@Test
	public void testEnojar() {
		ragna.agitarHermano(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 10 */
		assertEquals(90, ignir.getSalud());
		ignir.atacar(ragna);
		/* Le logro sacar 25 */
		assertEquals(75, ragna.getSalud());

		ragna.convidarBebida(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 5 */
		assertEquals(85, ignir.getSalud());

		ragna.convidarBebida(ignir);
		ragna.atacar(ignir);
		/* Le logro sacar 8 */
		assertEquals(77, ignir.getSalud());
		ignir.atacar(ragna);
		/* Le logro sacar 2 */
		assertEquals(73, ragna.getSalud());
	}
}