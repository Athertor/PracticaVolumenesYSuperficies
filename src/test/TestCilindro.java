package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Cilindro;

class TestCilindro {
	/****
	 * Test de la superficie
	 */
	@Test
	void testSuperficie() {
		Cilindro cilin= new Cilindro(1,1);
		int superficieEsperada= (int)(12.56);
		assertEquals(superficieEsperada, cilin.superficie());
	}
	
/****
 * Test del volumen
 */
	@Test
	void testVolumen() {
		Cilindro cilin= new Cilindro(1,1);
		int volumenEsperado=(int)(3.14);
		assertEquals(volumenEsperado, cilin.volumen());
		
		
	}

}
