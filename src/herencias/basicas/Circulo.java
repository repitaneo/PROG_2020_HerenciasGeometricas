package herencias.basicas;

import interfaces.Espacios;

public class Circulo extends Punto implements Espacios {

	protected float radio;

	protected static final float PI = 3.141592f;
	
	
	
	
	public float getArea() {
		
		return PI*radio*radio;
	}
	public float getPerimetro() {
		
		return 2*PI*radio;
	}
	
	

	
	/* *******************
	 * SETTERS Y GETTERS
	 * 	 
	 */
	
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
}
