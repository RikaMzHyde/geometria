package test;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Circulo_LMPP;


public class CirculoLMPP_Test {
	double radio;

	@Test
	public void testArea() {
		radio = 7;
		Circulo_LMPP c1 = new Circulo_LMPP(radio, "circulo");
		assertEquals(radio * radio * Math.PI, c1.area(), 0.001);
		

		radio = 0;
		Circulo_LMPP c2 = new Circulo_LMPP(radio, "circulo");
		assertEquals(radio * radio * Math.PI, c2.area(), 0.001);
		

		radio = -3;
		Circulo_LMPP c3 = new Circulo_LMPP(radio, "circulo");
		assertEquals(radio * radio * Math.PI, c3.area(), 0.001);
	}

	@Test
	public void testPerimetro() {
		radio = 7;
		Circulo_LMPP c1 = new Circulo_LMPP(radio, "circulo");
		assertEquals(radio * 2 * Math.PI, c1.perimetro(), 0.001);

		radio = 0;
		Circulo_LMPP c2 = new Circulo_LMPP(radio, "circulo");
		assertEquals(radio * 2 * Math.PI, c2.perimetro(), 0.001);

		radio = -3; // Si el radio es negativo en el assertEquals tendremos que convertirlo a positivo.
		Circulo_LMPP c3 = new Circulo_LMPP(radio, "circulo");
		assertEquals(-radio * 2 * Math.PI, c3.perimetro(), 0.001);
	}

}
