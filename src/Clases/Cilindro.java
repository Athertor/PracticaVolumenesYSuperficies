package Clases;

public class Cilindro {
	int radio;
	int altura;

	public Cilindro(int radio, int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/****
	 * Metodo que calcula la superficie
	 * 
	 * @return int
	 */
	public int superficie() {
		int S = (int) (2 * 3.14) * radio * radio + (int) (2 * 3.14) * radio * altura;
		return S;
	}
	
	/****
	 * Metodo que calcula el volumen
	 * 
	 * @return int
	 */
	
	public int volumen() {
		int V = (int) 3.14 * radio * radio * altura;
		return V;
	}
}
