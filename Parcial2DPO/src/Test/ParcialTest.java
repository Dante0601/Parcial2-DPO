package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;
import java.util.*;

import Modelo.Parcial;


public class ParcialTest {
	@Test
	public void CalcularRaicestest() throws Exception{
		ArrayList<Double> valoresPrueba = new ArrayList<Double>();
		// Caso dos raices reales
		valoresPrueba.add(1.0);
		valoresPrueba.add(-1.0);
		assertEquals(valoresPrueba, Parcial.CalcularRaices(1.0, 0.0, -1.0));
		valoresPrueba.removeFirst();
		valoresPrueba.removeFirst();
		// Caso una raiz real (a diferente de 0)
		valoresPrueba.add(1.0);
		assertEquals(valoresPrueba, Parcial.CalcularRaices(1.0, -2.0, 1.0));
		valoresPrueba.removeFirst();
		// Caso de raices complejas
		Exception e = assertThrows(Exception.class, () -> Parcial.CalcularRaices(1.0, 1.0, 1.0));
		assertEquals("No es posible, tiene raiz Compleja", e.getMessage());
		// Caso de una raiz (a igual a 0)
		valoresPrueba.add(1.0);
		assertEquals(valoresPrueba, Parcial.CalcularRaices(0, -1, 1));
		valoresPrueba.removeFirst();
		// Caso de raiz indefinida
		Exception f = assertThrows(Exception.class, () -> Parcial.CalcularRaices(0.0, 0.0, 1.0));
		assertEquals("Indefinido, no hay variable x", f.getMessage());
	}
}
