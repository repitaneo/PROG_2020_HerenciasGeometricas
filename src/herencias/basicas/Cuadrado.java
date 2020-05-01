package herencias.basicas;

import interfaces.Espacios;

public class Cuadrado extends Punto implements Espacios {

	
	protected float lado;

	
	
	public float getArea() {
		
		return lado*lado;
	}
	public float getPerimetro() {
		
		return 4*lado;
	}	
	
	

	/* *******************
	 * SETTERS Y GETTERS
	 * 	 
	 */
	
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
	
	
}
