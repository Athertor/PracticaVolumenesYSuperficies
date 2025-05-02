package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Cubo;

class TestCubo {
	/****
	 * Test de la superficie
	 */
	@Test
	void testSuperficie() {
		Cubo cubo= new Cubo(1); 
		int superficieEsperada= 1*1*6;
		assertEquals(superficieEsperada, cubo.superficie());
	}
	/****
	 * Test del volumen
	 */
	@Test
	void testVolumen() {
		Cubo cubo= new Cubo(1);
		int volumenEsperado=1*1*1;
		assertEquals(volumenEsperado, cubo.volumen());
	}

}
