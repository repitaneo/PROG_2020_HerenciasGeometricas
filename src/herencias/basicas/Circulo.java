package herencias.basicas;

public class Circulo extends Punto {

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
