package Clases;

public class Cubo {
	int lado;

	/****
	 * constructor que obtiene parametros
	 * @param lado
	 */
	public Cubo(int lado) {
		this.lado = lado;
	}

	public Cubo() {
		lado = 1;
	}

	/****
	 * Metodo que calcula la superficie
	 * 
	 * @return int
	 */
	public int superficie() {
		int superficie = (lado * lado) * 6;
		return superficie;
	}
	
	/****
	 * Metodo que calcula el volumen
	 * 
	 * @return int
	 */
	public int volumen() {
		int volumen = (lado * lado * lado);
		return volumen;
	}

}
